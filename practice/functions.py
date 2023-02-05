''' required arguments
default arguments
keyword arguments
variable length arguments - non keyword arguments (*)
named arguments - keyword arguments (**) '''

def name():
    pass
name() 

#required arguments
def add(name, b, c):
    print ("name is",name)
    print ("b is",b)
    print ("c is",c)
    print ("sum of", b + c)
add ("aditya", 10, 20)   

#default arguments
def default(name, age = 22):
    print ("name is", name)
    print ("age is", age)
#default ("aditya", 25) 
default (age = 25, name = "aditya")

#keyword arguments
def keyword(name, _id):
    print(name, _id)
keyword(name = "aditya", _id = 123)

#variable length arguments - non keyword arguments
def variable_length_arg(a, *b):
    print("a value is", a)
    print("b value is", b)
variable_length_arg(1, 1, 2, 3, 4, 5)

#named arguments - keyword arguments (**)
def named_keyword_arg(**details):
    print(details)
named_keyword_arg(name = "aditya", age = 22, Degree = "BCA")   

def sum(a, b):
    return a + b
data = sum(10, 20)
print(data)
data = sum(50, 60)
print(data)

def add(a=10, b=20)
    return a+b, a-b
  
  