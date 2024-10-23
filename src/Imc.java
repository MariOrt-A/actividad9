public class Imc {
    static class IMC {
        private double peso;
        private double altura;

        public IMC(double peso, double altura) {
            this.peso = peso;
            this.altura = altura;
        }
        public void setAltura(double altura) {
            if (altura > 0) {
                this.altura = altura;
            } else {
                throw new IllegalArgumentException("La altura debe ser un número positivo.");
            }
        }
        public String calcular() {
            if (altura <= 0) {
                return "La Altura no puede ser cero o negativa.";
            }
            double imc = peso / Math.pow(altura, 2);

            if (imc < 18.5) {
                return "Bajo peso";
            } else if (imc >= 18.5 && imc <= 24.9) {
                return "Peso normal";
            } else if (imc >= 25 && imc <= 29.9) {
                return "Sobrepeso";
            } else if (imc >= 30 && imc <= 34.9) {
                return "Obesidad tipo 1";
            } else if (imc >= 35 && imc <= 39.9) {
                return "Obesidad tipo 2";
            } else {
                return "Obesidad tipo 3";
            }
        }
    }
}
