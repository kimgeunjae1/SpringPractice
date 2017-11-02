package com.naver.rmswo.board;

public interface ArticleDao {

	void insert(Article article);
	Article selectById(Integer id);
	
}
