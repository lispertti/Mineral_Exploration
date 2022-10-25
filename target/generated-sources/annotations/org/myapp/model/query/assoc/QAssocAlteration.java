package org.myapp.model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PFloat;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.processing.Generated;
import org.myapp.model.Alteration;
import org.myapp.model.query.QAlteration;

/**
 * Association query bean for AssocAlteration.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocAlteration<R> extends TQAssocBean<Alteration,R> {

  public PLong<R> id;
  public PString<R> holeid;
  public PFloat<R> depthFrom;
  public PFloat<R> depthTo;
  public PInteger<R> bleaching;
  public PInteger<R> veining;
  public PInteger<R> sulphides;
  public QAssocCollar<R> collar;
  public PLong<R> lastUpdate;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QAlteration>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QAlteration>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QAlteration>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QAlteration>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocAlteration(String name, R root) {
    super(name, root);
  }

  public QAssocAlteration(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
