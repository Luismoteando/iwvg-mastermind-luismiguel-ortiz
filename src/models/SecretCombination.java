package models;

import java.util.Collections;
import java.util.Random;

public class SecretCombination extends Combination {

    public SecretCombination() {
        Collections.addAll(this.colors, Color.values());
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < Color.length() - LENGTH; i++) {
            this.colors.remove(random.nextInt(this.colors.size()));
        }
        Collections.shuffle(this.colors);
    }

    Result getResult(ProposedCombination proposedCombination) {
        int blacks = 0;
        for (int i = 0; i < this.colors.size(); i++) {
            if (proposedCombination.contains(this.colors.get(i), i)) {
                blacks++;
            }
        }
        int whites = 0;
        for (Color color : this.colors) {
            if (proposedCombination.contains(color)) {
                whites++;
            }
        }
        return new Result(proposedCombination, blacks, whites - blacks);
    }
}
