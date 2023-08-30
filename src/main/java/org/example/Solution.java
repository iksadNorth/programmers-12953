package org.example;

class Solution {
    public int solution(int[] arr) {
        int answer = 1;
        for(int i : arr) {
            answer = lcm(answer, i);
        } return answer;
    }

    int lcm(int a, int b) {
        return a * b / gcd(a,b);
    }

    int gcd(int a, int b) {
        int x=Math.max(a,b), y=Math.min(a,b);

        while(y!=0) {
            int temp = x%y;
            x = y; y = temp;
        } return x;
    }
}