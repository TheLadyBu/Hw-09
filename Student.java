public class Student {
    private String id;
    private String FirstName;
    private String LastName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        this.FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        this.LastName = lastName;
    }
    @Override
    public String toString() {
        return "Student{id='" + id + "', firstName='" + FirstName + "', lastName='" + LastName + "'}";
    }
}

