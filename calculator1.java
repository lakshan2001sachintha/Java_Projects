import java.util.Scanner;

public class calculator1 {

        // java simple calculator by switch case
        public static void main(String[] args) {
            while(true){
                int a,b;
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter Your First Number :");
                System.out.println("*** first answer > second answer ***");
                a = scanner.nextInt();

                Scanner scanner1 = new Scanner(System.in);
                System.out.println("Enter Your Second Number :");
                b = scanner1.nextInt();

                System.out.println("Whats your choise :");
                System.out.println("Addition---(+)---->1");
                System.out.println("Subtraction--(-)----->2");
                System.out.println("Multiplication---(x)---->3");
                System.out.println("Divition----(/)--->4");
                Scanner scanner2 = new Scanner(System.in);
                int c = scanner.nextInt();


                switch(c) {
                    case 1:
                        System.out.println("Answer is :" + (a + b));
                        System.out.println("\n");
                        break;
                    case 2:
                        System.out.println("Answer is :" + (a - b));
                        System.out.println("\n");
                        break;
                    case 3:
                        System.out.println("Answer is :" + (a * b));
                        System.out.println("\n");
                        break;
                    case 4:
                        System.out.println("Answer is :" + (a / b));
                        System.out.println("rest is : " + (a % b));
                        System.out.println("\n");
                        break;
                    default:
                        System.out.println("Wrong operations");
                        System.out.println("\n");

                }

            }
        }

    }

