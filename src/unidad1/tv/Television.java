package unidad1.tv;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;

/**
 * @author Pedro Ayon
 */
public class Television {
    private final String brand;
    private final String model;
    private boolean power = false;
    private int volume = 10;
    private int volumeBeforeMute = 0;
    private int maxVolume = 15;
    private boolean muted = false;
    private int channelIndex = 0;
    private final List<String> channels;

    /**
     * @param brand Marca del televisor
     * @param model Modelo del televisor
     */
    public Television(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.channels = Arrays.asList("Disney channel", "National Geographic", "Nickelodeon", "Discovery Channel", "HBO", "TNT");
    }

    /**
     * Constructor para crear una instancia estableciendo el volumen máximo.
     *
     * @param brand     Marca del televisor
     * @param model     Modelo del televisor
     * @param maxVolume Volumen maximo
     */
    public Television(String brand, String model, int maxVolume) {
        this.brand = brand;
        this.model = model;
        this.maxVolume = maxVolume;
        this.channels = Arrays.asList("Disney", "National Geographic", "Nickelodeon", "Discovery Channel", "HBO", "TNT");
    }

    /**
     * Enciende o apaga el televisor
     */
    public void powerButton() {
        this.power = !this.power;
    }

    /**
     * Boton de silenciar
     */
    public void muteButton() {
        if (tvIsOff()) return;
        this.muted = !this.muted;
        if (muted) {
            volumeBeforeMute = volume;
            volume = 0;
            log("TV muted");
        } else {
            volume = volumeBeforeMute;
            volumeBeforeMute = 0;
            log("Unmuted TV");
        }
    }

    /**
     * Subir el volumen
     */
    public void increaseVolume() {
        if (tvIsOff()) return;
        if (muted) muteButton();
        if (checkVolumeBounds(true)) {
            this.volume++;
            printVolume();
        }
    }

    /**
     * Bajar el volumen
     */
    public void decreaseVolume() {
        if (tvIsOff()) return;
        if (muted) muteButton();
        if (checkVolumeBounds(false)) {
            this.volume--;
            printVolume();
        }
    }

    /**
     * Revisar si se puede subir o bajar el volumen
     *
     * @param increase Evaluar si la accion es subir (verdadero) o bajar (falso) el volumen
     * @return Verdadero si se puede efectuar la accion
     */
    private boolean checkVolumeBounds(boolean increase) {
        if ((increase && this.volume < this.maxVolume) || (!increase && this.volume > 0)) return true;
        else {
            if (increase) log("Cannot increase the volume, the maximum volume was reached.");
            else log("Cannot decrease the volume, the minimum volume was reached.");
            return false;
        }
    }

    /**
     * Imprime el volumen actual
     */
    public void printVolume() {
        if (tvIsOff()) return;
        log("Current volume: " + this.volume);
    }

    /**
     * Siguiente canal
     */
    public void nextChannel() {
        if (tvIsOff()) return;
        this.channelIndex++;
        if (this.channelIndex == this.channels.size()) this.channelIndex = 0;
    }

    /**
     * Canal anterior
     */
    public void previousChannel() {
        if (tvIsOff()) return;
        this.channelIndex--;
        if (this.channelIndex == -1) this.channelIndex = this.channels.size() - 1;
    }

    /**
     * Imprime el canal que se está visualizando en el televisor
     */
    public void display() {
        if (tvIsOff()) return;
        log("Currently watching " + this.channels.get(channelIndex));
    }

    /**
     * Asegurarse de que el televisor esta encendido antes de ejecutar una accion que lo requiera
     *
     * @return Verdadero si el televisor esta apagado
     */
    private boolean tvIsOff() {
        if (!power) log("Error! TV is off.");
        return !power;
    }

    /**
     * Muestra un mensaje compuesto por la marca y nombre del televisor, y el mensaje que se desea imprimir
     *
     * @param message Mensaje a desplegar
     */
    private void log(String message) {
        System.out.println(MessageFormat.format("{0} {1} says: {2}", this.brand, this.model, message));
    }

    /**
     * @return Cadena de texto que contiene los atributos de la clase
     */
    @Override
    public String toString() {
        return "Television{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                ", volume=" + volume +
                ", volumeBeforeMute=" + volumeBeforeMute +
                ", maxVolume=" + maxVolume +
                ", muted=" + muted +
                ", channelIndex=" + channelIndex +
                ", channels=" + channels +
                '}';
    }
}
