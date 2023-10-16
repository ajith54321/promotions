package com.example.lulu02_02_MS4_Promotions.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lulu02_02_MS4_Promotions.Entity.PromotionsEntity;

@Repository
public interface PromotionsRepository extends JpaRepository<PromotionsEntity, Integer>{

}
