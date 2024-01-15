class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs)
    {
        std::unordered_map<std::string, std::vector<std::string> > mp;
        std::vector<std::vector<std::string> > vec;
    
        for (auto s: strs)
        {
            std::string tmp = s;
            std::sort(tmp.begin(), tmp.end());
            mp[tmp].push_back(s);
        }
        for (auto m: mp)
            vec.push_back(m.second);
        return vec;
    }
};