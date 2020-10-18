import com.sun.javafx.css.CalculatedValue;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws Exception{
        MainClass mainClass = new MainClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTask = Integer.parseInt(bufferedReader.readLine());

        try{
            switch (numberOfTask){
                case 1:
                    System.out.println("You`ve choose task 1, please input two numbers: ");

                    double firstValue = Double.parseDouble(bufferedReader.readLine());
                    double secondValue = Double.parseDouble(bufferedReader.readLine());

                    System.out.println("Result is: " + mainClass.Task1(firstValue, secondValue));

                    break;
                case 2:
                    System.out.println("You`ve choose task 2, please input date: ");

                    System.out.println("In what year was Odessa founded?");
                    int date = Integer.parseInt(bufferedReader.readLine());

                    mainClass.Task2(date);

                    break;
                case 3:
                    System.out.println("You`ve choose task 3, please input money value: ");

                    double moneyValue = Double.parseDouble(bufferedReader.readLine());
                    mainClass.Task3(moneyValue);

                    break;
                case 4:System.out.println(); break;
                case 5:System.out.println(); break;
                case 6:System.out.println(); break;
                case 7:System.out.println(); break;
                case 8:System.out.println(); break;
                case 9:System.out.println(); break;
                case 10:System.out.println(); break;
            }
        }
        catch (NumberFormatException ex){
            System.out.println("Something error " + ex.getMessage());
        }
    }

    /*
     * Write a program that calculates the quotient of two numbers.
     */
    public double Task1(double firstValue, double secondValue){
        return firstValue / secondValue;
    }

    /*
     * Write a program to check the date of the day of Odessa.
     */
    public void Task2(int date){
        if(date == 1794){
            System.out.println("You`re right! Odessa was founded in 1794.");
        }
        else{
            System.out.println("You are wrong, Odessa was founded in 1794.");
        }
    }

    /*
    * Write a program to calculate the cost of a purchase, taking into account the discount.
    */
    public void Task3(double cost){
        if(cost >= 500){
            System.out.println("You get a 3% discount");
            double costResult = cost - (cost * 0.03);
            System.out.println("Amount with discount:" + costResult);
        }
        else if (cost >= 1000){
            System.out.println("You get a 5% discount");
            double costResult = cost - (cost * 0.05);
            System.out.println("Amount with discount:" + costResult);
        }
        else{
            System.out.println("No discount available.");
        }
    }
}
