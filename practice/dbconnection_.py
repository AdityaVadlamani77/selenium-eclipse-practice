#pymysql
"""
mysqlconnection
create db
create table
insert data into table
read data from database table
drop table
drop database
"""
import pymysql
def mysqlconnection():
    connection = pymysql.connect(host = "localhost", user = "root", password = "Rjniha@21", database = "college")
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
       