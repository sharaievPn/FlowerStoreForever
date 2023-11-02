package ucu.edu.apps.flowerstoreforever.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucu.edu.apps.flowerstoreforever.Flower;
import ucu.edu.apps.flowerstoreforever.FlowerColor;
import ucu.edu.apps.flowerstoreforever.FlowerService;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService currentFlowerService) {
        this.flowerService = currentFlowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlower(){
        return flowerService.getFlower();
    }

    @PostMapping("/add")
    public void add(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}
