package com.directi.training.ocp.exercise;

public class Space implements Resource {

    public int allocate() {
        int resourceId;
        resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
        return resourceId;
    }

    public void free(int ressourceId) {
        markSpaceSlotFree(ressourceId);
    }

    private void markSpaceSlotBusy(int resourceId) {
    }

    private int findFreeSpaceSlot() {
        return 0;
    }

    private void markSpaceSlotFree(int resourceId) {
    }
}
