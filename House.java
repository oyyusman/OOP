package FA068;
import java.util.*;
public class House implements  comparable <House>{
    private int house_id;
    private double houseArea;
    private Date whenBuilt;
    public House(){
        house_id=0;
        houseArea=0.0;
        whenBuilt=null;
    }
    public void readData(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the house id:");
        house_id=input.nextInt();
        System.out.println("Enter the Area of the house:");
        houseArea=input.nextDouble();
        whenBuilt=new Date();
    }


    public int getHouse_id(){
        return house_id;
    }
    public double getHouseArea(){
        return houseArea;
    }
    public Date getWhenBuilt(){
        return whenBuilt;
    }
    public String toString(){
        return("house id:"+ houseArea +"houseArea:"+houseArea +"date:"+whenBuilt);
    }
    public int compareTo(House h){
        if(this.houseArea==h.houseArea){
            return 0;
        }
        if(this.houseArea>h.houseArea){
            return 1;
        }
        if(this.houseArea<h.houseArea){
            return -1;
        }
        return 0;
    }
    public Object clone() throws CloneNotSupportedException {
        try{
            House h=(House)super.clone();
            Date d=(Date)((House) super.clone()).whenBuilt;
            h.whenBuilt=d;
            return h;
        }
        catch (CloneNotSupportedException e){
            return  null;
        }
    }


}
