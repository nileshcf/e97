package com.optum.uhg.app.dto.d5427dt1;

/**
 * The class LilianGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:47. using version 5.0.0.257
 */
import com.cloudframe.app.exception.CFException;
import com.optum.uhg.app.dto.serialize.d5427dt1.*;

public class LilianGroup extends LilianGroupSerialized {

  private int lilian;

  /** Constructor for LilianGroup */
  public LilianGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of lilian
   *
   * @return lilian
   */
  public int getLilian() throws CFException {
    if (isLilianModified()) {
      lilian = refreshLilian();
    }
    return lilian;
  }

  /**
   * Update Lilian with the passed value Corresponding COBOL Variable is LILIAN
   *
   * @param number
   */
  public void setLilian(int number) {
    // Truncate if the number is beyond +/- Max range
    lilian = checkLilianMaxLimit(number);
    serializeLilian(lilian);
  }

  public void setLilian(long number) {
    number = checkLilianMaxLimit(number); // Truncate if value is beyond +/- Max range
    setLilian((int) number);
  }

  public static int getLilianGroupFieldLength() {
    return LILIAN_GROUP_LENGTH;
  }
}
