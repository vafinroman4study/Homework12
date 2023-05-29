package pro.sky.java.course2.homework12_estore.services;

import java.util.List;

public interface StoreService{
    String addItems(String items);

    List<Integer> getItems();

    String hello();
}
