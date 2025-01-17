package article.service;

import java.sql.Connection;
import java.sql.SQLException;

import article.dao.ArticleContentDao;
import article.dao.ArticleDao;
import article.model.Article;
import jdbc.JdbcUtil;
import jdbc.connection.ConnectionProvider;

public class DeleteArticleService {
	private ArticleDao articleDao =new ArticleDao();
	private ArticleContentDao contentDao = new ArticleContentDao();
	
	public void Dlete(DeleteRequest dleReq) {
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			
			Article article = articleDao.selectById(conn, dleReq.getArticleNumber());
			if(article == null) {
				throw new ArticleNotFoundException();
			}if(!canModify(dleReq.getUserId(), article)) {
				throw new PermissionDeniedException();
			}if(!canModify(dleReq.getUserId(), article)) {
				throw new PermissionDeniedException();
			}
			articleDao.delete(conn, dleReq.getArticleNumber());
			contentDao.delete(conn, dleReq.getArticleNumber());
			conn.commit();
		}catch(SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException();
		}catch(PermissionDeniedException e) {
			JdbcUtil.rollback(conn);
			throw e;
		} finally {
			JdbcUtil.close(conn);
		}
	}

	private boolean canModify(String delUserId, Article article) {
		// TODO Auto-generated method stub
		return article.getWriter().getId().equals(delUserId);
	}
}
