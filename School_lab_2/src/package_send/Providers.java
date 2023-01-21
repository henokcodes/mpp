package package_send;

import java.util.ArrayList;
import java.util.List;

public class Providers {

    String desc;
    double weight;
   private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    String zone;
    List<Providers> providers;

    public List<Providers> getProviders() {
        return providers;
    }

    public Providers(){
        this.providers = new ArrayList<>();
    }
    public void addPackages(String desc, double weight, String zone){

        providers.add(new USMail(desc,weight,zone));
        providers.add(new UPS(desc,weight,zone));
        providers.add(new FedEx(desc,weight,zone));
    }
    public double calculatePrice(){
        return getRate()*getWeight();
    }


    public Providers calcPrice(){
        Providers lowest = getProviders().get(0);

        for (Providers p: providers
             ) {
            if(p.calculatePrice()<lowest.calculatePrice()) {
                lowest = p;
            }

        }

        return lowest;
    }
}
