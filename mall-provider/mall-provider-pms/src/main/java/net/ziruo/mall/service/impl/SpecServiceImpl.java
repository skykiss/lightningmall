package net.ziruo.mall.service.impl;

import net.ziruo.mall.mapper.SpecMapper;
import net.ziruo.mall.mapper.SpecValueMapper;
import net.ziruo.mall.model.domain.Spec;
import net.ziruo.mall.model.domain.SpecExample;
import net.ziruo.mall.model.domain.SpecValue;
import net.ziruo.mall.model.domain.SpecValueExample;
import net.ziruo.mall.service.SpecService;
import net.ziruo.mall.util.TimeTransUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: october
 * @Date: 2020/1/3 01:21
 * @Description:
 */

@Service
public class SpecServiceImpl implements SpecService {

    @Autowired
    private SpecMapper specMapper;
    @Autowired
    private SpecValueMapper specValueMapper;

    @Override
    public int addSpecKeyAndValue(String key, String value) {
        Spec spec = new Spec();
        spec.setSpecName(key);
        spec.setCreateTime(TimeTransUtil.currentTimeToInt());
        specMapper.insertSelective(spec);
        System.out.println(spec.getId());
        addValueBySpecId(spec.getId(), value);
        return spec.getId();
    }

    @Override
    public int addValueBySpecId(Integer specId, String value) {
        SpecValue specValue = new SpecValue();
        specValue.setSpecId(specId);
        specValue.setSpecValue(value);
        specValue.setCreateTime(TimeTransUtil.currentTimeToInt());
        specValueMapper.insertSelective(specValue);
        return specValue.getId();
    }

    @Override
    public List<SpecValue> listSpecValueBySpecId(Integer specId) {
        SpecValueExample example = new SpecValueExample();
        example.createCriteria().andSpecIdEqualTo(specId);
        return specValueMapper.selectByExample(example);
    }
}
