import java.util.Scanner;
public class PosNegCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Positive");
        }
        else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
}