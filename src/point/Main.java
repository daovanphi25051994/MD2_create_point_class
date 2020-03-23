package point;

public class Main {
    public static void main(String[] args) {
        Point2D h1 = new Point2D(3, 5);
        Point2D h2 = new Point3D(1, 2, 3);
        Point3D h3d1 = new Point3D(2, 3, 2);
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3d1);
        System.out.println(h1.getXYPos()[1]);
        System.out.println(h2.getXYPos()[1]);
        //System.out.println(h2.getXYZPos()[1]);
        System.out.println(h3d1.getXYZPos()[1]);
    }

}
