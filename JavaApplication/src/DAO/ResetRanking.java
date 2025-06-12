package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ResetRanking {

    public static void main(String[] args) {
        String url = "jdbc:sqlite:ranking.db"; // Caminho do seu banco

        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement()) {

            // Deleta todos os dados da tabela
            String sqlDelete = "DELETE FROM ranking";
            stmt.executeUpdate(sqlDelete);

            // Reseta o contador de IDs (AUTOINCREMENT)
            String sqlResetId = "DELETE FROM sqlite_sequence WHERE name='ranking'";
            stmt.executeUpdate(sqlResetId);

            System.out.println("✅ Ranking resetado com sucesso.");

        } catch (SQLException e) {
            System.err.println("Erro ao resetar ranking: " + e.getMessage());
        }
    }
}
