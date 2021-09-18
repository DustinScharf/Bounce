package com.dustinscharf.bounce;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import javafx.scene.input.KeyCode;

import static com.almasb.fxgl.dsl.FXGL.getNotificationService;
import static com.almasb.fxgl.dsl.FXGL.onKeyDown;

public class GameApp extends GameApplication {
    @Override
    protected void initSettings(GameSettings gameSettings) {
        // empty
    }

    @Override
    protected void initGame() {
        // empty
    }

    protected void initInput() {

    }

    public static void main(String[] args) {
        launch(args);
    }
}
