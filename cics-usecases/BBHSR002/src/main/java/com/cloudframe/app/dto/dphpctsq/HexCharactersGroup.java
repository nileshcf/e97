package com.cloudframe.app.dto.dphpctsq;

/**
 * The class HexCharactersGroup is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-03-25 at 08:30. using version 5.0.0.231
 */
import com.cloudframe.app.data.Field;
import com.cloudframe.app.dto.serialize.dphpctsq.*;

public class HexCharactersGroup extends HexCharactersGroupSerialized {

  private HexCharacters hexCharacters = new HexCharacters();
  private HexTable hexTable = new HexTable();

  /** Constructor for HexCharactersGroup */
  public HexCharactersGroup() {
    super();
    /*  set the parent of each child as this which are a group variable */
    hexCharacters.setParent(this, getStartOffset() + 0);
    hexTable.setParent(this, getStartOffset() + 0);
    /*  end of offset */
  }

  /**
   * Returns the value of hexCharacters
   *
   * @return hexCharacters
   */
  public HexCharacters getHexCharacters() {
    return hexCharacters;
  }
  /**
   * Update HexCharacters with the passed value Corresponding COBOL Variable is HEX-CHARACTERS
   *
   * @param value
   */
  public void setHexCharacters(char[] value) {
    hexCharacters.setString(value);
  }

  /**
   * Update HexCharacters with a String from an offset and length
   *
   * @param value
   */
  public void setHexCharacters(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hexCharacters.begin, hexCharacters.length());
  }

  /**
   * Update HexCharacters with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHexCharacters(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hexCharacters.begin + targetIndex, targetLen);
  }

  /**
   * Update HexCharacters with another Field
   *
   * @param value
   */
  public void setHexCharacters(Field source) {
    replace(source, 0, source.length(), hexCharacters.begin, hexCharacters.length());
  }

  /**
   * Update HexCharacters with another Field from an offset and length
   *
   * @param value
   */
  public void setHexCharacters(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hexCharacters.begin, hexCharacters.length());
  }

  /**
   * Update HexCharacters with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHexCharacters(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hexCharacters.begin + targetIndex, targetLen);
  }
  /**
   * Returns the value of hexTable
   *
   * @return hexTable
   */
  public HexTable getHexTable() {
    return hexTable;
  }
  /**
   * Update HexTable with the passed value Corresponding COBOL Variable is HEX-TABLE
   *
   * @param value
   */
  public void setHexTable(char[] value) {
    hexTable.setString(value);
  }

  /**
   * Update HexTable with a String from an offset and length
   *
   * @param value
   */
  public void setHexTable(char[] source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hexTable.begin, hexTable.length());
  }

  /**
   * Update HexTable with a String from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHexTable(
      char[] source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hexTable.begin + targetIndex, targetLen);
  }

  /**
   * Update HexTable with another Field
   *
   * @param value
   */
  public void setHexTable(Field source) {
    replace(source, 0, source.length(), hexTable.begin, hexTable.length());
  }

  /**
   * Update HexTable with another Field from an offset and length
   *
   * @param value
   */
  public void setHexTable(Field source, int sourceIndex, int sourceLen) {
    replace(source, sourceIndex, sourceLen, hexTable.begin, hexTable.length());
  }

  /**
   * Update HexTable with another Field from an offset and length to an offset and length
   *
   * @param value
   */
  public void setHexTable(
      Field source, int sourceIndex, int sourceLen, int targetIndex, int targetLen) {
    replace(source, sourceIndex, sourceLen, hexTable.begin + targetIndex, targetLen);
  }

  public static int getHexCharactersGroupFieldLength() {
    return HEX_CHARACTERS_GROUP_LENGTH;
  }
}
