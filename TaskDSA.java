public class assigncookies {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int l=0;
            int r=0;
            while(l < g.length && r < s.length){
                if(g[l]<=s[r]){
                    l++;
                }

                r++;
            }
            return l;
        }
    }

    class balckWhiteBalls{
        class Solution {
            public long minimumSteps(String s) {
                long swap = 0;
                long black = 0;
                for (int i = 0; i < s.length(); i++) {
                    if(s.charAt(i)=='1')
                        black++;
                    else
                        swap += (long) black;
                }
                return swap;
            }
        }
        }
    class Longest common prefix{
        class Solution {
            public String longestCommonPrefix(String[] v) {
                StringBuilder ans = new StringBuilder();
                Arrays.sort(v);
                String first = v[0];
                String last = v[v.length-1];
                for (int i=0; i<Math.min(first.length(), last.length()); i++) {
                    if (first.charAt(i) != last.charAt(i)) {
                        return ans.toString();
                    }
                    ans.append(first.charAt(i));
                }
                return ans.toString();
            }
        }
    }

    class minimum column value{
        class Solution {
            public int getCommon(int[] nums1, int[] nums2) {
                int i = 0, j = 0;
                while(i < nums1.length && j < nums2.length ){
                    if(nums1[i] == nums2[j]) return nums1[i];
                    if(nums1[i] > nums2[j]) j++;
                    else i++;
                }
                return -1;

            }
        }
    }

    class Ransom_Note{
        class Solution {
            public boolean canConstruct(String ransomNote, String magazine) {
                ArrayList<Character> ar=new ArrayList<>();
                for(int i=0 ; i<magazine.length(); i++){
                    ar.add(magazine.charAt(i));
                }
                for(int i=0; i<ransomNote.length(); i++){
                    if(ar.contains(ransomNote.charAt(i))){
                        ar.remove(Character.valueOf(ransomNote.charAt(i)));
                    }
                    else
                        return false;
                }
                return true;


            }
        }
    }
    class Repeated_Substring_pattern_approach1{
        class Solution {
            public boolean repeatedSubstringPattern(String s) {
                String check="";
                int a=1;
                check = check + s.substring(0, a);
                while(a<s.length()){
                    if (s.length() % check.length() != 0) {
                        check= check + s.substring(a,a+1);
                        a++;
                    }
                    else{
                        String newcheck=check;
                        while(newcheck.length()!=s.length()){
                            newcheck+=check;
                        }
                        if(newcheck.equals(s))
                            return true;
                        else{
                            check= check + s.substring(a,a+1);
                            a++;

                        }

                    }



                }
                return false;
            }
        }
    }
    class repeated_substring_pattern_approach2{
        public class Solution {
            public boolean repeatedSubstringPattern(String s) {
                int n = s.length();
                for (int i = 1; i <= n / 2; i++) {
                    if (n % i == 0) {
                        String substring = s.substring(0, i);
                        StringBuilder repeated = new StringBuilder();
                        for (int j = 0; j < n / i; j++) {
                            repeated.append(substring);
                        }
                        if (repeated.toString().equals(s))
                            return true;
                    }
                }
                return false;
            }
        }
    }
class Excle_sheet_column_table{
    class Solution {
        public String convertToTitle(int columnNumber) {
            StringBuilder result = new StringBuilder();
            while(columnNumber>0){
                columnNumber--;
                result.insert(0, (char)('A' + columnNumber % 26));
                columnNumber /= 26;
            }

            return result.toString();
        }
    }
}
class number_of_Substring_only1{
    class Solution {
        public int numSub(String s) {
            int count = 0;
            long total = 0;
            int MOD = 1000000007;
            int start = 0;
            while (start < s.length()) {
                if (s.charAt(start) == '0') {
                    start++;
                } else {
                    count = 0;
                    while (start < s.length() && s.charAt(start) == '1') {
                        count++;
                        start++;
                    }
                    total = (total + (long)count * (count + 1) / 2) % MOD;
                }
            }

            return (int) total;
        }
    }

}
class subarray_with_max_difference{


