public class main {
    public static void main(String args[]) {
        Cavaleiro cavaleiro1 = new Cavaleiro(null, 0, null);
        Cavaleiro cavaleiro2 = new Cavaleiro(null, 0, null);

        System.out.println("===== CRIAÇÃO DE PERSONAGEM 1 =====");
        cavaleiro1.setNome();
        cavaleiro1.setNivel();
        cavaleiro1.setTipoPersonagem();

        System.out.println("\n===== CRIAÇÃO DE PERSONAGEM 2 =====");
        cavaleiro2.setNome();
        cavaleiro2.setNivel();
        cavaleiro2.setTipoPersonagem();

        Batalha batalha = new Batalha(cavaleiro1, cavaleiro2);
        batalha.iniciarBatalha();
    }
}
