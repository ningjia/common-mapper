package com.example.springboot.mybatis.commonmapper.service.util;

import java.util.List;

/**
 * describe: 通用Service的基础接口类
 *
 * @author Neil.Jia
 * @date 2018/10/23
 */
public interface BaseService<T> {

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param entity
     * @return
     */
    List<T> select(T entity);

    /**
     * 根据主键字段进行查询，方法参数必须包含完整的主键属性，查询条件使用等号
     *
     * @param key
     * @return
     */
    T selectByKey(Object key);

    /**
     * 保存一个实体，null的属性也会保存，不会使用数据库默认值
     *
     * @param entity
     * @return
     */
    int save(T entity);

    /**
     * 根据主键字段进行删除，方法参数必须包含完整的主键属性
     *
     * @param key
     * @return
     */
    int delete(Object key);

    /**
     * 根据主键更新实体全部字段，null值会被更新
     *
     * @param entity
     * @return
     */
    int updateAll(T entity);

    /**
     * 根据主键更新属性不为null的值
     *
     * @param entity
     * @return
     */
    int updateNotNull(T entity);

    /**
     * 根据Example条件进行查询
     * 这个查询支持通过Example类指定查询列，通过selectProperties方法指定查询列
     *
     * @param example
     * @return
     */
    List<T> selectByExample(Object example);

    /**
     * 查询所有记录
     *
     * @return
     */
    List<T> selectAll();

}
