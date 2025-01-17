package auth.service;

import java.sql.Connection;
import java.sql.SQLException;

import javax.management.RuntimeErrorException;

import jdbc.connection.ConnectionProvider;
import member.dao.MemberDao;
import member.model.Member;

public class LoginService {

		private MemberDao memberDao = new MemberDao();
		
		public User login(String id, String password) {
			
			try(Connection conn = ConnectionProvider.getConnection()) {
				Member member= memberDao.selectByid(conn, id);
				if(member ==null) {
					throw new LoginFailException();
				}
				if(!member.matchPassword(password)) {
					throw new LoginFailException();
				}
				return new User(member.getId(), member.getName(), member.getNickname());
			}catch (SQLException e) {
				throw new RuntimeException(e);
				// TODO: handle exception
			}
		}
}
