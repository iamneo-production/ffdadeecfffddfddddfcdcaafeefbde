package controller;

public class CalculateBMI {

	//Enter the code here....

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
}
