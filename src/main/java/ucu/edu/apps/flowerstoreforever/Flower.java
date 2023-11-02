package ucu.edu.apps.flowerstoreforever;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor @Getter
@NoArgsConstructor
@Entity
public class Flower {
    @Id
    private int id;
    private double sepalLength;
    private double price;
    private FlowerColor color;

    public String getColor() {
        return color.toString();
    }
}
