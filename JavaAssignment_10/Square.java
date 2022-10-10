package JavaAssignment_10;

public class Square {
    protected double side1;

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area1() {
        System.out.println("The Square Area : ");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }

}
