import java.util.Scanner;
class Hello_World {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        do {
            System.out.println("Enter a number (negative to stop) :");

            num = scan.nextInt();
            if (num < 0) {
                System.out.println("Negative number entered. Exiting... ");

            } else {
                System.out.println("The Power Of " + num + " is" + (num * num));

            }
        } while (num >= 0);
    }
}