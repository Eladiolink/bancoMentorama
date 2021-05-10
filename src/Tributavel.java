package src;
public interface Tributavel {
   public void Sacar(Double valor);
   public void depositar(Double valor);
   public Double getSaldo();
   public void transferir(Conta destino, Double valor);


}
