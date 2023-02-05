'''
#write = create/write a file
filename = open("adityafile.txt", "w")
filename.write("hello world")
filename.close()

#read
filename = open("adityafile.txt", "r")
print (filename.read())
filename.close()

#with open read method
with open("adityafile.txt", "r")as filename:
    print(filename.read())
'''

'''#write+read (w+)
filename = open("writeplus.txt", "w+")
#print (dir (filename))
filename.write("the name of the planet is Earth")
filename.seek(0)
print (filename.read())
print (filename.readable())
print (filename.writable())
filename.close()'''

'''filename = open("adityafile.txt", "r")
print (filename.read())
print (filename.writable())
print (filename.readable())
filename.close()'''

'''append mode ('a')
filename = open("adityafile.txt", "a")
filename.write(" my name is aditya")
filename.close()'''

'''append plus
filename = open("adityafile.txt", "a+")
filename.write(" my name is aditya")
filename.seek(0)
print (filename.read())
filename.close()'''

'''filename = open("adityafile.txt", "r")
for i in (filename.readlines()):
    print(i)
filename.close()'''

'''filename = open( "aditya2.txt", "w")
filename.writelines("i am from India\ni am learning write lines\nthis is in python")
filename.close()'''

filename = open("aditya2.txt", "wb")
filename.write("i am from India\ni am learning write lines\nthis is in python")
filename.close()
