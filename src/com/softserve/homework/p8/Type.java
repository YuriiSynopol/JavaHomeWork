package com.softserve.homework.p8;

import java.io.IOException;

import static com.softserve.homework.p8.Main.br;

public enum Type {
    ROSE, TULIP, CHAMOMILE;

    public static Type getTypeInEnum(String inputType) throws TypeException, IOException {

        inputType = br.readLine();

        switch (inputType) {
            case "rose": {
                return Type.ROSE;

            }
            case "tulip": {
                return Type.TULIP;

            }
            case "chamomile": {
                return Type.CHAMOMILE;

            }

            default: {
                throw new TypeException("You enter not exist type");
            }
        }
    }
}
