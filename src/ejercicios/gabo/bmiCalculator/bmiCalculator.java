package ejercicios.gabo.bmiCalculator;

public class bmiCalculator {
    public double bmistuff(double weight, double height) {
        double bmi = weight / (height*height);
        if (bmi <= 18.5){
            System.out.println("Underweight");
        }
        else if(bmi <= 25.0){
            System.out.println("Normal");
        }
        else if(bmi <= 30.0){
            System.out.println("Overweight");
        }
        else if(bmi>30.0){
            System.out.println("Obese");
        }
        return bmi;
    }
}