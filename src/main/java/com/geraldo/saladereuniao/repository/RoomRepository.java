package com.geraldo.saladereuniao.repository;

import com.geraldo.saladereuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
