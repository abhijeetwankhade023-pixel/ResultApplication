package main;

import java.util.Scanner;

import entity.Student;
import helper.OutputHelper;
import repository.StudentRepository;
import service.StudentService;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.err.println("!!! Welcome to Result Application !!!");

		
		while(true){
			

			
			//System.err.println("!!! Welcome to Result Application !!!");
			System.out.println("Please select option of your choice");
			System.out.println("1. Get Student Details by Name");
			System.out.println("2. Get Student Details by id");
			System.out.println("3. Get All Student Details");
			System.out.println("4. Exit");
			
			System.out.println("Please Enter your option ");
			 int val = sc.nextInt();
			 
			 
			 StudentService service = new StudentService();
	   switch (val) {
		
		  case 1: {
		 
		  System.out.println("Enter name of Student :" );
		  
		  String name = sc.next();
		  
		  service.getStudentDeatailsByName(name);
		  
		  break;
		  }
		 
	case 2:{
		System.out.println("Enter id of Student");
		
		int id = sc.nextInt();
		
		
		service.getStudentDeatailsById(id );
		break;
		
	}
case 3:{
		
		
		service.getAllStudentDetails();
		break;
		
	}
	case 4:{
		System.out.println("Application Closed");
	
		
		return;
	
	}
	
	default:
		System.err.println("Unexpected value :" + val);
	}
	   
	
	
		
		
		
		}	
		

	}

}

