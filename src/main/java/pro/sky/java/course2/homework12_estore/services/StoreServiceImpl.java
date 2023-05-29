package pro.sky.java.course2.homework12_estore.services;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework12_estore.repository.Cart;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class StoreServiceImpl implements StoreService {

    private final Cart cart;

    StoreServiceImpl(Cart cart) {
        this.cart = cart;
    }
    public String addItems(String items) {
        List<Integer> itemsList = Stream.of(items.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (Integer i : itemsList) {
            cart.add(i);
        }


        return "В корзину добавлен список покупок: " + items;
    }

    public List<Integer> getItems() {
        return cart.getCart();
    }

    @Override
    public String hello() {
        return "Решение по ДЗ урока «Spring».";
    }
}
