public class Calculate {

    public double calculate(Double num1, Double num2, Counter counter) {
        return counter.operation(num1, num2);
    }

    Counter add = (num1, num2) -> num1 + num2;
    Counter sub = (num1, num2) -> num1 - num2;
    Counter mult = (num1, num2) -> num1 * num2;
    Counter div = (num1, num2) -> num1 / num2;

    Counter max = (num1, num2) -> {
        Double max;
        if (num1 > num2)
            max = num1;
        else max = num2;
        return max;
    };

    Counter superstrong = (num1, num2) -> { // операция с  большим количеством условий из домашнего задания
        Double min;
        if (num1 > num2) min = num2; // Находим минимальное число для будущего расчета
        else min = num1;
        Double max2;
        if (num1 > num2) max2 = num1; // Находим максимальное число для будущего расчета
        else max2 = num2;
        double power = max2 - min; // Степень числа- разница между большим и меньшим числом
        double temp = Math.pow(min, power); // возводим меньшее число в степень
        double temp2 = ((temp * 10) / max2); //умножаем на 10 и делим на большее число
        return temp2;
    };

    /*
            /*Пусть будет моя операция:  сколько должен стоить рубль, при цене барелля нефти в долларах.
        Ориентиром  цены нефти в рублях считается сумма 3200 рублей за баррель.
        Тогда первое число: цена нефти. Второе число: сколько стоит рубль за один доллар
             */
    Counter petroleum = (num1, num2) -> {
        Double result;
        result = (3200 / num1);
        if ((result) > num2)
            System.out.println("Пока еще неплохо живем");
        else System.out.println("Но если есть в кармане пачка сигарет,\n" +
                "Значит все не так уж плохо на сегодняшний день.");
        return result;
    };
}
