// find lagest number

// Algorithm
/* STEP 1 : START
   STEP 2 : INTIALIZE arr[] = [,,,,,,,]
   STEP 3 : max = arr[0]
   STEP 4 : REPEAT STEP 5 for(i=0;arr.length;i++)
   STEP 5 : if(arr[i]>max) max=arr[i]
   STEP 6 : PRINT("Lagest element in given array")
   STEP 7 : PRINT max
   STEP 8 : END
 */
public class lagest_number{
    public static void main(String[] args) {

        //initialize array
        int[]arr = new int[]{23,45,56,78,12,987};

        //intialize max with first element of array
        int max = arr[0];

        //Loop thought the array
        for(int i =0;i< arr.length;i++){
            //compare element of array with max

            if(arr[i]>max)
                max = arr[i];
            }
            System.out.println("Lagest element is : "+max);
        }
    }
