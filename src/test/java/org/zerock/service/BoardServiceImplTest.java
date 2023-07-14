package org.zerock.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criterial;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class BoardServiceImplTest {

	@Autowired
	private BoardService service;
	
	@Test
	public void testGetList() {
		log.info("-----------------GetList");
		service.getList(new Criterial()).
		forEach(vo-> log.info("vo : {}", vo ));;
	}

	@Test
	public void testRemove() {
		log.info("-----------------testRemove");
		log.info("delete=====> : {}", service.remove(2L));
	}
	
	@Test
	public void testModify() {
		log.info("-----------------testModify");
		BoardVO vo = new BoardVO();
		vo.setTitle("Jsp");
		vo.setContent("Jsp  마스터중........");
		vo.setWriter("이하림");
		vo.setBno(3L);
		
		log.info("modify : {}", service.modify(vo));
	}
	
	@Test
	public void testGetCount() {
		log.info("total count : {}", service.getTotal(new Criterial(1,10)));
	}
	
	
	
}
