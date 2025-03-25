package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class GdOrdTokenTableRedefinedSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GdOrdTokenTableRedefinedSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(GdOrdTokenTableRedefinedSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int GD_ORD_TOKEN_TABLE_REDEFINED_LENGTH = 51700;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginGdOrdToken;
  protected static final int GD_ORD_TOKEN_SIZE = 100;

  /** Constructor for GdOrdTokenTableRedefinedSerialized */
  public GdOrdTokenTableRedefinedSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdTokenTableRedefinedSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdTokenTableRedefinedSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this GdOrdTokenTableRedefinedSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 4040); // serialize this field at offset 4040 by default
  }

  /**
   * sets parent for this GdOrdTokenTableRedefinedSerialized to the parent and set the serialize
   * offset to parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 4040 by default
  }
  /** initializes the field in GdOrdTokenTableRedefinedSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(GD_ORD_TOKEN_TABLE_REDEFINED_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginGdOrdToken = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  public int gdOrdTokenSize() {
    return GD_ORD_TOKEN_SIZE;
  }
}
