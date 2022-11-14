
class Fraction {
    double decimal;
    int numerator;
    int denominator;

    public Fraction(double decimal){
        denominator = 1;
        this.decimal = decimal;
        calculateNumerator();
    }

    public Fraction(){
        decimal = 0;
    }
    private void calculateNumerator(){
        do{

            denominator++;

        }while((decimal * denominator) % 1 != 0);
        numerator = ((int) (decimal * denominator));
    }

    public void multiply(double factor){
        double decimal = (double)numerator / denominator;
        this.decimal = decimal * factor;
        denominator = 0;
        calculateNumerator();


    }
    public String toString(){
        if (decimal == 0){
            return "0";
        }
        else {
            return numerator + "/" + denominator;
        }
    }


}
