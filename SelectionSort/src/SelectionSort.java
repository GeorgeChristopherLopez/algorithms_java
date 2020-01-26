import java.util.Arrays;
import java.lang.String;
public class SelectionSort
{
    public static void main(String[] args) {
        int[] lst = {4,9,7,1,3,6,5};
//    int[] lst = {15,3,13,11,18,13,2,4,25,1};

    /*
	Arrays.sort(lst);
     // print out [1,3,4,5,6,7,9]
    System.out.println(Arrays.toString(lst));
	*/


        int current = 0;
        int previous= 0;
        int temp= 0;
        int tempIndex= 0;
        int smallest= 0;
        boolean foundSmallest = false;
        // loop over cards
        for (int i = 0; i < lst.length; i++){
            // find smallest

            foundSmallest = false;

            for (int x = i; x< lst.length; x++){

                if(x>i){
                    current = lst[x];
                    previous = lst[x-1];
                    if(foundSmallest == false){
                        if(previous <= current){
                            smallest = previous;
                            tempIndex = x-1;

                        } else if (current <= previous){
                            smallest = current;
                            tempIndex = x;
                        }
                        foundSmallest = true;
                    } else {
                        if(current <= smallest){
                            smallest = current;
                            tempIndex = x;

                        }
                    }


                }




            }
            temp = lst[i];
            lst[i] = smallest;
            lst[tempIndex] = temp;
            // System.out.println(smallest);
            // System.out.println(tempIndex);

        }
        System.out.println(Arrays.toString(lst));
    }
}