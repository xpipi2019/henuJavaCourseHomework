/**
 * @author XPIPI
 */
// 抽象类 Spaceship
abstract class Spaceship {
    private int engineNum;
    private int crewCapacity;

    public Spaceship(int engineNum, int crewCapacity) {
        this.engineNum = engineNum;
        this.crewCapacity = crewCapacity;
    }

    public abstract void display();

    public int getEngineNum() {
        return engineNum;
    }

    public int getCrewCapacity() {
        return crewCapacity;
    }
}

class CargoShip extends Spaceship {
    public CargoShip(int engineNum, int crewCapacity) {
        super(engineNum, crewCapacity);
    }

    @Override
    public void display() {
        System.out.println("Cargo Ship 引擎数量: " + getEngineNum() + "，乘员容量: " + getCrewCapacity());
    }
}

class FighterShip extends Spaceship {
    public FighterShip(int engineNum, int crewCapacity) {
        super(engineNum, crewCapacity);
    }

    @Override
    public void display() {
        System.out.println("Fighter Ship 引擎数量: " + getEngineNum() + "，乘员容量: " + getCrewCapacity());
    }
}

public class S4_4 {
    public static void main(String[] args) {
        Spaceship cargoShip = new CargoShip(4, 30);
        Spaceship fighterShip = new FighterShip(8, 4);

        cargoShip.display();
        fighterShip.display();
    }
}
