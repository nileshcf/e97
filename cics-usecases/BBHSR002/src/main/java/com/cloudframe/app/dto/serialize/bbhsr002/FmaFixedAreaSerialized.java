package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class FmaFixedAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FmaFixedAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FmaFixedAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FMA_FIXED_AREA_LENGTH = 54;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for FmaFixedAreaSerialized */
  public FmaFixedAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for FmaFixedAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public FmaFixedAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this FmaFixedAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 9); // serialize this field at offset 9 by default
  }

  /**
   * sets parent for this FmaFixedAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 9 by default
  }
  /** initializes the field in FmaFixedAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FMA_FIXED_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
