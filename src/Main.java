import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] salaryArray = generateRandomArray();
        System.out.println(Arrays.toString(salaryArray));
        int salarySum = 0;

        for (int salary : salaryArray) {
            salarySum += salary;
        }

        System.out.println("Сумма трат за месяц составила " + salarySum + " рублей");
        System.out.println();


        // Задание 2

        salarySum = 0;
        int minExpenses = salaryArray[0];
        int maxExpenses = salaryArray[0];

        for (int salary : salaryArray) {
            if (salary < minExpenses) {
                minExpenses = salary;
            }
            if (salary > maxExpenses) {
                maxExpenses = salary;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses + "рублей. Максимальная сумма трат за неделю составила " + maxExpenses + " рублей");

        // Задание 3

        for (int salary : salaryArray) {
            salarySum += salary;
        }
        System.out.println("Средняя сумма трат за месяц  в день составила " + salarySum / 30 + " рублей");
    }

    // Задание 4

    char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

    {
        for (int i = 0; i < reverseFullName.length / 2; i++){
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 -i];
            reverseFullName[reverseFullName.length - 1 -i] = temp;
            System.out.println(reverseFullName[i]);
        }
        System.out.println(Arrays.toString(reverseFullName));



    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000) + 100000;
        }
        return arr;

    }
}