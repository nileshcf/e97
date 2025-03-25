package com.cloudframe.app.dto.bbhsr002;

/**
 * The class DsmPolRet8Block is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class DsmPolRet8Block extends DsmPolRet8BlockSerialized {

  private Pol8RetArea2 pol8RetArea2 = new Pol8RetArea2();

  /** Constructor for DsmPolRet8Block */
  public DsmPolRet8Block() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol8RetArea2.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol8RetArea2
   *
   * @return pol8RetArea2
   */
  public Pol8RetArea2 getPol8RetArea2() {
    return pol8RetArea2;
  }
  /**
   * Update Pol8RetArea2 with the passed value Corresponding COBOL Variable is POL8-RET-AREA2
   *
   * @param value
   */
  public void setPol8RetArea2(char[] value) {
    pol8RetArea2.setString(value);
  }

  /**
   * Update Pol8RetArea2 with a String from an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin, pol8RetArea2.length());
  }

  /**
   * Update Pol8RetArea2 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol8RetArea2 with another Field
   *
   * @param value
   */
  public void setPol8RetArea2(Field source) {
    replace(source, 0, source.length(), pol8RetArea2.begin, pol8RetArea2.length());
  }

  /**
   * Update Pol8RetArea2 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin, pol8RetArea2.length());
  }

  /**
   * Update Pol8RetArea2 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol8RetArea2(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol8RetArea2.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmPolRet8Block String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol8RetArea2.initialize();
  }

  public static int getDsmPolRet8BlockFieldLength() {
    return DSM_POL_RET_8_BLOCK_LENGTH;
  }
}
