package com.optum.uhg.app.dto.o529351u;

/**
 * The class FrontendMedPmtIcnRecord is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.optum.uhg.app.dto.serialize.o529351u.*;

public class FrontendMedPmtIcnRecord extends FrontendMedPmtIcnRecordSerialized {

  private MedPmtiVariableDetailData medPmtiVariableDetailData = new MedPmtiVariableDetailData();

  /** Constructor for FrontendMedPmtIcnRecord */
  public FrontendMedPmtIcnRecord() {
    super();
    /*  set the parent of each child as this which are a group variable */
    medPmtiVariableDetailData.setParent(this, getStartOffset() + 31);
    /*  end of offset */
  }

  /**
   * Returns the value of medPmtiVariableDetailData
   *
   * @return medPmtiVariableDetailData
   */
  public MedPmtiVariableDetailData getMedPmtiVariableDetailData() {
    return medPmtiVariableDetailData;
  }
  /**
   * Update MedPmtiVariableDetailData with the passed value Corresponding COBOL Variable is
   * MED-PMTI-VARIABLE-DETAIL-DATA
   *
   * @param value
   */
  public void setMedPmtiVariableDetailData(char[] value) {
    medPmtiVariableDetailData.setString(value);
  }

  /**
   * Update MedPmtiVariableDetailData with a String from an offset and length
   *
   * @param value
   */
  public void setMedPmtiVariableDetailData(char[] source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        medPmtiVariableDetailData.begin,
        medPmtiVariableDetailData.length());
  }

  /**
   * Update MedPmtiVariableDetailData with a String from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMedPmtiVariableDetailData(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(
        source, sourceIndex, sourceLen, medPmtiVariableDetailData.begin + targetIndex, targetLen);
  }

  /**
   * Update MedPmtiVariableDetailData with another Field
   *
   * @param value
   */
  public void setMedPmtiVariableDetailData(Field source) {
    replace(
        source,
        0,
        source.length(),
        medPmtiVariableDetailData.begin,
        medPmtiVariableDetailData.length());
  }

  /**
   * Update MedPmtiVariableDetailData with another Field from an offset and length
   *
   * @param value
   */
  public void setMedPmtiVariableDetailData(Field source, int sourceIndex, int sourceLen) {
    replace(
        source,
        sourceIndex,
        sourceLen,
        medPmtiVariableDetailData.begin,
        medPmtiVariableDetailData.length());
  }

  /**
   * Update MedPmtiVariableDetailData with another Field from an offset and length to an offset and
   * length
   *
   * @param value
   */
  public void setMedPmtiVariableDetailData(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(
        source, sourceIndex, sourceLen, medPmtiVariableDetailData.begin + targetIndex, targetLen);
  }

  public static int getFrontendMedPmtIcnRecordFieldLength() {
    return FRONTEND_MED_PMT_ICN_RECORD_LENGTH;
  }
}
