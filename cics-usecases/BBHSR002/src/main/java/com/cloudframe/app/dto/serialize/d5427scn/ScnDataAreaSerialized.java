package com.cloudframe.app.dto.serialize.d5427scn;

/**
 * The class ScnDataAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ScnDataAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ScnDataAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int SCN_DATA_AREA_LENGTH = 37;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for ScnDataAreaSerialized */
  public ScnDataAreaSerialized() {
    init(0);
  }

  /** initializes the field in ScnDataAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(SCN_DATA_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
