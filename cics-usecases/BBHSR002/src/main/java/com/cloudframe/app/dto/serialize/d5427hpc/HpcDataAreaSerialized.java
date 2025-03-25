package com.cloudframe.app.dto.serialize.d5427hpc;

/**
 * The class HpcDataAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HpcDataAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HpcDataAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HPC_DATA_AREA_LENGTH = 915;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for HpcDataAreaSerialized */
  public HpcDataAreaSerialized() {
    init(0);
  }

  /** initializes the field in HpcDataAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HPC_DATA_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
