class AreaOfCircle {
    public static void AreaOfCircle(int radius){
        double area;
        System.out.println("Enter the radius of the circle ::"+radius);
        area = (3.14*radius*radius);
        System.out.println("Area of the circle is ::" + area);
    }
}
class Square extends AreaOfCircle{
    public static void AreaOfSquare(int radius){
        double area;
        System.out.println("Enter the side of the Square ::"+radius);
        area=radius*radius;
        System.out.println("Area of the square is ::" + area);
    }
}
