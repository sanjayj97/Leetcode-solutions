class Solution:
    def complexNumberMultiply(self, num1: str, num2: str) -> str:
        c1r, c1i = num1.split('+')
        c2r, c2i = num2.split('+')

        c1r = int(c1r)
        c2r = int(c2r)
        c1i = int(c1i[:-1])
        c2i = int(c2i[:-1])

        r = c1r * c2r - c1i * c2i
        i = c1r * c2i + c2r * c1i

        return str(r) + "+" + str(i) + "i"



