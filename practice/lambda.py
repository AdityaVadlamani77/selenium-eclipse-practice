# lamada
# syntax  it contains map reduce filter
data=lambda X:X*2
#data2=lambda x,y, if x>y else y
#print(data2(4,6))
print(data(5))
# map ex
print(list( map(lambda x:x*2,[1,2,3,4,5,6,7,8,9])))
print(list(map(lambda a,b :a+b ,[1,2,3,4,5,6,7,8,9],[10,20,30,40,50,60,70,80,90])))
# filter
data2=[30,90,70,59,21,60,5,20]
print(list(filter (lambda  x:x<31,data2)))
print(list(filter (lambda  x:x%2==1,[1,2,3,4,5,6,7,8,9] )))
# reduce ex
from functools import reduce
numbers=[1,2,3,4,5,6]
print(reduce(lambda x, y: x + y,numbers))
#1+2=3+3=6+4=10+5=15+6=21

# list comprehension
print([x for x in range(1,10) if x%2==1])
print([x for x in range(1,10) if x%2==0])
#zip 
zipdata=zip([1,2,3,4],[9,8,7,6],["a","b","c","d"])
print(list(zipdata))