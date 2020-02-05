package net.mischneider;

import android.app.Activity;
import androidx.annotation.Nullable;

import com.facebook.react.bridge.WritableMap;

/**
 * Emitter to send events to React Native
 */
public interface MSREventBridgeEventEmitter {
    /**
     * Post an event to an event subscriber
     */
    void emitEvent(final String name, @Nullable WritableMap info);

    /**
     * Emits and event to a an event subscriber within a component that lifes within the components tree
     * managed by the passed activity
     */
    void emitEventForActivity(Activity activity, final String name, @Nullable WritableMap info);
}
