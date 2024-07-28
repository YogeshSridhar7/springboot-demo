package gradingSystem;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;
    private String city;
    private String state;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    public Student(int id, String name, int age, String address, String city, String state) {
        this.id =id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }

    public void setAge(int age) { this.age = age; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }

    public void setState(String state) { this.state = state; }
}
