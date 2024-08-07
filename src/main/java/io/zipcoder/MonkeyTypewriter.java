package io.zipcoder;

public class MonkeyTypewriter {
    public static void main(String[] args) {
        String introduction = "It was the best of times,\n" +
                "it was the blurst of times,\n" +
                "it was the age of wisdom,\n" +
                "it was the age of foolishness,\n" +
                "it was the epoch of belief,\n" +
                "it was the epoch of incredulity,\n" +
                "it was the season of Light,\n" +
                "it was the season of Darkness,\n" +
                "it was the spring of hope,\n" +
                "it was the winter of despair,\n" +
                "we had everything before us,\n" +
                "we had nothing before us,\n" +
                "we were all going direct to Heaven,\n" +
                "we were all going direct the other way--\n" +
                "in short, the period was so far like the present period, that some of\n" +
                "its noisiest authorities insisted on its being received, for good or for\n" +
                "evil, in the superlative degree of comparison only.";

        // Do all of the Monkey / Thread building here
        // For each Copier(one safe and one unsafe), create and start 5 monkeys copying the introduction to
        // A Tale Of Two Cities.
        UnsafeCopier monkey1 = new UnsafeCopier(introduction);
        monkey1.run();
        UnsafeCopier monkey2 = new UnsafeCopier(introduction);
        monkey2.run();
        UnsafeCopier monkey3 = new UnsafeCopier(introduction);
        monkey3.run();
        UnsafeCopier monkey4 = new UnsafeCopier(introduction);
        monkey4.run();
        UnsafeCopier monkey5 = new UnsafeCopier(introduction);
        monkey5.run();

        SafeCopier monkey6 = new SafeCopier(introduction);
        monkey6.run();
        SafeCopier monkey7 = new SafeCopier(introduction);
        monkey7.run();
        SafeCopier monkey8 = new SafeCopier(introduction);
        monkey8.run();
        SafeCopier monkey9 = new SafeCopier(introduction);
        monkey9.run();
        SafeCopier monkey10 = new SafeCopier(introduction);
        monkey10.run();





        // This wait is here because main is still a thread and we want the main method to print the finished copies
        // after enough time has passed.
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {
            System.out.println("MAIN INTERRUPTED");
        }

        // Print out the copied versions here.

        UnsafeCopier uc = new UnsafeCopier(introduction);
        System.out.println(uc.copied);
//        System.out.println(monkey2.copied);
//        System.out.println(monkey3.copied);
//        System.out.println(monkey4.copied);
//        System.out.println(monkey5.copied);

//        System.out.println(monkey6.copied);
//        System.out.println(monkey7.copied);
//        System.out.println(monkey8.copied);
//        System.out.println(monkey9.copied);
//        System.out.println(monkey10.copied);


    }
}