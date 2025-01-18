package hello.item_service.domain.item;

import lombok.Data;

// @Data 가 아닌 되도록 필요한 @Getter @Setter 로 사용하는 것을 권장
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price;
    private Integer quantity;

    public Item(){

    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
