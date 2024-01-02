package com.HotelProject.HotelProject.repository;

import com.HotelProject.HotelProject.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,Long> {
    @Query("SELECT r FROM Reservation r JOIN FETCH r.chambre c JOIN FETCH c.category WHERE c.category.id = :categoryId AND r.dateDepart BETWEEN :startDate AND :endDate AND r.dateArrive BETWEEN :startDate AND :endDate")
    List<Reservation> findReservationsByCategoryAndDateRange(@Param("categoryId") Long categoryId, @Param("startDate") Date startDate, @Param("endDate") Date endDate);
}
