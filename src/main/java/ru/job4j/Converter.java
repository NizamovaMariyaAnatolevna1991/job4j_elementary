package ru.job4j;

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
            float euro = Converter.rubleToEuro(140);
            float dolar = rubleToDollar(140);
            System.out.println("140 rubles are " + euro + " euro.");
            System.out.println("140 rubles are " + dolar + " dolar.");
        }

}
