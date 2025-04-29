package com.optum.uhg.app.dto.serialize.d5427dt1;

/**
 * The class Dt1RspContainerSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:47. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dt1RspContainerSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Dt1RspContainerSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DT_1_RSP_CONTAINER_LENGTH = 386;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for Dt1RspContainerSerialized */
  public Dt1RspContainerSerialized() {
    init(0);
  }

  /** initializes the field in Dt1RspContainerSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DT_1_RSP_CONTAINER_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
