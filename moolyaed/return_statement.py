def add(a, b, c):  # optional argument
    '''

    :param a:
    :param b:
    :param c:
    :return:
    '''

    return a**2


z = add(b=1, a=2, c=3)
#print(z)

# positional argument
# keyword argument
# required argument
# optional argument

def f(n):
    if n in {0, 1}:
        return n
    return f(n - 1) + f(n - 2)

print([f(n) for n in range(15)])
#square of a no times 5 plus/minus 4 should be a perfect square
import math 
print(math.sqrt(841))
print("n:")
n = int(input())
print("fibonnacci of", n, ":", f(n))


