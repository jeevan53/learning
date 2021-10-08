package leetCode;

public class Solution {

	    public int countPrimes(int n) {
	      int i =0;
	       int num =0;
	        int value = 0;

	       for (i = 1; i <n; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
	           
		  if (counter ==2)
		  {
		 
	          value++;
		  }	
	       }
	        return value;
	    }
	    public static void main(String[] args)
	    {
	        Solution s = new Solution();
	        int n= s.countPrimes(70);
	        System.out.println(n);
	  

	}
}    
