package com.micro2816.action;

import com.micro2816.api.PermutationIteratorHandler;

public class MyPermutationIteratorHandler implements PermutationIteratorHandler {
    private StringBuilder result;
    private static volatile MyPermutationIteratorHandler instance;
    
    private MyPermutationIteratorHandler() {
        result = new StringBuilder();
    }
    
    public static MyPermutationIteratorHandler getInstance() {
        if (instance == null) {
            synchronized (MyPermutationIteratorHandler.class) {
                instance = new MyPermutationIteratorHandler();
            }
        }
        return instance;
    }
    
    public void setLength(int newLength) {
        result.setLength(newLength);
    }
    
    @Override
    public void handle(char[] letters) {
        result.append(new String(letters)).append(' ');
    }

    public String getContent() {
        int factor = 48, idx = 2, t;
        if (result.length() <= factor) {
            return result.toString();
        }
        char ch = result.charAt(factor);
        if (ch == ' ') {
            result.setCharAt(factor, '\n');
        } else {
            factor = result.lastIndexOf(" ", factor);
            result.setCharAt(factor, '\n');
        }
        ++factor;  // skip newline character
        t = factor * idx - 1;
        while (t < result.length()) {
            result.setCharAt(t, '\n');
//            ++idx;
            t += factor;
        }
        return result.toString();
    }
}
