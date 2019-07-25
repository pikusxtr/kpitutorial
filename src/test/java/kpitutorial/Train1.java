package kpitutorial;

/**
 * Created by kpiekos on 7/13/2017.
 */
public class Train1 {
    public static void main(String[] args) {
        System.out.println("aaaaaa");
        Puppy myPuppy = new Puppy("tommy");
        Puppy myPuppy2 = new Puppy("tommy2");
        int m1Hash = myPuppy.hashCode();
        int m2Hash = myPuppy2.hashCode();

        System.out.println("m1Hash=" + m1Hash);
        System.out.println("m2Hash=" + m2Hash);
        myPuppy = myPuppy2;
        System.out.println("Age new is=" + myPuppy.getPuppyAge());
        myPuppy.setPuppyAge(10);
        System.out.println("Age after set is=" + myPuppy.getPuppyAge());
    }
}
