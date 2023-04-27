package com.ssafy.enjoytrip.plan.model.service;

import java.sql.SQLException;

import org.springframework.stereotype.Service;

import com.ssafy.enjoytrip.plan.model.Plan;
import com.ssafy.enjoytrip.plan.model.mapper.PlanMapper;

@Service
public class PlanServiceImpl implements PlanService {

	private PlanMapper planMapper;
	
	public PlanServiceImpl(PlanMapper planMapper) {
		this.planMapper = planMapper;
	}

	@Override
	public void getPlanList(String userId) throws SQLException {
		planMapper.selectPlanList(userId);
	}

	@Override
	public void getPlan(String planId) throws SQLException {
		planMapper.selectPlanById(planId);
	}

	@Override
	public void createPlan(Plan plan) throws SQLException {
		planMapper.insertPlan(plan);
	}

	@Override
	public void updatePlan(Plan plan) throws SQLException {
		planMapper.updatePlan(plan);
	}

	@Override
	public void deletePlan(String planId) throws SQLException {
		planMapper.deletePlan(planId);
	}

}
