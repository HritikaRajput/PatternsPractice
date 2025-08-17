package org.lld.questions.snl.entities;

public class ConcretePlayer implements Player{
    private  int id;
    private  String name;

    public ConcretePlayer(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String getType() {
        return "normal";
    }

    public Player getPlayer(int id) {
        return this;
    }

    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
}
