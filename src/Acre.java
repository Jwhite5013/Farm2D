public class Acre{
private String cropType;
private double sellPrice;
private double growCropPrice;
private int growDays;
private boolean growCheck;
public Acre(String cropType, double sellPrice, double growCropPrice, int growDays){
this.cropType = cropType;
this.sellPrice = sellPrice;
this.growCropPrice = growCropPrice;
this.growDays = growDays;
growCheck = true;
public Acre(){
cropType = "No Crop";
growCheck = false;
sellPrice = 0.0;
growDays = 0;
growCropPrice = 0.0;
}
public String getCrop(){
return cropType;
}
public boolean enoughDays(int days){
boolean check;
if(days>=growDays){
check = true;
} else{
check = false;
}
return check;
}
public double income(){
double income;
income = sellPrice - growCropPrice;
  return income;
}
public double income(int days){
  double income;
  income = (days/growDays)*(sellprice - growCropPrice);
  return income;
}
public String toString(){
  String stuff = "";
  Stuff += "Crop: " + croptype + "\tCost: " + growCropPrice + "\tSell price: " + sellPrice;
}
}