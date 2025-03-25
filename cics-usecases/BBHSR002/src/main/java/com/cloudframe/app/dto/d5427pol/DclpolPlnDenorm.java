package com.cloudframe.app.dto.d5427pol;

/**
 * The class DclpolPlnDenorm is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:31. using version 5.0.0.231
 */
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.d5427pol.*;
import com.cloudframe.app.exception.CFException;

public class DclpolPlnDenorm extends DclpolPlnDenormSerialized {

  private char[] denCovTypCd = Field.fillLowValue(1);

  private char[] denPolNbr = Field.fillLowValue(6);

  private char[] denPlnNbr = Field.fillLowValue(4);

  private char[] denClssNbr = Field.fillLowValue(4);

  private short denPlnSeqNbr;

  private char[] denObsolete = Field.fillLowValue(6);

  private char[] denSlotTblId = Field.fillLowValue(6);

  private char[] denObligId = Field.fillLowValue(2);

  private char[] denShrArngCd = Field.fillLowValue(2);

  private char[] denRcprctyTblId = Field.fillLowValue(6);

  private char[] denNewOldSrvcInd = Field.fillLowValue(1);

  private int denCopayVarId;

  private char[] denLstUpdtDttm = Field.fillLowValue(26);

  private char[] denLstUpdtId = Field.fillLowValue(9);

  private char[] denStdPlnPolNbr = Field.fillLowValue(6);

  private char[] denStdPlnPlnNbr = Field.fillLowValue(4);

  private char[] denStdPlnClssNbr = Field.fillLowValue(4);

  private char[] denGtdHmoCd = Field.fillLowValue(1);

  /** Constructor for DclpolPlnDenorm */
  public DclpolPlnDenorm() {
    super();
    /*  set the parent of each child as this which are a group variable */
    /*  end of offset */
  }

  /**
   * Returns the value of denCovTypCd
   *
   * @return denCovTypCd
   */
  public char[] getDenCovTypCd() throws CFException {
    if (isDenCovTypCdModified()) {
      denCovTypCd = refreshDenCovTypCd();
    }
    return denCovTypCd;
  }

  /**
   * set variable denCovTypCd Corresponding COBOL Variable is DEN-COV-TYP-CD
   *
   * @param value
   */
  public void setDenCovTypCd(char[] value) {
    denCovTypCd = checkDenCovTypCdConstraints(value);
    serializeDenCovTypCd(denCovTypCd);
  }

  /**
   * Update DenCovTypCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenCovTypCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenCovTypCd, denCovTypCd.length);
  }

  public void setDenCovTypCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenCovTypCd, denCovTypCd.length);
  }

  /**
   * Update DenCovTypCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenCovTypCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenCovTypCd + targetIndex, targetLen);
  }

  /**
   * Update DenCovTypCd with another Field
   *
   * @param value
   */
  public void setDenCovTypCd(Field source) {
    replace(source, 0, source.length(), beginDenCovTypCd, DEN_COV_TYP_CD_LEN);
  }

  /**
   * Update DenCovTypCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDenCovTypCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenCovTypCd, DEN_COV_TYP_CD_LEN);
  }

  /**
   * Update DenCovTypCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenCovTypCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenCovTypCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of denPolNbr
   *
   * @return denPolNbr
   */
  public char[] getDenPolNbr() throws CFException {
    if (isDenPolNbrModified()) {
      denPolNbr = refreshDenPolNbr();
    }
    return denPolNbr;
  }

  /**
   * set variable denPolNbr Corresponding COBOL Variable is DEN-POL-NBR
   *
   * @param value
   */
  public void setDenPolNbr(char[] value) {
    denPolNbr = checkDenPolNbrConstraints(value);
    serializeDenPolNbr(denPolNbr);
  }

  /**
   * Update DenPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenPolNbr, denPolNbr.length);
  }

  public void setDenPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenPolNbr, denPolNbr.length);
  }

  /**
   * Update DenPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenPolNbr + targetIndex, targetLen);
  }

  /**
   * Update DenPolNbr with another Field
   *
   * @param value
   */
  public void setDenPolNbr(Field source) {
    replace(source, 0, source.length(), beginDenPolNbr, DEN_POL_NBR_LEN);
  }

