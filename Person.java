public class Person {
    private int id;
    private static int id_gen=1;
    private String name;
    private String surname;
    public Person(){
        id=id_gen++;
    }
    public Person(String name, String surname, int age){
        this();
        setName(name);
        setSurname(surname);
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getName(){
        return surname;
    }
    public String getSurname(){
        return surname;
    }
    public int getId(){
        return id;
    }
    public String getPosition(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
