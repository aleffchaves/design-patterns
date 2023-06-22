package criacionais.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ConnectionPool {

    public static final int POOL_SIZE = 2;
    private static final ConnectionPool singleton = new ConnectionPool();
    private final List<Connection> connectionPool;

    public static  ConnectionPool getInstance() {
        return singleton;
    }

    private ConnectionPool() {
        System.out.println("Creating Connection Pool");
        connectionPool = new ArrayList<>();
        for (int i=0; i < POOL_SIZE; i++) {
            connectionPool.add(new Connection());
        }
    }

    public Connection getConnection() {
        Connection available = null;
        for (Connection conn: connectionPool) {
            if (!conn.isInUse()) {
                available = conn;
                break;
            }
        }

        if (Objects.isNull(available)) {
            System.out.println("No Connections available");
            return null;
        }
        available.setInUse(true);

        return available;
    }

    public void  leaveConnection(Connection connection) {
        connection.setInUse(false);
    }

}
