p, q, r = 10, 20, 30
print(p, q, r)
for i in range(1, 5):
    print(i)
else:
    print("this is else block statement")
listOne = [20, 40, 60, 80]
listTwo = [20, 40, 60, 80]

print(listOne == listTwo)
print(listOne is listTwo)

var = "James Bond"
print(var[2::-1])

year = 365
day = 24
min = 60
sec = 60
Number_of_seconds_in_a_year = year * day * min * sec
print(Number_of_seconds_in_a_year)

print("Gonna knock three times:")
for i in range(3):
    print("*knock*")
print("- Who's there?")

for i in range(10):
    print(i ** 2)

for i in range(10):
    print(2 ** i)

import math
def fact(n):
    return math.factorial(n)

f = fact(27)
print("factorial of 27: ", f)

the_list = [
    143266561,
    1738152473,
    312377936,
    1027708881,
    1871655963,
    1495785517,
    1858250798,
    1693786723,
    374455497,
    430158267,
]
print("maximum no: ", max(the_list))

def circle_perimeter(radius):
    return(2*radius*(math.pi))
print("circle_perimeter: ",circle_perimeter(1))
print("circle_perimeter: ",circle_perimeter(10))
print("circle_perimeter: ",circle_perimeter(100))


def print_even_numbers(start, stop):
    for x in range(start, stop):
        if x % 2 == 0:
            print(x)
print_even_numbers(0, 10)

sum = 0
for x in range(0, 102):
    if x % 2 == 0:
        sum = sum + x
print(sum)

sum = 0
for x in range(0,1000):
    if (x%3 == 0) or (x%5 == 0):
        sum = sum + x
print(sum)


def fahrenheit_to_celsius(temp):
    return (((temp + 40) / 1.8) - 40)
def celsius_to_fahrenheit(temp):
    return (((temp + 40) * 1.8) - 40)

print("celsius_to_fahrenheit: ", celsius_to_fahrenheit(100))
print("fahrenheit_to_celsius:", fahrenheit_to_celsius(100))

