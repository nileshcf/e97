package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class CacheHpcDataAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheHpcDataAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(CacheHpcDataAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int CACHE_HPC_DATA_AREA_LENGTH = 18009;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for CacheHpcDataAreaSerialized */
  public CacheHpcDataAreaSerialized() {
    init(0);
  }

  /** initializes the field in CacheHpcDataAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(CACHE_HPC_DATA_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }

  private int dependValue = 0;

  public void setDependingValue(int dependValue) {
    this.dependValue = dependValue;
  }

  public int getVariableLength() {
    return 9 + (dependValue * 9);
  }

  public int getVariableLength(int idx) {
    return 9 + (idx * 9);
  }
}
