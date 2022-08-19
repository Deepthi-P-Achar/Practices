import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;

public class Solution {

	
	public static void main(String[] args) {
		int []amount= {100, 100, -10, -20, -30};
		String []date={"2020-01-01", "2020-02-01", "2020-02-11", "2020-02-05", "2020-02-08"};
		solution(amount,date);
		
	}
	
	static int solution(int[] A, String[] D) {
        int []amount=A;
        int monthsToPayfee=12;
        Month []month=new Month[amount.length];
        HashMap<Month,Integer>monthMap=new HashMap<Month,Integer>();
        HashMap<Month,Integer>amountMap=new HashMap<Month,Integer>();
        int i=0;
       int sum=0;
       
       if(amount.length==0) {
    	   return -monthsToPayfee*5;
       }else if(amount.length==1) {
    	   return amount[0];
       }
        for(String date:D) {
        	LocalDate currentDate=LocalDate.parse(date);
        	month[i]=currentDate.getMonth();
        	i++;
        }
        for(int j=0;j<amount.length;j++) {
        	if(amount.length>=3) {
        	if(amount[j]<0) {
        		if(monthMap.containsKey(month[j])) {
        			monthMap.put(month[j],monthMap.get(month[j])+1);
        			amountMap.put(month[j],amountMap.get(month[j])+amount[j]);
        			
        		}else {
        			monthMap.put(month[j],1);
        			amountMap.put(month[j],amount[j]);
        		}
        		
        	}
        	}
        	sum+=amount[j];
        }
        
        
        for(Month key: monthMap.keySet()) {
        	if(amountMap.containsKey(key)) {
        		if(monthMap.get(key)>=3 && amountMap.get(key)<=-100) {
        			monthsToPayfee--;
        		}
        		
        	}
        	
        }
        
        int totalSumAmount=sum-(monthsToPayfee*5);
        
        
      return totalSumAmount;
        
    }

}
