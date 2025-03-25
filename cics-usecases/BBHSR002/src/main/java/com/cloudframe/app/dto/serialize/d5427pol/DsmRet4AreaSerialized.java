package com.cloudframe.app.dto.serialize.d5427pol;

/**
 * The class DsmRet4AreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsmRet4AreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DsmRet4AreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DSM_RET_4_AREA_LENGTH = 746;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for DsmRet4AreaSerialized */
  public DsmRet4AreaSerialized() {
    init(0);
  }

  /** initializes the field in DsmRet4AreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DSM_RET_4_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
