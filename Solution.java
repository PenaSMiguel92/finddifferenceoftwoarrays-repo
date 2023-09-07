import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
        
        List<Integer> res1 = new ArrayList<>(s1);
        res1.removeAll(s2);
        List<Integer> res2 = new ArrayList<>(s2);
        res2.removeAll(s1);

        ans.add(res1);
        ans.add(res2);
        return ans;
    }
}
