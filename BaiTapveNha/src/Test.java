import java.util.Scanner;

class Account {
    private double balance;
    private int transactionCount;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        this.transactionCount = 0;
    }

    public void deposit(double amount) {
        if (transactionCount < 5) {
            if (amount > 0) {
                balance += amount;
                transactionCount++;
                System.out.println("Nap tien: " + amount);
                System.out.println("So tien con lai trong tai khoan: " + balance);
            } else {
                System.out.println("So tien nap vao phai lon hon 0.");
            }
        } else {
            System.out.println("Ban da vuot qua so lan giao dich toi da (5 lan) trong ngay.");
        }
    }

    public void withdraw(double amount) {
        if (transactionCount < 5) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                transactionCount++;
                System.out.println("Rut tien: " + amount);
                System.out.println("So tien con lai trong tai khoan: " + balance);
            } else if (amount <= 0) {
                System.out.println("So tien rut phai lon hon 0.");
            } else {
                System.out.println("Khong du tien trong tai khoan de rut.");
            }
        } else {
            System.out.println("Ban da vuot qua so lan giao dich toi da (5 lan) trong ngay.");
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tien ban dau trong tai khoan: ");
        double initialBalance = scanner.nextDouble();

        Account sharedAccount = new Account(initialBalance);

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so tien can nap: ");
            double depositAmount = scanner.nextDouble();
            sharedAccount.deposit(depositAmount);

            System.out.print("Nhap so tien can rut: ");
            double withdrawAmount = scanner.nextDouble();
            sharedAccount.withdraw(withdrawAmount);
        }

        scanner.close();
    }
}
