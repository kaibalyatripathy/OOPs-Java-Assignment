import java.util.*;
class Area {

    static void rectangle(int length, int breadth) {
        System.out.println("Area of rectangle = "+(length*breadth));
    }

    void square(int side) {
        System.out.println("Area of square = "+(side*side));
    }

    public static void main(String[] args) {

        int length,breadth,side;

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length : ");
        length=sc.nextInt();
        System.out.print("Enter breadth : ");
        breadth=sc.nextInt();
        System.out.print("Enter side : ");
        side=sc.nextInt();

        rectangle(length,breadth);

        Area obj = new Area();
        obj.square(side);
    }
}