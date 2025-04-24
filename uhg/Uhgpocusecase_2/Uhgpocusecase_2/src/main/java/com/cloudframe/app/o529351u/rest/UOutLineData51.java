package com.cloudframe.app.o529351u.rest;

/**
*  The class UOutLineData51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;

public class UOutLineData51 { 	
   protected Logger logger = LoggerFactory.getLogger(UOutLineData51.class);

   /*  Child Field declaration */
                  private String uOutLinePos51 = "";
                  private String uOutLineServiceCode51 = "";
                          private int uOutLineDosDate51;
                          private BigDecimal uOutLineChargeAmt51 = BigDecimal.ZERO;
                          private BigDecimal uOutLineNotcovAmt51 = BigDecimal.ZERO;
                  private String uOutLineRemarkCd51 = "";
                          private short uOutLinePlanVar51;
                  private String uOutLineCauseCd51 = "";
                          private int uOutLineAppUnits51;
                  private String uOutSpiTblId51 = "";
                  private String uOutPosTierCd51 = "";
                  private String uOutDiagElgInd51 = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of uOutLinePos51
	 *	@return uOutLinePos51
	 */
   public String getUOutLinePos51() {           
   		return uOutLinePos51;
   }

  
	/**
	*  set variable uOutLinePos51
	*  @param value
	**/
   public void setUOutLinePos51(String value) {
	uOutLinePos51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uOutLineServiceCode51
	 *	@return uOutLineServiceCode51
	 */
   public String getUOutLineServiceCode51() {           
   		return uOutLineServiceCode51;
   }

  
	/**
	*  set variable uOutLineServiceCode51
	*  @param value
	**/
   public void setUOutLineServiceCode51(String value) {
	uOutLineServiceCode51 = value.trim(); 
   }   
	public int getUOutLineDosDate51() {         
   		return uOutLineDosDate51;
	}
	
	/**
	 * 	Update UOutLineDosDate51 with the passed value
	 *	@param number
	 */
	public void setUOutLineDosDate51(int number) {
		uOutLineDosDate51 = number;
	}	
	public BigDecimal getUOutLineChargeAmt51() {  
   		return uOutLineChargeAmt51;
	}
	/**
	 * 	Update UOutLineChargeAmt51 with the passed number
	 *	@param number
	 */
	public void setUOutLineChargeAmt51(BigDecimal number) {
       uOutLineChargeAmt51 = number;
   }
	public BigDecimal getUOutLineNotcovAmt51() {  
   		return uOutLineNotcovAmt51;
	}
	/**
	 * 	Update UOutLineNotcovAmt51 with the passed number
	 *	@param number
	 */
	public void setUOutLineNotcovAmt51(BigDecimal number) {
       uOutLineNotcovAmt51 = number;
   }
	/**
	 *	Returns the value of uOutLineRemarkCd51
	 *	@return uOutLineRemarkCd51
	 */
   public String getUOutLineRemarkCd51() {           
   		return uOutLineRemarkCd51;
   }

  
	/**
	*  set variable uOutLineRemarkCd51
	*  @param value
	**/
   public void setUOutLineRemarkCd51(String value) {
	uOutLineRemarkCd51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uOutLinePlanVar51
	 *	@return uOutLinePlanVar51
	 */
	public short getUOutLinePlanVar51() {               
   		return uOutLinePlanVar51;
	}
	
	/**
	 * 	Updates UOutLinePlanVar51 with the value
	 *	@param number
	 */
	public void setUOutLinePlanVar51(short number) {
	    uOutLinePlanVar51 = number; 
    }
	/**
	 *	Returns the value of uOutLineCauseCd51
	 *	@return uOutLineCauseCd51
	 */
   public String getUOutLineCauseCd51() {           
   		return uOutLineCauseCd51;
   }

  
	/**
	*  set variable uOutLineCauseCd51
	*  @param value
	**/
   public void setUOutLineCauseCd51(String value) {
	uOutLineCauseCd51 = value.trim(); 
   }   
	public int getUOutLineAppUnits51() {         
   		return uOutLineAppUnits51;
	}
	
	/**
	 * 	Update UOutLineAppUnits51 with the passed value
	 *	@param number
	 */
	public void setUOutLineAppUnits51(int number) {
		uOutLineAppUnits51 = number;
	}	
	/**
	 *	Returns the value of uOutSpiTblId51
	 *	@return uOutSpiTblId51
	 */
   public String getUOutSpiTblId51() {           
   		return uOutSpiTblId51;
   }

  
	/**
	*  set variable uOutSpiTblId51
	*  @param value
	**/
   public void setUOutSpiTblId51(String value) {
	uOutSpiTblId51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uOutPosTierCd51
	 *	@return uOutPosTierCd51
	 */
   public String getUOutPosTierCd51() {           
   		return uOutPosTierCd51;
   }

  
	/**
	*  set variable uOutPosTierCd51
	*  @param value
	**/
   public void setUOutPosTierCd51(String value) {
	uOutPosTierCd51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uOutDiagElgInd51
	 *	@return uOutDiagElgInd51
	 */
   public String getUOutDiagElgInd51() {           
   		return uOutDiagElgInd51;
   }

  
	/**
	*  set variable uOutDiagElgInd51
	*  @param value
	**/
   public void setUOutDiagElgInd51(String value) {
	uOutDiagElgInd51 = value.trim(); 
   }   
 @JsonIgnore
 public void setUOutLineData51(com.cloudframe.app.o529351u.dto.UOutLineData51 uOutLineData51)  throws CFException{
            if (uOutLinePos51 != null && !uOutLinePos51.isEmpty()) {
                uOutLineData51.setUOutLinePos51(uOutLinePos51.toCharArray());
            }
            if (uOutLineServiceCode51 != null && !uOutLineServiceCode51.isEmpty()) {
                uOutLineData51.setUOutLineServiceCode51(uOutLineServiceCode51.toCharArray());
            }
	uOutLineData51.setUOutLineDosDate51(uOutLineDosDate51);
	uOutLineData51.setUOutLineChargeAmt51(uOutLineChargeAmt51);
	uOutLineData51.setUOutLineNotcovAmt51(uOutLineNotcovAmt51);
            if (uOutLineRemarkCd51 != null && !uOutLineRemarkCd51.isEmpty()) {
                uOutLineData51.setUOutLineRemarkCd51(uOutLineRemarkCd51.toCharArray());
            }
	uOutLineData51.setUOutLinePlanVar51(uOutLinePlanVar51);
            if (uOutLineCauseCd51 != null && !uOutLineCauseCd51.isEmpty()) {
                uOutLineData51.setUOutLineCauseCd51(uOutLineCauseCd51.toCharArray());
            }
	uOutLineData51.setUOutLineAppUnits51(uOutLineAppUnits51);
            if (uOutSpiTblId51 != null && !uOutSpiTblId51.isEmpty()) {
                uOutLineData51.setUOutSpiTblId51(uOutSpiTblId51.toCharArray());
            }
            if (uOutPosTierCd51 != null && !uOutPosTierCd51.isEmpty()) {
                uOutLineData51.setUOutPosTierCd51(uOutPosTierCd51.toCharArray());
            }
            if (uOutDiagElgInd51 != null && !uOutDiagElgInd51.isEmpty()) {
                uOutLineData51.setUOutDiagElgInd51(uOutDiagElgInd51.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.UOutLineData51 uOutLineData51)  throws CFException {
            setUOutLinePos51(String.valueOf(uOutLineData51.getUOutLinePos51()));
            setUOutLineServiceCode51(String.valueOf(uOutLineData51.getUOutLineServiceCode51()));
         setUOutLineDosDate51(uOutLineData51.getUOutLineDosDate51());
         setUOutLineChargeAmt51(uOutLineData51.getUOutLineChargeAmt51());
         setUOutLineNotcovAmt51(uOutLineData51.getUOutLineNotcovAmt51());
            setUOutLineRemarkCd51(String.valueOf(uOutLineData51.getUOutLineRemarkCd51()));
         setUOutLinePlanVar51(uOutLineData51.getUOutLinePlanVar51());
            setUOutLineCauseCd51(String.valueOf(uOutLineData51.getUOutLineCauseCd51()));
         setUOutLineAppUnits51(uOutLineData51.getUOutLineAppUnits51());
            setUOutSpiTblId51(String.valueOf(uOutLineData51.getUOutSpiTblId51()));
            setUOutPosTierCd51(String.valueOf(uOutLineData51.getUOutPosTierCd51()));
            setUOutDiagElgInd51(String.valueOf(uOutLineData51.getUOutDiagElgInd51()));
  }

}
  
