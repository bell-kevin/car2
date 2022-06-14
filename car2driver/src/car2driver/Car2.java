package car2driver;

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
        return this.make.equalsIgnoreCase(otherCar.make) && this.year == otherCar.year && this.color.equalsIgnoreCase(otherCar.color);
    }
}
