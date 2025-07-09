class Solution {
    public List<List<Integer>> permute(int[] nums) {
           List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] nums, List<Integer> tempList, List<List<Integer>> result) {
        if (tempList.size() == nums.length) {
            result.add(new ArrayList<>(tempList)); // Add a copy of the current permutation
            return;
        }

        for (int num : nums) {
            if (tempList.contains(num)) continue; // Skip already used numbers
            tempList.add(num);                    // Choose
            backtrack(nums, tempList, result);    // Explore
            tempList.remove(tempList.size() - 1); // Un-choose (backtrack)
        }
    }

    }
