package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
            try {
                while (stringIterator.hasNext()){
                    Thread.sleep(500);
                    if (stringIterator.hasNext()) {
                    System.out.println(stringIterator.next());
                    copied += " " + stringIterator.next();
                }
                }
        } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
    }

