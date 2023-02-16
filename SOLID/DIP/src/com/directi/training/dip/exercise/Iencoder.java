package com.directi.training.dip.exercise;

import java.io.IOException;

public interface Iencoder {
    public void encodeWithFiles() throws IOException;
    public void encodeBasedOnNetworkAndDatabase(Idatabase Idb) throws IOException;
}
