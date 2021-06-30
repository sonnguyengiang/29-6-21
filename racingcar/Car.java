package racingcar;
import java.util.Random;


public class Car implements Runnable{

    // Khai báo Tên của xe đua
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        // Khởi tạo điểm start(hay km ban đầu)
        int runDistance = 0;
        // Khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        // Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < 1000) {
            try {
                // Random Speed KM/H
                int speed = (new Random()).nextInt(20);
                // Calculate traveled distance
                runDistance += speed;
                // Build result graphic
                String log = "|";
                int percentTravel = (runDistance * 100) / 1000;
                for (int i = 0; i < 1000; i += 4) {
                    if (percentTravel >= i + 4) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + 4) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ": " + log + " " + Math.min(1000, runDistance) + "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}