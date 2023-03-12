 public class CajaCarton extends Caja {
        public CajaCarton(int ancho, int largo, int alto) {
            super(ancho, largo, alto, Unidad.CM);
        }

        public double calcularVolumen() {
            return super.getVolumen() * 0.8;
        }
         public double calcularSuperficie() {
             return 2 * (getAncho() * getFondo() + getAncho() * getAlto() + getFondo() * getAlto());
         }
}
