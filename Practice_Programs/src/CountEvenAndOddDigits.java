
public class CountEvenAndOddDigits {


    public static void main(String[] args) {
		
    	int num=1234567;
    	int even_Count=0;
    	int odd_Count=0;
    	
    	while(num>0) {
    		int rem=num%10;
    		if(rem%2==0) {
    			even_Count++;
    		}
    		else {
    			odd_Count++;
    		}
    		num =num/10;
    		
    		
    	}
    	
    	System.out.println("Even no's count: "+even_Count);
    	System.out.println("Odd no's count: "+odd_Count);
    	
    	
    	
	}





}

