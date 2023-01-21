package package_send;

public class USMail extends Providers{

    public USMail(String desc, double weight, String zone){
        setDesc(desc);
        setWeight(weight);
        setZone(zone);
        setRate();
    }

    public void setRate() {
        if(getWeight()<3){
            super.setRate(1);
        }
       super.setRate(0.55);
    }


}
