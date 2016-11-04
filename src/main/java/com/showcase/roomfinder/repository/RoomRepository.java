package com.showcase.roomfinder.repository;

import com.showcase.roomfinder.domain.Room;

import org.springframework.data.jpa.repository.*;

import java.util.List;

/**
 * Spring Data JPA repository for the Room entity.
 */
@SuppressWarnings("unused")
public interface RoomRepository extends JpaRepository<Room,Long> {

}
