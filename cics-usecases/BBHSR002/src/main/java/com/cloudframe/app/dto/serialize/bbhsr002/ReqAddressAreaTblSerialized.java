package com.cloudframe.app.dto.serialize.bbhsr002;

/**
 * The class ReqAddressAreaTblSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReqAddressAreaTblSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(ReqAddressAreaTblSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int REQ_ADDRESS_AREA_TBL_LENGTH = 60;
  /*  offset of each of Child Fields when serialized as a String */
  protected int beginReqAddressTbl;
  protected static final int REQ_ADDRESS_TBL_SIZE = 10;

  /** Constructor for ReqAddressAreaTblSerialized */
  public ReqAddressAreaTblSerialized() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for ReqAddressAreaTblSerialized. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public ReqAddressAreaTblSerialized(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * sets parent for this ReqAddressAreaTblSerialized to the parent
   *
   * @param parent
   */
  @Override
  public void setParent(Field parent) {
    setParent(parent, 23); // serialize this field at offset 23 by default
  }

  /**
   * sets parent for this ReqAddressAreaTblSerialized to the parent and set the serialize offset to
   * parameter begin
   *
   * @param parent
   * @param begin - offset used when serializing this object to a String
   */
  public void setParent(Field parent, int begin) {
    super.setParent(parent);
    init(begin); // serialize this field at offset 23 by default
  }
  /** initializes the field in ReqAddressAreaTblSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(REQ_ADDRESS_AREA_TBL_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */
    beginReqAddressTbl = getStartOffset() + 0; // set offset for serialization

    /*  end of offset */
  }

  public int reqAddressTblSize() {
    return REQ_ADDRESS_TBL_SIZE;
  }
}
