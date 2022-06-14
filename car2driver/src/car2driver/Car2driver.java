package car2driver;

public class Car2driver {

    public static void main(String[] args) {
        // TODO code application logic here
        Car2 nathanCar = new Car2();
        Car2 nickCar = new Car2();

        nathanCar.setMake("Audi");
        nathanCar.setYear(2012);
        nathanCar.setColor("green");
        nickCar.setMake("Audi");
        nickCar.setYear(2012);
        nickCar.setColor("green");
        if (nathanCar.equals(nickCar)) {
            System.out.println("Cars have identical features");
        }
    }
}
