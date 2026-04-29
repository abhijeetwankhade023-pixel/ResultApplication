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
			Student ram = repository.getRamObject();
			helper.printStudentDetails(ram);
			break;
		}
		case "Sham": {
			Student sham = repository.getShamObject();
			helper.printStudentDetails(sham);
			break;
		}
		case "Vishal": {
			Student vishal = repository.getVishalObject();
			helper.printStudentDetails(vishal);
			break;
		}
		case "Pankaj": {
			Student pankaj = repository.getPankajObject();
			helper.printStudentDetails(pankaj);
			break;
		}
		case "Prachi": {
			Student prachi = repository.getPrachiObject();
			helper.printStudentDetails(prachi);
			break;
		}
		case "Akash": {
			Student akash = repository.getAkashObject();
			helper.printStudentDetails(akash);
		}
		case "Nishant": {
			Student nishant = repository.getNishantObject();
			helper.printStudentDetails(nishant);
			break;
		}
		case "Yogesh": {
			Student yogesh = repository.getYogeshObject();
			helper.printStudentDetails(yogesh);
			break;
		}
		case "Prajakta": {
			Student prajakta = repository.getPrajaktaObject();
			helper.printStudentDetails(prajakta);
			break;
		}
		case "Vaishnavi": {
			Student vaishnavi = repository.getVaishnaviObject();
			helper.printStudentDetails(vaishnavi);
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
