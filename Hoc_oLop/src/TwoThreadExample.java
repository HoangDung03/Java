import java.util.Scanner;

class SharedResource {
    private int randomNumber;
    private boolean isNumberGenerated = false;

    // Phương thức để set số ngẫu nhiên và đánh dấu rằng số đã được tạo
    synchronized void setRandomNumber(int number) {
        this.randomNumber = number;
        isNumberGenerated = true;
        notify(); // Thông báo cho luồng đang chờ
    }

    // Phương thức để lấy số ngẫu nhiên, nếu số chưa được tạo thì chờ
    synchronized int getRandomNumber() {
        while (!isNumberGenerated) {
            try {
                wait(); // Chờ đến khi có thông báo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return randomNumber;
    }
}
// taoj Frame cho hien thi tu 0-100
// so 0 mau do, 1 xanh , lanf

class NumberGeneratorThread extends Thread {
    private SharedResource sharedResource;

    public NumberGeneratorThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        // Nhập số từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Luồng 1: Nhập số ngẫu nhiên: ");
        int userNumber = scanner.nextInt();

        // Gửi số người dùng nhập tới luồng khác
        sharedResource.setRandomNumber(userNumber);
        System.out.println("Luồng 1: Đã gửi số ngẫu nhiên: " + userNumber);
    }
}

class NumberReceiverThread extends Thread {
    private SharedResource sharedResource;

    public NumberReceiverThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        // Nhận số ngẫu nhiên từ luồng khác
        int receivedNumber = sharedResource.getRandomNumber();
        System.out.println("Luồng 2: Đã nhận số ngẫu nhiên: " + receivedNumber);
    }
}

public class TwoThreadExample {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Tạo và khởi chạy 2 luồng
        NumberGeneratorThread generatorThread = new NumberGeneratorThread(sharedResource);
        NumberReceiverThread receiverThread = new NumberReceiverThread(sharedResource);

        generatorThread.start();
        receiverThread.start();
    }
}
