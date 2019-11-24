package ru.kolosov.unicorn;

import ru.kolosov.unicorn.bruno.collections.BrunoQueue;

public class Application {

	public static void main(String[] args) {

        BrunoQueue<String> myQueue = new BrunoQueue<String>();

        myQueue.add("Billy");
        myQueue.add("Villy");
        myQueue.add("Dilly");
        myQueue.add("Button");

        for(String str: myQueue) {
            System.out.println(str);
        }

	}

}
