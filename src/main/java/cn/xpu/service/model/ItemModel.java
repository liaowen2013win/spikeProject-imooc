/**
 * @(#)ItemModel.java, 2019/09/04. 19:55
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.service.model;

import java.math.BigDecimal;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * 商品模型
 *
 * @Author: L.Wen
 * @created_at: 2019/09/04 19:55
 */
public class ItemModel {

    private Integer id;
    // 商品名称
    @NotBlank(message = "商品名称不能为空")
    private String title;
    // 商品价格
    @NotNull(message = "商品价格不能为空")
    @Min(value = 0, message = "商品价格必须大于0")
    private BigDecimal price;
    // 商品库存
    @NotNull(message = "商品库存不能为空")
    private Integer stock;
    // 商品描述
    @NotBlank(message = "商品描述信息不能为空")
    private String description;
    // 商品销量
    private Integer sales;
    // 商品图片
    @NotBlank(message = "商品图片不能为空")
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
