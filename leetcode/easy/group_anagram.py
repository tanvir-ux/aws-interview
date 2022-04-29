from typing import List
class Solution:
    def findHash(self, string):
        return ''.join(sorted(string))

    def groupAnagram(self, strings: List[str]) -> List[List[str]]:
        answers = []
        map = {}

        for s in strings:
            hashed = self.findHash(s)
            if (hashed not in map):
                map[hashed] = []
            map[hashed].append(s)
        
        for x in map.values():
            answers.append(x)
        
        return answers

