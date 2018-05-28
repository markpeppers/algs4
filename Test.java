public class Test {
    public static void main(String[] args) {
        Counter c = new Counter("hello");
        c.increment();
        System.out.println(c.tally());
        doStuff(c);
        System.out.println(c.tally());
    }

    private static void doStuff(Counter c) {
        c.increment();
    }
}
