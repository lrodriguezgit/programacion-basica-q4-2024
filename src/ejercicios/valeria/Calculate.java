package ejercicios.valeria;
//https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java

public class Calculate {
    public static void main(String[] args) {

        bmi(80,1.80);
    }

    public static String bmi(double weight, double height) {
        double bmi = (weight / (height * height));

        if(bmi <= 18.5){
            return "Underweight";
        } else if ( bmi <= 25.0 ){
            return "Normal"; 
        } else if ( bmi <= 30.0 ) {
            return "Overweight";
        } else{
            return "Obese";
        }


    }
}
