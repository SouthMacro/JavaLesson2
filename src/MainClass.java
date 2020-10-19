import com.sun.javafx.css.CalculatedValue;
import com.sun.org.apache.xpath.internal.operations.Equals;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {
    public static void main(String[] args) throws Exception{
        MainClass mainClass = new MainClass();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, input task value.");

        int numberOfTask = Integer.parseInt(bufferedReader.readLine());
        double inputDoubleValue;
        int inputIntValue;

        try{
            switch (numberOfTask){
                case 1:
                    System.out.println("You`ve choose task 1, please input two numbers: ");

                    inputDoubleValue = Double.parseDouble(bufferedReader.readLine());
                    double secondValue = Double.parseDouble(bufferedReader.readLine());

                    System.out.println("Result is: " + mainClass.Task1(inputDoubleValue, secondValue));

                    break;
                case 2:
                    System.out.println("You`ve choose task 2, please input date: ");

                    System.out.println("In what year was Odessa founded?");
                    inputIntValue = Integer.parseInt(bufferedReader.readLine());

                    mainClass.Task2(inputIntValue);

                    break;
                case 3:
                    System.out.println("You`ve choose task 3, please input money value: ");

                    inputDoubleValue = Double.parseDouble(bufferedReader.readLine());
                    mainClass.Task3(inputDoubleValue);

                    break;
                case 4:
                    System.out.println("You`ve choose task 4, please input value: ");

                    inputDoubleValue = Double.parseDouble(bufferedReader.readLine());
                    mainClass.Task4(inputDoubleValue);

                    break;
                case 5:
                    System.out.println("You`ve choose task 5, please input date: ");

                    inputIntValue = Integer.parseInt(bufferedReader.readLine());
                    mainClass.Task5(inputIntValue);
                    break;
                case 6:
                    System.out.println("You`ve choose task 6, please input day and minutes value: ");

                    inputDoubleValue = Double.parseDouble(bufferedReader.readLine());
                    inputIntValue = Integer.parseInt(bufferedReader.readLine());
                    DayOfWeek dayOfWeek = DayOfWeek.values()[inputIntValue];

                    mainClass.Task6(dayOfWeek, inputDoubleValue);

                    break;
                case 7:
                    System.out.println("You`ve choose task 7, please input day and minutes value: ");

                    inputIntValue = Integer.parseInt(bufferedReader.readLine());

                    mainClass.Task7(inputIntValue);
                    break;
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

    /*
     * Write a program to calculate the cost of a phone call with taking into account the 20% discount provided on Saturdays and Sundays.
     */
    public void Task6(DayOfWeek dayOfWeek, double minutes){
        double resultOfCostOperation;
        if (dayOfWeek == DayOfWeek.Saturday || dayOfWeek == DayOfWeek.Sunday){
            resultOfCostOperation = (minutes * 0.8) * 2;
        }
        else{
            resultOfCostOperation = minutes * 2;
        }
        System.out.print("Speak cost: ");
        System.out.format("%.2f%n", resultOfCostOperation);
    }

    /*
     * A three-digit number is given. Determine which of its numbers is greater.
     */
    public void Task7(int value) throws Exception {
        if(value < 100 || value > 999){
            throw new Exception("Value must be less than 999 and more than 100.");
        }
        else{
            int value1 = value % 10;
            int value2 = (value/10) % 10;
            int value3 = (value/100) % 10;

            if(value1 > value3){
                System.out.println("third value is higher.");
            }
            else{
                System.out.println("first value is higher.");
            }

            if(value1 > value2){
                System.out.println("first value is higher.");
            }
            else{
                System.out.println("second value is higher.");
            }

            if(value2 > value3){
                System.out.println("second value is higher.");
            }
            else{
                System.out.println("third value is higher.");
            }
        }
    }
}
