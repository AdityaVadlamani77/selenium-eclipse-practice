from multipledispatch import dispatch
@dispatch(int,int)
def add(a,b):
    print (a, "+", b, "=", a + b)

@dispatch(int,int,int)
def add(a,b,c):
    print (a, "+", b, "+", c, "=", a + b + c)
@dispatch(int,int,int,int)
def add(a,b,c,d):
    print (a, "+", b, "+", c, "+",d, "=",a + b + c + d)

add(1,2)
add(1,2,3)
add(1,2,3,4)


