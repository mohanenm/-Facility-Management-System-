package maintain;

import base_layer.Facility;

public class Maintenance extends Facility {

    private String details;
    private int totalCost;
    private int hourlyCost;

    public Maintenance() {

    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getCost(){
        return totalCost;
    }

    public void setCost(int cost){
        this.totalCost = cost;
    }
}