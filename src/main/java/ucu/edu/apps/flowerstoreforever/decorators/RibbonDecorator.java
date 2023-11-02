package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.Item;

public class RibbonDecorator extends AbstractDecorator {
    private Item item;
    public RibbonDecorator(Item currentItem) {
        item = currentItem;
        item.setDescription("Ribbon decorator");
    }

    @Override
    public double price() {
        return item.getPrice();
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + item.price();
    }
}
