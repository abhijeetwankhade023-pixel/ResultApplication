package main;

import java.util.Scanner;

import entity.Student;
import helper.OutputHelper;
import repository.StudentRepository;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Student :");
		String name = sc.next();

		StudentRepository repository = new StudentRepository();

		OutputHelper helper = new OutputHelper();

		switch (name) {
		case "Ram": {
			//before static
			//Student ram = repository.getRamObject();
			//after
			 System.out.println(StudentRepository.getRamObject());
			helper.printStudentDetails(StudentRepository.getRamObject());
			break;
		}
		case "Sham": {
			//Student sham = repository.getShamObject();
			//System.out.println(repository.getShamObject());
			//Student sham = StudentRepository.getShamObject();
			System.out.println(repository.getShamObject());
			helper.printStudentDetails(repository.getShamObject());
			break;
		}
		case "Vishal": {
			//Student vishal = repository.getVishalObject();
			//before Static
			//System.out.println(repository.getVishalObject());
			//After static
			Student vishal = StudentRepository.getVishalObject();
			helper.printStudentDetails(vishal);
			break;
		}
		case "Pankaj": {
			//Student pankaj = repository.getPankajObject();
			System.out.println(repository.getPankajObject());
			helper.printStudentDetails(repository.getPankajObject());


			break;
		}
		case "Prachi": {
			//Student prachi = repository.getPrachiObject();
			System.out.println(repository.getPrachiObject());
			helper.printStudentDetails(repository.getPrachiObject());
			break;
		}
		case "Akash": {
			//Student akash = repository.getAkashObject();
			System.out.println(repository.getAkashObject());
			helper.printStudentDetails(repository.getAkashObject());
		}
		case "Nishant": {
			//Student nishant = repository.getNishantObject();
			System.out.println(repository.getNishantObject());
			helper.printStudentDetails(repository.getNishantObject());
			break;
		}
		case "Yogesh": {
			//Student yogesh = repository.getYogeshObject();
			System.out.println(repository.getYogeshObject());
			helper.printStudentDetails(repository.getYogeshObject());
			break;
		}
		case "Prajakta": {
			//Student prajakta = repository.getPrajaktaObject();
			System.out.println(repository.getPrajaktaObject());
			helper.printStudentDetails(repository.getPrajaktaObject());
			break;
		}
		case "Vaishnavi": {
			//Student vaishnavi = repository.getVaishnaviObject();
			System.out.println(repository.getVaishnaviObject());
			//helper.printStudentDetails(repository.getVaishnaviObject());
			
			break;
		}
		default:
			System.err.println("Please Enter proper name");
		}
	}

}

//StudentRepository repository = new StudentRepository();

//	System.out.println("Print Ram details");

//Student ram = repository.getRamObject();

//System.out.println(ram.id);

//System.out.println(ram.firstName);

//System.out.println(ram.lastName);

//System.out.println(ram.mathsObtained);

//System.out.println(ram.scienceObtained);

//System.out.println(ram.englishObtained);
