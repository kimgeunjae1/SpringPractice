package com.naver.rmswo;

import com.naver.rmswo.board.NewArticleRequest;
import com.naver.rmswo.board.WriteArticleService;
import com.naver.rmswo.member.MemberRegRequest;
import com.naver.rmswo.member.MemberService;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainQuickStart2 {
	
	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:acQuickStart2.xml");
		
		WriteArticleService writeArticleService = ctx.getBean("writeArticleService", WriteArticleService.class);
		writeArticleService.write(new NewArticleRequest("writer", "title", "content"));
		
		
	}

}
