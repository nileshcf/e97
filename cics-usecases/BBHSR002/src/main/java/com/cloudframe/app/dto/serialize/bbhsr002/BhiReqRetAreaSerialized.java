package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class BhiReqRetAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiReqRetAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiReqRetAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_REQ_RET_AREA_LENGTH = 4074;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for BhiReqRetAreaSerialized */
  public BhiReqRetAreaSerialized() {
    init(0);
  }

  /** initializes the field in BhiReqRetAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_REQ_RET_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
