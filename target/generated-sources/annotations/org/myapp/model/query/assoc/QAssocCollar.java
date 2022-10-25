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
import org.myapp.model.Collar;
import org.myapp.model.query.QCollar;

/**
 * Association query bean for AssocCollar.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocCollar<R> extends TQAssocBean<Collar,R> {

  public PLong<R> id;
  public PString<R> holeid;
  public PFloat<R> easting;
  public PFloat<R> northing;
  public PFloat<R> elevation;
  public PFloat<R> maxDepth;
  public PInteger<R> dip;
  public PInteger<R> direction;
  public PLong<R> lastUpdate;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QCollar>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QCollar>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QCollar>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QCollar>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocCollar(String name, R root) {
    super(name, root);
  }

  public QAssocCollar(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
