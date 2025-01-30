import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer,Integer> hashMap = new HashMap<>();
            for(int i=0;i<nums.length;i++){
                int n = target-nums[i];
                if(hashMap.containsKey(n)){
                    return new int[]{i,hashMap.get(n)};
                }
                hashMap.put(nums[i],i);
            }
            return new int[]{};
        }

}
