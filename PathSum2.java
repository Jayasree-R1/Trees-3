
//TC: O(n)
//SC : O(n*h) ==> O(n)
class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        this. result = new ArrayList<>();
        helper(root, targetSum, 0, new ArrayList<>());
        return result;
    }
    private void helper(TreeNode root, int targetSum, int currSum, List<Integer> path){
        //base case
        if(root == null) return;

        //Action
        currSum = currSum + root.val;
        path.add(root.val);


        if(root.left == null && root.right == null){
            if(currSum == targetSum){
                System.out.print(path);
                result.add(new ArrayList<>(path));
                System.out.print(path);
            }
        }

        //recursion
        helper(root.left, targetSum, currSum, path);
        helper(root.right, targetSum, currSum, path);

        //backtrack
        path.remove(path.size()-1);

    }
}