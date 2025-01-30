import java.util.HashSet;

public class ContainsDuplicate {
        public boolean containsDuplicate(int[] nums) {
            HashSet<Integer> numSet = new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(numSet.contains(nums[i]))
                    return true;
                else
                    numSet.add(nums[i]);
            }
            return false;
        }
}
