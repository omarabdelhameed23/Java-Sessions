package JavaProblemSolving;

import java.util.Scanner;

public class Methods {
    /*
    // 1. Find Smallest Number Among Three
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = input.nextDouble();
        System.out.println("Input the second number: ");
        double y = input.nextDouble();
        System.out.println("Input the third number: ");
        double z = input.nextDouble();

        System.out.println("The smallest value is " + findSmallestNumber(x, y, z));
        input.close();
    }

    public static double findSmallestNumber(double a, double b, double c) {
        return Math.min(Math.min(a,b), c);
    }*/
    /*******************************************************************************************************************/
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number ");
        double x = input.nextDouble();
        System.out.println("Input the second number ");
        double y = input.nextDouble();
        System.out.println("Input the third number ");
        double z = input.nextDouble();

        System.out.println("The average value is " + findAverage(x, y, z));
        input.close();
    }

    public static double findAverage(double a, double b, double c) {
        return (a+b+c) / 3;
    }*/
    /*******************************************************************************************************************/
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Input the string: ");
//        String x = input.nextLine();
//
//        System.out.println("Number of vowels are " + numberOfVowels(x));
//    }
//
//    public static int numberOfVowels(String a) {
//        int counter = 0;
//        for(int i = 0; i < a.length(); i++) {
//            if(a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u'){
//                counter++;
//            }
//        }
//        return counter;
//    }
    /// //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public static void main(String[] args) {
//        try(Scanner input = new Scanner(System.in)) {
//            System.out.println("Input your name: "); // Asking user to input a name
//            String name = storeName(input); // Storing the input
//
//            System.out.println("Input your age: "); // Asking the user to input an age
//            int age = storeAge(input); // Storing the input
//
//            System.out.println("Input your salary: "); // Asking the user to input a salary
//            double salary = storeSalary(input); // Storing the input
//
//            System.out.printf("Name: %s%nAge: %d%nSalary: %.2f%n", name, age, salary); // Printing all variables
//        }
//    }
//
//    public static String storeName(Scanner input) {
//        return input.nextLine();
//    }
//
//    public static int storeAge(Scanner input) {
//        return input.nextInt();
//    }
//
//    public static double storeSalary(Scanner input) {
//        return  input.nextDouble();
//    }
    /*******************************************************************************************************************
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            // Collecting number of users
            System.out.println("Input the number of users: ");
            int numberOfUsers = Integer.parseInt(input.nextLine());

            // Creating arrays to store users' data
            String[] names = new String[numberOfUsers];
            int[] ages = new int[numberOfUsers];
            double[] salaries = new double[numberOfUsers];

            // Collecting data for each user
            for(int i = 0; i< numberOfUsers; i++) {
                System.out.println("User " + (i + 1));
                System.out.println("Name: ");
                names[i] = input.nextLine();

                System.out.println("Age: ");
                ages[i] = Integer.parseInt(input.nextLine());

                System.out.println("Salary: ");
                salaries[i] = Double.parseDouble(input.nextLine());
            }

            System.out.println("--------- Users Data ---------");
            System.out.printf("%-10s %-5s %-10s\n", "Name", "Age", "Salary");
            System.out.println("------------------------------");
            for(int j = 0; j < numberOfUsers; j++) {
                System.out.printf("%-10s %-5d %-10.2f\n", names[j], ages[j], salaries[j]);
            }
        }
    }
    ********************************************************************************************************************/
//    public static void main(String[] args) {
//        System.out.println("Choose from the following options: ");
//        System.out.println("1. Calculate the area of a circle");
//        System.out.println("2. Calculate the circumference of a circle");
//
//        try(Scanner input = new Scanner(System.in)){
//            int choice = input.nextInt();
//            if(choice == 1 || choice == 2) {
//                System.out.println("Input the circle's radius: ");
//                double radius = input.nextDouble();
//                if (radius <= 0) {
//                    System.out.println("Radius must be a positive number.");
//                } else if (choice == 1) {
//                    System.out.println("Area of the circle is: " + circleArea(radius));
//                } else {
//                    System.out.println("Circumference of the circle is: " + circleCircumference(radius));
//                }
//            } else {
//                System.out.println("Invalid choice. Please select either 1 or 2.");
//            }
//        }
//    }
//
//    public static double circleCircumference(double radius) {
//        return 2 * Math.PI * radius;
//    }
//    public static  double circleArea(double radius) {
//        return Math.PI * Math.pow(radius, 2);
//    }
    /******************************************************************************************************************/
    public static void main(String[] args) {
        try(Scanner input = new Scanner(System.in)) {
            System.out.println("Hi!. The purpose of this program is to find whether the number you entered is even or odd.");
            System.out.println("Input a number: ");
            int num = input.nextInt();
            isEven(num);

        }

    }
    public static void isEven(int number) {
        if(number % 2 == 0) {
            System.out.println("The entered number is even.");
        }else {
            System.out.println("The entered number is odd.");
        }
    }
}
