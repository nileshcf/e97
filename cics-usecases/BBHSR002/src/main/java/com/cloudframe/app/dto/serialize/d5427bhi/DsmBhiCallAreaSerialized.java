package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class DsmBhiCallAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsmBhiCallAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DsmBhiCallAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DSM_BHI_CALL_AREA_LENGTH = 4074;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for DsmBhiCallAreaSerialized */
  public DsmBhiCallAreaSerialized() {
    init(0);
  }

  /** initializes the field in DsmBhiCallAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DSM_BHI_CALL_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
