package com.ll.p42586;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    //스택: 선입후출, 큐 : 선입선출
    //ArrayList와의 차이 : 속도
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] result = solution.solution(progresses, speeds);
        IntStream.of(result).forEach(System.out::println);
    }
}

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
//        int[] day = {};
//
//        for (int i = 0; i < progresses.length; i++) {
//            if (progresses[i] % speeds[i] ==0)
//                day[i] = progresses[i] / speeds[i];
//            if (progresses[i] % speeds[i] !=0)
//                day[i] = progresses[i] / speeds[i] + 1;
//        }
//

        Queue<Integer> queue = IntStream
                .range(0, progresses.length)
                .mapToObj(i -> (int) Math.ceil((100.0 - progresses[i]) / speeds[i]))
                .collect(Collectors.toCollection(LinkedList::new));

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int remains = queue.poll();
            int count = 1;

            while (!queue.isEmpty() && remains >= queue.peek()) {
                queue.poll();
                count++;
            }

            result.add(count);
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
