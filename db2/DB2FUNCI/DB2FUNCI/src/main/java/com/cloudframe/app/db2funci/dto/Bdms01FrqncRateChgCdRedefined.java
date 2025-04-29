package com.cloudframe.app.db2funci.dto;

/**
*  The class Bdms01FrqncRateChgCdRedefined is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/


import com.cloudframe.app.db2funci.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bdms01FrqncRateChgCdRedefined extends Bdms01FrqncRateChgCdRedefinedSerialized { 
   

						private char[] msdFloatingRateInd = Field.fillLowValue(1);
	
	/**
	* Constructor for Bdms01FrqncRateChgCdRedefined
	**/
    public Bdms01FrqncRateChgCdRedefined() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01FrqncRateChgCdRedefined. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01FrqncRateChgCdRedefined(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of msdFloatingRateInd
	 *	@return msdFloatingRateInd
	 */
   public char[] getMsdFloatingRateInd() throws CFException{
     if (isMsdFloatingRateIndModified()) { 
        msdFloatingRateInd = refreshMsdFloatingRateInd();
     }
   		return msdFloatingRateInd;
   }

  
	/**
	*  set variable msdFloatingRateInd
	*  Corresponding COBOL Variable is MSD-FLOATING-RATE-IND
	*  @param value
	**/
   public void setMsdFloatingRateInd(char[] value) {
      msdFloatingRateInd = checkMsdFloatingRateIndConstraints(value);
      serializeMsdFloatingRateInd(msdFloatingRateInd);
   } 

     /**
	 * 	Update MsdFloatingRateInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsdFloatingRateInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsdFloatingRateInd,msdFloatingRateInd.length);
   	
   }
   
   public void setMsdFloatingRateInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFloatingRateInd,msdFloatingRateInd.length);
   	
   }
   
     /**
	 * 	Update MsdFloatingRateInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdFloatingRateInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFloatingRateInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update MsdFloatingRateInd with another Field
	 *	@param value
	 */
   public void setMsdFloatingRateInd(Field source) {
       replace(source,0,source.length(),beginMsdFloatingRateInd,MSD_FLOATING_RATE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update MsdFloatingRateInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsdFloatingRateInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsdFloatingRateInd,MSD_FLOATING_RATE_IND_LEN);
   	
   }
   
     /**
	 * 	Update MsdFloatingRateInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdFloatingRateInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsdFloatingRateInd+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBdms01FrqncRateChgCdRedefinedFieldLength() {
			return BDMS_01_FRQNC_RATE_CHG_CD_REDEFINED_LENGTH;
		}

}
  
