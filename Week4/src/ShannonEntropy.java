public class ShannonEntropy {

    public static void main(String args[]){
        int m = Integer.parseInt(args[0]);

        int[] values = new int[m+1];

        int count = 0;
        while(!StdIn.isEmpty()){
             int i = StdIn.readInt();
             values[i]++;
             count++;
        }

        double shannon_entropy = 0.0;
        for(int i=1; i<=m; i++){
            if(values[i] == 0){shannon_entropy = shannon_entropy + 0.0;}
            else {
                //System.out.println("value:" +values[i]);
                double p = (double) values[i]/count;
                //System.out.println("probability:" + p);
                double temp = (p) * (Math.log(p) / Math.log(2));
                //System.out.println("temp =" + temp);
                shannon_entropy = shannon_entropy - temp;
            }
        }
        StdOut.printf("%.4f\n", shannon_entropy);
    }
}
