import java.text.DecimalFormat;

public class Square {
    static double square(double A) {
        double fullLength = 4*A;
        float radius = (float) (fullLength / 2 / Math.PI);
        DecimalFormat df = new DecimalFormat("###.##");
        String res = df.format(radius * radius);

        return Double.parseDouble(res);
    }
}
