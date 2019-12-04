public class RandomWalkers {

    public static void main(String[] args){
        int r = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        double sum = 0;

        for(int trail=0; trail<n; trail++){
            int i=0;
            int j=0;

            int count =0;

            while((Math.abs(i) + Math.abs(j)) != r){
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
            sum = sum+count;
        }

        System.out.println("average number of steps = " + sum/n);
    }
}
