package ujibus3;

/**
 *
 * @author Arian
 */
public class ujibus3 
{
    public static void main(String[] abc) 
    {
        Bus bus=new Bus(5);
        bus.getPassword(17);
        bus.getPassword(90);
        bus.cetak();

        bus.pluspenumpang(2);
        bus.getWeight(62);
        bus.getAverage();
        bus.cetak();
        
        bus.pluspenumpang(1);
        bus.getWeight(47);
        bus.getAverage();
        bus.cetak();
        
        bus.pluspenumpang(2);
        bus.getWeight(73);
        bus.getAverage();
        bus.cetak();
        
        bus.pluspenumpang(1);
        bus.getWeight(68);
        bus.getAverage(); 
        bus.cetak(); 
    }
}


