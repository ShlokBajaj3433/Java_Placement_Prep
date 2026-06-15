package com.shlok.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) {
        Queue<String> TicketList = new LinkedList<>(); 
        
        TicketList.add("Shlok");
        TicketList.add("Suchit");
        TicketList.add("Swaraj");
        TicketList.add("Pramit");

        System.out.println(TicketList);
        System.out.println(TicketList.peek());
        System.out.println(TicketList.poll());
        System.out.println(TicketList);
        TicketList.clear();
        System.out.println(TicketList.isEmpty() );
    }
}
