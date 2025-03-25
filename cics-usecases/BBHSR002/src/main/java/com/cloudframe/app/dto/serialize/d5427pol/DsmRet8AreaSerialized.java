package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DsmRet8AreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsmRet8AreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DsmRet8AreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DSM_RET_8_AREA_LENGTH = 153;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for DsmRet8AreaSerialized */
  public DsmRet8AreaSerialized() {
    init(0);
  }

  /** initializes the field in DsmRet8AreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DSM_RET_8_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
