package com.cloudframe.app.init1.dto;

/**
*  The class WcdloCycEndDt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WcdloCycEndDt extends WcdloCycEndDtSerialized { 
   

								private int wcdloCycEndDtMm;


								private int wcdloCycEndDtDd;


								private int wcdloCycEndDtYyyy;
	
	/**
	* Constructor for WcdloCycEndDt
	**/
    public WcdloCycEndDt() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WcdloCycEndDt. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloCycEndDt(Field parent,int begin) {
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
	 *	Returns the value of wcdloCycEndDtMm
	 *	@return wcdloCycEndDtMm
	 */
	public int getWcdloCycEndDtMm() throws CFException {
       if (isWcdloCycEndDtMmModified()) { 
           wcdloCycEndDtMm = refreshWcdloCycEndDtMm();
        }
   		return wcdloCycEndDtMm;
	}
	

	
	   
	/**
	 * 	Update WcdloCycEndDtMm with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CYC-END-DT-MM
	 *	@param number
	 */
	public void setWcdloCycEndDtMm(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCycEndDtMm = checkWcdloCycEndDtMmMaxLimit(number); 
		serializeWcdloCycEndDtMm(wcdloCycEndDtMm);
	}
	

	public void setWcdloCycEndDtMm(long number) {
	    number = checkWcdloCycEndDtMmMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCycEndDtMm((int)number);
	}
	
	/**
	 * 	Update WcdloCycEndDtMm with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCycEndDtMm(char[] value) throws CFException {
		 wcdloCycEndDtMm = serializeWcdloCycEndDtMm(value);
	}
	/**
	 * 	Update WcdloCycEndDtMm with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCycEndDtMmString(char[] value) throws CFException {
		 setWcdloCycEndDtMm(value);
	}
	/**
	 *	Returns the value of wcdloCycEndDtDd
	 *	@return wcdloCycEndDtDd
	 */
	public int getWcdloCycEndDtDd() throws CFException {
       if (isWcdloCycEndDtDdModified()) { 
           wcdloCycEndDtDd = refreshWcdloCycEndDtDd();
        }
   		return wcdloCycEndDtDd;
	}
	

	
	   
	/**
	 * 	Update WcdloCycEndDtDd with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CYC-END-DT-DD
	 *	@param number
	 */
	public void setWcdloCycEndDtDd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCycEndDtDd = checkWcdloCycEndDtDdMaxLimit(number); 
		serializeWcdloCycEndDtDd(wcdloCycEndDtDd);
	}
	

	public void setWcdloCycEndDtDd(long number) {
	    number = checkWcdloCycEndDtDdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCycEndDtDd((int)number);
	}
	
	/**
	 * 	Update WcdloCycEndDtDd with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCycEndDtDd(char[] value) throws CFException {
		 wcdloCycEndDtDd = serializeWcdloCycEndDtDd(value);
	}
	/**
	 * 	Update WcdloCycEndDtDd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCycEndDtDdString(char[] value) throws CFException {
		 setWcdloCycEndDtDd(value);
	}
	/**
	 *	Returns the value of wcdloCycEndDtYyyy
	 *	@return wcdloCycEndDtYyyy
	 */
	public int getWcdloCycEndDtYyyy() throws CFException {
       if (isWcdloCycEndDtYyyyModified()) { 
           wcdloCycEndDtYyyy = refreshWcdloCycEndDtYyyy();
        }
   		return wcdloCycEndDtYyyy;
	}
	

	
	   
	/**
	 * 	Update WcdloCycEndDtYyyy with the passed value
	 *  Corresponding COBOL Variable is WCDLO-CYC-END-DT-YYYY
	 *	@param number
	 */
	public void setWcdloCycEndDtYyyy(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    wcdloCycEndDtYyyy = checkWcdloCycEndDtYyyyMaxLimit(number); 
		serializeWcdloCycEndDtYyyy(wcdloCycEndDtYyyy);
	}
	

	public void setWcdloCycEndDtYyyy(long number) {
	    number = checkWcdloCycEndDtYyyyMaxLimit(number); // Truncate if value is beyond +/- Max range
		setWcdloCycEndDtYyyy((int)number);
	}
	
	/**
	 * 	Update WcdloCycEndDtYyyy with the passed value
	 *	@param value (String or char[])
	 */
	public void setWcdloCycEndDtYyyy(char[] value) throws CFException {
		 wcdloCycEndDtYyyy = serializeWcdloCycEndDtYyyy(value);
	}
	/**
	 * 	Update WcdloCycEndDtYyyy with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setWcdloCycEndDtYyyyString(char[] value) throws CFException {
		 setWcdloCycEndDtYyyy(value);
	}

	
	
	
	/**
	 * 	initializes WcdloCycEndDt
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setWcdloCycEndDtMm(0);
                     setWcdloCycEndDtDd(0);
                     setWcdloCycEndDtYyyy(0);
   }

		public static int getWcdloCycEndDtFieldLength() {
			return WCDLO_CYC_END_DT_LENGTH;
		}

}
  
