package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiDataArea01Serialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiDataArea01Serialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiDataArea01Serialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_DATA_AREA_01_LENGTH = 3547;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for BhiDataArea01Serialized */
  public BhiDataArea01Serialized() {
    init(0);
  }

  /** initializes the field in BhiDataArea01Serialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_DATA_AREA_01_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
