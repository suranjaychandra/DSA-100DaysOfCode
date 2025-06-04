class Solution {
  public:
    int largest(vector<int> &arr) {
        // code here
        int start = arr[0];
        for(int i = 1; i < arr.size(); i++)
        {
            if(start < arr[i])
            {
                 start = arr[i];
            }
        }
        return start;
    }
};
