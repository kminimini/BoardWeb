package com.ezen.biz.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.BoardVO;

/* ù��° ��� : SqlSessionDaoSupport�� ��ӹ޾� Mybatis ��ü �����Ͽ� ��� */
//@Repository	// �ι�° ����� �浹�� �Ͼ�� �ʰ� �ϱ����� �ӽ÷� �ּ�ó��
public class BoardDAO extends SqlSessionDaoSupport {
	/*
	 *  �θ� Ŭ���� (SqlSessionDaoSupport)�� SessionFactory ���� �޼ҵ带 ȣ���Ͽ�
	 *  DB�� ������ ������ ������ִ� factory ����
	 *  @Autowired�� �����Ͽ� �ڵ����� �����ϵ��� �Ѵ�.
	 */
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		// SqlSessionFactory ��ü ����
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	// TODO �Խñ� �ۼ�
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� insertBoard() ó��");
		
		getSqlSession().insert("BoardMapper.insertBoard", vo);
	}
	
	// TODO �Խñ� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� updateBoard() ó��");
		
		getSqlSession().update("BoardMapper.updateBoard", vo);
	}
	// TODO �Խñ� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� deleteBoard() ó��");
		
		getSqlSession().delete("BoardMapper.deleteboard", vo);
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� getBoard() ó��");
		
		return getSqlSession().selectOne("BoardMapper.getBoard", vo);
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis�� getBoardList() ó��");
		
		return getSqlSession().selectList("BoardMapper.getBoardList", vo);
	}

}