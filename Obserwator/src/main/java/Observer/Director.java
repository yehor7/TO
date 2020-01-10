package Observer;

import java.util.ArrayList;
import java.util.List;

class Director implements Observer {
    public void event(List<String> strings) {
        System.out.println("The list of students has changed: " + strings);
    }
}
