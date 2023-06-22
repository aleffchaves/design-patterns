package criacionais.singleton;

public class Connection {

    private boolean inUse;

    public Connection() {
        this.inUse = false;
    }

    public void query(String sql) {
        System.out.println("Running '" + sql + "' in Connection " + this);
    }

    boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

}
