class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, new ArrayList<>(), result, 0);
        return result;
    }

    private void backtrack(int[] candidates, int target, List<Integer> current, List<List<Integer>> result, int index) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (target < 0 || index >= candidates.length) {
            return;
        }

        // Choose the current number
        current.add(candidates[index]);
        // Allow reuse of the same element, so stay at the same index
        backtrack(candidates, target - candidates[index], current, result, index);
        current.remove(current.size() - 1); // backtrack

        // Skip the current number and move to the next
        backtrack(candidates, target, current, result, index + 1);
    }
}