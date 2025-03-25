package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class DsmPolRet6BlockSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsmPolRet6BlockSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DsmPolRet6BlockSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DSM_POL_RET_6_BLOCK_LENGTH = 129;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for DsmPolRet6BlockSerialized */
  public DsmPolRet6BlockSerialized() {
    init(0);
  }

  /** initializes the field in DsmPolRet6BlockSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DSM_POL_RET_6_BLOCK_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
