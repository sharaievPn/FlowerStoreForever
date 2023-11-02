package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.FlowerBucket;
import ucu.edu.apps.flowerstoreforever.Item;

public class BasketDecorator extends AbstractDecorator {
    private Item item;

    public BasketDecorator(FlowerBucket flowerBucket) {
        item = new FlowerBucket(flowerBucket);
        item.setDescription("Basket decorator");
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
        return 4 + item.price();
    }

}
