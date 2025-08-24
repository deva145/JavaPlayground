import java.util.Scanner;
class Hello_World{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        do{
            System.out.println("-----Menu-----");
            System.out.println("1. Print Hello");
            System.out.println("2. Print World");
            System.out.println("3. Exit");
            System.out.print(("Enter The Number(1-3) :"));
            choice = scan.nextInt();

            switch(choice){
                case 1 : System.out.println("Hello");
                break;
                case 2 : System.out.println("World");
                break;
                case 3 : System.out.println("Exiting...");
                break;
                default : System.out.println("Invalid Choice");

            }

        }while(choice!=3);
    }
}