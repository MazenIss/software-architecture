package com.directi.training.ocp.exercise;

public class Time implements Resource {
    public int allocate() {
        int resourceId;
        resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int ressourceId) {
        markTimeSlotFree(ressourceId);
    }

    private void markTimeSlotBusy(int resourceId) {
    }

    private int findFreeTimeSlot() {
        return 0;
    }

    private void markTimeSlotFree(int resourceId) {
    }
}
