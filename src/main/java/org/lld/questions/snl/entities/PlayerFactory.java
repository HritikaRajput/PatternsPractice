package org.lld.questions.snl.entities;

public class PlayerFactory {
    public static Player getPlayer(String type, String name, int id) {
        switch (type) {
            case "normal":
                return new ConcretePlayer(name, id);
            default:
                throw new IllegalArgumentException("Unknown player type: " + type);
        }
    }
}
