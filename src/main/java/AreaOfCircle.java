class AreaOfCircle {
    public static double area(int radius){
        double area;
        System.out.println("Enter the radius of the circle ::"+radius);
        area = (3.14*radius*radius);
        System.out.println("Area of the circle is ::" + area);
        return area;
    }
    public static double area(int base,int height){
        double area;
        area=0.5*base*height;
        System.out.println("Area of the Triangle is ::" + area);
        return area;
    }
    public static double area(double length,double width){
        double area=length*width;
        System.out.println("Area of rectangle:"+area);
        return area;
    }
}
