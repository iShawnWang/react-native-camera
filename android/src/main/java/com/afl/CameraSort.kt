package com.afl

object CameraSort {
    var mCameraIndex = 0

    fun nextCmaeraId() {
        mCameraIndex += 1
        mCameraIndex %= 2
    }
}