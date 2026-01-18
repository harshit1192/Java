import java.util.*;
 
 public class SumOfDigits{

    static int SumOfNum (int num){
        int sum =0;
    while(num>0){
        sum += num%10;
        num/=10;
    }
    return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = SumOfNum(n);
        System.out.println(ans);

    }
 }
