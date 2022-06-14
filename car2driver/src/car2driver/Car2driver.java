/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car2driver;

/**
 *
 * @author 4800590195
 */
public class Car2driver {

    /**
     * @param args the command line arguments
     */
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
