package courseApp;

import java.util.Scanner;

//Main class
public class CourseMain {
	public static void main(String[] args) {
		BatchService batchService = new BatchService();

		do {

			Scanner sc = new Scanner(System.in);

			// JavaBean course = service.getCourseById(1);

			System.out.println("Main menu: ");
			System.out.println("Press:\n1) JAVA\n" + "2) AWS\n" + "3) Others\n" + "4) Exit");
			System.out.println();
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("JAVA ->: ");
				System.out.println("Press:\n1) Register new Student\n" + "2) Show All Stdent Details\n"
						+ "3) Update Student details by Id\n" + "4) Exit");

				int javaChoice = sc.nextInt();
				switch (javaChoice) {
				case 1:
					batchService.createJavaCourse();
					System.out.println();
				//	System.out.println("Register new Student");
					break;
				case 2:
					batchService.getAllStudentDetailsJava();
					System.out.println();
					//System.out.println(" Show All Stdent Details");
					break;
				case 3:
					try {
						batchService.updateJava();
					} catch (CourseNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					System.out.println();
					//System.out.println(" Update Student details by Id");
					break;
				case 4:
					System.out.println(" Thank you!!1");
					System.exit(0);
					break;
				default:
					break;
				}

				//System.out.println("end of the java bean methods");
				break;

			case 2:
				System.out.println("AWS ->: ");
				System.out.println("Press:\n1) Register new Student\n" + "2) Show All Stdent Details\n"
						+ "3) Update Student details by Id\n" + "4) Exit");

				int awsChoice = sc.nextInt();
				switch (awsChoice) {
				case 1:
					batchService.createAWSCourse();
					System.out.println();
					//System.out.println("Register new Student");
					break;
				case 2:
					batchService.getAllStudentDetailsAWS();
					System.out.println();
					//System.out.println(" Show All Stdent Details");
					break;
				case 3:
					try {
						batchService.updateAWS();
					} catch (CourseNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					//System.out.println(" Update Student details by Id");
					break;
				case 4:
					System.out.println(" Thank you!!1");
					System.exit(0);
					break;
				default:
					break;
				}

				System.out.println("end of the aws bean methods");
				break;

			case 3:
				System.out.println("OTHERS: ");
				try {
					System.out.println("Enter the Course name you want to search.");
					String course = sc.next();
					batchService.checkCourse(course);
				} catch (CourseNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;

			case 4:
				System.out.println("Thank you for visiting!!!");
				System.exit(0);
				break;

			}

		} while (true);
	}
}
