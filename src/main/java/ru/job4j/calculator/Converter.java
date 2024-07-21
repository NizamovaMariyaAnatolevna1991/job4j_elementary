package ru.job4j.calculator;

public class Converter {
        public static float rubleToEuro(float value) {
            float result = value / 70;
            return result;
        }

        public static float rubleToDollar(float value) {
            float result = value / 60;
            return result;
        }

        public static void main(String[] args) {
            float input = 140;
            float expected = 2;
            float output = Converter.rubleToEuro(input);
            boolean passed = expected == output;
            System.out.println("140 rubles are 2. Test result : " + passed);
            float input1 = 180;
            float expected1 = 3;
            float output1 = Converter.rubleToDollar(input1);
            boolean passed1 = expected1 == output1;
            System.out.println("180 rubles are 3. Test result : " + passed1);
            float euro = Converter.rubleToEuro(140);
            float dolar = rubleToDollar(180);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dolar + " dolar.");
        }
}
