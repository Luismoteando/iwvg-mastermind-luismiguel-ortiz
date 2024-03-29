package controllers;

import models.Game;
import models.ProposedCombination;
import models.Result;

import java.util.ArrayList;

public class ProposalController extends Controller {

    public ProposalController(Game game) {
        super(game);
    }

    public void addProposedCombination(ProposedCombination proposedCombination) {
        this.game.addProposedCombination(proposedCombination);
    }

    public boolean isFinished() {
        return this.game.isFinished();
    }

    public boolean isWinner() {
        return this.game.isWinner();
    }

    public ArrayList<Result> getResults() {
        return this.game.getResults();
    }
}
