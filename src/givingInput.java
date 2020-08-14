import java.util.Scanner;

public class givingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The First Number : ");
        int a = sc.nextInt();
        System.out.print("Enter The Second Number : ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The Sum is : "+c);
    }
}
