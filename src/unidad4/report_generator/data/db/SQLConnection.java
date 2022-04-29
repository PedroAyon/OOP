package unidad4.report_generator.data.db;

public interface SQLConnection {
    void connect();
    void runStatement(String sql);
}
