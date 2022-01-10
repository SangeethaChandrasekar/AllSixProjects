import java.text.DecimalFormat;
class BodyMassIndex {
    public static double bodyMassIndex() {
        double weight = 60.00;
        System.out.print("Input weight in kilogram: " + weight);
        double height = 1.80;
        double a;
        System.out.print("\nInput height in meters: " + height);
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) :");
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        System.out.println(decimalFormat.format(BMI) + " kg/m2");
         a= Double.parseDouble(decimalFormat.format(BMI));
        return a;
    }
}