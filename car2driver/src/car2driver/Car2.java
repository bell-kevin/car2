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
class Car2 {
    
 private String make;
    private int year;
    private String color;

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean equals(Car2 otherCar) {
        return this.make.equals(otherCar.make) && this.year == otherCar.year && this.color.equals(otherCar.color);
    }
}

