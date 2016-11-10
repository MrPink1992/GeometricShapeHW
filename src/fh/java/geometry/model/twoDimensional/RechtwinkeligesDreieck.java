package fh.java.geometry.model.twoDimensional;


/**
 * Created by MacS on 09.11.16.
 */
public class RechtwinkeligesDreieck extends TwoDim {

    private double sideA;
    private double sideB;

    public RechtwinkeligesDreieck(int x, int y, double sideA, double sideB){
        this.x=x;
        this.y=y;
        this.sideA=sideA;
        this.sideB=sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }


    public double calcArea() {
        return sideA*sideB/2;
    }

    public double calcPerimeter() {
        return sideA+sideB+calcSideC();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RechtwinkeligesDreieck that = (RechtwinkeligesDreieck) o;

        if (Double.compare(that.sideA, sideA) != 0) return false;
        return Double.compare(that.sideB, sideB) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    public double calcSideC() {
        return Math.sqrt(sideA*sideA+sideB*sideB);
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RechtwinkeligesDreieck{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append('}');
        return sb.toString();
    }
}
