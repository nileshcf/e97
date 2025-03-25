package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class Pol2RetReciprocityTableSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Pol2RetReciprocityTableSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(Pol2RetReciprocityTableSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int POL_2_RET_RECIPROCITY_TABLE_LENGTH = 81;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginPol2RetReciprocityOccurs;
  protected static final int POL_2_RET_RECIPROCITY_OCCURS_SIZE = 3;

  /** Constructor for Pol2RetReciprocityTableSerialized */
  public Pol2RetReciprocityTableSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol2RetReciprocityTableSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol2RetReciprocityTableSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this Pol2RetReciprocityTableSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 95); // serialize this field at offset 95 by default
  }

  /**
   * sets parent for this Pol2RetReciprocityTableSerialized to the parent and set the serialize
   * offset to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 95 by default
  }
  /** initializes the field in Pol2RetReciprocityTableSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(POL_2_RET_RECIPROCITY_TABLE_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginPol2RetReciprocityOccurs = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  public int pol2RetReciprocityOccursSize() {
    return POL_2_RET_RECIPROCITY_OCCURS_SIZE;
  }
}
