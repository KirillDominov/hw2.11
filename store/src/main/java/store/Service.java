package store;

import java.util.Collection;
import java.util.List;

public interface Service {
    Collection<Integer> getOrder();

    boolean addItems(List<Integer> items);
}