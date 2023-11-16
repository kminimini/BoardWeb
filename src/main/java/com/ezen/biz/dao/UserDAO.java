package com.ezen.biz.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.common.JDBCUtil;
import com.ezen.biz.dto.UserVO;

@Repository("userDao")
public class UserDAO extends SqlSessionDaoSupport {

	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// SqlSessionFactory 按眉 积己
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public UserVO getUser(UserVO vo) {
		System.out.println("===> Mybatis肺 getUser() 贸府");

		
		return getSqlSession().selectOne("UserMapper.getUser", vo);		
	}

}
