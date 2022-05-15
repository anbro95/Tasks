public class Stringy {
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
}
