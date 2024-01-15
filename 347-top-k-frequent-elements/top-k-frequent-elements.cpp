#include <map>
#include <vector>

class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        std::map<int, std::vector<int>> mp;
        std::sort(nums.begin(), nums.end());

        for (int i = 1; i <= nums.size(); i++)
        {
            int freq = 1;
            while (i < nums.size() && nums[i - 1] == nums[i])
                i++, freq++;
            mp[freq].push_back(nums[i - 1]);
        }

        std::vector<int> vec;
        for (auto it = mp.rbegin(); it != mp.rend() && vec.size() < k; ++it)
            std::copy(it->second.begin(), it->second.end(), std::back_inserter(vec));

        vec.resize(k);
        return vec;
    }
};
