/**
 * @(#)ItemService.java, 2019/09/04. 20:36
 * @Author: L.Wen
 * <p/>
 */
package cn.xpu.service;

import java.util.List;

import cn.xpu.error.BusinessException;
import cn.xpu.service.model.ItemModel;

/**
 * @Author: L.Wen
 * @created_at: 2019/09/04 20:36
 */
public interface ItemService {

    // 创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    // 商品列表浏览
    List<ItemModel> listItem();

    // 商品详情浏览
    ItemModel getItemById(Integer id);


}
