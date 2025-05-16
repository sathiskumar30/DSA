import java.util.Scanner;


class JavaUserInput{
    public static void main(String[] args){
        System.out.println("Enter the Input : ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num + "This the input");

    }
}