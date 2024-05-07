import java.util.Scanner;

public class OctalFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert to octal number format");
        int number = sc.nextInt();
        StringBuilder oct = new StringBuilder();
        while(number>0){
            oct.append(number%8);
            number/=8;
        }
        System.out.println(oct.reverse());
    }
}

