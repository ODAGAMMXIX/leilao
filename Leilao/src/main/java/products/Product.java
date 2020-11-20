package products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Product {
    private Integer id;
    private Double value;
    private Integer auction;


}
