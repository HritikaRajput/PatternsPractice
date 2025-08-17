package org.lld.questions.snl;

import org.lld.questions.snl.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) throws Exception {
        List<ConcretePlayer> players = new ArrayList<>();
        players.add(new ConcretePlayer("hritika",0));
        players.add(new ConcretePlayer("goochi",1));


        List<Snakes> list = new ArrayList<>();
        list.add(new Snakes(0,10));
        list.add(new Snakes(5,40));
        list.add(new Snakes(35,48));
        list.add(new Snakes(10,99));

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(10, 50));
        ladders.add(new Ladder(6,15));
        ladders.add(new Ladder(38,78));


        Board board = new Board(10, list, ladders);

        Game game = new Game(players, board);
        game.start();

        game.roll();



    }
}
