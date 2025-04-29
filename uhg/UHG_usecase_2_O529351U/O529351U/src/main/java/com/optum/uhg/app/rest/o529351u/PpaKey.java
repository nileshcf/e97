package com.optum.uhg.app.rest.o529351u;

/**
 * The class PpaKey is used to handle fields declared in it
 *
 * @author CloudFrame Inc. created on 2025-04-28 at 19:32.
 */
import com.cloudframe.app.exception.CFException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PpaKey {

  protected Logger logger = LoggerFactory.getLogger(PpaKey.class);

  /*  Child Field declaration */
  private long ppaProvTinSuff;

  /*  End of Field declaration */
  public long getPpaProvTinSuff() {
    return ppaProvTinSuff;
  }

  /**
   * Update PpaProvTinSuff with the passed value
   *
   * @param number
   */
  public void setPpaProvTinSuff(long number) {
    ppaProvTinSuff = number;
  }

  @JsonIgnore
  public void setPpaKey(com.optum.uhg.app.dto.o529351u.PpaKey ppaKey) throws CFException {
    ppaKey.setPpaProvTinSuff(ppaProvTinSuff);
  }

  @JsonIgnore
  public void populateFrom(com.optum.uhg.app.dto.o529351u.PpaKey ppaKey) throws CFException {
    setPpaProvTinSuff(ppaKey.getPpaProvTinSuff());
  }
}
