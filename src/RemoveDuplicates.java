
public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,3,4,5};
		int val=3;
		int result=removeDuplicates(nums,val);
		System.out.println(result);
	}
	static int removeDuplicates(int[] nums, int val) {
        int i=0;
        int j=0;
        while(j<nums.length){
            if(nums[j]!=val){
                nums[i]=nums[j];
                i++;
            }
            j++;
        }
        return i;
    }

}
