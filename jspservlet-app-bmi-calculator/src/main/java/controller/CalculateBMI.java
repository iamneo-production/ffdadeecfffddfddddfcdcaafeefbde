package controller;

public class CalculateBMI {

    public static double calculate(double height, double weight) {
        // BMI Formula: BMI = weight (kg) / height^2 (m^2)
        return weight / (height * height);
    }

    public static String description(double bmi) {
        // BMI Categories
        if (bmi < 18.5) {
            return "Under Weight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Over Weight";
        } else if (bmi >= 30 && bmi < 34.9) {
            return "Obese";
        } else {
            return "Extremely Obese";
        }
    }

    public static void main(String[] args) {
        // Example usage
        double height = 1.75; // in meters
        double weight = 65; // in kilograms

        double bmiValue = calculate(height, weight);
        System.out.println("BMI: " + bmiValue);

        String description = description(bmiValue);
        System.out.println("BMI Description: " + description);
    }
}
