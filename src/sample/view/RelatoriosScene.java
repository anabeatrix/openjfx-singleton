package sample.view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.TilePane;
import sample.App;
import sample.model.Config;

public class RelatoriosScene extends AbstractScene {
    private final Config config = Config.getInstance();

    public RelatoriosScene(App app) {
        super(app);

        var label = new Label("Formato de Relatórios = " + config.getFormatRelatorios());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnVoltar));

        btnVoltar.setOnAction(event -> app.setScene(new MainScene(app)));


    }
}
