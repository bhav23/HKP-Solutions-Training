
class Solution
{
    public int[] searchRange(int[] nums, int target) 
    {
        int[] retArr = {-1, -1};
        
        //Edge case if array is empty
        if (nums.length == 0)
        {
            return retArr;
        }
        
        int start = -1;
        int end = -1;
        
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == target)
            {
                start = i;
                break;
            }
        }
        
        
        //if start is still -1, return retArr which is still {-1, -1}
        if (start == -1)
        {
            return retArr;
        }
        else
        {
            //starts loop after the start index of num 
            for (int i = start + 1; i < nums.length; i++)
            {
                if (nums[i] == target)
                {
                    end = i;
                }
            }
            
            //if the list only had the number once, so end still = -1
            if (end == -1)
            {
                retArr[0] = start;
                retArr[1] = start;
            }
            else
            {
                retArr[0] = start;
                retArr[1] = end;
            }

            return retArr;
        }
    }
}
