import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.printf("The ASCII value of %c is: %d",ch,ascii);
    }
}

