package com.example.biddingapp.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.biddingapp.model.Playerregistration;

@Repository
public interface PlayerRegistrationRepository extends JpaRepository<Playerregistration, Long>  {
}
