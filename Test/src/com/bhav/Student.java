package com.bhav;

class A{
	String s="saurabh";
}
public class Student implements Cloneable  {
	int name;
	A a;
String st;
	Student(int name,String s,A a){
		this.name=name;
		this.st=s;this.a=a;
	}
	@Override
	public
	boolean equals(Object o) {
		return o==this;
		
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		Student s= new Student(10,"bhav",new A());
		Student s1=(Student) s.clone();
		s1.name=100;
		s1.a.s="singh";
		System.out.println(s1.a.getClass());
	}

}
