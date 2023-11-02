package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.Item;

public class PaperDecorator extends AbstractDecorator {
    public PaperDecorator(Item itemCurrent) {
        description = "Paper decorator";
        item = itemCurrent;
    }

    @Override
    public double price() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return 13 + item.price();
    }
}
