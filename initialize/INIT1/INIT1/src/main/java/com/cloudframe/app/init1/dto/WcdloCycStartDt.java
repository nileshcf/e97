package com.cloudframe.app.init1.dto;

/**
*  The class WcdloCycStartDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloCycStartDt extends WcdloCycStartDtSerialized { 
   

								private int wcdloCycStartDtMm;


								private int wcdloCycStartDtDd;


								private int wcdloCycStartDtYyyy;
	
	/**
	* Constructor for WcdloCycStartDt
	**/
    public WcdloCycStartDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloCycStartDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycStartDt(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 2
             ,1
             );
       replaceValue( // serialize and save the value
             ("/").toCharArray()
             , getStartOffset() + 5
             ,1
             );
    } 

	/**
	 *	Returns the value of wcdloCycStartDtMm
	 *	@return wcdloCycStartDtMm
	 */
	public int getWcdloCycStartDtMm() throws CFException {
       if (isWcdloCycStartDtMmModified()) { 
           wcdloCycStartDtMm = refreshWcdloCycStartDtMm();
        }
   		return wcdloCycStartDtMm;
	}
	

	
	   
	/**
	 * 	Update WcdloCycStartDtMm with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CYC-START-DT-MM
	 *	@param number
	 */
	public void setWcdloCycStartDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCycStartDtMm = checkWcdloCycStartDtMmMaxLimit(number); 
		serializeWcdloCycStartDtMm(wcdloCycStartDtMm);
	}
	

	public void setWcdloCycStartDtMm(long number) {
	    number = checkWcdloCycStartDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCycStartDtMm((int)number);
	}
	
	/**
	 * 	Update WcdloCycStartDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCycStartDtMm(char[] value) throws CFException {
		 wcdloCycStartDtMm = serializeWcdloCycStartDtMm(value);
	}
	/**
	 * 	Update WcdloCycStartDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCycStartDtMmString(char[] value) throws CFException {
		 setWcdloCycStartDtMm(value);
	}
	/**
	 *	Returns the value of wcdloCycStartDtDd
	 *	@return wcdloCycStartDtDd
	 */
	public int getWcdloCycStartDtDd() throws CFException {
       if (isWcdloCycStartDtDdModified()) { 
           wcdloCycStartDtDd = refreshWcdloCycStartDtDd();
        }
   		return wcdloCycStartDtDd;
	}
	

	
	   
	/**
	 * 	Update WcdloCycStartDtDd with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CYC-START-DT-DD
	 *	@param number
	 */
	public void setWcdloCycStartDtDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCycStartDtDd = checkWcdloCycStartDtDdMaxLimit(number); 
		serializeWcdloCycStartDtDd(wcdloCycStartDtDd);
	}
	

	public void setWcdloCycStartDtDd(long number) {
	    number = checkWcdloCycStartDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCycStartDtDd((int)number);
	}
	
	/**
	 * 	Update WcdloCycStartDtDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCycStartDtDd(char[] value) throws CFException {
		 wcdloCycStartDtDd = serializeWcdloCycStartDtDd(value);
	}
	/**
	 * 	Update WcdloCycStartDtDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCycStartDtDdString(char[] value) throws CFException {
		 setWcdloCycStartDtDd(value);
	}
	/**
	 *	Returns the value of wcdloCycStartDtYyyy
	 *	@return wcdloCycStartDtYyyy
	 */
	public int getWcdloCycStartDtYyyy() throws CFException {
       if (isWcdloCycStartDtYyyyModified()) { 
           wcdloCycStartDtYyyy = refreshWcdloCycStartDtYyyy();
        }
   		return wcdloCycStartDtYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdloCycStartDtYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CYC-START-DT-YYYY
	 *	@param number
	 */
	public void setWcdloCycStartDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCycStartDtYyyy = checkWcdloCycStartDtYyyyMaxLimit(number); 
		serializeWcdloCycStartDtYyyy(wcdloCycStartDtYyyy);
	}
	

	public void setWcdloCycStartDtYyyy(long number) {
	    number = checkWcdloCycStartDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCycStartDtYyyy((int)number);
	}
	
	/**
	 * 	Update WcdloCycStartDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCycStartDtYyyy(char[] value) throws CFException {
		 wcdloCycStartDtYyyy = serializeWcdloCycStartDtYyyy(value);
	}
	/**
	 * 	Update WcdloCycStartDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCycStartDtYyyyString(char[] value) throws CFException {
		 setWcdloCycStartDtYyyy(value);
	}

	
	
	
	/**
	 * 	initializes WcdloCycStartDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloCycStartDtMm(0);
                     setWcdloCycStartDtDd(0);
                     setWcdloCycStartDtYyyy(0);
   }

		public static int getWcdloCycStartDtFieldLength() {
			return WCDLO_CYC_START_DT_LENGTH;
		}

}
  
