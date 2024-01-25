public class Student extends Person{
    private int id;
    private static int id_gen = 1;
    private String name;
    private String surname;
    private double gpa;

    public Student(){
        id = id_gen++;
    }
    public Student(String name, String surname, double gpa){
       this();
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public String getName(){
        return surname;
    }
    public String getSurname(){
        return surname;
    }
    public double getGpa(){
        return gpa;
    }
    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
