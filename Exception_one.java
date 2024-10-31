import java.util.Scanner;

public class Exception_one {
    public static void main(String[] args) {
        while(true){
            try{
                Scanner sc = new Scanner(System.in);
                int a,b,c;
                System.out.println("Enter Your First Number : ");
                a = sc.nextInt();

                System.out.println("Enter Your Second Number : ");
                b = sc.nextInt();

                c = a / b;
                if(b>a){
                    System.out.println("b is larger than a");
                }
                System.out.println("===========///=============");

                System.out.println("Answer is : "+c);
            }catch(Exception e){
                System.out.println("Exception is : "+e);
            }
            finally {
                System.out.println("Bye");
                System.out.println("===========================");
            }
        }
    }
}