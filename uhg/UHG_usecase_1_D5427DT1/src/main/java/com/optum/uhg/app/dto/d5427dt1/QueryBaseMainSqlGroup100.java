package com.optum.uhg.app.dto.d5427dt1;

/**
 * The class QueryBaseMainSqlGroup100 is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:47. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.serialize.d5427dt1.*;

public class QueryBaseMainSqlGroup100 extends QueryBaseMainSqlGroup100Serialized {

  /** Constructor for QueryBaseMainSqlGroup100 */
  public QueryBaseMainSqlGroup100() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for QueryBaseMainSqlGroup100. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public QueryBaseMainSqlGroup100(Field parent, int begin) {
    setParent(parent, begin);
  }

  @Override
  public void setParent(Field parent, int begin) {
    super.setParent(parent, begin);
    replaceValue( // serialize and save the value
        (",").toCharArray(), getStartOffset() + 0, 1);
    replaceValue( // serialize and save the value
        ("'").toCharArray(), getStartOffset() + 1, 1);
    replaceValue( // serialize and save the value
        fillSpace(1), getStartOffset() + 2, 1);
    replaceValue( // serialize and save the value
        ("'").toCharArray(), getStartOffset() + 3, 1);
    replaceValue( // serialize and save the value
        (")").toCharArray(), getStartOffset() + 4, 1);
  }

  public static int getQueryBaseMainSqlGroup100FieldLength() {
    return QUERY_BASE_MAIN_SQL_GROUP_100_LENGTH;
  }
}
