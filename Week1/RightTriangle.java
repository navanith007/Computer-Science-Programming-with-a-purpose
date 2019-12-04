/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        System.out.println( (c*c == a*a + b*b || b*b == a*a + c*c || a*a == b*b + c*c) && (c>0 && b>0 && a>0));
}
}
