public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.division.apply(a, b);
        calc.println.accept(Integer.MAX_VALUE); // возвращение невероятного числа
    }
}
