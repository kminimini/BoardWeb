package com.ezen.biz.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ezen.biz.dto.BoardVO;

/* �ι�° ���  */
@Repository
public class BoardDAO2 {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	// TODO �Խñ� �ۼ�
	public void insertBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� insertBoard() ó��2");
		
		mybatis.insert("BoardMapper.insertBoard", vo);
	}
	
	// TODO �Խñ� ����
	public void updateBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� updateBoard() ó��2");
		
		mybatis.update("BoardMapper.updateBoard", vo);
	}
	
	// TODO �Խñ� ����
	public void deleteBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� deleteBoard() ó��2");
		
		mybatis.delete("BoardMapper.deleteboard", vo);
	}
	
	// TODO �Խñ� �󼼺���
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("===> Mybatis�� getBoard() ó��2");
		
		return mybatis.selectOne("BoardMapper.getBoard", vo);
	}
	
	// TODO �Խñ� ����Ʈ
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("===> Mybatis�� getBoardList() ó��2");
		
		return mybatis.selectList("BoardMapper.getBoardList_D", vo);
	}

}
