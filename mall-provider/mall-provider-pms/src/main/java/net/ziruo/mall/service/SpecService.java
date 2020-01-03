package net.ziruo.mall.service;

import net.ziruo.mall.model.domain.SpecValue;

import java.util.List;

/**
 * @Author: october
 * @Date: 2020/1/3 01:19
 * @Description:
 */
public interface SpecService {

    // 增加属性和值
    int addSpecKeyAndValue(String key, String value);

    // 增加某属性的值
    int addValueBySpecId(Integer specId, String value);

    List<SpecValue> listSpecValueBySpecId(Integer specId);


}
