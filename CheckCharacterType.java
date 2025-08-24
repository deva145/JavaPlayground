import java.util.Scanner;
class Hello_World {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scan.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Character");
        }
    }
}