public class lab1 {
    // i+j
    // i-1
    // long
     static long a = 2, b = 0, n = 150, m= 150, C=1;
    public static void main(String[] arg){
        long result = 0;
        for(long i = a; i != n; i++){
            for(long j = b; j != m; j++){
                long zn = i - C;
                if(zn != 0) {
                    result += (i+j)/(i-C);
                } 
                else{
                    System.out.println("тупня полнєйша знаменник 0");
                    return;
                }
            }
        }
        System.out.println(result);
    }
}
