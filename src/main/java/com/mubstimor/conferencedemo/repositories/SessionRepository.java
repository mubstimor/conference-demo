package com.mubstimor.conferencedemo.repositories;

import com.mubstimor.conferencedemo.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
