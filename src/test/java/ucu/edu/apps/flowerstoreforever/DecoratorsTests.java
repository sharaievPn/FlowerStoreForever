package ucu.edu.apps.flowerstoreforever;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ucu.edu.apps.flowerstoreforever.decorators.BasketDecorator;
import ucu.edu.apps.flowerstoreforever.decorators.PaperDecorator;
import ucu.edu.apps.flowerstoreforever.decorators.RibbonDecorator;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(basePrice + ribbonPrice, decoratedFlowerBucketRibbon.getPrice(), "The price should be the base price plus the cost of the ribbon.");
    }

    @Test
    public void testDescriptionRibbon() {
        String baseDescription = flowerBucket.getDescription();
        String expectedDescription = "Ribbon decorator";
        assertEquals(expectedDescription, decoratedFlowerBucketRibbon.getDescription(), "The description should be for the ribbon decorator.");
    }

    @Test
    public void testItemOriginalFunctionalityRibbon() {
        assertEquals(flowerBucket.getPrice(), decoratedFlowerBucketRibbon.price(), "The price method should return the original item's price without the decorator's additions.");
    }

    @Test
    public void testPriceBasket() {
        double basePrice = flowerBucket.price();
        double basketPrice = 4;
        assertEquals(basePrice + basketPrice, decoratedFlowerBucketBasket.getPrice(), "The price should be the base price plus the cost of the ribbon.");
    }

    @Test
    public void testDescriptionBasket() {
        String baseDescription = flowerBucket.getDescription();
        String expectedDescription = "Basket decorator";
        assertEquals(expectedDescription, decoratedFlowerBucketBasket.getDescription(), "The description should be for the ribbon decorator.");
    }

    @Test
    public void testItemOriginalFunctionalityBasket() {
        assertEquals(flowerBucket.getPrice(), decoratedFlowerBucketBasket.price(), "The price method should return the original item's price without the decorator's additions.");
    }

    @Test
    public void testPricePaper() {
        double basePrice = flowerBucket.price();
        double paperPrice = 13;
        assertEquals(basePrice + paperPrice, decoratedFlowerBucketPaper.getPrice(), "The price should be the base price plus the cost of the ribbon.");
    }

    @Test
    public void testDescriptionPaper() {
        String baseDescription = flowerBucket.getDescription();
        String expectedDescription = "Paper decorator";
        assertEquals(expectedDescription, decoratedFlowerBucketPaper.getDescription(), "The description should be for the ribbon decorator.");
    }

    @Test
    public void testItemOriginalFunctionalityPaper() {
        assertEquals(flowerBucket.getPrice(), decoratedFlowerBucketPaper.price(), "The price method should return the original item's price without the decorator's additions.");
    }
}
