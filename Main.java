import com.sun.security.jgss.GSSUtil;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        System.err.println("There is an error here");
    }

    static boolean eee(int[] nums) {
        HashSet set = new HashSet(Collections.singleton(nums));
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if(!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

//    Rock Paper Scissors
    static String rps(String p1, String p2) {


        if(p1 == p2) {
            return("Draw!");

        }

        switch(p1) {
            case "scissors" :
                switch(p2) {
                    case "paper" :
                        return("Player 1 won!");

                    case "rock" :
                        return("Player 2 won!");
                }
            case "paper" :
                switch(p2) {
                    case "scissors" :
                        return("Player 2 won!");
                    case "rock" :
                        return("Player 1 won!");
                }
            case "rock" :
                switch (p2) {
                    case "paper" :
                        return("Player 2 won!");
                    case "scissors" :
                        return("Player 1 won!");
                }
        }

        return "";

    }

    static double square(double A) {
        double fullLength = 4*A;
        float radius = (float) (fullLength / 2 / Math.PI);
        DecimalFormat df = new DecimalFormat("###.##");
        String res = df.format(radius * radius);

        return Double.parseDouble(res);
    }

    public static int[] plusOne(int[] digits) {
        String str = "";
        for (int i = 0; i < digits.length; i++) {
            str += digits[i];
        }

        BigInteger num = new BigInteger(str);
        num = num.add(BigInteger.ONE);

        String numstr = "" + num;

        int[] res = new int[numstr.length()];

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(String.valueOf(numstr.charAt(i)));
        }

        return res;

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(target == nums[i]) {
                return i;
            }
        }

        for (int i = 1; i < nums.length; i++) {
             if(nums[i] > target && target > nums[i-1]) {
                return i;
            }
        }

        if(target > nums[nums.length-1]) {
            return nums.length;
        } else if(target < nums[0]) {
            return -1;
        } else return -69;
    }

    public static boolean isPalindrome(int x) {
        if(Math.signum(x) < 0) {
            return false;
        }
        String str = "" + x;

        int[] arr = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == arr[length-1-i]) {
                count++;
            }
        }

        if(count == arr.length) {
            return true;
        }else
            return false;
    }

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        if(nums.length == 1) {
            return nums[0];
        }

        if(nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

        if(nums[0] != nums[1]) {
            return nums[1];
        }

        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1]) {
                return nums[i];
            }
        }


        return -1;

    }

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

  }

    public ListNode reverseList(ListNode head) {
        ListNode node = new ListNode(5);
        ListNode n = new ListNode(10);
        node.next = n;
        return node;
    }

//    public static ArrayList reverse(ArrayList<Integer> list) {
//        List<Integer> res = new ArrayList<>();
//        int index = 0;
//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            res.get(index) = list.get(size - index);
//            index++;
//        }
//    }

    public static boolean isPlural(float f){
        if(f == 1)
            return false;
        else
            return true;
    }

    public static String noSpace(final String x) {
       String y = x.replaceAll(" ", "");
//       x = y;
       return x;
    }

    public static String stringy(int size) {
        String res = "";
        for (int i = 0; i < size; i++) {
            if(i % 2 == 0)
                res += "1";
            else if(i % 2 == 1)
                res += "0";
        }

        return res;
    }

    public static String[] stringToArray(String s) {
        String[] res = s.split(" ");
        return res;
    }

    public String longestCommonPrefix(String[] strs) {
        String res = "";
        HashSet list = new HashSet();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if(!list.add(String.valueOf(strs[j].charAt(i))));

            }
        }

        return res;
    }

}
