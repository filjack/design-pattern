package com.design.test.singleton;

/**
 * @author xpf
 * @since 2023/5/19
 */
public class TicketMaker {

    private static final TicketMaker ticketMaker = new TicketMaker();

    private int ticket = 1000;

    private TicketMaker() {

    }

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public int getNextTicketNumber() {
        return ticket++;
    }

}
