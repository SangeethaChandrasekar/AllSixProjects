import java.text.DecimalFormat;
class BodyMassIndex {
    static double bodyMassIndex(double weight, double height) {

        System.out.print("Input weight in kilogram: " + weight);

        double a;
        System.out.print("\nInput height in meters: " + height);
        double BMI = weight / (height * height);
        System.out.print("\nThe Body Mass Index (BMI) :");
        DecimalFormat decimalFormat = new DecimalFormat();
        decimalFormat.setMaximumFractionDigits(2);
        System.out.println(decimalFormat.format(BMI) + " kg/m2");
        a = Double.parseDouble(decimalFormat.format(BMI));
        return a;
    }
}