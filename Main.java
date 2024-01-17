public class Main {
    public static void main (String[] args) {
        Student studentLead = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        Group group = new Group(studentLead);
        group.addStudent(student1);
        group.addStudent(student2);
        System.out.println(group);
        Student newStudentLead = new Student();
        group.changeStudentLead(newStudentLead);
        group.renameStudent(student1, "Anastasiia", "UpdatedLastName");
        group.deleteStudent(student2);
        group.addTask("Task 1");
        group.addTask("Task 2");
        System.out.println("Final state of the group:");
        System.out.println(group);
    }
}
