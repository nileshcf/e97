package com.cloudframe.app.o529351u.rest;

/**
*  The class ULineData51 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54.
**/
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import java.math.BigDecimal;

public class ULineData51 { 	
   protected Logger logger = LoggerFactory.getLogger(ULineData51.class);

   /*  Child Field declaration */
                  private String uLinePos51 = "";
                  private String uLineServiceCode51 = "";
                          private int uLineDosDate51;
                          private BigDecimal uLineChargeAmt51 = BigDecimal.ZERO;
                          private BigDecimal uLineNotcovAmt51 = BigDecimal.ZERO;
                  private String uLineRemarkCd51 = "";
                          private int uLineAppUnits51;
                  private String uLineDiagPointer51 = "";
   /*  End of Field declaration */
	
	
   
	/**
	 *	Returns the value of uLinePos51
	 *	@return uLinePos51
	 */
   public String getULinePos51() {           
   		return uLinePos51;
   }

  
	/**
	*  set variable uLinePos51
	*  @param value
	**/
   public void setULinePos51(String value) {
	uLinePos51 = value.trim(); 
   }   
	/**
	 *	Returns the value of uLineServiceCode51
	 *	@return uLineServiceCode51
	 */
   public String getULineServiceCode51() {           
   		return uLineServiceCode51;
   }

  
	/**
	*  set variable uLineServiceCode51
	*  @param value
	**/
   public void setULineServiceCode51(String value) {
	uLineServiceCode51 = value.trim(); 
   }   
	public int getULineDosDate51() {         
   		return uLineDosDate51;
	}
	
	/**
	 * 	Update ULineDosDate51 with the passed value
	 *	@param number
	 */
	public void setULineDosDate51(int number) {
		uLineDosDate51 = number;
	}	
	public BigDecimal getULineChargeAmt51() {  
   		return uLineChargeAmt51;
	}
	/**
	 * 	Update ULineChargeAmt51 with the passed number
	 *	@param number
	 */
	public void setULineChargeAmt51(BigDecimal number) {
       uLineChargeAmt51 = number;
   }
	public BigDecimal getULineNotcovAmt51() {  
   		return uLineNotcovAmt51;
	}
	/**
	 * 	Update ULineNotcovAmt51 with the passed number
	 *	@param number
	 */
	public void setULineNotcovAmt51(BigDecimal number) {
       uLineNotcovAmt51 = number;
   }
	/**
	 *	Returns the value of uLineRemarkCd51
	 *	@return uLineRemarkCd51
	 */
   public String getULineRemarkCd51() {           
   		return uLineRemarkCd51;
   }

  
	/**
	*  set variable uLineRemarkCd51
	*  @param value
	**/
   public void setULineRemarkCd51(String value) {
	uLineRemarkCd51 = value.trim(); 
   }   
	public int getULineAppUnits51() {         
   		return uLineAppUnits51;
	}
	
	/**
	 * 	Update ULineAppUnits51 with the passed value
	 *	@param number
	 */
	public void setULineAppUnits51(int number) {
		uLineAppUnits51 = number;
	}	
	/**
	 *	Returns the value of uLineDiagPointer51
	 *	@return uLineDiagPointer51
	 */
   public String getULineDiagPointer51() {           
   		return uLineDiagPointer51;
   }

  
	/**
	*  set variable uLineDiagPointer51
	*  @param value
	**/
   public void setULineDiagPointer51(String value) {
	uLineDiagPointer51 = value.trim(); 
   }   
 @JsonIgnore
 public void setULineData51(com.cloudframe.app.o529351u.dto.ULineData51 uLineData51)  throws CFException{
            if (uLinePos51 != null && !uLinePos51.isEmpty()) {
                uLineData51.setULinePos51(uLinePos51.toCharArray());
            }
            if (uLineServiceCode51 != null && !uLineServiceCode51.isEmpty()) {
                uLineData51.setULineServiceCode51(uLineServiceCode51.toCharArray());
            }
	uLineData51.setULineDosDate51(uLineDosDate51);
	uLineData51.setULineChargeAmt51(uLineChargeAmt51);
	uLineData51.setULineNotcovAmt51(uLineNotcovAmt51);
            if (uLineRemarkCd51 != null && !uLineRemarkCd51.isEmpty()) {
                uLineData51.setULineRemarkCd51(uLineRemarkCd51.toCharArray());
            }
	uLineData51.setULineAppUnits51(uLineAppUnits51);
            if (uLineDiagPointer51 != null && !uLineDiagPointer51.isEmpty()) {
                uLineData51.setULineDiagPointer51(uLineDiagPointer51.toCharArray());
            }
 }
 
 @JsonIgnore
  public void populateFrom(com.cloudframe.app.o529351u.dto.ULineData51 uLineData51)  throws CFException {
            setULinePos51(String.valueOf(uLineData51.getULinePos51()));
            setULineServiceCode51(String.valueOf(uLineData51.getULineServiceCode51()));
         setULineDosDate51(uLineData51.getULineDosDate51());
         setULineChargeAmt51(uLineData51.getULineChargeAmt51());
         setULineNotcovAmt51(uLineData51.getULineNotcovAmt51());
            setULineRemarkCd51(String.valueOf(uLineData51.getULineRemarkCd51()));
         setULineAppUnits51(uLineData51.getULineAppUnits51());
            setULineDiagPointer51(String.valueOf(uLineData51.getULineDiagPointer51()));
  }

}
  
