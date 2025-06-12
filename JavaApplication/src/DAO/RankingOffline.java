package DAO;

import java.sql.*;

public class RankingOffline {
    public static void main(String[] args) {
        // Caminho para o arquivo .db (será criado na pasta do projeto)
        String url = "jdbc:sqlite:ranking.db";

        try (Connection conn = DriverManager.getConnection(url)) {
            if (conn != null) {
                // Cria a tabela se não existir
                String sqlCriarTabela = "CREATE TABLE IF NOT EXISTS ranking (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "nome TEXT NOT NULL," +
                        "pontuacao INTEGER NOT NULL)";
                Statement stmt = conn.createStatement();
                stmt.execute(sqlCriarTabela);

                // Inserir exemplo (pode comentar se quiser usar só leitura)
                String sqlInserir = "INSERT INTO ranking (nome, pontuacao) VALUES (?, ?)";
                PreparedStatement ps = conn.prepareStatement(sqlInserir);
                ps.setString(1, "Deivid");
                ps.setInt(2, 3000);
                ps.executeUpdate();

                // Mostrar o ranking
                String sqlRanking = "SELECT * FROM ranking ORDER BY pontuacao DESC";
                ResultSet rs = conn.createStatement().executeQuery(sqlRanking);

                System.out.println("=== RANKING OFFLINE ===");
                int posicao = 1;
                while (rs.next()) {
                    String nome = rs.getString("nome");
                    int pontos = rs.getInt("pontuacao");
                    System.out.println(posicao + "º lugar - " + nome + ": " + pontos + " pontos");
                    posicao++;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
