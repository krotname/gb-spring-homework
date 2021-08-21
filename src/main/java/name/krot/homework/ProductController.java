package name.krot.homework;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class ProductController {
    @GetMapping("/user")
    public ResponseEntity<?> Product() {

        ArrayList<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product product = new Product();
            product.setId(i);
            product.setCost(i * 15.7);
            product.setTitle("Title #" + i);
            list.add(product);
        }


        return ResponseEntity
                .status(HttpStatus.OK)
                .body(list);
    }
}
