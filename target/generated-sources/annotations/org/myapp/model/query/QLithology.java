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
import org.myapp.model.Lithology;
import org.myapp.model.query.assoc.QAssocCollar;

/**
 * Query bean for Lithology.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@Generated("io.ebean.querybean.generator")
@TypeQueryBean("v1")
public class QLithology extends TQRootBean<Lithology,QLithology> {

  private static final QLithology _alias = new QLithology(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QLithology alias() {
    return _alias;
  }

  public PLong<QLithology> id;
  public PString<QLithology> holeid;
  public PString<QLithology> rockName;
  public PFloat<QLithology> depthFrom;
  public PFloat<QLithology> depthTo;
  public QAssocCollar<QLithology> collar;
  public PLong<QLithology> lastUpdate;


  /**
   * Return a query bean used to build a FetchGroup.
   */
  public static QLithology forFetchGroup() {
    return new QLithology(FetchGroup.queryFor(Lithology.class));
  }

  /**
   * Construct using the default Database.
   */
  public QLithology() {
    super(Lithology.class);
  }

  /**
   * Construct with a given transaction.
   */
  public QLithology(Transaction transaction) {
    super(Lithology.class, transaction);
  }

  /**
   * Construct with a given Database.
   */
  public QLithology(Database database) {
    super(Lithology.class, database);
  }


  /**
   * Construct for Alias.
   */
  private QLithology(boolean dummy) {
    super(dummy);
  }

  /**
   * Private constructor for FetchGroup building.
   */
  private QLithology(Query<Lithology> fetchGroupQuery) {
    super(fetchGroupQuery);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QLithology> id = _alias.id;
    public static PString<QLithology> holeid = _alias.holeid;
    public static PString<QLithology> rockName = _alias.rockName;
    public static PFloat<QLithology> depthFrom = _alias.depthFrom;
    public static PFloat<QLithology> depthTo = _alias.depthTo;
    public static QAssocCollar<QLithology> collar = _alias.collar;
    public static PLong<QLithology> lastUpdate = _alias.lastUpdate;
  }
}
