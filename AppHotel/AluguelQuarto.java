package AppHotel;

public class AluguelQuarto {
   private String nome;
   private Integer quarto;

   public AluguelQuarto(){

        }

   public AluguelQuarto(String nome, Integer quarto){
       this.nome = nome;
       this.quarto = quarto;


        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getQuarto() {
            return quarto;
        }

        public void setQuarto(Integer quarto){
            this.quarto = quarto;
        }



        @Override
        public String toString() {
            return "Cliente: "+ nome
                    +" , Quarto:"+quarto;

        }
    }

