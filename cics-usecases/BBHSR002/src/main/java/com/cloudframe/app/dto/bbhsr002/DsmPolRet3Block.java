package com.cloudframe.app.dto.bbhsr002;

/**
 * The class DsmPolRet3Block is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;

public class DsmPolRet3Block extends DsmPolRet3BlockSerialized {

  private PolRetArea3 polRetArea3 = new PolRetArea3();

  /** Constructor for DsmPolRet3Block */
  public DsmPolRet3Block() {
    super();
    /*  set the parent of each child as this which are a group variable */
    polRetArea3.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of polRetArea3
   *
   * @return polRetArea3
   */
  public PolRetArea3 getPolRetArea3() {
    return polRetArea3;
  }
  /**
   * Update PolRetArea3 with the passed value Corresponding COBOL Variable is POL-RET-AREA3
   *
   * @param value
   */
  public void setPolRetArea3(char[] value) {
    polRetArea3.setString(value);
  }

  /**
   * Update PolRetArea3 with a String from an offset and length
   *
   * @param value
   */
  public void setPolRetArea3(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, polRetArea3.begin, polRetArea3.length());
  }

  /**
   * Update PolRetArea3 with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetArea3(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, polRetArea3.begin + targetIndex, targetLen);
  }

  /**
   * Update PolRetArea3 with another Field
   *
   * @param value
   */
  public void setPolRetArea3(Field source) {
    replace(source, 0, source.length(), polRetArea3.begin, polRetArea3.length());
  }

  /**
   * Update PolRetArea3 with another Field from an offset and length
   *
   * @param value
   */
  public void setPolRetArea3(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, polRetArea3.begin, polRetArea3.length());
  }

  /**
   * Update PolRetArea3 with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setPolRetArea3(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, polRetArea3.begin + targetIndex, targetLen);
  }

  /**
   * initializes DsmPolRet3Block String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    polRetArea3.initialize();
  }

  public static int getDsmPolRet3BlockFieldLength() {
    return DSM_POL_RET_3_BLOCK_LENGTH;
  }
}
