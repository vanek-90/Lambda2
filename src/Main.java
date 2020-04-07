public class Main {
    public static void main(String[] args) {

        Calculate calculate = new Calculate();
        System.out.println(calculate.calculate(35.0, 120.0, calculate.petroleum));
    }
    /*Для удобства проверки, возможные операции:
        add Addition – сложение
        sub Subtraction – вычитание
        mult Multiplication – умножение
        div Division – деление
        superstrong - операция с  большим количеством условий из домашнего задания
        petroleum - моя операция. Описание в классе Calculate, возле очереднего case.
         */
}
