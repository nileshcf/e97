package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class HsrRequestAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HsrRequestAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HsrRequestAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HSR_REQUEST_AREA_LENGTH = 85;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for HsrRequestAreaSerialized */
  public HsrRequestAreaSerialized() {
    init(0);
  }

  /** initializes the field in HsrRequestAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HSR_REQUEST_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
