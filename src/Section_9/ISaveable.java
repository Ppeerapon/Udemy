package Section_9;

import java.util.List;

public interface ISaveable {

    List<String> strings = null;

    default List<String> write() {
        return strings;
    }
    default void read(List<String> strings) {
        //this.strings = strings;
    }

}
