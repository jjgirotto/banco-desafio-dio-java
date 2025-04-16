import lombok.Data;

@Data
public class CartaoCredito {
    private Conta cc;
    private String numero;
    private double fatura;
    private double limite;

    public CartaoCredito(Conta cc, String numero, double limite) {
        this.cc = cc;
        this.numero = numero;
        this.limite = limite;
    }

    public boolean realizarPagamento(double valor) {
        if (valor <= limite) {
            limite -= valor;
            fatura += valor;
            return true;
        } return false;
    }

    public void mostrarInfoCartao() {
        System.out.println("Cartão de crédito nº " + numero + ":");
        System.out.println("Limite: R$" + limite);
        System.out.println("Fatura: R$" + fatura);
    }

    public void pagarFatura() {
        limite += fatura;
        fatura = 0;
    }
    
}
