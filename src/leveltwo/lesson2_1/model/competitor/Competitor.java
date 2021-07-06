package leveltwo.lesson2_1.model.competitor;

import leveltwo.lesson2_1.model.action.Jumper;
import leveltwo.lesson2_1.model.action.Runner;

public interface Competitor extends Jumper, Runner {
    boolean onDistance();
}
