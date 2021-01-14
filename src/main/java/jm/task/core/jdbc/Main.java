package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

      UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();
      //userDaoHibernate.createUsersTable();
      //userDaoHibernate.saveUser("Vasya", "Puskin", (byte) 28);
      //userDaoHibernate.saveUser("Kolya", "Tolstoy", (byte) 44);
      //userDaoHibernate.saveUser("Alex", "White", (byte) 38);
      //userDaoHibernate.saveUser("Goga", "Tupin", (byte) 56);

       userDaoHibernate.cleanUsersTable();
       userDaoHibernate.dropUsersTable();

        // реализуйте алгоритм здесь

    }
}
