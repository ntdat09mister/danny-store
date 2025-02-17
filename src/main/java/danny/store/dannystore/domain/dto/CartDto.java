package danny.store.dannystore.domain.dto;

import lombok.Data;

@Data
public class CartDto {
    private Long cartId;
    private Long productId;
    private String src;
    private String nameProduct;
    private String classify;
    private Long price;
    private Long quantity;
    private String createdAt;
}
