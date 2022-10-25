package org.myapp.model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PFloat;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.processing.Generated;
import org.myapp.model.Assay;
import org.myapp.model.query.assoc.QAssocCollar;

/**
 * Query bean for Assay.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAssay extends TQRootBean<Assay,QAssay> {

  private static final QAssay _alias = new QAssay(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QAssay alias() {
    return _alias;
  }

  public PLong<QAssay> id;
  public PString<QAssay> holeid;
  public PString<QAssay> sampleid;
  public PFloat<QAssay> depthFrom;
  public PFloat<QAssay> depthTo;
  public PFloat<QAssay> Au;
  public PFloat<QAssay> As;
  public QAssocCollar<QAssay> collar;
  public PLong<QAssay> lastUpdate;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QAssay forFetchGroup() {
    return new QAssay(FetchGroup.queryFor(Assay.class));
  }

  /**
   * Construct using the default Database.
   */
  public QAssay() {
    super(Assay.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QAssay(Transaction transaction) {
    super(Assay.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QAssay(Database database) {
    super(Assay.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QAssay(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QAssay(Query<Assay> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QAssay> id = _alias.id;
    public static PString<QAssay> holeid = _alias.holeid;
    public static PString<QAssay> sampleid = _alias.sampleid;
    public static PFloat<QAssay> depthFrom = _alias.depthFrom;
    public static PFloat<QAssay> depthTo = _alias.depthTo;
    public static PFloat<QAssay> Au = _alias.Au;
    public static PFloat<QAssay> As = _alias.As;
    public static QAssocCollar<QAssay> collar = _alias.collar;
    public static PLong<QAssay> lastUpdate = _alias.lastUpdate;
  }
}
