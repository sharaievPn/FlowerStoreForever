package ucu.edu.apps.flowerstoreforever;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public abstract class Item {
    @Getter
    @Setter
    private String description;
    private double price;
    public Item(Item currentItem) {
        description = currentItem.getDescription();
        price = currentItem.getPrice();
    }

    public abstract double price();
}
