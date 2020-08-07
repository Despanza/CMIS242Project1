/* Project 1
Sterling Despanza
January 26 2020
Checks if object is lessthan, addsto total, divides object, changes objects to ounces
and normalises object
 */
public class Weight {
    private Weight weight;
    private int pounds;
    private double ounces;
    private double CONVERSION = 16;
    public Weight(int pounds, double ounces){
        this.pounds = pounds;
        this.ounces = ounces;
    }

   /* public Weight(String line) {
        weight = Double.parseDouble(line);
    }*/


    public Weight lessThan(Weight weight[]){
        if (weight[0] > weight[1]){//Comparing weight
            return (int) this.pounds;
        }
        else{
            return weight;
        }

    }
    public double addTO(double weight){
       double hold = 0.0;
       hold = hold + weight;
        return weight;
    }
    public double divide(double weightD){
        return weightD;
    }
    public String toString(){
        return pounds + " lbs " + ounces + " oz ";
    }
    private double toOunces(){
        this.ounces = this.pounds * 16;
        return ounces;
    }
    private void normalise(){

    }
}
