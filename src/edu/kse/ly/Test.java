package edu.kse.ly;

import java.io.Serializable;

public class Test implements Serializable {

    int t = 555;
    byte[][][] image = new byte[256][256][3];

    public Test(){
        float i = 0;
        float j = 0;
        float eps = 16/256.0f;
        for(byte[][] row : image){
            for (byte[] pixel: row) {
                byte value = (byte) (i*j);
                pixel[0] = value;
                pixel[1] = value;
                pixel[2] = value;
                j += eps;
            }
            i += eps;
        }
    }
}
