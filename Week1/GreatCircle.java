/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double x1_rad = Math.toRadians(x1);
        double y1_rad = Math.toRadians(y1);
        double x2_rad = Math.toRadians(x2);
        double y2_rad = Math.toRadians(y2);

        double r = 6371.0;

        double a = Math.sin((x2_rad - x1_rad)/2) * Math.sin((x2_rad - x1_rad)/2);
        double b = Math.cos(x1_rad) * Math.cos(x2_rad) * Math.sin((y2_rad - y1_rad)/2) * Math.sin((y2_rad - y1_rad)/2);

        double c = Math.asin(Math.sqrt(a+b));

        double distance = 2*r*c;

        System.out.println(distance + " kilometers");

    }
}
