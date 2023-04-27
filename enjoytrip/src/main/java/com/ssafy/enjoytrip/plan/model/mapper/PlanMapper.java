package com.ssafy.enjoytrip.plan.model.mapper;

import java.sql.SQLException;
import org.apache.ibatis.annotations.Mapper;
import com.ssafy.enjoytrip.plan.model.Plan;

@Mapper
public interface PlanMapper {
	void selectPlanList(String userId) throws SQLException;
	void selectPlanById(String planId) throws SQLException;
	void insertPlan(Plan plan) throws SQLException;
	void updatePlan(Plan plan) throws SQLException;
	void deletePlan(String planId) throws SQLException;
}
