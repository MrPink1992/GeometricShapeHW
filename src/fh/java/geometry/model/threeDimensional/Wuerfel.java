package fh.java.geometry.model.threeDimensional;


/**
 * Created by MacS on 09.11.16.
 */
public class Wuerfel extends ThreeDim {

    private double sideA;

    public Wuerfel(int x, int y, double sideA){
        this.x=x;
        this.y=y;
        this.sideA=sideA;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }


    public double calcSurface() {
        return 6*sideA*sideA;
    }

    public double calcVolume() {
        return sideA*sideA*sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Wuerfel wuerfel = (Wuerfel) o;

        return Double.compare(wuerfel.sideA, sideA) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(sideA);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Wuerfel{");
        sb.append("sideA=").append(sideA);
        sb.append('}');
        return sb.toString();
    }
}
