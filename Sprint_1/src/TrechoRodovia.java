public class TrechoRodovia {

   private int quilometroInicial;
   private int quilometroFinal;
   private float nivelVegetacao;

    public float getNivelVegetacao() {
        return nivelVegetacao;
    }
    public void setNivelVegetacao(float nivelVegetacao) {
        this.nivelVegetacao = nivelVegetacao;
    }


    public int getQuilometroFinal() {
        return quilometroFinal;
    }
    public void setQuilometroFinal(int quilometroFinal) {
        this.quilometroFinal = quilometroFinal;
    }


    public int getQuilometroInicial() {
        return quilometroInicial;
    }
    public void setQuilometroInicial(int quilometroInicial) {
        this.quilometroInicial = quilometroInicial;
    }



    public void registrarCrescimento(double taxa){

        System.out.println("Nivel antigo da grama " + this.nivelVegetacao);
        this.nivelVegetacao += taxa;
        System.out.println("Nivel da vegetação atual " + this.nivelVegetacao);
    }



    public void mandarEquipes(){

        if (this.nivelVegetacao>= 25){

            System.out.println("Uma equipe foi desiguinada para a manutenção do trecho ");
            this.nivelVegetacao -= 20;
            System.out.println("Novo tamanho da grama " + this.nivelVegetacao);
    }else{
            System.out.println("Grama abaixo do nivel de corte ");
        }
    }

}
