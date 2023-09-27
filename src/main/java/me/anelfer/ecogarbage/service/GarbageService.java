package me.anelfer.ecogarbage.service;

import me.anelfer.ecogarbage.model.garbage.GarbageTypes;
import me.anelfer.ecogarbage.model.garbage.Point;
import me.anelfer.ecogarbage.repository.CollectionPointRepository;
import me.anelfer.ecogarbage.repository.GarbageTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GarbageService {

    private final CollectionPointRepository pointRepository;
    private final GarbageTypesRepository garbageTypesRepository;

    @Autowired
    public GarbageService(CollectionPointRepository repository, GarbageTypesRepository garbageTypesRepository) {
        this.pointRepository = repository;
        this.garbageTypesRepository = garbageTypesRepository;
    }

    public List<Point> getAllPointsWithLimit() {
        return pointRepository.findAll(Pageable.ofSize(100)).stream().toList();
    }

    public Point getPoint(double lat, double lng) {
        return pointRepository.findPointByLatAndLng(lat, lng);
    }

    public void savePoint(Point point) {
        pointRepository.save(point);
    }

    public void deletePoint(Point point) {
        pointRepository.delete(point);
    }

    public void saveGarbageType(GarbageTypes type) {
        garbageTypesRepository.save(type);
    }

    public List<GarbageTypes> getGarbageTypes() {
        return garbageTypesRepository.findAll(Pageable.ofSize(100)).stream().toList();
    }

    public void deleteGarbageType(GarbageTypes type) {
        garbageTypesRepository.delete(type);
    }
}
