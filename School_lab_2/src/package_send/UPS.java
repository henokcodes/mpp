package package_send;

public class UPS extends Providers{

    public UPS(String desc, double weight, String zone){
        setDesc(desc);
        setWeight(weight);
        setZone(zone);
        setRate();
    }
    public void setRate() {
        super.setRate(0.45);
    }


}
