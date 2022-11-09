package ss4_class_and_object_in_java.exercise.stop_watch;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public double getStartTime() {
        return startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public long start() {
        startTime = System.currentTimeMillis();
        return startTime;
    }

    public long stop() {
        endTime = System.currentTimeMillis();
        return endTime;
    }

    public long getElapsedTime() {
        return stop()-start();
    }
}
