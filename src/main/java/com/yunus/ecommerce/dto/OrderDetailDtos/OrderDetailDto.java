package com.yunus.ecommerce.dto.OrderDetailDtos;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class OrderDetailDto {
    private Long orderDetailId;
    private Float productPrice;
    private Float subTotal;
    private Long productId;
    private Long orderId;
}
