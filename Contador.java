package Contador;

public class Contador {
    
    public void getTypeNumber(int n){
        
        if(n % 2 == 0){
            System.out.printf("%d es par - ",n);
        } else{
            if(n % 5 == 0 && n % 2 != 0){
                System.out.printf("%d es número ordinal - ",n);
            }else{
                if(isPrimo(n)){
                    System.out.printf("%d es primo - ",n);
                }   
            }

        }
        
        
        
        if(n < 1000){
           getTypeNumber(n+1);
        }
    }

    private boolean isPrimo(int n){
        
        if(n == 0 || n == 2 || n == 4){
            return false;
        }

        for(int i = 2; i < n/2; i++){
            if(n % i == 0){
                return  false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Contador c = new Contador();
        c.getTypeNumber(1);
    }

}
