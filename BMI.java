
public class BMI {
    private double height;
    private double weight;
    private double bmi;

    public BMI() {
    }

    public BMI(double h, double w) {
        this.height = h;
        this.weight = w;
        calculateBMI();
    }

    public void calculateBMI() {
        this.bmi = (this.weight / (this.height * this.height)) * 703;
    }

    public double getBMI() {
        return this.bmi;
    }

    public String getStatus() {
        if (this.bmi < 18.5) {
            return "Underweight";
        } else if (this.bmi < 25.0) {
            return "Normal";
        } else if (this.bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }

    }
}
