package com.offline.speech;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognitionService;
import android.speech.SpeechRecognizer;
import java.util.ArrayList;

public class RecognitionServiceImpl extends RecognitionService {

    @Override
    protected void onStartListening(Intent recognizerIntent, Callback listener) {
        // Recognition started
    }

    @Override
    protected void onCancel(Callback listener) {
        // Cancelled
    }

    @Override
    protected void onStopListening(Callback listener) {
        // Recognition stopped
    }
}