  /**
   * Update DenPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDenPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenPolNbr, DEN_POL_NBR_LEN);
  }

  /**
   * Update DenPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of denPlnNbr
   *
   * @return denPlnNbr
   */
  public char[] getDenPlnNbr() throws CFException {
    if (isDenPlnNbrModified()) {
      denPlnNbr = refreshDenPlnNbr();
    }
    return denPlnNbr;
  }

  /**
   * set variable denPlnNbr Corresponding COBOL Variable is DEN-PLN-NBR
   *
   * @param value
   */
  public void setDenPlnNbr(char[] value) {
    denPlnNbr = checkDenPlnNbrConstraints(value);
    serializeDenPlnNbr(denPlnNbr);
  }

  /**
   * Update DenPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenPlnNbr, denPlnNbr.length);
  }

  public void setDenPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenPlnNbr, denPlnNbr.length);
  }

  /**
   * Update DenPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DenPlnNbr with another Field
   *
   * @param value
   */
  public void setDenPlnNbr(Field source) {
    replace(source, 0, source.length(), beginDenPlnNbr, DEN_PLN_NBR_LEN);
  }

  /**
   * Update DenPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDenPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenPlnNbr, DEN_PLN_NBR_LEN);
  }

  /**
   * Update DenPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of denClssNbr
   *
   * @return denClssNbr
   */
  public char[] getDenClssNbr() throws CFException {
    if (isDenClssNbrModified()) {
      denClssNbr = refreshDenClssNbr();
    }
    return denClssNbr;
  }

  /**
   * set variable denClssNbr Corresponding COBOL Variable is DEN-CLSS-NBR
   *
   * @param value
   */
  public void setDenClssNbr(char[] value) {
    denClssNbr = checkDenClssNbrConstraints(value);
    serializeDenClssNbr(denClssNbr);
  }

  /**
   * Update DenClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenClssNbr, denClssNbr.length);
  }

  public void setDenClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenClssNbr, denClssNbr.length);
  }

  /**
   * Update DenClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DenClssNbr with another Field
   *
   * @param value
   */
  public void setDenClssNbr(Field source) {
    replace(source, 0, source.length(), beginDenClssNbr, DEN_CLSS_NBR_LEN);
  }

  /**
   * Update DenClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDenClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenClssNbr, DEN_CLSS_NBR_LEN);
  }

  /**
   * Update DenClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of denPlnSeqNbr
   *
   * @return denPlnSeqNbr
   */
  public short getDenPlnSeqNbr() throws CFException {
    if (isDenPlnSeqNbrModified()) {
      denPlnSeqNbr = refreshDenPlnSeqNbr();
    }
    return denPlnSeqNbr;
  }

  /**
   * Update DenPlnSeqNbr with the passed value Corresponding COBOL Variable is DEN-PLN-SEQ-NBR
   *
   * @param number
   */
  public void setDenPlnSeqNbr(short number) {
    // Truncate if the number is beyond +/- Max range
    denPlnSeqNbr = checkDenPlnSeqNbrMaxLimit(number);
    serializeDenPlnSeqNbr(denPlnSeqNbr);
  }

  public void setDenPlnSeqNbr(int number) {
    number = checkDenPlnSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDenPlnSeqNbr((short) number);
  }

  public void setDenPlnSeqNbr(long number) {
    number = checkDenPlnSeqNbrMaxLimit((short) number); // Truncate if value is beyond +/- Max range
    setDenPlnSeqNbr((short) number);
  }

  /**
   * Returns the value of denObsolete
   *
   * @return denObsolete
   */
  public char[] getDenObsolete() throws CFException {
    if (isDenObsoleteModified()) {
      denObsolete = refreshDenObsolete();
    }
    return denObsolete;
  }

  /**
   * set variable denObsolete Corresponding COBOL Variable is DEN-OBSOLETE
   *
   * @param value
   */
  public void setDenObsolete(char[] value) {
    denObsolete = checkDenObsoleteConstraints(value);
    serializeDenObsolete(denObsolete);
  }

