package io.zipcoder;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {

    private final ReentrantLock lock = new ReentrantLock(); //I added this -JC

    public SafeCopier(String toCopy) { super(toCopy); }

    public void run() {
        lock.lock();
        try {
        copied = copied + stringIterator.next();
        while (stringIterator.hasNext()) {
            copied = copied + " " + stringIterator.next();
        }} finally {
            lock.unlock();
            }
        }
    }
