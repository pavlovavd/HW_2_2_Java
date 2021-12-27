public class Main {
    public static void main(String[] args) {
        int currentAccount = 100; // текущий счет (руб)
        int refillBalance = 100; // сумма (руб) пополнения баланса
        int moneyOfRefill = 100; // сумма (руб) за начисление 1 бонуса

        int finalAccount; // Итоговый счет
        int bonus;

        if (refillBalance < 1000) {
            bonus = 0;
        } else {
            bonus = refillBalance / moneyOfRefill;
        }
        finalAccount = currentAccount + refillBalance + bonus;
        System.out.println("Итоговый счет :" + finalAccount);
        System.out.println("Колличество бонусов:" + bonus);
    }
}
