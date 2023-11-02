package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.FlowerBucket;
import ucu.edu.apps.flowerstoreforever.Item;

public class PaperDecorator extends AbstractDecorator {
    private Item item;
    public PaperDecorator(FlowerBucket flowerBucket) {
        item = new FlowerBucket(flowerBucket);
        item.setDescription("Paper decorator");
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
        return 13 + item.price();
    }
}
