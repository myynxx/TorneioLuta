public class Batalha {
    private Cavaleiro cav1;
    private Cavaleiro cav2;

    public Batalha(Cavaleiro cav1, Cavaleiro cav2) {
        this.cav1 = cav1;
        this.cav2 = cav2;
    }

    public void iniciarBatalha() {
        System.out.println("\n===== BATALHA ENTRE CAVALEIROS =====");
        System.out.println(cav1.getNome() + " vs " + cav2.getNome() + "\n");

        Cavaleiro atacante = cav1.getVelocidade() >= cav2.getVelocidade() ? cav1 : cav2;
        Cavaleiro defensor = atacante == cav1 ? cav2 : cav1;

        int turno = 1;

        while (cav1.estaVivo() && cav2.estaVivo()) {
            System.out.println("----- TURNO " + turno + " -----");

            int dano = atacante.getForca() - defensor.getDefesa();
            if (dano < 0) dano = 0;

            int novaVida = defensor.getHP() - dano;
            defensor.setHP(novaVida);

            System.out.println(atacante.getNome() + " ataca!");
            System.out.println("Dano causado: " + dano);
            System.out.println(defensor.getNome() + " agora tem " + Math.max(0, defensor.getHP()) + " de HP.\n");

            if (!defensor.estaVivo()) break;

            Cavaleiro temp = atacante;
            atacante = defensor;
            defensor = temp;

            turno++;
        }

        Cavaleiro vencedor = cav1.estaVivo() ? cav1 : cav2;
        System.out.println("🏆 VENCEDOR: " + vencedor.getNome() + "!\n");
    }
}
