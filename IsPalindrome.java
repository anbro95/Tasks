public class IsPalindrome {
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
}
