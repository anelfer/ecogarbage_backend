package me.anelfer.ecogarbage.controller;

import me.anelfer.ecogarbage.model.garbage.GarbageTypes;
import me.anelfer.ecogarbage.model.garbage.Point;
import me.anelfer.ecogarbage.service.GarbageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarbageController {

    private final GarbageService service;

    @Autowired
    public GarbageController(GarbageService service) {
        this.service = service;
    }

    @GetMapping("/api/v1/points")
    public List<Point> getPoints() {
        return service.getAllPointsWithLimit();
    }

    @GetMapping("/api/v1/point")
    public Point getPoint(@RequestParam double lat, @RequestParam double lng) {
        return service.getPoint(lat, lng);
    }

    @PostMapping("/api/v1/point")
    public void savePoint(@RequestBody Point point) {
        service.savePoint(point);
    }

    @DeleteMapping("/api/v1/point")
    public void deletePoint(@RequestBody Point point) {
        service.deletePoint(point);
    }

    @GetMapping("/api/v1/point/types")
    public List<GarbageTypes> getGarbageTypes() {
        return service.getGarbageTypes();
    }

    @PostMapping("/api/v1/point/type")
    public void saveGarbageType(@RequestBody GarbageTypes type) {
        service.saveGarbageType(type);
    }

    @DeleteMapping("/api/v1/point/type")
    public void deleteGarbageType(@RequestBody GarbageTypes type) {
        service.deleteGarbageType(type);
    }
}
