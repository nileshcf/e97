package com.cloudframe.app.dto.bbhsr002;

/**
 * The class DsmPolRet1Block is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class DsmPolRet1Block extends DsmPolRet1BlockSerialized {

  private Pol1RetArea1 pol1RetArea1 = new Pol1RetArea1();

  /** Constructor for DsmPolRet1Block */
  public DsmPolRet1Block() {
    super();
    /*  set the parent of each child as this which are a group variable */
    pol1RetArea1.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of pol1RetArea1
   *
   * @return pol1RetArea1
   */
  public Pol1RetArea1 getPol1RetArea1() {
    return pol1RetArea1;
  }
  /**
   * Update Pol1RetArea1 with the passed value Corresponding COBOL Variable is POL1-RET-AREA1
   *
   * @param value
   */
  public void setPol1RetArea1(char[] value) {
    pol1RetArea1.setString(value);
  }

  /**
   * Update Pol1RetArea1 with a String from an offset and length
   *
   * @param value
   */
  public void setPol1RetArea1(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol1RetArea1.begin, pol1RetArea1.length());
  }

  /**
   * Update Pol1RetArea1 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetArea1(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol1RetArea1.begin + targetIndex, targetLen);
  }

  /**
   * Update Pol1RetArea1 with another Field
   *
   * @param value
   */
  public void setPol1RetArea1(Field source) {
    replace(source, 0, source.length(), pol1RetArea1.begin, pol1RetArea1.length());
  }

  /**
   * Update Pol1RetArea1 with another Field from an offset and length
   *
   * @param value
   */
  public void setPol1RetArea1(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, pol1RetArea1.begin, pol1RetArea1.length());
  }

  /**
   * Update Pol1RetArea1 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPol1RetArea1(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, pol1RetArea1.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmPolRet1Block String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    pol1RetArea1.initialize();
  }

  public static int getDsmPolRet1BlockFieldLength() {
    return DSM_POL_RET_1_BLOCK_LENGTH;
  }
}
