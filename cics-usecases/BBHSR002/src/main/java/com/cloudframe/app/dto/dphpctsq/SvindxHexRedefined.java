package com.cloudframe.app.dto.dphpctsq;

/**
 * The class SvindxHexRedefined is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import com.cloudframe.app.exception.CFException;

public class SvindxHexRedefined extends SvindxHexRedefinedSerialized {

  private short svindxHexLowHword;

  /** Constructor for SvindxHexRedefined */
  public SvindxHexRedefined() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for SvindxHexRedefined. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public SvindxHexRedefined(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of svindxHexLowHword
   *
   * @return svindxHexLowHword
   */
  public short getSvindxHexLowHword() throws CFException {
    if (isSvindxHexLowHwordModified()) {
      svindxHexLowHword = refreshSvindxHexLowHword();
    }
    return svindxHexLowHword;
  }

  /**
   * Update SvindxHexLowHword with the passed value Corresponding COBOL Variable is
   * SVINDX-HEX-LOW-HWORD
   *
   * @param number
   */
  public void setSvindxHexLowHword(short number) {
    // Truncate if the number is beyond +/- Max range
    svindxHexLowHword = checkSvindxHexLowHwordMaxLimit(number);
    serializeSvindxHexLowHword(svindxHexLowHword);
  }

  public void setSvindxHexLowHword(int number) {
    number =
        checkSvindxHexLowHwordMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSvindxHexLowHword((short) number);
  }

  public void setSvindxHexLowHword(long number) {
    number =
        checkSvindxHexLowHwordMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setSvindxHexLowHword((short) number);
  }

  public static int getSvindxHexRedefinedFieldLength() {
    return SVINDX_HEX_REDEFINED_LENGTH;
  }
}
