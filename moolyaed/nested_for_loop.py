"""list1 = ["election", "crack", "pause", "educate", "term"]
for x in list1:
    for y in x:
        print(y)"""

list2 = [["valley", "quantity", "whistle", "obey", "nurse"], ["fool", "radio", "kind", "wool", "tell"]]
for x in list2:
    for y in x:
        print(y)

list3 = [["India", "Mumbai"], ["United States", "Los Angeles"], ["Canada", "Toronto"]]
# for x in list3:
for y, z in list3:
    print(y, z)

dict1 = dict(list3)
print(dict1)
for a, b in dict1.items():
    print(a, b)
list4 = ["India", "Mumbai", "United States", "Los Angeles"]
set1 = set(list4)
print(set1)
tuple1 = tuple(list4)
print(tuple1)
tuple2 = tuple(list3)
print(tuple2)

import math
x = math.sqrt(225)
print(x)
