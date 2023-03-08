public class MathApplication {
    private CalculadoraService calculadoraService;

    public double add(double input1, double input2){
        return input1 + input2;
    }

    public double subtract(double input1, double input2){
        return calculadoraService.subtract(input1, input2);
    }

    public double multiply(double input1, double input2){
        return calculadoraService.multiply(input1, input2);
    }

    public double divide(double input1, double input2){
        return calculadoraService.divide(input1, input2);
    }
}
