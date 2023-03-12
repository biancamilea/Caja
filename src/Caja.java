public class Caja {
        private final int ancho;
        private final int alto;
        private final int fondo;
        private final Unidad unidad;
        private String etiqueta;


        public Caja(int ancho, int alto, int fondo, Unidad unidad) {
            this.ancho = ancho;
            this.alto = alto;
            this.fondo = fondo;
            this.unidad = unidad;
        }

        public double getVolumen() {
            double volumen = ancho * alto * fondo;
            if (unidad == Unidad.CM) {
                volumen /= 1000000.0;
            }
            return volumen;
        }

        public void setEtiqueta(String etiqueta) {
            this.etiqueta = etiqueta.substring(0, Math.min(etiqueta.length(), 30));
        }

        @Override
        public String toString() {
            return "Caja{" +
                    "ancho=" + ancho +
                    ", alto=" + alto +
                    ", fondo=" + fondo +
                    ", unidad=" + unidad +
                    ", etiqueta='" + etiqueta + '\'' +
                    '}';
        }
}

