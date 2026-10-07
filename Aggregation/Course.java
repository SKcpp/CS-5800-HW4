package Aggregation;

import java.util.ArrayList;

public class Course 
{
    private String name;
    private final ArrayList<Instructor> instructors = new ArrayList<>();
    private final ArrayList<Textbook> textbooks = new ArrayList<>();

    public Course(String name) 
    {
        this.name = name;
    }

    public String getName() 
    { 
        return name;
    }
    
    public void setName(String name) 
    { 
        this.name = name; 
    }

    public void addInstructor(Instructor i) 
    { 
        instructors.add(i); 
    }

    public void addTextbook(Textbook t) 
    { 
        textbooks.add(t); 
    }

    public ArrayList<Instructor> getInstructors() 
    { 
        return instructors; 
    }

    public ArrayList<Textbook> getTextbooks() 
    { 
        return textbooks; 
    }

    public void print() 
    {
        System.out.println("Course: " + name);
        for (Instructor i : instructors) 
        {
            System.out.println("  Instructor: " + i.getFirstName() + " " + i.getLastName()
                               + " (Office " + i.getOfficeNumber() + ")");
        }
        for (Textbook t : textbooks) 
        {
            System.out.println("  Textbook: " + t.getTitle() + " by " + t.getAuthor()
                               + " (" + t.getPublisher() + ")");
        }
    }
}