package com.ll.p42840;

public class Main {

}

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] student1 = {1, 2, 3, 4, 5};
        int[] student2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] student3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i <= answers.length; i++) {
            if (answers[i] == student1[i]) {
                count1++;
            }
            if (answers[i] == student2[i]) {
                count2++;
            }
            if (answers[i] == student3[i]) {
                count3++;
            }
        }

        return answer;
    }
}
