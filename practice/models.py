'''
models

os
sys
datetime
time
re
pymysql
'''

import os
#print(dir(os))
#os.rename("aditya2.txt", "17052022.txt")

if os.path.exists("17052022.txt"):
    os.remove("17052022.txt")  
else:
    print("file does not exist")

'''if os.path.isdir("modules"):
    print("folder already exists")
else:    
    os.mkdir("modules")'''

if not os.path.isdir("modules"):
    os.mkdir("modules")    
else:    
    print("folder already exists")
    
print(os.getcwd())
for files in os.walk(os.getcwd()):
    print(files)
    print(type(files))
    #print(dir(files))
file_1 = ['adityafile.txt', 'filehandling.py', 'functions.py', 'functions2.py', 'lambda.py', 'models.py', 'operators.py', 'writeplus.txt']
if "models.py" in file_1:
    print("3rd file exists")
else:
    print("3rd file doesnt exist")
        