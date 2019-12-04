/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class CMYKtoRGB {
    public static void main(String[] args) {
        double C = Double.parseDouble(args[0]);
        double M = Double.parseDouble(args[1]);
        double Y = Double.parseDouble(args[2]);
        double K = Double.parseDouble(args[3]);

        double W = 1-K;

        int Red = (int) Math.round(255*W*(1.0-C));
        int Green = (int) Math.round(255*W*(1.0 - M));
        int Blue = (int) Math.round(255*W*(1.0 - Y));

        System.out.println("red = " +Red);
        System.out.println("green = "+ Green);
        System.out.print("blue = "+ Blue);

    }
}
