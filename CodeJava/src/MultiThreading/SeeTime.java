package MultiThreading;

public class SeeTime {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.printf("%d ",i);
        }

        long endTime=System.currentTimeMillis();
        System.out.println();
        long msTime=endTime-startTime;
        System.out.println("MilliSecond: "+msTime);

    }
}
