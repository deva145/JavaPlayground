import java.util.Scanner;
class Hello_World{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Mark: ");
        int mark = scan.nextInt();
        if(mark>=90 && mark<=100){
            System.out.println("A Grade");
        }
        else if(mark>=80 && mark<=89){
            System.out.println("B Grade");
        }
        else if(mark>=70 && mark<=79){
            System.out.println("C Grade");
        }
        else if(mark>=60 && mark<=69){
            System.out.println("D Grade");
        }
        else if(mark<60 && mark>=1){
            System.out.print("F Grade");
        }
        else{
            System.out.println("Enter Valid Student Mark");
        }



    }
}