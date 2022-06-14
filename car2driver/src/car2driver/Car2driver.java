package car2driver;

public class Car2driver {

    public static void main(String[] args) {
        Car2 nathanCar = new Car2();
        Car2 nickCar = new Car2();
        nathanCar.setMake("AUDI");
        nathanCar.setYear(2012);
        nathanCar.setColor("GREEN");
        nickCar.setMake("Audi");
        nickCar.setYear(2012);
        nickCar.setColor("green");
        if (nathanCar.equals(nickCar)) {
            System.out.println("Cars have identical features");
        } else {
            System.out.println("not the same car");
        }
    }
}
