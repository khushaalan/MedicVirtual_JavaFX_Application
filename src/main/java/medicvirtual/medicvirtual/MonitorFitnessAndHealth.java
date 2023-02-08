package medicvirtual.medicvirtual;


import java.util.HashMap;

public class MonitorFitnessAndHealth{
    private String startDir = System.getProperty("user.dir");
    private String imgDir = startDir + "/src/main/resources/medicvirtual/medicvirtual/images/";
    private HashMap<String,String> bmi_class_pic = new HashMap<String,String>();

    public MonitorFitnessAndHealth(){

    }
    public Double calculate_BMI(double weight, double height){
        double bmi_value=0.0;
        bmi_value = weight / ((height/100) * (height/100));
        return bmi_value;
    }
    public String getBMIclass(double bmi_value){
        if(bmi_value<18.5){
            return "Underweight";
        }else if(bmi_value>=18.5 && bmi_value<=24.9){
            return "Normal";
        }else if(bmi_value>=25 && bmi_value<=29.9){
            return "Overweight";
        }else if(bmi_value>=30){
            return "Obese";
        }else{
            return "Error";
        }
    }
    public String getBMIclassPic(String bmi_class){
        bmi_class_pic.put("Underweight",imgDir + "underweight.png");
        bmi_class_pic.put("Normal",imgDir + "normal.png");
        bmi_class_pic.put("Overweight",imgDir + "overweight.png");
        bmi_class_pic.put("Obese",imgDir + "obese.png");
        return bmi_class_pic.get(bmi_class);
    }
    public Double calculate_calorie(double weight, double height, int age, boolean gender_male) {

        double harris_benedict_equation_men = 66.5 + (13.75 * weight) + (5.003 * height) - (6.75 * age);
        double harris_benedict_equation_women = 655.1 + (9.563 * weight) + (1.850 * height) - (4.676 * age);
        //ternary operator
        return gender_male ? harris_benedict_equation_men : harris_benedict_equation_women;
    }
}