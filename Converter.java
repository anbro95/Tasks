public class Converter{
    public static int binToDecimal(String inp){
        int res = 0;
        int l = inp.length();
        int index = 0;

        while(index < l){
            for(int i = l-1; i >= 0; i--) {
                res += Integer.parseInt(String.valueOf(inp.charAt(index))) * Math.pow(2, i);
                index++;
            }
        }
        return res;
    }
}