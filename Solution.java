import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> s1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> s2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        ans.add(getDiff(s1, s2));
        ans.add(getDiff(s2, s1));
        return ans;
    }
    
    public List<Integer> getDiff(Set<Integer> set1, Set<Integer> set2) {
        List<Integer> res1 = new ArrayList<>(set1);
        res1.removeAll(set2);
        return res1;
    }
}
