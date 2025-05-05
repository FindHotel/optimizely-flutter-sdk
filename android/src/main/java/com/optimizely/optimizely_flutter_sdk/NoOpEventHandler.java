package com.optimizely.optimizely_flutter_sdk;

import com.optimizely.ab.event.EventHandler;
import com.optimizely.ab.event.LogEvent;

public class NoOpEventHandler implements EventHandler {

    @Override
    public void dispatchEvent(LogEvent logEvent) {
        // Do nothing
    }
}