package me.anelfer.ecogarbage.repository;

import me.anelfer.ecogarbage.model.garbage.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectionPointRepository extends JpaRepository<Point, Long> {

    Point findPointByLatAndLng(double lat, double lng);

}
