package ucu.edu.apps.flowerstoreforever.decorators;

import ucu.edu.apps.flowerstoreforever.Item;

public abstract class AbstractDecorator extends Item {
    protected Item item;
    public abstract String getDescription();
}
