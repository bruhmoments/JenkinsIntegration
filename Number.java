public class Number {
    public static void main(String args[]) {
      System.out.println("Hello World");
        for (int i=1; i<=100; i++){
            if(cPrima(i)) {
            	System.out.println(i);	
            }
            
        }
    }
    public static boolean cPrima(int nCek) {
        int nRem;
        for (int i = 2; i <= nCek / 2; i++) {
            nRem = nCek % i;
            if (nRem == 0) {
                return false;
            }
        }
        return true;
    }
}