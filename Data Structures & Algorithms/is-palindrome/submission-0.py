class Solution:
    def isPalindrome(self, s: str) -> bool:
        beg = 0
        end = len(s)-1

        while (beg<end):
            if not s[beg].isalnum():
                beg+=1 
            elif not s[end].isalnum():
                end-=1
            elif (s[beg].lower() == s[end].lower()):
                beg+=1
                end-=1
            else:
                return False
        
        return True
        