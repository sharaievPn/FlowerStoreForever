package ucu.edu.apps.flowerstoreforever;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    private FlowerRepository flowerRepository;
    @Autowired
    public FlowerService(FlowerRepository flowerRepositoryCurrent) {
        this.flowerRepository = flowerRepositoryCurrent;
    }
    public List<Flower> getFlower() {
        return flowerRepository.findAll();
    }

    public void add(Flower flower) {
        flowerRepository.save(flower);
    }
}
