import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class ThreeSum {
	
	public static void main(String[] args) {
		ThreeSum threeSum=new ThreeSum();
		 List<List<Integer>> result=new ArrayList<List<Integer>>();
		 result=threeSum.threeSum(new int[] {-1,0,1,2,-1,-4});
		 System.out.println(result.toString());
	}
    public List<List<Integer>> threeSum(int[] nums) {
        int a_pointer=0;
        int b_pointer=nums.length-1;
        int sum=0;
        List<List<Integer>> output=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
           a_pointer=i+1;
           b_pointer=nums.length-1;
            while(a_pointer<b_pointer){
                sum=nums[i]+nums[a_pointer]+nums[b_pointer];
                if(sum>0){
                    b_pointer--;
                }else if(sum<0){
                    a_pointer++;
                }else{
                    output.add(Arrays.asList(i,a_pointer,b_pointer));
                }
            }
            
            
        }
        return output;
    }
}