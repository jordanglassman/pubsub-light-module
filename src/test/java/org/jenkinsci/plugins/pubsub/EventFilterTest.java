package org.jenkinsci.plugins.pubsub;

import org.junit.Test;

import static org.junit.Assert.*;

public class EventFilterTest {

    @Test
    public void test_no_default_props() {
        // A Message should have default props set on it.
        assertTrue(new SimpleMessage().size() > 0);
        // But an EventFilter should not.
        assertTrue(new EventFilter().size() == 0);
    }
}