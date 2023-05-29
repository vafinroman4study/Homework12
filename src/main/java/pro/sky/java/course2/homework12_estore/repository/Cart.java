package pro.sky.java.course2.homework12_estore.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Repository
@SessionScope
public class Cart {
    private List<Integer> cart;
    Cart() {
        this.cart = new ArrayList<>();
    }

    public void add(Integer i) {
        cart.add(i);
    }

    public List<Integer> getCart(){
        return cart;
    }

}
