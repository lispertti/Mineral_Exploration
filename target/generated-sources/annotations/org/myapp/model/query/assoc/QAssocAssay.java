package org.myapp.model.query.assoc;

import io.ebean.Transaction;
import io.ebean.typequery.PFloat;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.processing.Generated;
import org.myapp.model.Assay;
import org.myapp.model.query.QAssay;

/**
 * Association query bean for AssocAssay.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssocAssay<R> extends TQAssocBean<Assay,R> {

  public PLong<R> id;
  public PString<R> holeid;
  public PString<R> sampleid;
  public PFloat<R> depthFrom;
  public PFloat<R> depthTo;
  public PFloat<R> Au;
  public PFloat<R> As;
  public QAssocCollar<R> collar;
  public PLong<R> lastUpdate;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetch(TQProperty<QAssay>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchQuery(TQProperty<QAssay>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Eagerly fetch this association using L2 cache.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchCache(TQProperty<QAssay>... properties) {
    return fetchCacheProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs @SuppressWarnings("varargs")
  public final R fetchLazy(TQProperty<QAssay>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocAssay(String name, R root) {
    super(name, root);
  }

  public QAssocAssay(String name, R root, String prefix) {
    super(name, root, prefix);
  }
}
