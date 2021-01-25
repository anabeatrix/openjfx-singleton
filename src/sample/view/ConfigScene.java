package sample.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import sample.App;
import sample.model.Config;

public class ConfigScene extends AbstractScene {
    private Config config = Config.getInstance();

    public ConfigScene(App app) {
        super(app);

        var label1 = new Label("Formato de Relatórios");
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorios());

        var label2 = new Label("Tipo de Gráficos");
        var fieldTiposGraficos = new TextField(config.getTipoGraficos());

        var btnOk = new Button("OK");
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldTiposGraficos, btnOk));

        btnOk.setOnAction(event -> {
            config.setFormatRelatorios(fieldFormatoRelatorios.getText());
            config.setTipoGraficos(fieldTiposGraficos.getText());
            app.setScene(new MainScene(app));
        });
    }
}
