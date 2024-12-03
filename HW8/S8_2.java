/**
 * @author XPIPI
 */

public class S8_2 {
    public static void main(String[] args) {
        final int totalDistance = 50 * 1000;
        long startTime = 0;

        // 兔子：每秒跑5米，跑至40米，休息一次；
        Thread rabbit = new Thread(new Runner("兔子", 5000, 40000, 8000, totalDistance, startTime));

        // 乌龟：每秒跑3米，不休息。
        Thread turtle = new Thread(new Runner("乌龟", 3000, 0, 0, totalDistance, startTime));

        rabbit.start();
        turtle.start();
    }
}

class Runner implements Runnable {
    private final String name;
    private final int speed;
    private final int restPoint;
    private final int restTime;
    private final int totalDistance;
    private final long startTime;

    public Runner(String name, int speed, int restPoint, int restTime, int totalDistance, long startTime) {
        this.name = name;
        this.speed = speed;
        this.restPoint = restPoint;
        this.restTime = restTime;
        this.totalDistance = totalDistance;
        this.startTime = startTime;
    }

    @Override
    public void run() {
        int distanceCovered = 0;
        long currentTime = 0;
        boolean isRest = false;

        if(restTime == 0) isRest = true;

        while (distanceCovered < totalDistance) {
            try {
                // 100millis = 0.1s
                Thread.sleep(100);
                distanceCovered += speed / 10;
                currentTime += 100;

                System.out.println(name + " 跑了 " + Math.min(distanceCovered, totalDistance) / 1000.0 + " 米，已用时 " + currentTime / 1000.0 + " 秒");

                // 判断休息
                if (distanceCovered >= restPoint && distanceCovered < totalDistance && !isRest) {
                    System.out.println(name + " 到达 " + restPoint / 1000.0 + " 米，开始休息");
                    Thread.sleep(restTime);
                    System.out.println(name + "休息结束！ ");
                    isRest = true;
                    currentTime += restTime;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + " 到达终点！用时：" + currentTime / 1000.0 + " 秒");
    }
}