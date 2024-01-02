package com.HotelProject.HotelProject.service;

import com.HotelProject.HotelProject.model.Category;

import java.util.Date;
import java.util.List;

public interface CategoryService {
    List<Category> ListCategory();

    boolean checkAvailability(Long categorieId, Date dateDepart, Date dateArrive);
}
