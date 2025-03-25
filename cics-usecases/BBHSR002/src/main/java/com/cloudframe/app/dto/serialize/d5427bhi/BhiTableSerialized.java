package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiTableSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiTableSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiTableSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_TABLE_LENGTH = 288000;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginBhiDataArea;
  protected static final int BHI_DATA_AREA_SIZE = 3000;

  /** Constructor for BhiTableSerialized */
  public BhiTableSerialized() {
    init(0);
  }

  /** initializes the field in BhiTableSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_TABLE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginBhiDataArea = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  public int bhiDataAreaSize() {
    return BHI_DATA_AREA_SIZE;
  }
}
