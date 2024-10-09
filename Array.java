import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int num[] = {12,-23,34,475,98,1388};
        System.out.println("Lets play the game :");
        System.out.println("======================");
        System.out.println("these are the numbers:");
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
        System.out.println("=======================");
        //choises
        System.out.println("avarage of the numers : - 1");
        System.out.println("Maximum number        : - 2");
        System.out.println("Minimum number        : - 3");
        System.out.println("Even numbers          : - 4");
        System.out.println("Odd numbers           : - 5");
        Scanner scanner = new Scanner(System.in);
        System.out.println("=======================");
        System.out.println("What is your choise :");
        int numb = scanner.nextInt();

        switch(numb){
            case 1:
                int full =0;
                for(int k=0;k<num.length;k++){
                    full = full + num[k];
                }
                int avg = full/num.length;
                System.out.println("Avarage = "+avg);
                break;

            case 2:
                int max = num[0];
                for(int l=0;l<num.length;l++) {
                    if (num[l] > max) {
                        max = num[l];
                    }
                }
                System.out.println("Largest Number is : "+max);
                break;

            case 3:
                int min = num[0];
                for(int p=0;p<num.length;p++){
                    if(num[p] < min){
                        min = num[p];
                    }
                }
                System.out.println("Minimum Number is : "+min);

            case 4:
                for(int y=0;y<num.length;y++){
                    if(num[y] % 2 == 0){
                        System.out.println(num[y]);
                    }
                }

                break;

            case 5:
                for(int e=0;e<num.length;e++){
                    if(num[e] % 2 != 0){
                        System.out.println(num[e]);
                    }
                }
        }

    }
}