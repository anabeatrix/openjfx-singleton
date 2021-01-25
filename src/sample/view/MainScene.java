package sample.view;

import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import sample.App;

public class MainScene extends AbstractScene {
    public MainScene(App app) {
        super(app);

        var btnRelatorios = new Button("Relatórios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios, btnConfig));

        btnRelatorios.setOnAction(event -> app.setScene(new RelatoriosScene(app)));
        btnConfig.setOnAction(event -> app.setScene(new ConfigScene(app)));
    }
}
