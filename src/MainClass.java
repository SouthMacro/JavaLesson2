import com.sun.javafx.css.CalculatedValue;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws Exception{
        MainClass mainClass = new MainClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfTask = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Please, input task value.");
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
                case 4:
                    System.out.println("You`ve choose task 4, please input value: ");

                    double inputValue = Double.parseDouble(bufferedReader.readLine());
                    mainClass.Task4(inputValue);

                    break;
                case 5:
                    System.out.println("You`ve choose task 5, please input date: ");

                    int inputValueTask5 = Integer.parseInt(bufferedReader.readLine());
                    mainClass.Task5(inputValueTask5);
                    break;
                case 6:System.out.println(); break;
                case 7:System.out.println(); break;
                case 8:System.out.println(); break;
                case 9:System.out.println(); break;
                case 10:System.out.println(); break;
                default: throw new Exception("Please input a valid number(1 to 10)");
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

    /*
     * Write a program that checks if the input is the user is an even integer.
     */
    public void Task4(double inputValue){
        if (inputValue % 2 == 0){
            System.out.println("Number is even.");
        }
        else{
            System.out.println("Number isn`t even");
        }
    }

    /*
    * Write a program that checks if the input is divisible by three keyboard is an integer.
    */
    public void Task5(int inputValue) throws Exception {
        if(inputValue <= 0){
            throw new Exception("Input number must be higher than 0.");
        }
        else{
            if (inputValue / 3 == 0){
                System.out.println("Number" + inputValue + "divisible by three.");
            }
            else{
                System.out.println("Number" + inputValue + "not divisible by three.");
            }
        }
    }
}
