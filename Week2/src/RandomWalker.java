import java.lang.Math;
public class RandomWalker {

    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);

        int i=0;
        int j=0;

        int count =0;

        while((Math.abs(i) + Math.abs(j)) != r){
            System.out.println("(" + i + "," +j + ")");
            double rand = Math.random();

            if(rand<0.25){
                i++;
            }

            else if(rand <0.5){
                j++;
            }
            else if(rand<0.75){
                i--;
            }
            else{
                j--;
            }
            count++;
        }

        System.out.println("(" + i + "," +j + ")");

        System.out.println("steps = " + count);
    }
}
