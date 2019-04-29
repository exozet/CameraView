package com.otaliastudios.cameraview;

import android.graphics.Bitmap;

import androidx.annotation.Nullable;

public interface ScreenshotListener {
    void onScreenshot(@Nullable Bitmap bitmap);
}