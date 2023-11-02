package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.Item;

public class RibbonDecorator extends AbstractDecorator{
    public RibbonDecorator(Item itemCurrent) {
        description = "Ribbon decorator";
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
        return 40 + item.price();
    }
}
