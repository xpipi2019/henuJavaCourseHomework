/**
 * @author XPIPI
 */
public class S8_1 {
        public static void main(String[] args) {
            TicketSeller ts = new TicketSeller();

            Thread window1 = new Thread(ts, "窗口1");
            Thread window2 = new Thread(ts, "窗口2");
            Thread window3 = new Thread(ts, "窗口3");
            Thread window4 = new Thread(ts, "窗口4");
            Thread window5 = new Thread(ts, "窗口5");

            window1.start();
            window2.start();
            window3.start();
            window4.start();
            window5.start();
        }
}

class TicketSeller implements Runnable {
        private static int tickets = 138;
        private static int soldTicketCount = 0;

        private final Object lock = new Object();

        @Override
        public void run() {
            while (true) {
                // 线程安全保护
                synchronized (lock) {
                    if (tickets > 0) {
                        soldTicketCount++;
                        System.out.println(Thread.currentThread().getName() + " 售出第 " + soldTicketCount + " 张票");
                        tickets--;

                        try {
                            Thread.sleep(250);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }
