#datetime module
import datetime
n = datetime.datetime.now()
print(n)
n = datetime.datetime.utcnow()
print(n)
print(n.year)
print(n.month)
print(n.day)
print(n.strftime("%m"))
print(n.strftime("%b"))
print(n.strftime("%p"))
print(n.strftime("%U"))
print(n.strftime("%H"))
print(n.strftime("%A"))
print(n.strftime("%a"))

'''
sys
os
time
datetime
calendar
'''
import calendar
b = calendar.calendar(2023, 1, 1, 6)
print(b)

cal = calendar.isleap(2017)
print(cal)
print(calendar.firstweekday())