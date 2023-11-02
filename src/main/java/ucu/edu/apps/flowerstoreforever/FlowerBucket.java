package ucu.edu.apps.flowerstoreforever;

import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();
    public FlowerBucket(FlowerBucket flowerBucketCurrent) {
        flowerPacks = flowerBucketCurrent.flowerPacks;
    }
    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    @Override
    public double price() {
        double price = 0;
        for (int i = 0; i < flowerPacks.size(); i++) {
            FlowerPack currentFlowerPack = flowerPacks.get(i);
            price += currentFlowerPack.getPrice();
        }
        return price;
    }
}

