package helper;

import entity.Student;

public class OutputHelper {

	 public  static void printStudentDetails(Student s) {
		 
		
				System.out.println("id : " + s.id);
				System.out.println("Name : " + s.firstName);
				System.out.println("Last name : " + s.lastName);
				System.out.println("English Marks :" + s.englishObtained);
				System.out.println("Maths Marks :" + s.mathsObtained);
				System.out.println("Science Marks :" + s.scienceObtained);
				System.out.println("Standard :" +Student.standard);
				
				
				
				
				
				
			}
		 
		 
	 }

