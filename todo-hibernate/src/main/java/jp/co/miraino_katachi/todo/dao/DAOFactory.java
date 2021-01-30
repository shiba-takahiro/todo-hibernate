package jp.co.miraino_katachi.todo.dao;

public class DAOFactory {

	public static UserDAO createUserDAO() {
//		return new UserDAOImpl();
		return new UserDAOHibernate();
	}

	public static ItemDAO createItemDAO() {
//		return new ItemDAOImpl();
		return new ItemDAOHibernate();
	}
}
