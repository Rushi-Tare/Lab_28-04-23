package courseApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//service class

public class BatchService {

	static Scanner sc = new Scanner(System.in);
	static int index = 0;

	static AWSBean aws[] = new AWSBean[50];
	static JavaBean java[] = new JavaBean[50];
	static int jindex = 0;
	static int aindex = 0;

	public void checkCourse(String course) throws CourseNotFoundException {
		if (course.equals("JAVA") || course.equals("AWS")) {
			System.out.println("The course you're looking for the is available with us!");
		} else {
			throw new CourseNotFoundException("Course not found:");
		}

	}

	// create course for aws
	public static void createAWSCourse() {
		System.out.println("Enter stdId:");
		int id = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter stdName:");
		String name = sc.nextLine();

		System.out.println("Enter phone:");
		long phone = sc.nextLong();

		System.out.println("Enter email");
		String email = sc.next();

		aws[aindex] = new AWSBean(id, name, phone, email);
		aindex++;
		System.out.println("AWS Course details created successfully!");
	}

	// create course for java
	public static void createJavaCourse() {
		System.out.println("Enter stdId:");
		int id = sc.nextInt();

		sc.nextLine();

		System.out.println("Enter stdName:");
		String name = sc.nextLine();

		System.out.println("Enter phone:");
		long phone = sc.nextLong();

		System.out.println("Enter email");
		String email = sc.next();

		java[jindex] = new JavaBean(id, name, phone, email);
		jindex++;
		System.out.println("Java Course details created successfully!");
	}

	// get all student details in aws
	public static void getAllStudentDetailsAWS() {
		for (int i = 0; i < aindex; i++) {
			System.out.println(" Id: " + aws[i].getStdId());
			System.out.println(" Name: " + aws[i].getStdName());
			System.out.println(" phone: " + aws[i].getPhone());
			System.out.println(" email: " + aws[i].getEmail());
			System.out.println();
		}
	}

	public static void getAllStudentDetailsJava() {
		for (int i = 0; i < jindex; i++) {
			System.out.println(" Id: " + java[i].getStdId());
			System.out.println(" Name: " + java[i].getStdName());
			System.out.println(" phone: " + java[i].getPhone());
			System.out.println(" email: " + java[i].getEmail());
			System.out.println();
		}
	}

	public static void getStudentDetailsByIdInAWS() {
		System.out.println("Enter Id to search(aws)");
		boolean flag = false;
		int id = sc.nextInt();
		for (int i = 0; i < aindex; i++) {
			if (aws[i].getStdId() == id) {
				System.out.println(" Id: " + aws[i].getStdId());
				System.out.println(" Name: " + aws[i].getStdName());
				System.out.println(" phone: " + aws[i].getPhone());
				System.out.println(" email: " + aws[i].getEmail());
				System.out.println();
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Details not found!");
		}
	}

	public static void getStudentDetailsByIdInJava() throws CourseNotFoundException {
		System.out.println("Enter Id to search(java)");
		boolean flag = false;
		int id = sc.nextInt();
		for (int i = 0; i < jindex; i++) {
			if (aws[i].getStdId() == id) {
				System.out.println(" Id: " + java[i].getStdId());
				System.out.println(" Name: " + java[i].getStdName());
				System.out.println(" phone: " + java[i].getPhone());
				System.out.println(" email: " + java[i].getEmail());
				System.out.println();
				flag = true;
				break;
			}
		}
		if (flag == false) {
			throw new CourseNotFoundException("Course not found:");
		}
	}

	// to update book details
	public static void updateAWS() throws CourseNotFoundException {
		System.out.println("Enter Id to search");
		boolean flag = false;
		int id = sc.nextInt();
		for (int i = 0; i < aindex; i++) {
			if (id == aws[i].getStdId()) {
				sc.nextLine();
				System.out.println("Enter stdId:");
				int id1 = sc.nextInt();

				sc.nextLine();

				System.out.println("Enter stdName:");
				String name = sc.nextLine();

				System.out.println("Enter phone:");
				long phone = sc.nextLong();

				System.out.println("Enter email");
				String email = sc.next();

				aws[aindex] = new AWSBean(id1, name, phone, email);
				flag = true;

			}
		}
		if (flag == true) {
			System.out.println("(AWS): details updated successfully!!");
		} else
			throw new CourseNotFoundException("Course not found:");

	}

	public static void updateJava() throws CourseNotFoundException {
		System.out.println("Enter Id to search");
		boolean flag = false;
		int id = sc.nextInt();
		for (int i = 0; i < jindex; i++) {
			if (id == java[i].getStdId()) {
				sc.nextLine();
				System.out.println("Enter stdId:");
				int id1 = sc.nextInt();

				sc.nextLine();

				System.out.println("Enter stdName:");
				String name = sc.nextLine();

				System.out.println("Enter phone:");
				long phone = sc.nextLong();

				System.out.println("Enter email");
				String email = sc.next();

				java[jindex] = new JavaBean(id1, name, phone, email);
				flag = true;

			}
		}
		if (flag == true) {
			System.out.println("(AWS): details updated successfully!!");
		} else
			throw new CourseNotFoundException("Course not found:");

	}
}
