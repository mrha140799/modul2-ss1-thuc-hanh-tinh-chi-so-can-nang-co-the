package SS1TH10;

import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào cân nặng");
        float weight = scn.nextFloat();
        System.out.println("Mời bạn nhập vào chiều cao");
        float height = scn.nextFloat();
        bmiProgram(weight,height);
    }
    public static void bmiProgram(float weight , float height) {
        double bmi = weight /(Math.pow(height , 2));
        if (bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi <25.0) {
            System.out.println("Nomal");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }

}
