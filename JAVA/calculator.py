import pymysql

con,cur = None,None
data1,data2,data3,data4="","","",""
row = None
conn = pymysql.connect(host='127.0.0.1',user='root',password='',db='hanbitDB')



cur = conn.cursor()

cur.execute("select * from userTable")

print("사용자 ID    사용자이름      이메일      출생년도")

while(True):
    row=cur.fetchone()
    if row == None:
        break
    data1=row[0]
    data2=row[1]
    data3=row[2]
    data4=row[3]
    print("%5s  %15s    %20s    %d" %(data1,data2,data3,data4))
conn.close()

