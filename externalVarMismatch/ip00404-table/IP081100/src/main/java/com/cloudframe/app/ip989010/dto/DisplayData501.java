package com.cloudframe.app.ip989010.dto;

/**
*  The class DisplayData501 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DisplayData501 extends DisplayData501Serialized { 
   

						private char[] panAlias501 = Field.fillLowValue(36);

								private long donationLimit501;

								private long calcDonationAmt501;

								private long builtDonationAmt501;
	
	/**
	* Constructor for DisplayData501
	**/
    public DisplayData501() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DisplayData501. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DisplayData501(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of panAlias501
	 *	@return panAlias501
	 */
   public char[] getPanAlias501() throws CFException{
     if (isPanAlias501Modified()) { 
        panAlias501 = refreshPanAlias501();
     }
   		return panAlias501;
   }

  
	/**
	*  set variable panAlias501
	*  Corresponding COBOL Variable is 501-PAN-ALIAS
	*  @param value
	**/
   public void setPanAlias501(char[] value) {
      panAlias501 = checkPanAlias501Constraints(value);
      serializePanAlias501(panAlias501);
   } 

     /**
	 * 	Update PanAlias501 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPanAlias501(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPanAlias501,panAlias501.length);
   	
   }
   
   public void setPanAlias501(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias501,panAlias501.length);
   	
   }
   
     /**
	 * 	Update PanAlias501 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPanAlias501(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias501+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PanAlias501 with another Field
	 *	@param value
	 */
   public void setPanAlias501(Field source) {
       replace(source,0,source.length(),beginPanAlias501,PAN_ALIAS_501_LEN);
   	
   }  
   
     /**
	 * 	Update PanAlias501 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPanAlias501(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPanAlias501,PAN_ALIAS_501_LEN);
   	
   }
   
     /**
	 * 	Update PanAlias501 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPanAlias501(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPanAlias501+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of donationLimit501
	 *	@return donationLimit501
	 */
	public long getDonationLimit501() throws CFException {
       if (isDonationLimit501Modified()) { 
           donationLimit501 = refreshDonationLimit501();
        }
   		return donationLimit501;
	}
	

	
	   
	/**
	 * 	Update DonationLimit501 with the passed value
	 *  Corresponding COBOL Variable is 501-DONATION-LIMIT
	 *	@param number
	 */
	public void setDonationLimit501(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    donationLimit501 = checkDonationLimit501MaxLimit(number); 
		serializeDonationLimit501(donationLimit501);
	}
	

	/**
	 * 	Update DonationLimit501 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDonationLimit501(char[] value) throws CFException {
		 donationLimit501 = serializeDonationLimit501(value);
	}
	/**
	 * 	Update DonationLimit501 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDonationLimit501String(char[] value) throws CFException {
		 setDonationLimit501(value);
	}
	/**
	 *	Returns the value of calcDonationAmt501
	 *	@return calcDonationAmt501
	 */
	public long getCalcDonationAmt501() throws CFException {
       if (isCalcDonationAmt501Modified()) { 
           calcDonationAmt501 = refreshCalcDonationAmt501();
        }
   		return calcDonationAmt501;
	}
	

	
	   
	/**
	 * 	Update CalcDonationAmt501 with the passed value
	 *  Corresponding COBOL Variable is 501-CALC-DONATION-AMT
	 *	@param number
	 */
	public void setCalcDonationAmt501(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    calcDonationAmt501 = checkCalcDonationAmt501MaxLimit(number); 
		serializeCalcDonationAmt501(calcDonationAmt501);
	}
	

	/**
	 * 	Update CalcDonationAmt501 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCalcDonationAmt501(char[] value) throws CFException {
		 calcDonationAmt501 = serializeCalcDonationAmt501(value);
	}
	/**
	 * 	Update CalcDonationAmt501 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCalcDonationAmt501String(char[] value) throws CFException {
		 setCalcDonationAmt501(value);
	}
	/**
	 *	Returns the value of builtDonationAmt501
	 *	@return builtDonationAmt501
	 */
	public long getBuiltDonationAmt501() throws CFException {
       if (isBuiltDonationAmt501Modified()) { 
           builtDonationAmt501 = refreshBuiltDonationAmt501();
        }
   		return builtDonationAmt501;
	}
	

	
	   
	/**
	 * 	Update BuiltDonationAmt501 with the passed value
	 *  Corresponding COBOL Variable is 501-BUILT-DONATION-AMT
	 *	@param number
	 */
	public void setBuiltDonationAmt501(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    builtDonationAmt501 = checkBuiltDonationAmt501MaxLimit(number); 
		serializeBuiltDonationAmt501(builtDonationAmt501);
	}
	

	/**
	 * 	Update BuiltDonationAmt501 with the passed value
	 *	@param value (String or char[])
	 */
	public void setBuiltDonationAmt501(char[] value) throws CFException {
		 builtDonationAmt501 = serializeBuiltDonationAmt501(value);
	}
	/**
	 * 	Update BuiltDonationAmt501 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBuiltDonationAmt501String(char[] value) throws CFException {
		 setBuiltDonationAmt501(value);
	}

	
	
	

		public static int getDisplayData501FieldLength() {
			return DISPLAY_DATA_501_LENGTH;
		}

}
  
