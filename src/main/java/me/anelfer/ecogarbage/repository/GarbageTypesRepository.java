package me.anelfer.ecogarbage.repository;

import me.anelfer.ecogarbage.model.garbage.GarbageTypes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarbageTypesRepository extends JpaRepository<GarbageTypes, Long> {
}
