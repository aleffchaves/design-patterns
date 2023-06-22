package criacionais.singleton;

import java.util.Objects;

public class Client {

    public static void main(String[] args) {

        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        Connection connection1 = connectionPool1.getConnection();
        if (Objects.nonNull(connection1)) {
            connection1.query("SELECT * FROM A1");
        }

        ConnectionPool connectionPool2 = ConnectionPool.getInstance();
        Connection connection2 = connectionPool2.getConnection();
        if (Objects.nonNull(connection2)) {
            connection2.query("SELECT * FROM A2");
        }

        connectionPool2.leaveConnection(connection2);

        ConnectionPool connectionPool3 = ConnectionPool.getInstance();
        Connection connection3 = connectionPool3.getConnection();
        if (Objects.nonNull(connection3)) {
            connection3.query("SELECT * FROM B7");
        }

    }
}
