package com.cloudframe.app.dto.serialize.dphpctsq;

/**
 * The class WritetdqCommareaSerialized is used to define offsets in order to serialize in a fixed
 * String
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WritetdqCommareaSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(WritetdqCommareaSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int WRITETDQ_COMMAREA_LENGTH = 5043;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for WritetdqCommareaSerialized */
  public WritetdqCommareaSerialized() {
    init(0);
  }

  /** initializes the field in WritetdqCommareaSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(WRITETDQ_COMMAREA_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
