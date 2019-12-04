public class DiscreteDistribution {

    public static void main(String[] args){
        int n = args.length;
        int m = Integer.parseInt(args[0]);
        int[] a = new int[n-1];
        int[] s = new int[n-1];

        for(int i=0; i<n-1; i++){
            a[i] = Integer.parseInt(args[i+1]);
        }

        s[0] = a[0];
        for(int i=1; i<n-1; i++){
            s[i] = s[i-1] + a[i];
        }

        for(int i=0; i<m; i++){
            int r = (int) (Math.random() * s[n-2]);
            //System.out.println("r =" +r);
            for(int j=0; j<n-1; j++){
                if(r<s[j]){
                    System.out.print(j+1 + " ");
                    break;
                }
            }
        }

    }
}
