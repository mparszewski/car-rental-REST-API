package com.mparszewski.carrental.repository;

import com.mparszewski.carrental.model.ReservationLocation;
import com.mparszewski.carrental.model.ReservationLocationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationLocationRepository extends JpaRepository<ReservationLocation, ReservationLocationId> {

    ReservationLocation findByReservationLocationId(ReservationLocationId reservationLocationId);
}
