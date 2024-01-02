package com.HotelProject.HotelProject.repository;

import com.HotelProject.HotelProject.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
