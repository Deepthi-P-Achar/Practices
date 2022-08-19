
public class PatternTest{
    public static void main(String []args){
        int count=5; // (1 to 100)
        //Write code here using "count"
        for(int i=0;i<count;i++) {
        	for(int j=0;j<count;j++) {
        		if(j<count-i-1) {
        			System.out.print("X");
        		}
        		else{
        			if(i%2==0) {
            			System.out.print('O');
            		}
        			else {
        				System.out.print('E');
        			}
        		}
        		
        	}
        	System.out.println();
        }
    }
}