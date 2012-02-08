package name.pilgr.android.picat.shared;

import java.util.ArrayList;
import java.util.List;

public class EventSequence {
    private List<Event> sequence = new ArrayList<Event>();

    /**
     * Add key press event
     *
     * @param keyCode
     * @return
     */
    public EventSequence press(int keyCode) {
        sequence.add(new KeyEvent(keyCode, true));
        return this;
    }

    /**
     * Add key release event
     *
     * @param keyCode
     * @return
     */
    public EventSequence release(int keyCode) {
        sequence.add(new KeyEvent(keyCode, false));
        return this;
    }

    /**
     * Delay in milliseconds
     *
     * @param time
     * @return
     */
    public EventSequence delay(int time) {
        sequence.add(new DelayEvent(time));
        return this;
    }

    public EventSequence wheel(int wheelAmt_) {
        sequence.add(new MouseEvent(wheelAmt_));
        return this;
    }

    public List<Event> getSequence() {
        return sequence;
    }
}
