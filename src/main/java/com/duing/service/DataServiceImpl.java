package com.duing.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.duing.bean.DataBean;
import com.duing.handler.DataHandler;
import com.duing.handler.JsoupHandler;
import com.duing.mapper.DataMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//改造完成之后 Service里就不需要写方法了 mybatisplus这个包会自动设置
// 自带的方法为list() (iService的父类提供）
// 这样可以直接通过.list方法调用mapper连接的数据库表格里的数据
public class DataServiceImpl extends ServiceImpl<DataMapper, DataBean>
        implements DataService {

//    @Override
//    public List<DataBean> list() {
//        return DataHandler.getData();
//    }
//
//
//    @Override
//    public List<DataBean> listById(int id) {
//        if (id == 2) {
//            return JsoupHandler.getData();
//        }
//        return list();
//    }
}
