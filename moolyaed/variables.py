"""def add(a, b):
    global x
    x = 20
    print(x)
    print (a + b)

def subtract(a, b):
    print (a - b)
    print(x)"""
x = 10
def multiply():
    print(x)
    def sub():
        x = 30
        print (x)
        def add():
            print(x)
        add()     
    sub()
multiply()





