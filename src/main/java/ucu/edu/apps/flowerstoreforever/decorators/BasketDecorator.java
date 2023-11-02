package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.Item;

public class BasketDecorator extends AbstractDecorator {
    public BasketDecorator(Item itemCurrent) {
        description = "Basket decorator";
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
        return 4 + item.price();
    }

}
