package com.directi.training.ocp.exercise;

public interface  Resource {
   public abstract int allocate();
   public abstract void  free(int ressourceId);
}
