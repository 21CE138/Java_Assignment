package JavaAssignment_2;

public class Main {
    public static void main(String[] args) {
        RegularPolygon A1 = new RegularPolygon();
        RegularPolygon A2 = new RegularPolygon(6, 4);
        RegularPolygon A3 = new RegularPolygon(6, 7, 5, 7);
        System.out.println("Perimeter of A1: "+ A1.getPerimeter());
        System.out.println("Area of A1: "+ A1.getArea());
        System.out.println("Perimeter of A2: "+ A2.getPerimeter());
        System.out.println("Area of A2: "+ A2.getArea());
        System.out.println("Perimeter of A3: "+ A3.getPerimeter());
        System.out.println("Area of  A3: "+ A3.getArea());
    }
}
