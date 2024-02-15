import java.util.ArrayList;
import java.util.List;

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class Course {
    private String courseName;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String courseName, List<Instructor> instructors, List<Textbook> textbooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textbooks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    public List<Textbook> getTextbooks() {
        return textbooks;
    }

    public void setTextbooks(List<Textbook> textbooks) {
        this.textbooks = textbooks;
    }

    public void print() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructors:");
        for (Instructor instructor : instructors) {
            System.out.println(instructor.getFullName() + ", Office Number: " + instructor.getOfficeNumber());
        }
        System.out.println("Textbooks:");
        for (Textbook textbook : textbooks) {
            System.out.println(textbook.getTitle() + " by " + textbook.getAuthor());
        }
    }
}

public class CourseDriver {
    public static void main(String[] args) {
        // Single Instructor and Textbook
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        List<Instructor> instructorsSingle = new ArrayList<>();
        List<Textbook> textbooksSingle = new ArrayList<>();
        instructorsSingle.add(instructor);
        textbooksSingle.add(textbook);

        Course courseSingle = new Course("Advanced Software Engineering", instructorsSingle, textbooksSingle);

        System.out.println("Single Instructor and Textbook");
        System.out.println("Course Information:");
        courseSingle.print();
        System.out.println("\n------------------------------------------\n");

        // Multiple Instructors and Textbooks
        Instructor instructor1 = new Instructor("David", "Johannsen", "Zoom");
        Instructor instructor2 = new Instructor("John", "Korah", "8-15");

        Textbook textbook1 = new Textbook("Computer Architecture, A Quantitative Approach", "John L. Hennessy", "Morgan Kaufmann");
        Textbook textbook2 = new Textbook("Introduction to Parallel Computing", "Ananth Grama", "Addison Wesley");

        List<Instructor> instructorsMultiple = new ArrayList<>();
        List<Textbook> textbooksMultiple = new ArrayList<>();
        instructorsMultiple.add(instructor1);
        instructorsMultiple.add(instructor2);
        textbooksMultiple.add(textbook1);
        textbooksMultiple.add(textbook2);

        Course courseMultiple = new Course("Advanced Computer Architecture", instructorsMultiple, textbooksMultiple);

        System.out.println("Multiple Instructors and Textbooks");
        System.out.println("Course Information:");
        courseMultiple.print();
    }
}
