package ucu.edu.apps.flowerstoreforever.deliveries;

import ucu.edu.apps.flowerstoreforever.Item;

import java.util.LinkedList;

public interface Delivery {

    String deliver(LinkedList<Item> items);
}
