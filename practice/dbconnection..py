#pymysql

import pymysql
def mysqlconnection():
    connection = pymysql.connect(host = "localhost", user = "root", password = "RJniha@21", database = "college")
    cur = connection.cursor()
    return cur,connection
    
def read_db_data(mycursor):
    query = "select * from student"
    mycursor.execute(query)
    result = mycursor.fetchall()
    for i in result:
         print(i)

cursor, connecction = mysqlconnection()
read_db_data(cursor)         