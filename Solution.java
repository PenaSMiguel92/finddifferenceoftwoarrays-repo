import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        ans.add(findUnique(list1, list2));
        ans.add(findUnique(list2, list1));

        return ans;
    }
    
    public List<Integer> findUnique(List<Integer> list1, List<Integer> list2) {
        HashSet<Integer> ans = new HashSet<>();
        Iterator<Integer> iterator = list1.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (!list2.contains(num))
                ans.add(num);
        }
        return ans.stream().toList();
    }
}
