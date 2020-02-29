public class LinearSearch
{

   
    public static void main(String[] args) {
        int [] lst = {37,9,7,5,4,6};
       linearSearch (lst, 37);
    }
    
     static void linearSearch(int[] lst, int search)
    {
       
        for(int i = 0; i< lst.length; i++ )
        {
            if(lst[i]== search)
            {
              System.out.println ("Found " + search +". It is at index " + i +".");
              return;
            } 
              
            
        }
        System.out.println ("Didnt find " + search +". It is not in the array.");
    }
}