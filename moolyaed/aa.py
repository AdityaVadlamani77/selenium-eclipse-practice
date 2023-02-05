
a, b, c, d, e = 5, 11, 52, 656, 334
print(a + b + c + d + e)
a = "adi"
print(a)
print(type(a))
print(id(a))
z = 111
print(str(z))

marks = 50
print("allowed to play video games") if marks >= 90 else print("study hard") if marks >= 70 else print("lathi charge")

a = [218, 852, 727, 338, 529, 757, 179, 901, 245, 503, 301, 549, 394, 88, 509]


def minmax(x):
    minimum = maximum = x[0]
    for i in x[1:]:
        if i < minimum:
            minimum = i
        else:
            if i > maximum:
                maximum = i
    return "min no.", minimum, "max no.", maximum


print(minmax(a))

arr = [218, 852, 727, 338, 529, 757, 179, 901, 245, 503, 301, 549, 394, 88, 509]
min1 = arr[0]
for a in arr:
    if a < min1:
        min1 = a
print("The minimum number in the list is: ", min1)

max1 = arr[0]
for a in arr:
    if a > max1:
        max1 = a
print("The maximum number in the lit is: ", max1)

arr = [218, 852, 727, 338, 529, 757, 179, 901, 245, 503, 301, 549, 394, 88, 509]
def minimum(x):
    x = sorted(x)
    return x[0]
def maximum(x):
    x = sorted(x)
    return x[-1]
print("min no.", minimum(arr))
print("max no.", maximum(arr))
