package com.ojas;

import java.sql.*;
import java.util.Scanner;


public class JdbcDemo {
public static void main (String[] args) {
	
	try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java200","root","root");
	System.out.println("Connected" + con);
	Scanner sc=new Scanner(System.in);
	Statement st = con.createStatement();
	//System.out.println("Enter no,name and marks?");
	
	
	//insert records
//	int num = sc.nextInt();
//	String name = sc.next();
//	int marks = sc.nextInt();
//	int res = st.executeUpdate("insert into student values("+num+",'"+ name + "',"+marks +")");
//	System.out.println(res + "Inserted successfully");
//	
	// delete records
//	System.out.println("Enter no ?");
//	int num = sc.nextInt();
//	int res = st.executeUpdate("delete from student where sno ="+num);
//	System.out.println(res + "deleted successfully");
//	
	
	//update records
	System.out.println("Enter num,name,marks?");
	int num = sc.nextInt();
	String name = sc.next();
	int marks = sc.nextInt();
	int res = st.executeUpdate("update student set sname=" + "'"+name+"', marks="+marks+" where sno="+num);
	System.out.println(res + "updated successfully");
	
	
	
//	int res = st.executeUpdate("insert into student values(1,'ramu',56)");
//	System.out.println(res + "Inserted successfully");
//	st.executeUpdate("create table student(sno int,sname varchar(20),marks int)");
//	System.out.println("table is created successfully");
	st.close();
	
	con.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
  }
}
