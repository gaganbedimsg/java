package com.github.jsoniter;

import junit.framework.TestCase;

import java.io.IOException;

public class TestFloat extends TestCase {

    public void test_float() throws IOException {
        Jsoniter iter = Jsoniter.parseString("1.1");
        assertEquals(1.1f, iter.readFloat());
    }

    public void test_double() throws IOException {
        Jsoniter iter = Jsoniter.parseString("1.1");
        assertEquals(1.1, iter.readDouble());
    }
}
