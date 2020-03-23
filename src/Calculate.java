public class Calculate {// implements Count {

    public static double calculate(double num1, double num2, String operation) {
        double result;
        // ниже объявление переменных, которые используются  при расчетах.
        double max;
        double max2;
        double min;
        double power; //степень, в которую нужно будет возводить
        double temp;  // промежуточная переменная
        double temp2; // вторая промежуточная переменная
        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "max":
                if (num1 > num2)
                    max = num1;
                else max = num2;
                result = max;
                break;
            case "superstrong": // операция с  большим количеством условий из домашнего задания
                if (num1 > num2) min = num2; // Находим минимальное число для будущего расчета
                else min = num1;
                if (num1 > num2) max2 = num1; // Находим максимальное число для будущего расчета
                else max2 = num2;
                power = max2 - min; // Степень числа- разница между большим и меньшим числом
                temp = Math.pow(min, power); // возводим меньшее число в степень
                temp2 = ((temp * 10) / max2); //умножаем на 10 и делим на большее число
                result = temp2;
                break;

                /*Пусть будет моя операция:  сколько должен стоить рубль, при цене барелля нефти в долларах.
            Ориентиром  цены нефти в рублях считается сумма 3200 рублей за баррель.
            Тогда первое число: цена нефти. Второе число: сколько стоит рубль за один доллар
                 */
            case "petroleum":
                result = (3200 / num1);
                if ((result) > num2)
                    System.out.println("Пока еще неплохо живем");
                else System.out.println("Но если есть в кармане пачка сигарет,\n" +
                        "Значит все не так уж плохо на сегодняшний день.");
                break;
            default:
                result = calculate(num1, num2, operation);
        }
        return result;
    }
}
