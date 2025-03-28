package com.dinamo.dinamo.repositories;

import com.dinamo.dinamo.models.MensajeChatbot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeChatbotRepository extends JpaRepository<MensajeChatbot, Integer> {
}