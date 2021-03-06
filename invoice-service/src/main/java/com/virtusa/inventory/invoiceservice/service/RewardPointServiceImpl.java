package com.virtusa.inventory.invoiceservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.virtusa.inventory.invoiceservice.model.RewardPoint;
import com.virtusa.inventory.invoiceservice.repository.RewardPointRepository;

/**
 * @author user
 *
 */
public class RewardPointServiceImpl {
	
	@Autowired
	RewardPointRepository rewardPointRepository;
	
	
	//save the rewardPoints
	public RewardPoint save(RewardPoint rewardPoint) {
		return rewardPointRepository.save(rewardPoint); 	
	}
	
	//fetch all rewardPoints 
	public List<RewardPoint> fetchAllRewardPoint() {
		return rewardPointRepository.findAll();
	}
	
	//fetch reward point relevant to the id
	public Optional<RewardPoint> fetchById(Integer id) {
		return rewardPointRepository.findById(id);
	}
	
	//fetch by reward value
//	public List<RewardPoint> fetchByRewardValue(Integer id) {
//		
//		
//	}
	
}
