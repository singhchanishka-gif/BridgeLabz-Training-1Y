package Com.LogisticTracker;

abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    int expectedDuration;
    int actualDuration;

    public Checkpoint(String id, String location, double distance,
                      int expected, int actual) {
        this.checkpointId = id;
        this.locationName = location;
        this.distanceFromLast = distance;
        this.expectedDuration = expected;
        this.actualDuration = actual;
    }

    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }

    public abstract boolean isCritical();
    public abstract String getType();
    public abstract double calculatePenalty();
}
