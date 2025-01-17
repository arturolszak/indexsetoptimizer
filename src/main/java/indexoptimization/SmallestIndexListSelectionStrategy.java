package indexoptimization;

import java.util.ArrayList;
import java.util.List;

public class SmallestIndexListSelectionStrategy implements IndexListSelectionStrategy {
    @Override
    public List<List<Index>> choseBestIndexSets(List<List<Index>> indexCandidates) {
        //chose the best set (smallest number of indexes)
        int minSize = -1;
        List<List<Index>> bestIndexSetList = null;
        for (List<Index> indexes : indexCandidates) {
            if (minSize == -1 || indexes.size() < minSize) {
                bestIndexSetList = new ArrayList<>();
                bestIndexSetList.add(indexes);
                minSize = indexes.size();
            } else if (indexes.size() == minSize) {
                bestIndexSetList.add(indexes);
            }
        }
        return bestIndexSetList;
    }
}
