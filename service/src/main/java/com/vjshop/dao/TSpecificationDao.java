/*
 * This file is generated by jOOQ.
*/
package com.vjshop.dao;


import com.vjshop.generated.db.tables.TSpecification;
import com.vjshop.generated.db.tables.records.TSpecificationRecord;
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
public class TSpecificationDao extends JooqBaseDao<TSpecificationRecord, com.vjshop.entity.TSpecification, Long> {

    /**
     * Create a new TSpecificationDao without any configuration
     */
    public TSpecificationDao() {
        super(TSpecification.T_SPECIFICATION, com.vjshop.entity.TSpecification.class);
    }

    /**
     * Create a new TSpecificationDao with an attached configuration
     */
    @Autowired
    public TSpecificationDao(Configuration configuration) {
        super(TSpecification.T_SPECIFICATION, com.vjshop.entity.TSpecification.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.vjshop.entity.TSpecification object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchById(Long... values) {
        return fetch(TSpecification.T_SPECIFICATION.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.vjshop.entity.TSpecification fetchOneById(Long value) {
        return fetchOne(TSpecification.T_SPECIFICATION.ID, value);
    }

    /**
     * Fetch records that have <code>create_date IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByCreateDate(Timestamp... values) {
        return fetch(TSpecification.T_SPECIFICATION.CREATE_DATE, values);
    }

    /**
     * Fetch records that have <code>modify_date IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByModifyDate(Timestamp... values) {
        return fetch(TSpecification.T_SPECIFICATION.MODIFY_DATE, values);
    }

    /**
     * Fetch records that have <code>version IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByVersion(Long... values) {
        return fetch(TSpecification.T_SPECIFICATION.VERSION, values);
    }

    /**
     * Fetch records that have <code>orders IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByOrders(Integer... values) {
        return fetch(TSpecification.T_SPECIFICATION.ORDERS, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByName(String... values) {
        return fetch(TSpecification.T_SPECIFICATION.NAME, values);
    }

    /**
     * Fetch records that have <code>options IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByOptions(String... values) {
        return fetch(TSpecification.T_SPECIFICATION.OPTIONS, values);
    }

    /**
     * Fetch records that have <code>product_category IN (values)</code>
     */
    public List<com.vjshop.entity.TSpecification> fetchByProductCategory(Long... values) {
        return fetch(TSpecification.T_SPECIFICATION.PRODUCT_CATEGORY, values);
    }
}
