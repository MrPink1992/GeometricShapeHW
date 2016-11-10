package fh.java.geometry.model.threeDimensional;


/**
 * Created by MacS on 09.11.16.
 */
public  class Pyramide extends ThreeDim {

    private double sideA;
    private double sideB;
    private double sideS;

    public Pyramide(int x, int y, double sideA, double sideB, double sideS){
        this.x=x;
        this.y=y;
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideS=sideS;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideS() {
        return sideS;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideS(double sideS) {
        this.sideS = sideS;
    }



    public double calcSurface() {
        double ha = Math.sqrt(Math.pow(sideB/2,2)*Math.pow(sideS/2,2));
        double hb = Math.sqrt(Math.pow(sideA/2,2)*Math.pow(sideS/2,2));

        return sideA*sideB+sideA*ha+sideB+hb;
    }


    public double calcVolume() {
        return 1/3*sideA*sideB+sideS;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Pyramide pyramide = (Pyramide) o;

        if (Double.compare(pyramide.sideA, sideA) != 0) return false;
        if (Double.compare(pyramide.sideB, sideB) != 0) return false;
        return Double.compare(pyramide.sideS, sideS) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideB);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sideS);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramide{");
        sb.append("sideA=").append(sideA);
        sb.append(", sideB=").append(sideB);
        sb.append(", sideS=").append(sideS);
        sb.append('}');
        return sb.toString();
    }
}
