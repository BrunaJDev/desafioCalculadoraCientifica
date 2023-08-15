import java.util.Objects;

public class Cientifica extends Calculadora {
    private int raizQuadrada;
    private int potenciaExpoente;

//    public Cientifica() {
//    }

    public double raiz() {
       double resultado = 0;
        if (Objects.equals(getOperador(),"raiz")){
            resultado = Math.sqrt(this.getNumerador1()); //adicionar o this.
        }
        return resultado;
    }

    public double potencia() {
        double resultado = 0;
        if (Objects.equals(getOperador(), "potencia")) {
            resultado = Math.pow(getNumerador1(), this.potenciaExpoente);
        }
        return resultado;
    }
    public int getPotenciaExpoente() {
        return this.potenciaExpoente;
    }

    public void setPotenciaExpoente(int potenciaExpoente) {
        this.potenciaExpoente = potenciaExpoente;
        //se o expoente for negativo, fazer algo para ele virara positivo.
    }

    public int getRaizQuadrada() {
        return raizQuadrada;
    }

    public void setRaizQuadrada(int raizQuadrada) {
        this.raizQuadrada = raizQuadrada;
        //validar que não existe raiz de numero negativo;
        }
    }



