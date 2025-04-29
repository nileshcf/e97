package com.optum.uhg.app.dto.serialize.o529351u;

/**
 * The class D51uReturnAreaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class D51uReturnAreaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(D51uReturnAreaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int D_51U_RETURN_AREA_LENGTH = 880595;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for D51uReturnAreaSerialized */
  public D51uReturnAreaSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for D51uReturnAreaSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public D51uReturnAreaSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this D51uReturnAreaSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 262); // serialize this field at offset 262 by default
  }

  /**
   * sets parent for this D51uReturnAreaSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 262 by default
  }
  /** initializes the field in D51uReturnAreaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(D_51U_RETURN_AREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
