package com.gocoder.myhome.repository;

import com.gocoder.myhome.model.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
