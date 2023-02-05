def outer():
    x = "local"

    def inner():
        nonlocal x
        x = "nonlocal"
        print("inner:", x)

    inner()
    print("outer:", x)


outer()

def check_type(data):
    #print(type(data))
    if type(data) == int:
        print("type = number")
    elif type(data) == tuple:
        print ("type = tuple")
         
check_type(1234)
check_type((1, 2, 3, 4))