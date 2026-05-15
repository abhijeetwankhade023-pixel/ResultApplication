package service;

import entity.Student;
import helper.OutputHelper;
import repository.StudentRepository;

public class StudentService {
	
	
	 public void getStudentDeatailsByName(String name) {
		 
		 Student[] allStudents = StudentRepository.getAllStudent();
		 
		 for(int i = 0;i<allStudents.length;i++) {
			 
			 Student student = allStudents[i];
			 
			 if(student.firstName.equals(name)) {
				 
				 OutputHelper.printStudentDetails(student);
			 }
		 }
		 
	  }
	 
	 public void getStudentDeatailsById(int id) {
		 
		 Student[] allStudents = StudentRepository.getAllStudent();
		 
		 for(int i =0; i < allStudents.length;i++) {
			 
			 Student student = allStudents[i];
			 
			 if(student.id == id) {
				 
				 OutputHelper.printStudentDetails(student);
			 }
			 
		 }
		 
	 }
	 
   
	public void getAllStudentDetails() {
		 
		Student[] allStudents = StudentRepository.getAllStudent();
		
		for(int i = 0 ;i< allStudents.length; i++) {
			
			          Student student  = allStudents[i];
			          
			          OutputHelper.printStudentDetails(student);
		}
			
			
		
		
		
	}

	
		
	}
	
	
	