    class Solution {
        public int[][] divideArray(int[] nums, int k) {
            Arrays.sort(nums);
            int [][] ans = new int[nums.length/3][3];
            for(int i = 2; i < nums.length; i += 3){
                if(nums[i] - nums[i-2] > k) return new int[0][];
                ans[i/3] = new int[]{nums[i-2], nums[i-1],nums[i]};
            }
            return ans;
        }
    }


}
class find_common_characters{
    class Solution {
        public void fillCountArray(String word, int[] count) {
            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }
        }

        public List<String> commonChars(String[] words) {
            List<String> result = new ArrayList<>();
            int n = words.length;
            int[] count = new int[26];
            fillCountArray(words[0], count);
            for (int i = 1; i < n; i++) {
                int[] temp = new int[26];
                fillCountArray(words[i], temp);
                for (int j = 0; j < 26; j++) {
                    count[j] = Math.min(count[j], temp[j]);
                }
            }

            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    for (int j = 0; j < count[i]; j++) {
                        result.add(String.valueOf((char) (i + 'a')));
                    }
                }
            }

            return result;
        }
    }
}
class 3sum{
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==0){
                    List<Integer> temp=Arrays.asList(nums[i],nums[left],nums[right]);
                    ans.add(temp);
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1])
                        left++;
                    while(left<right && nums[right]==nums[right+1])
                        right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }

            }
        }
        return ans;
    }
}

        }

        class 3sum_closet{
        import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }

                if (currentSum < target) {
                    left++;
                }

                else if (currentSum > target) {
                    right--;
                }
                else {
                    return currentSum;
                }
            }
        }

        return closestSum;
    }
}
}

class Longest_Mountain_arry{
    class Solution {
        public int longestMountain(int[] arr) {
            if (arr.length < 3) {
                return 0;
            }

            int maxLength = 0;
            int n = arr.length;

            for (int i = 1; i < n - 1; i++) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    int left = i - 1;
                    while (left > 0 && arr[left] > arr[left - 1]) {
                        left--;
                    }
                    int right = i + 1;
                    while (right < n - 1 && arr[right] > arr[right + 1]) {
                        right++;
                    }
                    int currentLength = right - left + 1;
                    maxLength = Math.max(maxLength, currentLength);
                    i = right;
                }
            }

            return maxLength;
        }
    }

}

class maximum_product_subarray{
    class Solution {
        public int maxProduct(int[] nums) {
            if (nums == null || nums.length == 0) return 0;
            int maxProduct = nums[0];
            int minProduct = nums[0];
            int result = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int current = nums[i];
                if (current < 0) {
                    int temp = maxProduct;
                    maxProduct = minProduct;
                    minProduct = temp;
                }
                maxProduct = Math.max(current, maxProduct * current);
                minProduct = Math.min(current, minProduct * current);
                result = Math.max(result, maxProduct);
            }

            return result;
        }
    }
}
class pivot_indx{
    class Solution {
        public int pivotIndex(int[] nums) {
            int left_sum=0;
            int right_sum=0;
            int start=0;
            int end=nums.length-1;
            int totalsum=0;
            for(int i=0;i<nums.length;i++){
                totalsum+=nums[i];
            }

            for(int j=0;j<nums.length;j++){
                if(j==0){
                    left_sum=0;
                    right_sum=totalsum-nums[j];
                    if(left_sum==right_sum)
                        return j;
                }
                else{
                    left_sum+=nums[j-1];
                    right_sum=totalsum-left_sum - nums[j];
                    if(left_sum==right_sum)
                        return j;}
            }
            return -1;

        }

    }
}
class contiguous_Array{
    class Solution {
        public int findMaxLength(int[] nums) {
            if (nums == null || nums.length == 0) {
                return 0;
            }
            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 0) nums[i] = -1;
            }
            int sum = 0;
            int max = 0;
            Map<Integer, Integer> map = new HashMap<>();
            map.put(0, -1);
            for(int i = 0; i < nums.length; i++){
                sum += nums[i];
                if(map.containsKey(sum)){
                    int last = map.get(sum);
                    max = Math.max(max, i - last);
                }
                else{
                    map.put(sum, i);
                }
            }
            return max;
        }
    }
}
