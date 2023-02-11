package mayton.exods.spatial.mtrees;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IMTree<T> {

    void add(@NotNull MTreePoint<T> point);

    void add(@NotNull Iterable<MTreePoint<T>> points);

    void remove(@NotNull MTreePoint<T> point);

    void clear();

    @Nullable
    @Contract(pure = true)
    MTreePoint<T> findNearest(@NotNull MTreePoint<T> point);

    @Contract(pure = true)
    Iterable<MTreePoint<T>> findKnearest(@NotNull MTreePoint<T> point);

    @Contract(pure = true)
    int size();

}
