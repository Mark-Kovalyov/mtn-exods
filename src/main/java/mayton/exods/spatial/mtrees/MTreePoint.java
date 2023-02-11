package mayton.exods.spatial.mtrees;

import org.jetbrains.annotations.NotNull;

public final class MTreePoint <T> {

    public final double x;
    public final double y;
    public final T object;

    public MTreePoint(double x, double y, @NotNull T object) {
        this.x = x;
        this.y = y;
        this.object = object;
    }
}
