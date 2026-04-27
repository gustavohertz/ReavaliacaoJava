package br.com.letheia.ufology.FuncionalidadesCapitulo2;

public class Coordenada {

    private double latitude;
    private double longitude;

    public Coordenada(double latitude, double longitude) {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("Latitude inválida. Deve estar entre -90 e 90.");
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("Longitude inválida. Deve estar entre -180 e 180.");
        }

        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String descricaoCurta() {
        return "Lat: " + this.latitude + " | Lon: " + this.longitude;
    }
}
