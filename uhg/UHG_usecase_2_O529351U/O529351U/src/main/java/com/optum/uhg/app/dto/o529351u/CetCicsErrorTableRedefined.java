package com.optum.uhg.app.dto.o529351u;

/**
 * The class CetCicsErrorTableRedefined is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.serialize.o529351u.*;

public class CetCicsErrorTableRedefined extends CetCicsErrorTableRedefinedSerialized {

  /** Constructor for CetCicsErrorTableRedefined */
  public CetCicsErrorTableRedefined() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for CetCicsErrorTableRedefined. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public CetCicsErrorTableRedefined(Field parent, int begin) {
    setParent(parent, begin);
  }

  public static int getCetCicsErrorTableRedefinedFieldLength() {
    return CET_CICS_ERROR_TABLE_REDEFINED_LENGTH;
  }
}
