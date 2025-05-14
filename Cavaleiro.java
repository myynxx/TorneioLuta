import java.util.Scanner;

public class Cavaleiro {
    Scanner teclado = new Scanner(System.in);
    private String nome;
    private int nivel;
    private String tipoPersonagem;
    private int forca;
    private int defesa;
    private int velocidade;
    private int HP;

    public Cavaleiro(String nome, int nivel, String tipoPersonagem){
        this.nome = nome;
        this.nivel = nivel;
        this.tipoPersonagem = tipoPersonagem;
    }

    public void setNome(){
        System.out.println("\nDigite seu nome: ");
        this.nome = teclado.nextLine();
    }

    public void setNivel(){
        do {
            System.out.println("\nDigite seu nível (1 a 100): ");
            this.nivel = teclado.nextInt();
            teclado.nextLine();
        } while (nivel < 1 || nivel > 100);
    }

    public void setTipoPersonagem(){
        System.out.println("\nDigite o número para escolher a classe do personagem: ");
        System.out.println("1 - Paladino [Tanque: resiste muito e ataca bem]");
        System.out.println("2 - Bárbaro [Ofensivo: dano bruto e rápido]");
        System.out.println("3 - Arqueiro [Ágil: ataca primeiro, mais frágil]");

        int opc = teclado.nextInt();

        if(opc == 1){
            this.tipoPersonagem = "Paladino";
            this.forca = 70;
            this.defesa = 90;
            this.velocidade = 40;
            this.HP = 120;
        } else if(opc == 2){
            this.tipoPersonagem = "Bárbaro";
            this.forca = 95;
            this.defesa = 50;
            this.velocidade = 60;
            this.HP = 100;
        } else if(opc == 3){
            this.tipoPersonagem = "Arqueiro";
            this.forca = 60;
            this.defesa = 40;
            this.velocidade = 90;
            this.HP = 80;
        }

        System.out.println("\n===== " + tipoPersonagem + " =====");
        System.out.println("Força - " + forca);
        System.out.println("Defesa - " + defesa);
        System.out.println("Velocidade - " + velocidade);
        System.out.println("HP - " + HP);
    }

    public String getNome() { return nome; }
    public int getNivel() { return nivel; }
    public String getTipoPersonagem() { return tipoPersonagem; }
    public int getForca() { return forca; }
    public int getDefesa() { return defesa; }
    public int getVelocidade() { return velocidade; }
    public int getHP() { return HP; }

    public void setHP(int hp) {
        this.HP = hp;
    }

    public boolean estaVivo() {
        return this.HP > 0;
    }
}
