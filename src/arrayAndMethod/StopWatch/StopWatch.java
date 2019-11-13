package arrayAndMethod.StopWatch;

public class StopWatch {
    private long startTime, endtime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public long getEndtime() {
        return endtime;
    }

    public void stop() {
        this.endtime = System.currentTimeMillis();
    }

    public int getElapsedTime(){
        return (int)(this.endtime - this.startTime);
    }
}
