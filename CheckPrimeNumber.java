import java.util.*;

public class CheckPrimeNumber{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.print("Not Prime");
                break;
            }else{
                System.out.println("Prime");
            }
        } 
        
    }
    
}
