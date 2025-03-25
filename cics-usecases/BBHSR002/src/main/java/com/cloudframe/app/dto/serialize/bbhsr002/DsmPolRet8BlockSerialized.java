package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class DsmPolRet8BlockSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DsmPolRet8BlockSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(DsmPolRet8BlockSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int DSM_POL_RET_8_BLOCK_LENGTH = 153;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for DsmPolRet8BlockSerialized */
  public DsmPolRet8BlockSerialized() {
    init(0);
  }

  /** initializes the field in DsmPolRet8BlockSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(DSM_POL_RET_8_BLOCK_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
