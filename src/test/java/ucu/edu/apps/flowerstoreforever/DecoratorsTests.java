package ucu.edu.apps.flowerstoreforever;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstoreforever.decorators.BasketDecorator;
import ucu.edu.apps.flowerstoreforever.decorators.PaperDecorator;
import ucu.edu.apps.flowerstoreforever.decorators.RibbonDecorator;

public class DecoratorsTests {
    private FlowerBucket flowerBucket;
    private RibbonDecorator decoratedFlowerBucketRibbon;
    private BasketDecorator decoratedFlowerBucketBasket;
    private PaperDecorator decoratedFlowerBucketPaper;
    private Flower flower;
    private Flower flowerSecond;
    private FlowerPack firstFlowePack;
    private FlowerPack secondFlowePack;

    @BeforeEach
    public void setUp() {
        flowerBucket = new FlowerBucket();
        flower = new Flower(1, 11.5, 11.5, FlowerColor.RED);
        firstFlowePack = new FlowerPack(flower, 15);
        flowerSecond = new Flower(2, 11.5, 11.5, FlowerColor.BLUE);
        secondFlowePack = new FlowerPack(flowerSecond, 15);
        flowerBucket.add(firstFlowePack);
        flowerBucket.add(secondFlowePack);
        decoratedFlowerBucketRibbon = new RibbonDecorator(flowerBucket);
        decoratedFlowerBucketBasket = new BasketDecorator(flowerBucket);
        decoratedFlowerBucketPaper = new PaperDecorator(flowerBucket);
    }

    @Test
    public void testPriceRibbon() {
        double basePrice = flowerBucket.price();
        double ribbonPrice = 40;
        Assertions.assertEquals(basePrice + ribbonPrice,
                decoratedFlowerBucketRibbon.getPrice());
    }

    @Test
    public void testDescriptionRibbon() {
        String expectedDescription = "Ribbon decorator";
        Assertions.assertEquals(expectedDescription,
                decoratedFlowerBucketRibbon.getDescription());
    }

    @Test
    public void testItemOriginalFunctionalityRibbon() {
        double flowerBucketPrice = flowerBucket.getPrice();
        double decoratedFlowerBucketPrice = decoratedFlowerBucketRibbon.price();
        Assertions.assertEquals(flowerBucketPrice, decoratedFlowerBucketPrice);
    }

    @Test
    public void testPriceBasket() {
        double basePrice = flowerBucket.price();
        double basketPrice = 4;
        Assertions.assertEquals(basePrice + basketPrice,
                decoratedFlowerBucketBasket.getPrice());
    }

    @Test
    public void testDescriptionBasket() {
        String expectedDescription = "Basket decorator";
        Assertions.assertEquals(expectedDescription,
                decoratedFlowerBucketBasket.getDescription());
    }

    @Test
    public void testItemOriginalFunctionalityBasket() {
        Assertions.assertEquals(flowerBucket.getPrice(),
                decoratedFlowerBucketBasket.price());
    }

    @Test
    public void testPricePaper() {
        double basePrice = flowerBucket.price();
        double paperPrice = 13;
        Assertions.assertEquals(basePrice + paperPrice,
                decoratedFlowerBucketPaper.getPrice());
    }

    @Test
    public void testDescriptionPaper() {
        String expectedDescription = "Paper decorator";
        Assertions.assertEquals(expectedDescription,
                decoratedFlowerBucketPaper.getDescription());
    }

    @Test
    public void testItemOriginalFunctionalityPaper() {
        Assertions.assertEquals(flowerBucket.getPrice(),
                decoratedFlowerBucketPaper.price());
    }
}
