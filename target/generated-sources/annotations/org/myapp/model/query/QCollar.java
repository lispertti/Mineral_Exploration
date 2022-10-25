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
import org.myapp.model.Collar;

/**
 * Query bean for Collar.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QCollar extends TQRootBean<Collar,QCollar> {

  private static final QCollar _alias = new QCollar(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QCollar alias() {
    return _alias;
  }

  public PLong<QCollar> id;
  public PString<QCollar> holeid;
  public PFloat<QCollar> easting;
  public PFloat<QCollar> northing;
  public PFloat<QCollar> elevation;
  public PFloat<QCollar> maxDepth;
  public PInteger<QCollar> dip;
  public PInteger<QCollar> direction;
  public PLong<QCollar> lastUpdate;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QCollar forFetchGroup() {
    return new QCollar(FetchGroup.queryFor(Collar.class));
  }

  /**
   * Construct using the default Database.
   */
  public QCollar() {
    super(Collar.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QCollar(Transaction transaction) {
    super(Collar.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QCollar(Database database) {
    super(Collar.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QCollar(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QCollar(Query<Collar> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QCollar> id = _alias.id;
    public static PString<QCollar> holeid = _alias.holeid;
    public static PFloat<QCollar> easting = _alias.easting;
    public static PFloat<QCollar> northing = _alias.northing;
    public static PFloat<QCollar> elevation = _alias.elevation;
    public static PFloat<QCollar> maxDepth = _alias.maxDepth;
    public static PInteger<QCollar> dip = _alias.dip;
    public static PInteger<QCollar> direction = _alias.direction;
    public static PLong<QCollar> lastUpdate = _alias.lastUpdate;
  }
}
