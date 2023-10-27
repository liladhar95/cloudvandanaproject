package allerp;

import java.util.Random;

public class ShuffleArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] arr = {1, 2, 3, 4, 5, 6, 7};
	      
		    Random rand = new Random();
		    
	        for (int i = arr.length - 1; i > 0; i--) {
	        	
	            int j = rand.nextInt(i + 1);
	            
	             int temp = arr[i];
	             
	             arr[i] = arr[j];
	             
	             arr[j] = temp;
	        }
	        
	        System.out.println("Shuffled array:");
	        
	        for (int value : arr) {
	        	
	            System.out.print(value + " ");
	            
	        }
	}
	    
	}
	    


