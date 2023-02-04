package com.ironhack.ironschool.main.menu;

import com.ironhack.ironschool.main.utils.Commands;

import java.util.Scanner;

public class Menu {

        static Commands commands = new Commands();
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello Principal, \n Welcome to School Simulator! \n" +
                "First things first, what's the name of your school? ");
        String schoolName = scanner.nextLine();
        commands.setSchoolName(schoolName);
        System.out.println(commands.getSchoolName() + " Principal. Sounds awesome!");
        boolean successInputCourses = false;
        do {
            System.out.println("How many courses does " + commands.getSchoolName() + " offer?");
            try {
                int howManyCourses = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < howManyCourses; i++) {
                    System.out.println("Name of course nº" + (i + 1));
                    String courseName = scanner.nextLine();
                    System.out.println("How much does " + courseName + " it cost?");
                    int courseCost = Integer.parseInt(scanner.nextLine());
                    commands.createCourse(courseName, courseCost);
                    successInputCourses = false;
                }
            } catch (NumberFormatException e) {
                successInputCourses = true;
                System.out.println("Error. Please put input in number format. Example: 1, 2, 3  ...");
            }
        } while (successInputCourses) ;
        boolean successInputTeachers = false;
        do {
            System.out.println("Ok, now let's talk about teachers.\nHow many teachers does " + schoolName + " has?");
            try {
              int howManyteachers = Integer.parseInt(scanner.nextLine());
              for (int i = 0; i < howManyteachers; i++) {
                  System.out.println("Name of teacher nº" + (i + 1));
                  String teacherName = scanner.nextLine();
                  System.out.println("How much does " + teacherName + " earn ?");
                  int teacherSalary = Integer.parseInt(scanner.nextLine());
                  commands.createTeacher(teacherName, teacherSalary);
                  successInputTeachers = false;
        }
            } catch (NumberFormatException e) {
                successInputTeachers = true;
                    System.out.println("Error. Please put input in number format.");
            }

        }while (successInputTeachers);
        boolean successInputStudents = false;
        do {
        System.out.println("Perfect then.\nNow for last but not least, let's talk about students");
            try {
                    System.out.println("How many students does the amazing " + schoolName + " has?");
                    int howManyStudents = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < howManyStudents; i++) {
                        System.out.println("Name of student nº" + (i + 1));
                        String studentName = scanner.nextLine();
                        System.out.println("What's " + studentName + "'s address ?");
                        String studentAddress = scanner.nextLine();
                        System.out.println("What's " + studentName + "'s email ?");
                        String studentEmail = scanner.nextLine();
                        commands.createStudent(studentName, studentAddress, studentEmail);
                        successInputStudents = false;
                    }
            } catch (NumberFormatException e) {
                successInputStudents = true;
                System.out.println("Error. Please put input in number format. Example: 1, 2, 3 ... ");
            }
        }while (successInputStudents);
        System.out.println("Ok... I think everything is set up.");
