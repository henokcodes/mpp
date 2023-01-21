package package_send;

public class FedEx extends Providers{
    public FedEx(String desc, double weight, String zone){
        setDesc(desc);
        setWeight(weight);
        setZone(zone);
        setRate();
    }

    public void setRate() {
        double rate = 0.43;
        if(getZone().equalsIgnoreCase("IA") ||
                getZone().equalsIgnoreCase("MT") ||
                getZone().equalsIgnoreCase("OR") || getZone().equalsIgnoreCase("CA"))
            rate = 0.35;
        else if(getZone().equalsIgnoreCase("TX") ||
                getZone().equalsIgnoreCase("UT") )
            rate = 0.30;
        else if(getZone().equalsIgnoreCase("FL") ||
                getZone().equalsIgnoreCase("MA") ||
                getZone().equalsIgnoreCase("OH"))
            rate = 0.55;

        super.setRate(rate);
    }


}
