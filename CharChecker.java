import java.util.Scanner;
class Hello_World {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter A Character :");
        char c = scan.next().charAt(0);
        if((c>='A' && c<='Z') || (c>='a' && c<='z')){
            System.out.println(c + " is an Alphabet");
        }
        else if(c>='0' && c<='9'){
            System.out.println(c + " is an Digit");
        }
        else{
            System.out.println(c + " is an Special Character");
        }
    }
}