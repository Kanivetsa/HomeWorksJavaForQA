package homeworks.home_work_1.Task_1_Person;

public class PersonApp {
    public static void main(String[] args) {
        // объект инициализируется конструктором Person():
        Person personOne = new Person();
        personOne.setFullName("Adam Earth");
        personOne.setAge(20);

        // объект инициализируется конструктором Person(fullName, age):

        Person personTwo = new Person("Eva Earth", 18);

        //вызываем методы для кождого объекта:

        personOne.move();
        personTwo.move();

        personOne.talk();
        personTwo.talk();

    }


}
