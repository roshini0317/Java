public class JavaBasics{

    public static void main(String[] args) {

        int age = 20;
        double salary = 25000.50;
        char grade = 'A';
        boolean isStudent = true;
        long population = 8000L;

        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);
        System.out.println("Population: " + population);
        final double ph = 3.14;
        System.out.println("Value of Pi: " + ph);
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Power: " + Math.pow(a, b));
        System.out.println("Square Root: " + Math.sqrt(25));

        int num = 10;
        double d = num;
        System.out.println("Implicit: " + d);
        double value = 9.78;
        int n = (int) value;
        System.out.println("Explicit: " + n);

        String name = "Roshini";
        System.out.println("Length: " + name.length());
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Contains 'shi': " + name.contains("shi"));
        
    }
}