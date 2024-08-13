package homeworks.home_work_1.Task_1_Person;

public class Person {
    // переменные объектов класса
    private String fullName;

    private int age;

    // конструктор по умолчанию
    public Person() {

    }

    ;

    // конструктор с заданными параметрами:
    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    // методы
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " moves.");
    }

    public void talk() {
        System.out.println(fullName + " talks.");
    }

}
