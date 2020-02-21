import java.util.*;

public class BinarySearch
{
	public static void main(String[] args) {
		int [] lst = {1,3,4,5,7,9,13,15,16,17,19,20};
	    System.out.println(BinarySearch(lst));
	}
	
	
	static boolean BinarySearch(int lst[]){
	    int [] sub = {};
		// looking for 
		int search = 7;
	    boolean found = false;
		// comparer with median of the array
		if (lst.length == 1) {
		    if (search == lst[0])
		        return true;
	        else 
                return false;		    
		}

        while(lst.length > 1){
            if(lst.length % 2 == 0) {
                if (search > lst[lst.length/2]) {
                    lst = Arrays.copyOfRange(lst, lst.length/2, lst.length);
                    System.out.println(Arrays.toString(lst));
                } else if  (search < lst[lst.length/2]){
                    lst = Arrays.copyOfRange(lst, 0, lst.length/2);
                    System.out.println(Arrays.toString(lst));   
                } else if ( search == lst[lst.length/2]){
                    System.out.println(Arrays.toString(lst));
                    System.out.println((lst [(lst.length/2)]));
                    return true;
                }
            } else {
                if (search > lst[(lst.length/2)+1]) {
                    lst = Arrays.copyOfRange(lst, (lst.length/2)+1, lst.length);
                    System.out.println(Arrays.toString(lst));
                } else if  (search < lst[(lst.length/2)+1]){
                    lst = Arrays.copyOfRange(lst, 0, (lst.length/2)+1);
                    System.out.println(Arrays.toString(lst));   
                } else if ( search == lst [(lst.length/2)+1]){
                    System.out.println(Arrays.toString(lst));
                    System.out.println((lst [(lst.length/2)+1]));
                    return true;
                }
            }
                    
        
        }
        return false;
	}
}