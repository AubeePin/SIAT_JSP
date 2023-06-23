package org.comstudy.myweb.board;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class BoardDAO {
	private SqlSession mybatis; 
	public BoardDAO() {	
	//마이바티스에서 <XML에서 SqlSessionFactory 빌드하기> 보면 있음.
	try {
		String resource = "org/comstudy/myweb/mybatis/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//마이바티스에서 <SqlSessionFactory 에서 SqlSession 만들기> 한줄만 복사해서 넣어두기
		mybatis = sqlSessionFactory.openSession();
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
	public List<BoardDTO> selectAll() {
		return mybatis.selectList("BoardMapper.selectAll");
	}
	public BoardDTO selectOne(BoardDTO dto) {
		return mybatis.selectOne("BoardMapper.selectOne", dto);
	}
	public void insert(BoardDTO dto) {
		System.out.println(dto);
		mybatis.insert("BoardMapper.insertBoard", dto);
		mybatis.commit();//이거 반드시 넣을것.
	}
	public void update(BoardDTO dto) {
		System.out.println(dto);
		mybatis.update("BoardMapper.updateBoard", dto);
		mybatis.commit();
	}
	public void delete(BoardDTO dto) {
		System.out.println(dto);
		mybatis.delete("BoardMapper.deleteBoard", dto);
		mybatis.commit();
	}
}