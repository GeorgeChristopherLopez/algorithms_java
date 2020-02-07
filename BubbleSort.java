import java.util.ArrayList;
import java.util.*;

public class BubbleSort
{
	public static void main(String[] args) {
		int [] lst  = {9, 1, 3, 9, 5, 1, 9, 0};
		bubbleSort(lst);
	
	}
	
	static void bubbleSort(int[] lst){
	    int i;
		int j;
		int n = lst.length;
	 
	    for (i = 0; i < n; i++){
		   for(j = 0; j < n-1; j++){
    	        if (lst[j] > lst[j+1]){
                    int temp = lst[j];
                    lst[j] = lst[j+1];
                    lst[j+1] = temp;
    		    }
		    }
	    }
        System.out.println(Arrays.toString(lst));
	}
}

