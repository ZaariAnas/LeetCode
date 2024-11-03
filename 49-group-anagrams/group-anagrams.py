class Solution(object):
    def groupAnagrams(self, strs):
        res = defaultdict(list)
        
        for s in strs:
            hash_map = [0] * 26
            
            for c in s:
                hash_map[ord(c) - ord('a')] += 1
            
            res[tuple(hash_map)].append(s)
        return res.values()
        