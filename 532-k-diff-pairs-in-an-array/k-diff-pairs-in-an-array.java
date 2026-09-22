class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

int i = 0;
int j = 1;
int count = 0;

while (j < nums.length) {

    if (i == j) {
        j++;
    }
    else if (nums[j] - nums[i] < k) {
        j++;
    }
    else if (nums[j] - nums[i] > k) {
        i++;
    }
    else {
        count++;

        int current = nums[j];

        while (j < nums.length && nums[j] == current)
            j++;

        i++;
    }
}

return count;
        
    }
}