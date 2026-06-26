public class MaximumEnemy {
     public static int captureForts(int[] forts) {
        int result =0;
        int L = 0;
        int R = 1;
        int N = forts.length;

        while(R<N){
            if(forts[R] == 0){
                R++;
            }
            else{
                if(forts[L] != 0 && forts[L] != forts[R]){
            
                  result = Math.max(result, R - L - 1);
                }
                 L=R;
                  R++;
            }
        }
        return result;
    }
    public static void main(String[] args){
        int array1[] = {1,0,0,-1,0,0,0,0,1};
        int array2[] = {0,0,1,-1};
        int enemy1 = captureForts(array1);
        int enemy2 = captureForts(array2);
        System.out.println(enemy1);
        System.out.println(enemy2);
    }
}
