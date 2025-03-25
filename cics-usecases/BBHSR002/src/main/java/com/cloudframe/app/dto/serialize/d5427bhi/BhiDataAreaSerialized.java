package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiDataAreaSerialized is used to define offsets in order to serialize in a fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiDataAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiDataAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_DATA_AREA_LENGTH = 96;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for BhiDataAreaSerialized */
  public BhiDataAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiDataAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiDataAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiDataAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 0); // serialize this field at offset 0 by default
  }

  /**
   * sets parent for this BhiDataAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 0 by default
  }
  /** initializes the field in BhiDataAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_DATA_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
