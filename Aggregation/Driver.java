package Aggregation;

public class Driver 
{
    public static void main(String[] args) 
    {
        Instructor nima = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook cleanCode = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Course cs5800 = new Course("CS 5800");
        cs5800.addInstructor(nima);
        cs5800.addTextbook(cleanCode);

        System.out.println("=== One instructor, one textbook ===");
        cs5800.print();

        Instructor second = new Instructor("Grace", "Hopper", "4-1010");
        Textbook patterns = new Textbook("Design Patterns", "Erich Gamma et al.", "Addison-Wesley");

        Course cs5800Two = new Course("CS 5800 (Team-Taught)");
        cs5800Two.addInstructor(nima);     
        cs5800Two.addInstructor(second);
        cs5800Two.addTextbook(cleanCode);
        cs5800Two.addTextbook(patterns);

        System.out.println();
        System.out.println("=== Two instructors, two textbooks ===");
        cs5800Two.print();
    }
}