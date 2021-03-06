package com.sbs.java.am.service;

import java.sql.Connection;
import java.util.List;

import com.sbs.java.am.dao.ArticleDao;
import com.sbs.java.am.dto.Article;

public class ArticleService {
	private Connection con;
	private ArticleDao articleDao;
	public ArticleService(Connection con) {
		this.con = con;
		this.articleDao = new ArticleDao(con);
	}
	public int getItemsInAPage() {
		return 3;
	}
	public int getForPrintListTotalPage(int page) {
		int itemsInAPage = getItemsInAPage();

		int totalCount = articleDao.getTotalCount();

		
		int totalPage = (int) Math.ceil((double) totalCount / itemsInAPage);
		return totalPage;
	}
	public List<Article> getForPrintListArticles(int page) {
		int itemsInAPage = getItemsInAPage();
		int limitFrom = (page -1) * itemsInAPage;
		
		
		
		List<Article> articles = articleDao.getArticles(limitFrom, itemsInAPage);
		return articles;
	}

}
