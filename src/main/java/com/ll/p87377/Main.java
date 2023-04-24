package com.ll.p87377;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
}

class Solution {
    public String[] solution(int[][] line) {
        String[] answer = {};
        return answer;
    }

    Point intersection(int[] line1, int[] line2) {
        double A1 = line1[0];
        double B1 = line1[1];
        double C1 = line1[2];

        double A2 = line1[0];
        double B2 = line1[1];
        double C2 = line1[2];

        if (C1 == 0 && C2 == 0) {
            return Point.of(0, 0);
        }
        return Point.of(1, 1);
    }
}

class Point {
    public final long x;
    public final long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    // 정수로 세팅
    public static Point of(long x, long y) {
        return new Point(x, y);
    }

    // 실수로 세팅
    public static Point of(double x, double y) {
        return of((long) x, (long) y);
    }

    //객체간의 비교를 위해

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }
}
