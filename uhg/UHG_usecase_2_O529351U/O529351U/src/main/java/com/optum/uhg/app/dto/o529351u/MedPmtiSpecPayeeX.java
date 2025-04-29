package com.optum.uhg.app.dto.o529351u;

/**
 * The class MedPmtiSpecPayeeX is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32. using version 5.0.0.257
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import com.optum.uhg.app.dto.serialize.o529351u.*;

public class MedPmtiSpecPayeeX extends MedPmtiSpecPayeeXSerialized {

  private long medPmtiSpecPayeeSuf;

  /** Constructor for MedPmtiSpecPayeeX */
  public MedPmtiSpecPayeeX() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for MedPmtiSpecPayeeX. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public MedPmtiSpecPayeeX(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of medPmtiSpecPayeeSuf
   *
   * @return medPmtiSpecPayeeSuf
   */
  public long getMedPmtiSpecPayeeSuf() throws CFException {
    if (isMedPmtiSpecPayeeSufModified()) {
      medPmtiSpecPayeeSuf = refreshMedPmtiSpecPayeeSuf();
    }
    return medPmtiSpecPayeeSuf;
  }

  /**
   * Update MedPmtiSpecPayeeSuf with the passed value Corresponding COBOL Variable is
   * MED-PMTI-SPEC-PAYEE-SUF
   *
   * @param number
   */
  public void setMedPmtiSpecPayeeSuf(long number) {
    // Truncate if the number is beyond +/- Max range
    medPmtiSpecPayeeSuf = checkMedPmtiSpecPayeeSufMaxLimit(number);
    serializeMedPmtiSpecPayeeSuf(medPmtiSpecPayeeSuf);
  }

  /**
   * Update MedPmtiSpecPayeeSuf with the passed value
   *
   * @param value (String or char[])
   */
  public void setMedPmtiSpecPayeeSuf(char[] value) throws CFException {
    medPmtiSpecPayeeSuf = serializeMedPmtiSpecPayeeSuf(value);
  }
  /**
   * Update MedPmtiSpecPayeeSuf with the passed value
   *
   * @param value (String or char[])
   */
  public void setMedPmtiSpecPayeeSufString(char[] value) throws CFException {
    setMedPmtiSpecPayeeSuf(value);
  }

  public static int getMedPmtiSpecPayeeXFieldLength() {
    return MED_PMTI_SPEC_PAYEE_X_LENGTH;
  }
}
