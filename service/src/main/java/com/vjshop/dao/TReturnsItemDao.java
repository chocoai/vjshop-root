/*
 * This file is generated by jOOQ.
*/
package com.vjshop.dao;


import com.vjshop.generated.db.tables.TReturnsItem;
import com.vjshop.generated.db.tables.records.TReturnsItemRecord;
import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TReturnsItemDao extends JooqBaseDao<TReturnsItemRecord, com.vjshop.entity.TReturnsItem, Long> {

    /**
     * Create a new TReturnsItemDao without any configuration
     */
    public TReturnsItemDao() {
        super(TReturnsItem.T_RETURNS_ITEM, com.vjshop.entity.TReturnsItem.class);
    }

    /**
     * Create a new TReturnsItemDao with an attached configuration
     */
    @Autowired
    public TReturnsItemDao(Configuration configuration) {
        super(TReturnsItem.T_RETURNS_ITEM, com.vjshop.entity.TReturnsItem.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.vjshop.entity.TReturnsItem object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchById(Long... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.vjshop.entity.TReturnsItem fetchOneById(Long value) {
        return fetchOne(TReturnsItem.T_RETURNS_ITEM.ID, value);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchByCreateDate(Timestamp... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>modify_date IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchByModifyDate(Timestamp... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.MODIFY_DATE, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchByVersion(Long... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.VERSION, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchByName(String... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.NAME, values);
    }

    /**
     * Fetch records that have <code>quantity IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchByQuantity(Integer... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.QUANTITY, values);
    }

    /**
     * Fetch records that have <code>sn IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchBySn(String... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.SN, values);
    }

    /**
     * Fetch records that have <code>specifications IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchBySpecifications(String... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.SPECIFICATIONS, values);
    }

    /**
     * Fetch records that have <code>returns IN (values)</code>
     */
    public List<com.vjshop.entity.TReturnsItem> fetchByReturns(Long... values) {
        return fetch(TReturnsItem.T_RETURNS_ITEM.RETURNS, values);
    }
}