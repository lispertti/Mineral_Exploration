package org.myapp.model.query;

import io.ebean.Database;
import io.ebean.FetchGroup;
import io.ebean.Query;
import io.ebean.Transaction;
import io.ebean.typequery.PFloat;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;
import javax.annotation.processing.Generated;
import org.myapp.model.Alteration;
import org.myapp.model.query.assoc.QAssocCollar;

/**
 * Query bean for Alteration.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QAlteration extends TQRootBean<Alteration,QAlteration> {

  private static final QAlteration _alias = new QAlteration(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QAlteration alias() {
    return _alias;
  }

  public PLong<QAlteration> id;
  public PString<QAlteration> holeid;
  public PFloat<QAlteration> depthFrom;
  public PFloat<QAlteration> depthTo;
  public PInteger<QAlteration> bleaching;
  public PInteger<QAlteration> veining;
  public PInteger<QAlteration> sulphides;
  public QAssocCollar<QAlteration> collar;
  public PLong<QAlteration> lastUpdate;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QAlteration forFetchGroup() {
    return new QAlteration(FetchGroup.queryFor(Alteration.class));
  }

  /**
   * Construct using the default Database.
   */
  public QAlteration() {
    super(Alteration.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QAlteration(Transaction transaction) {
    super(Alteration.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QAlteration(Database database) {
    super(Alteration.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QAlteration(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QAlteration(Query<Alteration> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QAlteration> id = _alias.id;
    public static PString<QAlteration> holeid = _alias.holeid;
    public static PFloat<QAlteration> depthFrom = _alias.depthFrom;
    public static PFloat<QAlteration> depthTo = _alias.depthTo;
    public static PInteger<QAlteration> bleaching = _alias.bleaching;
    public static PInteger<QAlteration> veining = _alias.veining;
    public static PInteger<QAlteration> sulphides = _alias.sulphides;
    public static QAssocCollar<QAlteration> collar = _alias.collar;
    public static PLong<QAlteration> lastUpdate = _alias.lastUpdate;
  }
}
