package com.parkease.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.parkease.pojos.Seat;
import com.parkease.pojos.User;

public interface SeatDao extends JpaRepository<Seat,Long>{

	Optional<Seat> findBySeatNumberAndLocation_LocationId(long seatId, long locationId);
	 
}
