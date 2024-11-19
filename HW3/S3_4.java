/**
 * @author XPIPI
 */
class TV {
    private static int idStarter = 1000;
    private int productId;
    private boolean power;
    private int volume;
    private int channel;

    public TV() {
        this.productId = idStarter++;
        this.power = false;
        this.volume = 50;
        this.channel = 1;
    }

    public void powerToggle() {
        power = !power;
        System.out.println("电视机 " + productId + (power ? " 已打开。" : " 已关闭。"));
    }

    public void changeVolume(boolean status) {
        if (power) {
            if (status && volume < 100) {
                volume++;
            } else if (!status && volume > 0) {
                volume--;
            }
            System.out.println("电视机 " + productId + " 当前音量: " + volume);
        } else {
            System.out.println("电视机 " + productId + " 未打开！");
        }
    }

    public void changeChannel(int newChannel) {
        if (power) {
                channel = newChannel;
                System.out.println("电视机 " + productId + " 频道已更换到: " + channel);
        } else {
            System.out.println("电视机 " + productId + " 未打开！");
        }
    }

    public void displayTV() {
        System.out.println("电视机" + productId);
        System.out.println("开关状态: " + (power ? "开" : "关"));
        System.out.println("当前音量: " + volume);
        System.out.println("当前频道: " + channel);
        System.out.println();
    }
}


public class S3_4 {
    public static void main(String[] args) {
        TV tv1 = new TV();
        TV tv2 = new TV();

        tv1.displayTV();
        tv2.displayTV();

        tv1.powerToggle();
        tv1.changeVolume(true);
        tv1.changeChannel(2);
        tv1.displayTV();

        tv2.powerToggle();
        tv2.changeVolume(false);
        tv2.changeChannel(3);
        tv2.displayTV();

        tv1.powerToggle();
        tv1.changeVolume(true);
        tv1.changeChannel(1);
        tv1.displayTV();
    }
}
