import java.util.Scanner;

public class DepositCalculator {
    double CalculateComplexPercent(double a, double y, int d) {
        double pay = a * Math.pow((1 + y / 12), 12 * d);
        return round(pay, 2);

    } double CalculateSimplePercent(double amount, double year, int depositPeriod) {
        return round(amount + amount * year * depositPeriod, 2);

    } double round(double value, int places) {
        double ScaLe = Math.pow(10, places);
        return Math.round(value*ScaLe) / ScaLe;
    }

    void getData() {
        int period;
        int action;
        int amount;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите сумму вклада в рублях:");
        amount = scanner.nextInt();

        System.out.println("Введите срок вклада в годах:");
        period = scanner.nextInt( );

        System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
        action = scanner.nextInt();

        double outInfo = 0;

        if(action == 1)
            outInfo = CalculateSimplePercent(amount, 0.06, period);
        else if(action == 2) {
            outInfo = CalculateComplexPercent(amount, 0.06, period);
        }
        System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + outInfo);
    }

    public static void main(String[] args) {
        new DepositCalculator().getData();
    }
}
