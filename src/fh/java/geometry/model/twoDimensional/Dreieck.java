package fh.java.geometry.model.twoDimensional;


/**
 * Created by MacS on 09.11.16.
 */
public class Dreieck extends TwoDim {

    private double sideA;
    private double sideB;
    private double sideC;
    private double s;


    public Dreieck(int x, int y, double sideA, double sideB, double sideC){
        this.x=x;
        this.y=y;
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }



    public double calcArea() {

        return (sideC*calcHeight())/2;
    }

    public double calcPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Dreieck dreieck = (Dreieck) o;

        if (Double.compare(dreieck.sideA, sideA) != 0) return false;
        if (Double.compare(dreieck.sideB, sideB) != 0) return false;
        return Double.compare(dreieck.sideC, sideC) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideC);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    public double calcHeight(){
        double s = (sideA+sideB+sideC)/2;
        double h = (2/sideC)*Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
        return h;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dreieck{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideC=").append(sideC);
        sb.append(", s=").append(s);
        sb.append('}');
        return sb.toString();
    }
}
