package com.example.matoshritoursandtravels.repository;

import com.example.matoshritoursandtravels.model.TourPackage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourPackageRepository extends JpaRepository<TourPackage, Long> {
}
