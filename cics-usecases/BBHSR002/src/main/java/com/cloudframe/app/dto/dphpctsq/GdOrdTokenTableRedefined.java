package com.cloudframe.app.dto.dphpctsq;

/**
 * The class GdOrdTokenTableRedefined is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;
import java.util.*;

public class GdOrdTokenTableRedefined extends GdOrdTokenTableRedefinedSerialized {

  private List<GdOrdToken> gdOrdToken = new ArrayList<>();

  /** Constructor for GdOrdTokenTableRedefined */
  public GdOrdTokenTableRedefined() {
    // TO-DO auto generated code
  }

  /**
   * Constructor for GdOrdTokenTableRedefined. sets the parent value to the parent
   *
   * @param parent
   * @param begin
   */
  public GdOrdTokenTableRedefined(Field parent, int begin) {
    setParent(parent, begin);
  }

  /**
   * Returns the value of gdOrdToken Corresponding COBOL Variable is GD-ORD-TOKEN
   *
   * @return gdOrdToken
   */
  public List<GdOrdToken> getGdOrdToken() {
    return gdOrdToken;
  }

  /**
   * Returns the element at the specified position in this list.
   *
   * @param index
   * @return gdOrdToken
   */
  public GdOrdToken getGdOrdToken(int index) {
    if (index < 0) {
      logger.trace("Array index was {} for getGdOrdToken(), resetting it to 0", index);
      index = 0;
    } else if (index >= GD_ORD_TOKEN_SIZE) {
      index = GD_ORD_TOKEN_SIZE - 1; // can't exceed max array size
      logger.trace(
          "gdOrdToken - Array index exceeded max Size {}, resetting it to max allowed",
          GD_ORD_TOKEN_SIZE);
    }
    if (index >= gdOrdToken.size()) {
      for (int fillIndex = gdOrdToken.size() - 1; fillIndex < index; fillIndex++) {
        gdOrdToken.add(null);
      }
      gdOrdToken.set(
          index,
          new GdOrdToken(this, beginGdOrdToken + index * GdOrdToken.getGdOrdTokenFieldLength()));
    }
    GdOrdToken value = gdOrdToken.get(index);
    if (value == null) {
      gdOrdToken.set(
          index,
          new GdOrdToken(this, beginGdOrdToken + index * GdOrdToken.getGdOrdTokenFieldLength()));
      value = gdOrdToken.get(index);
    }
    return value;
  }

  /**
   * Update GdOrdToken at index with the passed value Corresponding COBOL Variable is GD-ORD-TOKEN
   *
   * @param index
   * @param value
   */
  public void setGdOrdToken(int index, char[] value) {
    getGdOrdToken(index).setString(value);
  }

  public static int getGdOrdTokenTableRedefinedFieldLength() {
    return GD_ORD_TOKEN_TABLE_REDEFINED_LENGTH;
  }
}
