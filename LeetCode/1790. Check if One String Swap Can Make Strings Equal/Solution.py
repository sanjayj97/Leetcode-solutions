class Solution(object):
    def areAlmostEqual(self, s1, s2):
        if s1 == s2:
            return True
        if len(s1) != len(s2):
            return False
        l1 = list(s1)
        l2 = list(s2)

        c = 0
        l = []
        for i in range(len(s2)):
            if(l1[i] != l2[i]):
                c += 1
                if c > 2:
                    return False
                l.append([l1[i], l2[i]])
        if c == 2 and l[0] == l[1][::-1]:
            return True

        return False