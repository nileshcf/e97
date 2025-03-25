package com.cloudframe.app.dto.serialize.d5427bhi;

/**
 * The class BhiRowReturnDetSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:32. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BhiRowReturnDetSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(BhiRowReturnDetSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int BHI_ROW_RETURN_DET_LENGTH = 119;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for BhiRowReturnDetSerialized */
  public BhiRowReturnDetSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for BhiRowReturnDetSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public BhiRowReturnDetSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this BhiRowReturnDetSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 1580); // serialize this field at offset 1580 by default
  }

  /**
   * sets parent for this BhiRowReturnDetSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 1580 by default
  }
  /** initializes the field in BhiRowReturnDetSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(BHI_ROW_RETURN_DET_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
