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
    protected String description;
    protected double price;

    public abstract double price();
}
