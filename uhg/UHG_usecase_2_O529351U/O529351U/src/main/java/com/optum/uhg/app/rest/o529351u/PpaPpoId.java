package com.optum.uhg.app.rest.o529351u;

/**
 * The class PpaPpoId is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PpaPpoId {

  protected Logger logger = LoggerFactory.getLogger(PpaPpoId.class);

  /*  Child Field declaration */
  @JsonProperty("ppaOccurrence")
  private PpaOccurrence ppaOccurrence = new PpaOccurrence();

  /*  End of Field declaration */
  /**
   * Returns the value of ppaOccurrence
   *
   * @return ppaOccurrence
   */
  public PpaOccurrence getPpaOccurrence() {
    return ppaOccurrence;
  }

  // *** setGroup.txt starts
  /**
   * Update PpaOccurrence with the passed value
   *
   * @param value
   */
  @JsonIgnore
  public void setPpaOccurrence(com.optum.uhg.app.dto.o529351u.PpaOccurrence value)
      throws CFException {
    ppaOccurrence.populateFrom(value);
  }

  /**
   * Update PpaOccurrence with the passed value
   *
   * @param value
   */
  public void setPpaOccurrence(PpaOccurrence value) {
    ppaOccurrence = value;
  }

  // *** setGroup.txt ends
  @JsonIgnore
  public void setPpaPpoId(com.optum.uhg.app.dto.o529351u.PpaPpoId ppaPpoId) throws CFException {
    ppaOccurrence.setPpaOccurrence(ppaPpoId.getPpaOccurrence());
  }

  @JsonIgnore
  public void populateFrom(com.optum.uhg.app.dto.o529351u.PpaPpoId ppaPpoId) throws CFException {
    ppaOccurrence.populateFrom(ppaPpoId.getPpaOccurrence());
  }
}