//        scanner.close();
    }

    public static void menuCommands() {
        boolean isMenuOn = true;
        Scanner scannerMenu = new Scanner(System.in);
        while (isMenuOn) {
        System.out.println("What would you do now? Here you've got the menu.");
        System.out.println("1 - Enroll - Student ID and Course ID REQUIRED - (This command will help enroll the student specified in the corresponding course).");
        System.out.println("2 - Assign - Teacher ID and Course ID REQUIRED - (This command will help assign the teacher specified to the corresponding course).");
        System.out.println("3 - Show courses - (This command will display a list of all courses).");
        System.out.println("4 - Lookup course - Course ID and REQUIRED - (This command will display the full details of the specified course).");
        System.out.println("5 - Show students - (This command will display a list of all students).");
        System.out.println("6 - Lookup student - Student ID REQUIRED - (This command will display the full details of the specified student).");
        System.out.println("7 - Show teachers - (This command will display a list of all teachers).");
        System.out.println("8 - Lookup teacher - Teacher ID REQUIRED - (This command will display the full details of the specified teacher).");
        System.out.println("9 - Show profit - This command will calculate and return the profit of all courses.");
        System.out.println("10 - Exit - This command will close the program.");
        String commandMenu = scannerMenu.nextLine();
        commandMenu=  commandMenu.toLowerCase();
            String pressEnterToContinue;
            boolean errorData;
            switch (commandMenu) {
                case "1", "enroll":
                    do {
                        System.out.println("Insert student ID");
                        String studentId = scannerMenu.nextLine();
                        System.out.println("Insert course ID");
                        String courseId = scannerMenu.nextLine();
                        if (studentId.equalsIgnoreCase("c")||studentId.equalsIgnoreCase("cancel")||
                                courseId.equalsIgnoreCase("c")||courseId.equalsIgnoreCase("cancel")){
                            break;
                        }
                        errorData = false;
                        try{
                            commands.enroll(studentId, courseId);
                        } catch (NullPointerException e){
                            System.out.println("Insert a valid Student ID & Course ID.\nOr insert 'cancel' or 'c' to go back to menu ");
                            errorData =true;
                        }
                    }while (errorData);
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "2", "assign":
                    do {
                        System.out.println("Insert teacher ID");
                        String assignTeacherId = scannerMenu.nextLine();
                        System.out.println("Insert course ID");
                        String assignCourseId = scannerMenu.nextLine();
                        if (assignTeacherId.equalsIgnoreCase("c")||assignTeacherId.equalsIgnoreCase("cancel")||
                                assignCourseId.equalsIgnoreCase("c")||assignCourseId.equalsIgnoreCase("cancel")){
                            break;
                        }
                        errorData = false;
                        try {
                            commands.assignTeacherCourse(assignTeacherId, assignCourseId);
                        }catch (NullPointerException e){
                            System.out.println("Insert a valid Teacher ID & Course ID.\nOr insert 'cancel' or 'c' to go back to menu ");
                            errorData =true;
                        }
                    }while (errorData);
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "3", "show courses":
                    System.out.println(commands.getCourses().values());
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "4", "lookup course":
                    do{
                    System.out.println("Insert course ID");
                    String courseDetails = scannerMenu.nextLine();
                        if (courseDetails.equalsIgnoreCase("c")||courseDetails.equalsIgnoreCase("cancel")){
                            break;
                        }
                        errorData =false;
                        try {
                            System.out.println(commands.getCourse(courseDetails));
                        }catch (NullPointerException e){
                            System.out.println("Insert a valid Course ID.\nOr insert 'cancel' or 'c' to go back to menu ");
                            errorData =true;
                        }
                    }while (errorData);
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "5", "show students":
                    System.out.println(commands.getStudentsList().values());
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "6", "lookup student":
                    do{
                        System.out.println("Insert student ID");
                        String studentDetails = scannerMenu.nextLine();
                        if (studentDetails.equalsIgnoreCase("c")||studentDetails.equalsIgnoreCase("cancel")){
                            break;
                        }
                        errorData=false;
                    try {
                        System.out.println( commands.getStudent(studentDetails));
                    }catch (NullPointerException e){
                        System.out.println("Insert a valid Student ID.\nOr insert 'cancel' or 'c' to go back to menu ");
                        errorData =true;
                }
                    }while(errorData);
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "7", "show teachers":
                    System.out.println(commands.getTeacherList().values());
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "8", "lookup teacher":
                    do{
                        System.out.println("Insert teacher ID");
                        String teacherDetails = scannerMenu.nextLine();
                        if (teacherDetails.equalsIgnoreCase("c")||teacherDetails.equalsIgnoreCase("cancel")){
                            break;
                        }
                        errorData=false;
                        try {
                            System.out.println(commands.getTeacher(teacherDetails));
                        }catch (NullPointerException e){
                            System.out.println("Insert a valid Teacher ID.\nOr insert 'cancel' or 'c' to go back to menu ");
                            errorData =true;
                        }
                    }while (errorData);
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "9", "show profit":
                    System.out.println(commands.getCoursesProfit());
                    System.out.println("press enter to continue");
                    scannerMenu.nextLine();
                    break;
                case "10", "exit":
                    System.out.println("Bye bye! Hope to see you soon.\n May the force be with you.");
                    isMenuOn = false;
                    scannerMenu.close();
                    break;
                default:
                    break;
            }
        }
    }
}
