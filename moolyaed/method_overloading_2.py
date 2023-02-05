# one parameter - square of no
# two parameter - add
# three parameter - multipy
# four parameter - find perfect square

from multipledispatch import dispatch
import math
@dispatch(int)
def cal(a):
    print (a, "** 2", "=", a ** 2)
@dispatch(int,int)
def cal(a,b):
    print (a, "+", b, "=", a + b)
@dispatch(int,int,int)
def cal(a,b,c):
    print (a, "*", b, "*", c, "=", a * b * c)
@dispatch(int,int,int,int)
def cal(a,b,c,d):
    j = a*b*c*d
    while j>0:  
        k = math.sqrt(j)   
        if math.floor(k) == math.ceil(k):
            print(j, "is a perfect square")
        else:
            print(j, "is not perfect square")
        break
    while j<0:  
        print(j,": negative squares do not exist")
        break


        
    
cal(15)
cal(27,33)
cal(18,15,16)
cal(-50, 54, -4, -14)
cal(1,3,3,3)
cal(1,5,5,1)