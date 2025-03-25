package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class HexCharactersGroupSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HexCharactersGroupSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(HexCharactersGroupSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int HEX_CHARACTERS_GROUP_LENGTH = 512;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for HexCharactersGroupSerialized */
  public HexCharactersGroupSerialized() {
    init(0);
  }

  /** initializes the field in HexCharactersGroupSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(HEX_CHARACTERS_GROUP_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
