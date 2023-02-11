package mayton.exods.spatial.mtrees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MTreeTest {

    @Test
    void testAdd() {
        MTree<String> mTree = new MTree<>();
        mTree.add(new MTreePoint<>(0.0, 0.0, "Hello"));

    }

}