package com.cloudframe.app.dto.bbhsr002;

/**
 * The class Pol2RetReciprocityTable is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:29. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.bbhsr002.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class Pol2RetReciprocityTable extends Pol2RetReciprocityTableSerialized {

  private List<Pol2RetReciprocityOccurs> pol2RetReciprocityOccurs = new ArrayList<>();

  /** Constructor for Pol2RetReciprocityTable */
  public Pol2RetReciprocityTable() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for Pol2RetReciprocityTable. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public Pol2RetReciprocityTable(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of pol2RetReciprocityOccurs Corresponding COBOL Variable is
   * POL2-RET-RECIPROCITY-OCCURS
   *
   * @return pol2RetReciprocityOccurs
   */
  public List<Pol2RetReciprocityOccurs> getPol2RetReciprocityOccurs() {
    return pol2RetReciprocityOccurs;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return pol2RetReciprocityOccurs
   */
  public Pol2RetReciprocityOccurs getPol2RetReciprocityOccurs(int index) {
    if (index < 0) {
      logger.trace(
          "Array index was {} for getPol2RetReciprocityOccurs(), resetting it to 0", index);
      index = 0;
    } else if (index >= POL_2_RET_RECIPROCITY_OCCURS_SIZE) {
      index = POL_2_RET_RECIPROCITY_OCCURS_SIZE - 1; // can't exceed max array size
      logger.trace(
          "pol2RetReciprocityOccurs - Array index exceeded max Size {}, resetting it to max allowed",
          POL_2_RET_RECIPROCITY_OCCURS_SIZE);
    }
    if (index >= pol2RetReciprocityOccurs.size()) {
      for (int fillIndex = pol2RetReciprocityOccurs.size() - 1; fillIndex < index; fillIndex++) {
        pol2RetReciprocityOccurs.add(null);
      }
      pol2RetReciprocityOccurs.set(
          index,
          new Pol2RetReciprocityOccurs(
              this,
              beginPol2RetReciprocityOccurs
                  + index * Pol2RetReciprocityOccurs.getPol2RetReciprocityOccursFieldLength()));
    }
    Pol2RetReciprocityOccurs value = pol2RetReciprocityOccurs.get(index);
    if (value == null) {
      pol2RetReciprocityOccurs.set(
          index,
          new Pol2RetReciprocityOccurs(
              this,
              beginPol2RetReciprocityOccurs
                  + index * Pol2RetReciprocityOccurs.getPol2RetReciprocityOccursFieldLength()));
      value = pol2RetReciprocityOccurs.get(index);
    }
    return value;
  }

  /**
   * Update Pol2RetReciprocityOccurs at index with the passed value Corresponding COBOL Variable is
   * POL2-RET-RECIPROCITY-OCCURS
   *
   * @param index
   * @param value
   */
  public void setPol2RetReciprocityOccurs(int index, char[] value) {
    getPol2RetReciprocityOccurs(index).setString(value);
  }

  /**
   * initializes Pol2RetReciprocityTable String fields defaults to Spaces short/int/long defaults to
   * zero BigDecimal defaults to BigDecimal.ZERO
   */
  public void initialize() {
    if (pol2RetReciprocityOccurs.isEmpty()) {
      // fill the Array to the full capacity
      for (int index = 0; index < POL_2_RET_RECIPROCITY_OCCURS_SIZE; index++) {
        Pol2RetReciprocityOccurs newElement =
            new Pol2RetReciprocityOccurs(
                this,
                beginPol2RetReciprocityOccurs
                    + index * Pol2RetReciprocityOccurs.getPol2RetReciprocityOccursFieldLength());
        newElement.initialize();
        pol2RetReciprocityOccurs.add(newElement);
      }
    } else {
      if (pol2RetReciprocityOccurs.size() < POL_2_RET_RECIPROCITY_OCCURS_SIZE) {
        // prefill it first
        for (int index = pol2RetReciprocityOccurs.size();
            index < POL_2_RET_RECIPROCITY_OCCURS_SIZE;
            index++) {
          Pol2RetReciprocityOccurs newElement =
              new Pol2RetReciprocityOccurs(
                  this,
                  beginPol2RetReciprocityOccurs
                      + index * Pol2RetReciprocityOccurs.getPol2RetReciprocityOccursFieldLength());
          pol2RetReciprocityOccurs.add(newElement);
        }
      }

      for (int index = 0; index < POL_2_RET_RECIPROCITY_OCCURS_SIZE; index++) {
        Pol2RetReciprocityOccurs pol2RetReciprocityOccursVar = pol2RetReciprocityOccurs.get(index);
        if (pol2RetReciprocityOccursVar == null) {
          pol2RetReciprocityOccursVar =
              new Pol2RetReciprocityOccurs(
                  this,
                  beginPol2RetReciprocityOccurs
                      + index * Pol2RetReciprocityOccurs.getPol2RetReciprocityOccursFieldLength());
          pol2RetReciprocityOccurs.set(index, pol2RetReciprocityOccursVar);
        }
        pol2RetReciprocityOccursVar.initialize();
      }
    }
  }

  public static int getPol2RetReciprocityTableFieldLength() {
    return POL_2_RET_RECIPROCITY_TABLE_LENGTH;
  }
}
