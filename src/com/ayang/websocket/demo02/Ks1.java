package com.ayang.websocket.demo02;

import java.util.HashMap;

/**
 * @author Ayang
 * @date 2021/4/17 - 14:17
 */
public class Ks1 {

    public static void main(String[] args) {

//        /*代码1*/
//        String s1 = "1" + "2" + 3 + "4" + "5";
//        System.out.println(s1);
//
//        /*代码2*/
//        String s2 = "1" + "2" + "3" + "4" + "5";
//        System.out.println(s2);
//
//        /*代码3*/
//        String s3 = new StringBuilder().append("1").append("2").append("3").toString();
//        System.out.println(s3);
//        /*代码4*/
//        StringBuilder sb = new StringBuilder();
//        for (int i = 1; i <= 3; i++) {
//            sb.append(i);
//        }
//        String s4 = sb.toString();
//        System.out.println(s4);
//
//        HashMap<Integer,Integer> map = new HashMap<>();
    }

    public static int minOperations(int[] nums) {
        int ans = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1] + 1) ans += nums[i-1] + 1 - nums[i] + 1;
        }
        return ans;
    }

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] answer = new int[queries.length];
        int i = 0;
        for (int[] query : queries) {
            for (int[] point : points) {
                answer[i] += isIn(point, query);
            }
            i++;
        }
        return answer;

    }

    public int isIn(int[] point, int[] circle) {
        int x = point[0];
        int y = point[1];
        int cx = circle[0];
        int cy = circle[1];
        int r = circle[2];

        return (x - cx) * (x - cx) + (y - cy) * (y - cy) <= r * r ? 1 : 0;
    }

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int[] res = new int[nums.length];
        int n = 0;
        for (int i = res.length - 1; i >= 0; i--) {
            int j = res.length - 1 - i;
            n ^= nums[j];
            int k = 0;
            int x = 1;
            for (int ii = 0; ii < maximumBit; ii++) {
                if((n&x) == 0) k += x;
                x = x << 1;
            }
            res[i] = k;
        }
        return res;
    }
}
