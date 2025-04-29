package com.optum.uhg.app.dto.serialize.o529351u;

/**
 * The class FrontendMedPmtIcnRecordSerialized is used to define offsets in order to serialize in a
 * fixed String
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FrontendMedPmtIcnRecordSerialized extends Field {

  protected Logger logger = LoggerFactory.getLogger(FrontendMedPmtIcnRecordSerialized.class);
  /*  Length of the field, if serialized as a String */
  protected static final int FRONTEND_MED_PMT_ICN_RECORD_LENGTH = 673;
  /*  offset of each of Child Fields when serialized as a String */

  /** Constructor for FrontendMedPmtIcnRecordSerialized */
  public FrontendMedPmtIcnRecordSerialized() {
    init(0);
  }

  /** initializes the field in FrontendMedPmtIcnRecordSerialized */
  @Override
  protected void init(int begin) {
    setStartOffset(begin);
    setLength(FRONTEND_MED_PMT_ICN_RECORD_LENGTH);
    /*  set the offset/position of each field when this object is serialized as String */

    /*  end of offset */
  }
}
