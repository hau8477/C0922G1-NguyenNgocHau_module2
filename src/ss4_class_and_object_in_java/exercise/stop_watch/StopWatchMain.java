package ss4_class_and_object_in_java.exercise.stop_watch;

import ss4_class_and_object_in_java.exercise.stop_watch.StopWatch;

public class StopWatchMain {
    public static void main(String[] args) {
        StopWatch time = new StopWatch();

        System.out.println("Time now: " + time.start());
        System.out.println("Time stop: " + time.stop());
        System.out.println("Time: " + time.getElapsedTime());
    }
}
