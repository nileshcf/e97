package com.optum.uhg.app.dto.d5427dt1;

/**
 * The class QueryFilterAuthCrit5 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:47. using version 5.0.0.257
 */
import com.optum.uhg.app.dto.serialize.d5427dt1.*;

public class QueryFilterAuthCrit5 extends QueryFilterAuthCrit5Serialized {

  /** Constructor for QueryFilterAuthCrit5 */
  public QueryFilterAuthCrit5() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
    replaceValue( // serialize and save the value
        (" AND DLN1.AUTH_NBR  > ").toCharArray(), getStartOffset() + 0, 22);
    replaceValue( // serialize and save the value
        ("'").toCharArray(), getStartOffset() + 22, 1);
    replaceValue( // serialize and save the value
        fillSpace(1), getStartOffset() + 23, 1);
    replaceValue( // serialize and save the value
        ("'").toCharArray(), getStartOffset() + 24, 1);
  }

  public static int getQueryFilterAuthCrit5FieldLength() {
    return QUERY_FILTER_AUTH_CRIT_5_LENGTH;
  }
}
