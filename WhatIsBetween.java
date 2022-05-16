public class WhatIsBetween {
    public static int[] between(int a, int b) {
        int[] arr = new int[b-a+1];
        int index = 0;
        int length = arr.length;
        while(index < length) {
            for(int i = a; i <=b; i++) {
                arr[index] = i;
                index++;
            }
        }

        return arr;
    }
}
