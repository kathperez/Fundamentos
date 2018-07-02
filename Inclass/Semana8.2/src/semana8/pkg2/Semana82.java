package semana8.pkg2;

public class Semana82 {

    public static void main(String[] args) {

        String text = "Texto Ejemplo";

        String[] phrase = text.split(" ");
        String switchh = " ";
        for (int i = phrase.length - 1; i >= 0; i--) {
            switchh = switchh + " " + phrase[i];
        }
        System.out.println(switchh);

///////////////////////////////////////////////////////////////////////////////////////////
        int[] numbers = {36, 15, 13, 4, 8, 1, 11};
        int x;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[j] < numbers[i]) {

                    x = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = x;

                }
            }
        }
        System.out.print("Ordenado: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
