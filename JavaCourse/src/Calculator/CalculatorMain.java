package Calculator;

public class CalculatorMain{

    public static void main(String arg[]) {

        CalcMethods calc = new CalcMethods();

        int a = 5;
        int b = 10;
        int c = 10;

        System.out.println("Call Addition of Two numbers: "+ a+" & "+b);
        int result = calc.add(a, b);
        System.out.println("Result: "+ result);

        
        System.out.println("Call Addition of 3 numbers: "+ a+","+b+" & "+c);
        result = calc.add(a, b,c);
        System.out.println("Result: "+ result);


        
    }

}