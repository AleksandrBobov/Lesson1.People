public class Person {
    protected final String name;
    protected final String surname;
    private int age;
    private String city;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return city;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(surname);
        sb.append(" ");
        sb.append(name);
        sb.append(", ");
        sb.append(age);
        sb.append(" лет ");
        sb.append(city);
        return sb.toString();
    }

    public boolean hasAge() {
        return age == 0;
    }

    public boolean hasAddress() {
        return city == null;
    }

    public void setAddress(String address) {
        city = address;
    }

    public void happyBirthday() {
        age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder pb = new PersonBuilder();
        pb.setSurname(this.surname);
        pb.setAddress(this.city);
        pb.setAge(0);
        return pb;
    }
}