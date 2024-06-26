package com.pk.designpattern;
/**
 * 
 *Singleton Pattern
 *Approach: 
 *need one private constructor.
 *need one private,static global variable with Student dataType.
 *need one helper/factory method to create a object only once and give the access to other classes.
 *
 *Note:- helper method should be static.
 */
class Student {
	private static Student student=null;
/**
 * private constructor which is not allowed to create any object for student class in other class.	
 */
	private Student() {
		System.out.println("Student Object Intilized");
	}
/**
 * Helper Method which is used to create object for Student class
 */
	public static Student getStudentObject() {
		if(student==null)
			student=new Student();
		return student;
	}
}

public class SingletonPattern {
	public static void main(String[] args) {
		Student student=Student.getStudentObject();
		System.out.println(student.hashCode());
		
		Student student2 = Student.getStudentObject();
		System.out.println(student2.hashCode());
		
		if(student==student2) {
			System.out.println("Student Object singleton");
		}
	}
}
