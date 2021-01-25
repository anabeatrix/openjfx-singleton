package sample.model;

public class Config {
    private static final Config instance = new Config();

    String formatRelatorios = "html";
    String tipoGraficos = "pizza";

    // Definido construtor privado para impedir
    // que a classe seja instanciada a partir de outra classa
    // Apenas instancia o objeto.
    private Config() { }

    public static Config getInstance(){
        return instance;
    };

    public String getFormatRelatorios() {
        return formatRelatorios;
    }

    public void setFormatRelatorios(String formatRelatorios) {
        this.formatRelatorios = formatRelatorios;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
}
