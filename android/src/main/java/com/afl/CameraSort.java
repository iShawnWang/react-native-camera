package com.afl;

public class CameraSort {
    public static int mCameraIndex = 0;

    public static void nextCameraId() {
        mCameraIndex += 1;
        mCameraIndex %= 2;
    }
}
