import java.util.Scanner;

public class HexDecForomat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert to Hexa Decimal format");
        int number = sc.nextInt();
        StringBuilder hex = new StringBuilder();
        char[] arr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(number>0){
            int rem = number%16;
            hex.append(arr[rem]);
            number/=16;
        }
        System.out.println(hex.reverse());

    }
}