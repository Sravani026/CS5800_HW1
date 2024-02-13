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
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public void print() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                ", Office Number: " + instructor.getOfficeNumber());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
    }
}

public class CourseDriver {
    public static void main(String[] args) {
        // Single instructor and textbook
        Instructor instructor = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");

        Course course = new Course("Programming Principles", instructor, textbook);

        System.out.println("Single Instructor and Textbook");
        System.out.println("Course Information:");
        course.print();

        System.out.println("\n------------------------------------------\n");

        // Multiple instructors and textbooks
        Instructor instructor1 = new Instructor("David", "Johannsen", "Zoom");
        Instructor instructor2 = new Instructor("John", "Korah", "8-15");

        Textbook textbook1 = new Textbook("Computer Architecture, A Quantitative Approach", "John L. Hennessy ", "Morgan Kaufmann");
        Textbook textbook2 = new Textbook("Introduction to Parallel Computing", "Ananth Grama", "Addison Wesley");

        Course course2 = new Course("Advanced Computer Architecture", instructor1, textbook1);
        Course course3 = new Course("Parallel and Distributed Algorithms", instructor2, textbook2);

        System.out.println("Multiple Instructors and Textbooks");
        System.out.println("Course Information:");
        course2.print();
        System.out.println("\n");
        course3.print();
    }
}