  /**
   * Update DenObsolete with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenObsolete(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenObsolete, denObsolete.length);
  }

  public void setDenObsolete(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenObsolete, denObsolete.length);
  }

  /**
   * Update DenObsolete with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenObsolete(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenObsolete + targetIndex, targetLen);
  }

  /**
   * Update DenObsolete with another Field
   *
   * @param value
   */
  public void setDenObsolete(Field source) {
    replace(source, 0, source.length(), beginDenObsolete, DEN_OBSOLETE_LEN);
  }

  /**
   * Update DenObsolete with another Field from an offset and length
   *
   * @param value
   */
  public void setDenObsolete(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenObsolete, DEN_OBSOLETE_LEN);
  }

  /**
   * Update DenObsolete with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenObsolete(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenObsolete + targetIndex, targetLen);
  }
  /**
   * Returns the value of denSlotTblId
   *
   * @return denSlotTblId
   */
  public char[] getDenSlotTblId() throws CFException {
    if (isDenSlotTblIdModified()) {
      denSlotTblId = refreshDenSlotTblId();
    }
    return denSlotTblId;
  }

  /**
   * set variable denSlotTblId Corresponding COBOL Variable is DEN-SLOT-TBL-ID
   *
   * @param value
   */
  public void setDenSlotTblId(char[] value) {
    denSlotTblId = checkDenSlotTblIdConstraints(value);
    serializeDenSlotTblId(denSlotTblId);
  }

  /**
   * Update DenSlotTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenSlotTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenSlotTblId, denSlotTblId.length);
  }

  public void setDenSlotTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenSlotTblId, denSlotTblId.length);
  }

  /**
   * Update DenSlotTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenSlotTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenSlotTblId + targetIndex, targetLen);
  }

  /**
   * Update DenSlotTblId with another Field
   *
   * @param value
   */
  public void setDenSlotTblId(Field source) {
    replace(source, 0, source.length(), beginDenSlotTblId, DEN_SLOT_TBL_ID_LEN);
  }

  /**
   * Update DenSlotTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setDenSlotTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenSlotTblId, DEN_SLOT_TBL_ID_LEN);
  }

  /**
   * Update DenSlotTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenSlotTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenSlotTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of denObligId
   *
   * @return denObligId
   */
  public char[] getDenObligId() throws CFException {
    if (isDenObligIdModified()) {
      denObligId = refreshDenObligId();
    }
    return denObligId;
  }

  /**
   * set variable denObligId Corresponding COBOL Variable is DEN-OBLIG-ID
   *
   * @param value
   */
  public void setDenObligId(char[] value) {
    denObligId = checkDenObligIdConstraints(value);
    serializeDenObligId(denObligId);
  }

  /**
   * Update DenObligId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenObligId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenObligId, denObligId.length);
  }

  public void setDenObligId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenObligId, denObligId.length);
  }

  /**
   * Update DenObligId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenObligId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenObligId + targetIndex, targetLen);
  }

  /**
   * Update DenObligId with another Field
   *
   * @param value
   */
  public void setDenObligId(Field source) {
    replace(source, 0, source.length(), beginDenObligId, DEN_OBLIG_ID_LEN);
  }

  /**
   * Update DenObligId with another Field from an offset and length
   *
   * @param value
   */
  public void setDenObligId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenObligId, DEN_OBLIG_ID_LEN);
  }

  /**
   * Update DenObligId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenObligId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenObligId + targetIndex, targetLen);
  }
  /**
   * Returns the value of denShrArngCd
   *
   * @return denShrArngCd
   */
  public char[] getDenShrArngCd() throws CFException {
    if (isDenShrArngCdModified()) {
      denShrArngCd = refreshDenShrArngCd();
    }
    return denShrArngCd;
  }

  /**
   * set variable denShrArngCd Corresponding COBOL Variable is DEN-SHR-ARNG-CD
   *
   * @param value
   */
  public void setDenShrArngCd(char[] value) {
    denShrArngCd = checkDenShrArngCdConstraints(value);
    serializeDenShrArngCd(denShrArngCd);
  }

  /**
   * Update DenShrArngCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenShrArngCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenShrArngCd, denShrArngCd.length);
  }

  public void setDenShrArngCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenShrArngCd, denShrArngCd.length);
  }

  /**
   * Update DenShrArngCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenShrArngCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenShrArngCd + targetIndex, targetLen);
  }

  /**
   * Update DenShrArngCd with another Field
   *
   * @param value
   */
  public void setDenShrArngCd(Field source) {
    replace(source, 0, source.length(), beginDenShrArngCd, DEN_SHR_ARNG_CD_LEN);
  }

  /**
   * Update DenShrArngCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDenShrArngCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenShrArngCd, DEN_SHR_ARNG_CD_LEN);
  }

  /**
   * Update DenShrArngCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenShrArngCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenShrArngCd + targetIndex, targetLen);
  }
  /**
   * Returns the value of denRcprctyTblId
   *
   * @return denRcprctyTblId
   */
  public char[] getDenRcprctyTblId() throws CFException {
    if (isDenRcprctyTblIdModified()) {
      denRcprctyTblId = refreshDenRcprctyTblId();
    }
    return denRcprctyTblId;
  }

  /**
   * set variable denRcprctyTblId Corresponding COBOL Variable is DEN-RCPRCTY-TBL-ID
   *
   * @param value
   */
  public void setDenRcprctyTblId(char[] value) {
    denRcprctyTblId = checkDenRcprctyTblIdConstraints(value);
    serializeDenRcprctyTblId(denRcprctyTblId);
  }

  /**
   * Update DenRcprctyTblId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenRcprctyTblId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenRcprctyTblId, denRcprctyTblId.length);
  }

  public void setDenRcprctyTblId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenRcprctyTblId, denRcprctyTblId.length);
  }

  /**
   * Update DenRcprctyTblId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenRcprctyTblId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenRcprctyTblId + targetIndex, targetLen);
  }

  /**
   * Update DenRcprctyTblId with another Field
   *
   * @param value
   */
  public void setDenRcprctyTblId(Field source) {
    replace(source, 0, source.length(), beginDenRcprctyTblId, DEN_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update DenRcprctyTblId with another Field from an offset and length
   *
   * @param value
   */
  public void setDenRcprctyTblId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenRcprctyTblId, DEN_RCPRCTY_TBL_ID_LEN);
  }

  /**
   * Update DenRcprctyTblId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenRcprctyTblId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenRcprctyTblId + targetIndex, targetLen);
  }
  /**
   * Returns the value of denNewOldSrvcInd
   *
   * @return denNewOldSrvcInd
   */
  public char[] getDenNewOldSrvcInd() throws CFException {
    if (isDenNewOldSrvcIndModified()) {
      denNewOldSrvcInd = refreshDenNewOldSrvcInd();
    }
    return denNewOldSrvcInd;
  }

  /**
   * set variable denNewOldSrvcInd Corresponding COBOL Variable is DEN-NEW-OLD-SRVC-IND
   *
   * @param value
   */
  public void setDenNewOldSrvcInd(char[] value) {
    denNewOldSrvcInd = checkDenNewOldSrvcIndConstraints(value);
    serializeDenNewOldSrvcInd(denNewOldSrvcInd);
  }

  /**
   * Update DenNewOldSrvcInd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenNewOldSrvcInd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenNewOldSrvcInd, denNewOldSrvcInd.length);
  }

  public void setDenNewOldSrvcInd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenNewOldSrvcInd, denNewOldSrvcInd.length);
  }

  /**
   * Update DenNewOldSrvcInd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenNewOldSrvcInd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenNewOldSrvcInd + targetIndex, targetLen);
  }

  /**
   * Update DenNewOldSrvcInd with another Field
   *
   * @param value
   */
  public void setDenNewOldSrvcInd(Field source) {
    replace(source, 0, source.length(), beginDenNewOldSrvcInd, DEN_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update DenNewOldSrvcInd with another Field from an offset and length
   *
   * @param value
   */
  public void setDenNewOldSrvcInd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenNewOldSrvcInd, DEN_NEW_OLD_SRVC_IND_LEN);
  }

  /**
   * Update DenNewOldSrvcInd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenNewOldSrvcInd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenNewOldSrvcInd + targetIndex, targetLen);
  }
  /**
   * Returns the value of denCopayVarId
   *
   * @return denCopayVarId
   */
  public int getDenCopayVarId() throws CFException {
    if (isDenCopayVarIdModified()) {
      denCopayVarId = refreshDenCopayVarId();
    }
    return denCopayVarId;
  }

  /**
   * Update DenCopayVarId with the passed value Corresponding COBOL Variable is DEN-COPAY-VAR-ID
   *
   * @param number
   */
  public void setDenCopayVarId(int number) {
    // Truncate if the number is beyond +/- Max range
    denCopayVarId = checkDenCopayVarIdMaxLimit(number);
    serializeDenCopayVarId(denCopayVarId);
  }

  public void setDenCopayVarId(long number) {
    number = checkDenCopayVarIdMaxLimit(number); // Truncate if value is beyond +/- Max range
    setDenCopayVarId((int) number);
  }

  /**
   * Returns the value of denLstUpdtDttm
   *
   * @return denLstUpdtDttm
   */
  public char[] getDenLstUpdtDttm() throws CFException {
    if (isDenLstUpdtDttmModified()) {
      denLstUpdtDttm = refreshDenLstUpdtDttm();
    }
    return denLstUpdtDttm;
  }

  /**
   * set variable denLstUpdtDttm Corresponding COBOL Variable is DEN-LST-UPDT-DTTM
   *
   * @param value
   */
  public void setDenLstUpdtDttm(char[] value) {
    denLstUpdtDttm = checkDenLstUpdtDttmConstraints(value);
    serializeDenLstUpdtDttm(denLstUpdtDttm);
  }

  /**
   * Update DenLstUpdtDttm with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtDttm(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenLstUpdtDttm, denLstUpdtDttm.length);
  }

  public void setDenLstUpdtDttm(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtDttm, denLstUpdtDttm.length);
  }

  /**
   * Update DenLstUpdtDttm with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtDttm(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtDttm + targetIndex, targetLen);
  }

  /**
   * Update DenLstUpdtDttm with another Field
   *
   * @param value
   */
  public void setDenLstUpdtDttm(Field source) {
    replace(source, 0, source.length(), beginDenLstUpdtDttm, DEN_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DenLstUpdtDttm with another Field from an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtDttm(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtDttm, DEN_LST_UPDT_DTTM_LEN);
  }

  /**
   * Update DenLstUpdtDttm with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtDttm(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtDttm + targetIndex, targetLen);
  }
  /**
   * Returns the value of denLstUpdtId
   *
   * @return denLstUpdtId
   */
  public char[] getDenLstUpdtId() throws CFException {
    if (isDenLstUpdtIdModified()) {
      denLstUpdtId = refreshDenLstUpdtId();
    }
    return denLstUpdtId;
  }

  /**
   * set variable denLstUpdtId Corresponding COBOL Variable is DEN-LST-UPDT-ID
   *
   * @param value
   */
  public void setDenLstUpdtId(char[] value) {
    denLstUpdtId = checkDenLstUpdtIdConstraints(value);
    serializeDenLstUpdtId(denLstUpdtId);
  }

  /**
   * Update DenLstUpdtId with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtId(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenLstUpdtId, denLstUpdtId.length);
  }

  public void setDenLstUpdtId(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtId, denLstUpdtId.length);
  }

  /**
   * Update DenLstUpdtId with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtId(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtId + targetIndex, targetLen);
  }

  /**
   * Update DenLstUpdtId with another Field
   *
   * @param value
   */
  public void setDenLstUpdtId(Field source) {
    replace(source, 0, source.length(), beginDenLstUpdtId, DEN_LST_UPDT_ID_LEN);
  }

  /**
   * Update DenLstUpdtId with another Field from an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtId(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtId, DEN_LST_UPDT_ID_LEN);
  }

  /**
   * Update DenLstUpdtId with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenLstUpdtId(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenLstUpdtId + targetIndex, targetLen);
  }
  /**
   * Returns the value of denStdPlnPolNbr
   *
   * @return denStdPlnPolNbr
   */
  public char[] getDenStdPlnPolNbr() throws CFException {
    if (isDenStdPlnPolNbrModified()) {
      denStdPlnPolNbr = refreshDenStdPlnPolNbr();
    }
    return denStdPlnPolNbr;
  }

  /**
   * set variable denStdPlnPolNbr Corresponding COBOL Variable is DEN-STD-PLN-POL-NBR
   *
   * @param value
   */
  public void setDenStdPlnPolNbr(char[] value) {
    denStdPlnPolNbr = checkDenStdPlnPolNbrConstraints(value);
    serializeDenStdPlnPolNbr(denStdPlnPolNbr);
  }

  /**
   * Update DenStdPlnPolNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPolNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenStdPlnPolNbr, denStdPlnPolNbr.length);
  }

  public void setDenStdPlnPolNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPolNbr, denStdPlnPolNbr.length);
  }

  /**
   * Update DenStdPlnPolNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPolNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPolNbr + targetIndex, targetLen);
  }

  /**
   * Update DenStdPlnPolNbr with another Field
   *
   * @param value
   */
  public void setDenStdPlnPolNbr(Field source) {
    replace(source, 0, source.length(), beginDenStdPlnPolNbr, DEN_STD_PLN_POL_NBR_LEN);
  }

  /**
   * Update DenStdPlnPolNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPolNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPolNbr, DEN_STD_PLN_POL_NBR_LEN);
  }

  /**
   * Update DenStdPlnPolNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPolNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPolNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of denStdPlnPlnNbr
   *
   * @return denStdPlnPlnNbr
   */
  public char[] getDenStdPlnPlnNbr() throws CFException {
    if (isDenStdPlnPlnNbrModified()) {
      denStdPlnPlnNbr = refreshDenStdPlnPlnNbr();
    }
    return denStdPlnPlnNbr;
  }

  /**
   * set variable denStdPlnPlnNbr Corresponding COBOL Variable is DEN-STD-PLN-PLN-NBR
   *
   * @param value
   */
  public void setDenStdPlnPlnNbr(char[] value) {
    denStdPlnPlnNbr = checkDenStdPlnPlnNbrConstraints(value);
    serializeDenStdPlnPlnNbr(denStdPlnPlnNbr);
  }

  /**
   * Update DenStdPlnPlnNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPlnNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenStdPlnPlnNbr, denStdPlnPlnNbr.length);
  }

  public void setDenStdPlnPlnNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPlnNbr, denStdPlnPlnNbr.length);
  }

  /**
   * Update DenStdPlnPlnNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPlnNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPlnNbr + targetIndex, targetLen);
  }

  /**
   * Update DenStdPlnPlnNbr with another Field
   *
   * @param value
   */
  public void setDenStdPlnPlnNbr(Field source) {
    replace(source, 0, source.length(), beginDenStdPlnPlnNbr, DEN_STD_PLN_PLN_NBR_LEN);
  }

  /**
   * Update DenStdPlnPlnNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPlnNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPlnNbr, DEN_STD_PLN_PLN_NBR_LEN);
  }

  /**
   * Update DenStdPlnPlnNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenStdPlnPlnNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnPlnNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of denStdPlnClssNbr
   *
   * @return denStdPlnClssNbr
   */
  public char[] getDenStdPlnClssNbr() throws CFException {
    if (isDenStdPlnClssNbrModified()) {
      denStdPlnClssNbr = refreshDenStdPlnClssNbr();
    }
    return denStdPlnClssNbr;
  }

  /**
   * set variable denStdPlnClssNbr Corresponding COBOL Variable is DEN-STD-PLN-CLSS-NBR
   *
   * @param value
   */
  public void setDenStdPlnClssNbr(char[] value) {
    denStdPlnClssNbr = checkDenStdPlnClssNbrConstraints(value);
    serializeDenStdPlnClssNbr(denStdPlnClssNbr);
  }

  /**
   * Update DenStdPlnClssNbr with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenStdPlnClssNbr(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenStdPlnClssNbr, denStdPlnClssNbr.length);
  }

  public void setDenStdPlnClssNbr(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnClssNbr, denStdPlnClssNbr.length);
  }

  /**
   * Update DenStdPlnClssNbr with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenStdPlnClssNbr(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnClssNbr + targetIndex, targetLen);
  }

  /**
   * Update DenStdPlnClssNbr with another Field
   *
   * @param value
   */
  public void setDenStdPlnClssNbr(Field source) {
    replace(source, 0, source.length(), beginDenStdPlnClssNbr, DEN_STD_PLN_CLSS_NBR_LEN);
  }

  /**
   * Update DenStdPlnClssNbr with another Field from an offset and length
   *
   * @param value
   */
  public void setDenStdPlnClssNbr(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnClssNbr, DEN_STD_PLN_CLSS_NBR_LEN);
  }

  /**
   * Update DenStdPlnClssNbr with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenStdPlnClssNbr(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenStdPlnClssNbr + targetIndex, targetLen);
  }
  /**
   * Returns the value of denGtdHmoCd
   *
   * @return denGtdHmoCd
   */
  public char[] getDenGtdHmoCd() throws CFException {
    if (isDenGtdHmoCdModified()) {
      denGtdHmoCd = refreshDenGtdHmoCd();
    }
    return denGtdHmoCd;
  }

  /**
   * set variable denGtdHmoCd Corresponding COBOL Variable is DEN-GTD-HMO-CD
   *
   * @param value
   */
  public void setDenGtdHmoCd(char[] value) {
    denGtdHmoCd = checkDenGtdHmoCdConstraints(value);
    serializeDenGtdHmoCd(denGtdHmoCd);
  }

  /**
   * Update DenGtdHmoCd with a char[] from an offset and length
   *
   * @param value
   */
  public void setDenGtdHmoCd(char[] source, int sourceIndex) {
    replace(source, sourceIndex, source.length, beginDenGtdHmoCd, denGtdHmoCd.length);
  }

  public void setDenGtdHmoCd(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenGtdHmoCd, denGtdHmoCd.length);
  }

  /**
   * Update DenGtdHmoCd with a char[] from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenGtdHmoCd(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenGtdHmoCd + targetIndex, targetLen);
  }

  /**
   * Update DenGtdHmoCd with another Field
   *
   * @param value
   */
  public void setDenGtdHmoCd(Field source) {
    replace(source, 0, source.length(), beginDenGtdHmoCd, DEN_GTD_HMO_CD_LEN);
  }

  /**
   * Update DenGtdHmoCd with another Field from an offset and length
   *
   * @param value
   */
  public void setDenGtdHmoCd(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, beginDenGtdHmoCd, DEN_GTD_HMO_CD_LEN);
  }

  /**
   * Update DenGtdHmoCd with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setDenGtdHmoCd(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, beginDenGtdHmoCd + targetIndex, targetLen);
  }

  /**
   * initializes DclpolPlnDenorm String fields defaults to Spaces short/int/long defaults to zero
   * BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    setDenCovTypCd(CONSTANTS.SPACE);
    setDenPolNbr(CONSTANTS.SPACE_6);
    setDenPlnNbr(CONSTANTS.SPACE_4);
    setDenClssNbr(CONSTANTS.SPACE_4);
    setDenPlnSeqNbr((short) 0);
    setDenObsolete(CONSTANTS.SPACE_6);
    setDenSlotTblId(CONSTANTS.SPACE_6);
    setDenObligId(CONSTANTS.SPACE_2);
    setDenShrArngCd(CONSTANTS.SPACE_2);
    setDenRcprctyTblId(CONSTANTS.SPACE_6);
    setDenNewOldSrvcInd(CONSTANTS.SPACE);
    setDenCopayVarId(0);
    setDenLstUpdtDttm(CONSTANTS.SPACE_26);
    setDenLstUpdtId(CONSTANTS.SPACE_9);
    setDenStdPlnPolNbr(CONSTANTS.SPACE_6);
    setDenStdPlnPlnNbr(CONSTANTS.SPACE_4);
    setDenStdPlnClssNbr(CONSTANTS.SPACE_4);
    setDenGtdHmoCd(CONSTANTS.SPACE);
  }

  public static int getDclpolPlnDenormFieldLength() {
    return DCLPOL_PLN_DENORM_LENGTH;
  }
}
