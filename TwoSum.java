public class TwoSum {
  public static void main(String[] args) {
    int a[] = {3,5,6,8};
    int target  = 8;
    int[] result = twoSum(a, target);
    
    if (result != null) {
      System.out.println("Indices: " + result[0] + ", " + result[1]);
    } else {
      System.out.println("No solution found.");
    }

  }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
  
}

