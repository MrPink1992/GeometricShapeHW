package fh.java.geometry.model.threeDimensional;


/**
 * Created by MacS on 09.11.16.
 */
public class Kegel extends ThreeDim {
    private double radius;
    private double height;

    public Kegel(int x, int y, double radius, double height){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.height=height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }



    public double calcSurface() {
        return Math.PI*this.radius*(this.radius+this.height);
    }


    public double calcVolume() {
        return 1/3 *this.sideA*this.sideB*this.height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Kegel kegel = (Kegel) o;

        if (Double.compare(kegel.radius, radius) != 0) return false;
        return Double.compare(kegel.height, height) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(radius);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kegel{");
        sb.append("radius=").append(radius);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}



