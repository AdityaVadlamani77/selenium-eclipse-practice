"""list1 = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
for x in list1:
    print(x)"""

"""for x in range(1, 11):
    print(x)"""


# print all odd and even number till 100 using range function
def print_even_numbers(start, stop):
    for x in range(start, stop):
        if x % 2 == 0:
            print(x, end=", ")


def print_odd_numbers(start, stop):
    for x in range(start, stop):
        if x % 2 != 0:
            print(x, end=", ")


print("Even Numbers:")
print_even_numbers(0, 100)

print("\n")
print("Odd Numbers:")
print_odd_numbers(0, 100)

# print table of 23 till 10 using range
print("table_of_23:")
for i in range(1, 11):
    print("23 *", i, "=", 23 * i)

# print all even and odd using only range not condition statement
"""def print_even_odd(start, stop):
    for x in range(start, stop):
        if x % 2 == 0:
            print("even:", x)
        if x % 2 != 0:
            print("odd:", x)
print_even_odd(1, 100)"""

print("Odd Numbers:")
for x in range(1, 100, 2):
    print(x, end=", ")
print("\n")
print("Even Numbers:")
for x in range(2, 101, 2):
    print(x, end=", ")
print("\n")

