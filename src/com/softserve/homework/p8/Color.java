package com.softserve.homework.p8;

import java.io.IOException;

import static com.softserve.homework.p8.Main.br;

public enum Color {
    RED, WHITE, YELLOW;

    public static Color getColorInEnum(String inputColor) throws ColorException, IOException {

         inputColor = br.readLine();

        switch (inputColor) {
            case "red": {
                return Color.RED;

            }
            case "white": {
                return Color.WHITE;

            }
            case "yellow": {
                return Color.YELLOW;

            }

            default: {
                throw new ColorException("You enter not exist color");
            }
        }
    }
}
