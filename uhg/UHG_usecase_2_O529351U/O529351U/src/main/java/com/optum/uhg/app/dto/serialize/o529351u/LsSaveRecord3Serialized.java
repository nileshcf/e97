package com.optum.uhg.app.dto.serialize.o529351u;

/**
 * The class LsSaveRecord3Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LsSaveRecord3Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(LsSaveRecord3Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int LS_SAVE_RECORD_3_LENGTH = 32352;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for LsSaveRecord3Serialized */
  public LsSaveRecord3Serialized() {
    init(0);
  }

  /** initializes the field in LsSaveRecord3Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(LS_SAVE_RECORD_3_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }

  private int dependValue = 0;

  public void setDependingValue(int dependValue) {
    this.dependValue = dependValue;
  }

  public int getVariableLength() {
    return 85 + (dependValue * 396);
  }

  public int getVariableLength(int idx) {
    return 85 + (idx * 396);
  }
}
