package unidad1.AC;

/**
 * @author Pedro Ayon
 */
public class AC {
    int temperature;
    int minTemperature;
    int maxTemperature;
    int increment;

    public AC(int minTemperature, int maxTemperature) {
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.temperature = 15;
        this.increment = 5;
    }

    public void warm() {
        if (this.temperature + this.increment >= this.maxTemperature) {
            System.out.println("CALENTAR: Se ha alcanzado la temperatura máxima: " + this.maxTemperature);
            this.temperature = this.maxTemperature;
            return;
        } else {
            this.temperature = this.temperature + this.increment;
        }

        System.out.println("CALENTAR: Temperatura actual: " + this.temperature);
    }

    public void cool() {
        if (this.temperature - this.increment <= this.minTemperature) {
            System.out.println("ENFRIAR: Se ha alcanzado la temperatura mínima: " + this.minTemperature);
            this.temperature = this.minTemperature;
            return;
        } else {
            this.temperature = this.temperature - this.increment;
        }

        System.out.println("ENFRIAR: Temperatura actual: " + this.temperature);
    }

    public int getTemperature() {
        return (this.temperature);
    }

    public void printData() {
        System.out.println("IMPRIMIENDO INFORMACIÓN");
        System.out.println("Temperatura:" + this.temperature);
        System.out.println("Temperatura Mínima:" + this.minTemperature);
        System.out.println("Temperatura Máxima:" + this.maxTemperature);
        System.out.println("Incremento:" + this.increment);
    }

    public void setIncrement(int increment) {
        if (increment <= 0)
            System.out.println("setIncrement: No es válido un incremento negativo o CERO.");
        else {
            this.increment = increment;
            System.out.println("CAMBIAMOS EL INCREMENTO A " + this.increment + " GRADOS");
        }
    }
}
