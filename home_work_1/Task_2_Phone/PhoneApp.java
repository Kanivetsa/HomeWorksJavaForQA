package homeworks.home_work_1.Task_2_Phone;

public class PhoneApp {
    public static void main(String[] args) {

        Phone phoneOne = new Phone("+4915178899625", "iPhone", 160);
        Phone phoneTwo = new Phone("+4915173366548", "Samsung", 180);
        Phone phoneThree = new Phone("+4915175544987", "Fairphone", 200);

        System.out.println("Phone 1");
        phoneOne.printInfo();
        System.out.println();


        System.out.println("Phone 2");
        phoneTwo.printInfo();
        System.out.println();


        System.out.println("Phone 3");
        phoneThree.printInfo();
        System.out.println();

        phoneOne.receiveCall("Eva");
        System.out.println(phoneOne.getNumber());
        System.out.println();

        phoneTwo.receiveCall("Adam");
        System.out.println(phoneTwo.getNumber());
        System.out.println();

        phoneThree.receiveCall("Luka");
        System.out.println(phoneThree.getNumber());

    }
}
