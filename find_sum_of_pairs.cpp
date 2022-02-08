#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

bool find_sum_pairs(vector<int>& A, int target) {
    unordered_set<int> found_values;
    for(int& a: A) {
        if(found_values.find(target - a) != found_values.end()) {
            return true;
        }
        found_values.insert(a);
    }
    return false;
}

int main() {
    vector<int> numbers = { 1, 3, 5, 9 };
    int test = 8;
    bool output = find_sum_pairs(numbers, test);
    cout << output;
    return 0;
}