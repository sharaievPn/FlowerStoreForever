package ucu.edu.apps.flowerstoreforever;


import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
}
