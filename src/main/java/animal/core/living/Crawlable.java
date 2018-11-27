package main.java.animal.core.living;

public interface Crawlable extends Moveable {

    default void crawl() {
        System.out.println("I am crawling.");
    }


}
