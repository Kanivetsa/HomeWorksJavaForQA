package homeworks.home_work_1.Task_2_Phone;

public class Phone {
    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void printInfo() {
        System.out.println(this.model + " has weight " + this.weight + "g " +
                "and number " + this.number + ".");
    }

    public void receiveCall(String name) {
        System.out.println(name + " is calling.");
    }
}
