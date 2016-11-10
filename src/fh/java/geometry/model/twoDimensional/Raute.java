package fh.java.geometry.model.twoDimensional;


/**
 * Created by MacS on 09.11.16.
 */
public class Raute extends TwoDim {

    private double sideA;
    private double sideE;
    private double sideF;

    public Raute(int x, int y, double sideA, double sideE, double sideF) {
        this.x = x;
        this.y = y;
        this.sideA=sideA;
        this.sideE=sideE;
        this.sideF=sideF;

    }

    public double getA() {
        return sideA;
    }

    public double getE() {
        return sideE;
    }

    public double getF() {
        return sideF;
    }

    public void setA(double a) {
        this.sideA = sideA;
    }

    public void setE(double e) {
        this.sideE = sideE;
    }

    public void setF(double f) {
        this.sideF = sideF;
    }


    public double calcArea() {
        return sideE*sideF/2;
    }

    public double calcPerimeter() {
        return sideA*4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Raute raute = (Raute) o;

        if (Double.compare(raute.sideA, sideA) != 0) return false;
        if (Double.compare(raute.sideE, sideE) != 0) return false;
        return Double.compare(raute.sideF, sideF) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideE);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideF);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Raute{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideE=").append(sideE);
        sb.append(", sideF=").append(sideF);
        sb.append('}');
        return sb.toString();
    }
}



