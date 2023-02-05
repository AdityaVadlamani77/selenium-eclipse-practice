'''
re is used for pattern matching or searching
identifiers: 
/d - any number
/D - anything but a number 
/s - 
/S
/w - word matching
/W
/b
. - any character except a new line

Modifiers:
{1, 3}
+ - match one or more
? - match zero or one
* - match zero or more
$ - match the ending of the string
^ - match the beginning of the string
| - either
[] - range or variant [1-5] or [A-Z, a-z]

wide space characters:
\n - new line
\s - space
\t - tab space
\f - 
\r - 

flags:
re.M
re.I
'''

'''
symbols:
. * ? [] $ ^ () {} | / \
'''

'''
match
search
findall
sub
split
'''

import re 
data = "cats are smarter than dogs"
matchobj = re.match(r"(.*) are (.*?) .*",data)
print(matchobj.group())
print(matchobj.group(1))
print(matchobj.group(2))

gmail = "aditya.v.21@gmail.in"
gmailobj = re.match(r"\w+[./\w]+@\w+[.]*(com|in|gov)", gmail)
print(gmailobj.group())

#search
data = "cats are smarter than dogs"
searchobj = re.search(r"[a-z].*",data, re.M|re.I)
if searchobj:
    print(searchobj.group())
else:
    print('not found')