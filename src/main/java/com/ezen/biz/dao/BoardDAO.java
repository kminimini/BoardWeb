package com.ezen.biz.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.BoardVO;

/* 첫번째 방법 : SqlSessionDaoSupport를 상속받아 Mybatis 객체 생성하여 사용 */
//@Repository	// 두번째 방법과 충돌이 일어나지 않게 하기위해 임시로 주석처리
public class BoardDAO extends SqlSessionDaoSupport {
	/*
	 *  부모 클래스 (SqlSessionDaoSupport)의 SessionFactory 생성 메소드를 호출하여
	 *  DB에 연결할 세션을 만들어주는 factory 생성
	 *  @Autowired를 적용하여 자동으로 실행하도록 한다.
	 */
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// SqlSessionFactory 객체 생성
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	// TODO 게시글 작성
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 insertBoard() 처리");
		
		getSqlSession().insert("BoardMapper.insertBoard", vo);
	}
	
	// TODO 게시글 수정
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 updateBoard() 처리");
		
		getSqlSession().update("BoardMapper.updateBoard", vo);
	}
	// TODO 게시글 삭제
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 deleteBoard() 처리");
		
		getSqlSession().delete("BoardMapper.deleteboard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis로 getBoard() 처리");
		
		return getSqlSession().selectOne("BoardMapper.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis로 getBoardList() 처리");
		
		return getSqlSession().selectList("BoardMapper.getBoardList", vo);
	}

}