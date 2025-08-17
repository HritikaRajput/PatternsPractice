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

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
