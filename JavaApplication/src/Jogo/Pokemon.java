package Jogo;

public class Pokemon {
    private String nomePokemon;

    public String getNomePokemon() {
        return nomePokemon;
    }

    public void setNomePokemon(String nomePokemon) {
        this.nomePokemon = nomePokemon;
    }

    @Override
    public String toString() {
        return nomePokemon;
    }
}