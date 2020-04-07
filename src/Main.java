public class Main {
    public static void main(String[] args) {

        Calculate cal = new Calculate();
        System.out.println(cal.calculate(35.0, 120.0, cal.petroleum));
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
