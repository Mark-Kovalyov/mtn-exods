package mayton.exods.spatial.mtrees;

import java.util.ArrayList;
import java.util.List;

public class MTree<T> implements IMTree<T> {

    private List<MTreePoint<T>> points;

    public MTree() {
        this.points = new ArrayList<>();
    }

    @Override
    public void add(MTreePoint<T> point) {

    }

    @Override
    public void add(Iterable<MTreePoint<T>> points) {

    }

    @Override
    public void remove(MTreePoint<T> point) {

    }

    @Override
    public void clear() {
        points.clear();
    }

    @Override
    public MTreePoint<T> findNearest(MTreePoint<T> point) {
        return null;
    }

    @Override
    public Iterable<MTreePoint<T>> findKnearest(MTreePoint<T> point) {
        return null;
    }

    @Override
    public int size() {
        return points.size();
    }

}
