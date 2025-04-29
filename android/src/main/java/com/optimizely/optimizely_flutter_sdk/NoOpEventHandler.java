package com.optimizely.optimizely_flutter_sdk;

import android.content.Context;
import com.optimizely.ab.android.event_handler.DefaultEventHandler;
import com.optimizely.ab.event.LogEvent;

public class NoOpEventHandler extends DefaultEventHandler {

    public NoOpEventHandler(Context context) {
        super(context);
    }

    @Override
    public void dispatchEvent(LogEvent logEvent) {
        // Do nothing
    }
}