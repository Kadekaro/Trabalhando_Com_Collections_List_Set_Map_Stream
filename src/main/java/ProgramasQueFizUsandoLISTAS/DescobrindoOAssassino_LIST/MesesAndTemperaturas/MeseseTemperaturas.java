package ProgramasQueFizUsandoLISTAS.DescobrindoOAssassino_LIST.MesesAndTemperaturas;

class MeseseTemperaturas {
    public String mounth;
    public Double temperature;

    public MeseseTemperaturas(String mounth, Double temperature) {
        this.mounth = mounth;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "{" +
                "mounth= " + mounth + ", " +
                "temperature= " + temperature +
                "}";
    }
}
