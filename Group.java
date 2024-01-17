import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student studentLead;
    private final List<Student> listOfStudents;
    private final List<String> listOfTasks;

    public Group(Student studentLead) {
        this.studentLead = studentLead;
        this.listOfStudents = new ArrayList<>();
        this.listOfTasks = new ArrayList<>();
    }

    public Student getStudentLead() {
        return studentLead;
    }

    public void changeStudentLead(Student newStudentLead) {
        this.studentLead = newStudentLead;
    }

    public void addStudent(Student newStudent) {
        listOfStudents.add(newStudent);
    }

    public void deleteStudent(Student student) {
        if (listOfStudents.contains(student)) {
            listOfStudents.remove(student);
        } else {
            System.out.println("Student not found in the group.");
        }
    }

    public void renameStudent(Student student, String newFirstName, String newLastName) {
        if (listOfStudents.contains(student)) {
            Student newStudent = new Student();
            int index = listOfStudents.indexOf(student);
            listOfStudents.set(index, newStudent);
        } else {
            System.out.println("Student not found in the group.");
        }
    }

    public void addTask(String task) {
        listOfTasks.add(task);
    }
    public List<Student> getListOfStudents() {
        return new ArrayList<>(listOfStudents);
    }

    public List<String> getListOfTasks() {
        return new ArrayList<>(listOfTasks);
    }
}