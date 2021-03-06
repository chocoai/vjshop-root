/*
 * This file is generated by jOOQ.
*/
package com.vjshop.dao;


import com.vjshop.generated.db.tables.TShippingPaymentMethod;
import com.vjshop.generated.db.tables.records.TShippingPaymentMethodRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Record2;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.vjshop.generated.db.tables.TShippingPaymentMethod.T_SHIPPING_PAYMENT_METHOD;


/**
 * 配送方式支付方式关系DAO
 */
@Repository
public class TShippingPaymentMethodDao extends JooqBaseDao<TShippingPaymentMethodRecord, com.vjshop.entity.TShippingPaymentMethod, Record2<Long, Long>> {

    /**
     * Create a new TShippingPaymentMethodDao without any configuration
     */
    public TShippingPaymentMethodDao() {
        super(T_SHIPPING_PAYMENT_METHOD, com.vjshop.entity.TShippingPaymentMethod.class);
    }

    /**
     * Create a new TShippingPaymentMethodDao with an attached configuration
     */
    @Autowired
    public TShippingPaymentMethodDao(Configuration configuration) {
        super(T_SHIPPING_PAYMENT_METHOD, com.vjshop.entity.TShippingPaymentMethod.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Record2<Long, Long> getId(com.vjshop.entity.TShippingPaymentMethod object) {
        return compositeKeyRecord(object.getShippingMethods(), object.getPaymentMethods());
    }

    /**
     * Fetch records that have <code>shipping_methods IN (values)</code>
     */
    public List<com.vjshop.entity.TShippingPaymentMethod> fetchByShippingMethods(Long... values) {
        return fetch(T_SHIPPING_PAYMENT_METHOD.SHIPPING_METHODS, values);
    }

    /**
     * Fetch records that have <code>payment_methods IN (values)</code>
     */
    public List<com.vjshop.entity.TShippingPaymentMethod> fetchByPaymentMethods(Long... values) {
        return fetch(T_SHIPPING_PAYMENT_METHOD.PAYMENT_METHODS, values);
    }

    public void deleteByShippingMethodId(Long id) {
        getDslContext().delete(T_SHIPPING_PAYMENT_METHOD).where(T_SHIPPING_PAYMENT_METHOD.SHIPPING_METHODS.eq(id))
                .execute();
    }
}
