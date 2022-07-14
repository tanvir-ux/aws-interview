using namespace std;

#include <iostream>
#include <vector>
#include <algorithm>

class MaxSumSubArrayOfSizeK {
    public:
    static int findMaxSumSubArray(int k, const vector<int>& arr) {
        int maxSum = 0, windowSum = 0, windowStart = 0;

        for (int windowEnd = 0; windowEnd < arr.size(); windowEnd++) {
            windowSum += arr[windowEnd];

            if (windowEnd >= k-1) {
                maxSum = max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }            
        }
        return maxSum;
    }
};

int main(int agrc, char* argv[]) {
    cout << "Maximum sum of a subarray of size k: " 
         << MaxSumSubArrayOfSizeK::findMaxSumSubArray(3, vector<int>{2, 1, 5, 1, 3, 2}) << endl;

    cout << "Maximum sum of a subarray of size k: "
         << MaxSumSubArrayOfSizeK::findMaxSumSubArray(2, vector<int>{2, 3, 4, 1, 5}) << endl;

}