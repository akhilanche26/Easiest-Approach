import java.util.Scanner;

public class BinaryFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert to binary format");
        int number = sc.nextInt();
        StringBuilder bin = new StringBuilder();
        while(number>0){
            bin.append(number%2);
            number/=2;
        }
        System.out.println(bin.reverse());
    }
}

