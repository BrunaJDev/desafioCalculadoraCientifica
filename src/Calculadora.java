
import java.util.Objects;

    public class Calculadora {
        private double numerador1;
        private double numerador2;
        private String operador;

        public Calculadora() {
//            this.setNumerador1(numerador1);
//            this.setNumerador2(numerador2);
//            this.setOperador(operador);
        }


        public double operacoes() {
            double opAritimetico = 0;
            if (Objects.equals(operador, "adicao")) {
                opAritimetico = numerador1 + numerador2;
            }
            else if (Objects.equals(operador, "subtracao")) {
                opAritimetico = numerador1 - numerador2;
            }
            else if (Objects.equals(operador, "multiplicacao")) {
                opAritimetico = numerador1 * numerador2;
            }
            else if (Objects.equals(operador, "divisao")) {
                opAritimetico = numerador1 / numerador2;
            }
            return opAritimetico;
        }

        public double getNumerador1() {
            return this.numerador1;
        }

        public void setNumerador1(double numerador1) {
            this.numerador1 = numerador1;
            //Fazer uma vaidacao
        }

        public double getNumerador2() {
            return this.numerador2;
        }

        public void setNumerador2(double numerador2) {
            this.numerador2 = numerador2;
        }

        public String getOperador() {
            return this.operador;
        }

        public void setOperador(String operador) {
            this.operador = operador;
            if (!Objects.equals(operador, "adicao")  && !Objects.equals(operador, "subtracao") && !Objects.equals(operador, "multplicacao" )
            && !Objects.equals(operador, "divisao")  && !Objects.equals(operador, "potencia")&& !Objects.equals(operador, "raiz") ) {

                throw new IllegalArgumentException("Digite um operador válido");
            }

        }
        }








