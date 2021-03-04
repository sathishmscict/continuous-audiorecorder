package com.github.lassana.continuous_audiorecorder;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;

import com.github.lassana.recorder.AudioRecorder;

/**
 * @author Nikolai Doronin {@literal <lassana.nd@gmail.com>}
 * @since 11/26/14.
 */
public class RecorderApplication extends Application {

    public static RecorderApplication getApplication(@NonNull Context context) {
        if (context instanceof RecorderApplication) {
            return (RecorderApplication) context;
        }
        return (RecorderApplication) context.getApplicationContext();
    }

    private AudioRecorder mAudioRecorder;

    public void setRecorder(@NonNull AudioRecorder recorder) {
        mAudioRecorder = recorder;
    }

    public AudioRecorder getRecorder() {
        return mAudioRecorder;
    }

    @Override
    public void onCreate() {
        super.onCreate();

    }
}
