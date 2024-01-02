package com.HotelProject.HotelProject.service;

import com.HotelProject.HotelProject.model.Category;
import com.HotelProject.HotelProject.model.Reservation;
import com.HotelProject.HotelProject.repository.CategoryRepository;
import com.HotelProject.HotelProject.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository categoryRepository ;
    @Autowired
    private ReservationRepository reservationRepository;
    @Override
    public List<Category> ListCategory() {
        List<Category> categories = categoryRepository.findAll();
        return categories;
    }
    @Override
    public boolean checkAvailability(Long categorieId, Date dateDepart, Date dateArrive) {
        List<Reservation> reservations = reservationRepository.findReservationsByCategoryAndDateRange(categorieId, dateDepart, dateArrive);
        System.out.println("kayn"+reservations.isEmpty());
        return reservations.isEmpty();
    }
}
