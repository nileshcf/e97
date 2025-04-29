package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503MpMipProfileLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Sf503MpMipProfileLog extends Sf503MpMipProfileLogSerialized { 
   

						private char[] sf503MpLogTime = Field.fillLowValue(6);

						private char[] sf503MpLogDate = Field.fillLowValue(6);
				private Sf503MpMipId sf503MpMipId = new Sf503MpMipId();

								private int sf503MpIssFloorLim2Retail;

								private int sf503MpIssFloorLim2Travel;

								private int sf503MpIssFloorLim2Cash;

								private int sf503MpPosRetailLimit;

								private int sf503MpPosTravelLimit;

								private int sf503MpPosCashLimit;

								private int sf503MpXCodeLimit;

						private char[] sf503MpRclFileInd = Field.fillLowValue(1);

						private char[] sf503MpNegFileAvailInd = Field.fillLowValue(1);

						private char[] sf503MpMbrDelayFileInd = Field.fillLowValue(1);

						private char[] sf503MpLocalNegFileInd = Field.fillLowValue(1);
      private List<Integer> sf503MpIpqTimes; 

	
	/**
	* Constructor for Sf503MpMipProfileLog
	**/
    public Sf503MpMipProfileLog() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sf503MpMipProfileLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503MpMipProfileLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			sf503MpMipId.setParent(this,getStartOffset() + 14);
    } 

	/**
	 *	Returns the value of sf503MpLogTime
	 *	@return sf503MpLogTime
	 */
   public char[] getSf503MpLogTime() throws CFException{
     if (isSf503MpLogTimeModified()) { 
        sf503MpLogTime = refreshSf503MpLogTime();
     }
   		return sf503MpLogTime;
   }

  
	/**
	*  set variable sf503MpLogTime
	*  Corresponding COBOL Variable is SF503-MP-LOG-TIME
	*  @param value
	**/
   public void setSf503MpLogTime(char[] value) {
      sf503MpLogTime = checkSf503MpLogTimeConstraints(value);
      serializeSf503MpLogTime(sf503MpLogTime);
   } 

     /**
	 * 	Update Sf503MpLogTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpLogTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpLogTime,sf503MpLogTime.length);
   	
   }
   
   public void setSf503MpLogTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLogTime,sf503MpLogTime.length);
   	
   }
   
     /**
	 * 	Update Sf503MpLogTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpLogTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLogTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpLogTime with another Field
	 *	@param value
	 */
   public void setSf503MpLogTime(Field source) {
       replace(source,0,source.length(),beginSf503MpLogTime,SF_503_MP_LOG_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpLogTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpLogTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpLogTime,SF_503_MP_LOG_TIME_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpLogTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpLogTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLogTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503MpLogDate
	 *	@return sf503MpLogDate
	 */
   public char[] getSf503MpLogDate() throws CFException{
     if (isSf503MpLogDateModified()) { 
        sf503MpLogDate = refreshSf503MpLogDate();
     }
   		return sf503MpLogDate;
   }

  
	/**
	*  set variable sf503MpLogDate
	*  Corresponding COBOL Variable is SF503-MP-LOG-DATE
	*  @param value
	**/
   public void setSf503MpLogDate(char[] value) {
      sf503MpLogDate = checkSf503MpLogDateConstraints(value);
      serializeSf503MpLogDate(sf503MpLogDate);
   } 

     /**
	 * 	Update Sf503MpLogDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpLogDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpLogDate,sf503MpLogDate.length);
   	
   }
   
   public void setSf503MpLogDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLogDate,sf503MpLogDate.length);
   	
   }
   
     /**
	 * 	Update Sf503MpLogDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpLogDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLogDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpLogDate with another Field
	 *	@param value
	 */
   public void setSf503MpLogDate(Field source) {
       replace(source,0,source.length(),beginSf503MpLogDate,SF_503_MP_LOG_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpLogDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpLogDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpLogDate,SF_503_MP_LOG_DATE_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpLogDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpLogDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLogDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503MpMipId
	 *	@return sf503MpMipId
	 */   
	 public Sf503MpMipId getSf503MpMipId() {
   	return sf503MpMipId;
   }
   /**
	* 	Update Sf503MpMipId with the passed value
	*   Corresponding COBOL Variable is SF503-MP-MIP-ID
	*	@param value
	*/
   public void setSf503MpMipId(char[] value) {
      sf503MpMipId.setString(value); 
   }   
    
     /**
	 * 	Update Sf503MpMipId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setSf503MpMipId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipId.begin,sf503MpMipId.length());
   }
   
     /**
	 * 	Update Sf503MpMipId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Sf503MpMipId with another Field
	 *	@param value
	 */
   public void setSf503MpMipId(Field source) {
   	replace(source,0,source.length(),sf503MpMipId.begin,sf503MpMipId.length());
   }  
   
     /**
	 * 	Update Sf503MpMipId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setSf503MpMipId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipId.begin,sf503MpMipId.length());
   }
   
     /**
	 * 	Update Sf503MpMipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,sf503MpMipId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of sf503MpIssFloorLim2Retail
	 *	@return sf503MpIssFloorLim2Retail
	 */
	public int getSf503MpIssFloorLim2Retail() throws CFException {
        if (isSf503MpIssFloorLim2RetailModified()) { 
           sf503MpIssFloorLim2Retail = refreshSf503MpIssFloorLim2Retail();
        }
   		return sf503MpIssFloorLim2Retail;
	}
	
	/**
	 * 	Update Sf503MpIssFloorLim2Retail with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-ISS-FLOOR-LIM2-RETAIL
	 *	@param number
	 */
	public void setSf503MpIssFloorLim2Retail(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpIssFloorLim2Retail = checkSf503MpIssFloorLim2RetailMaxLimit(number); 
		serializeSf503MpIssFloorLim2Retail(sf503MpIssFloorLim2Retail);
	}


	public void setSf503MpIssFloorLim2Retail(long number) {
	    number = checkSf503MpIssFloorLim2RetailMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpIssFloorLim2Retail((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpIssFloorLim2Travel
	 *	@return sf503MpIssFloorLim2Travel
	 */
	public int getSf503MpIssFloorLim2Travel() throws CFException {
        if (isSf503MpIssFloorLim2TravelModified()) { 
           sf503MpIssFloorLim2Travel = refreshSf503MpIssFloorLim2Travel();
        }
   		return sf503MpIssFloorLim2Travel;
	}
	
	/**
	 * 	Update Sf503MpIssFloorLim2Travel with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-ISS-FLOOR-LIM2-TRAVEL
	 *	@param number
	 */
	public void setSf503MpIssFloorLim2Travel(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpIssFloorLim2Travel = checkSf503MpIssFloorLim2TravelMaxLimit(number); 
		serializeSf503MpIssFloorLim2Travel(sf503MpIssFloorLim2Travel);
	}


	public void setSf503MpIssFloorLim2Travel(long number) {
	    number = checkSf503MpIssFloorLim2TravelMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpIssFloorLim2Travel((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpIssFloorLim2Cash
	 *	@return sf503MpIssFloorLim2Cash
	 */
	public int getSf503MpIssFloorLim2Cash() throws CFException {
        if (isSf503MpIssFloorLim2CashModified()) { 
           sf503MpIssFloorLim2Cash = refreshSf503MpIssFloorLim2Cash();
        }
   		return sf503MpIssFloorLim2Cash;
	}
	
	/**
	 * 	Update Sf503MpIssFloorLim2Cash with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-ISS-FLOOR-LIM2-CASH
	 *	@param number
	 */
	public void setSf503MpIssFloorLim2Cash(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpIssFloorLim2Cash = checkSf503MpIssFloorLim2CashMaxLimit(number); 
		serializeSf503MpIssFloorLim2Cash(sf503MpIssFloorLim2Cash);
	}


	public void setSf503MpIssFloorLim2Cash(long number) {
	    number = checkSf503MpIssFloorLim2CashMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpIssFloorLim2Cash((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpPosRetailLimit
	 *	@return sf503MpPosRetailLimit
	 */
	public int getSf503MpPosRetailLimit() throws CFException {
        if (isSf503MpPosRetailLimitModified()) { 
           sf503MpPosRetailLimit = refreshSf503MpPosRetailLimit();
        }
   		return sf503MpPosRetailLimit;
	}
	
	/**
	 * 	Update Sf503MpPosRetailLimit with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-POS-RETAIL-LIMIT
	 *	@param number
	 */
	public void setSf503MpPosRetailLimit(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpPosRetailLimit = checkSf503MpPosRetailLimitMaxLimit(number); 
		serializeSf503MpPosRetailLimit(sf503MpPosRetailLimit);
	}


	public void setSf503MpPosRetailLimit(long number) {
	    number = checkSf503MpPosRetailLimitMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpPosRetailLimit((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpPosTravelLimit
	 *	@return sf503MpPosTravelLimit
	 */
	public int getSf503MpPosTravelLimit() throws CFException {
        if (isSf503MpPosTravelLimitModified()) { 
           sf503MpPosTravelLimit = refreshSf503MpPosTravelLimit();
        }
   		return sf503MpPosTravelLimit;
	}
	
	/**
	 * 	Update Sf503MpPosTravelLimit with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-POS-TRAVEL-LIMIT
	 *	@param number
	 */
	public void setSf503MpPosTravelLimit(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpPosTravelLimit = checkSf503MpPosTravelLimitMaxLimit(number); 
		serializeSf503MpPosTravelLimit(sf503MpPosTravelLimit);
	}


	public void setSf503MpPosTravelLimit(long number) {
	    number = checkSf503MpPosTravelLimitMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpPosTravelLimit((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpPosCashLimit
	 *	@return sf503MpPosCashLimit
	 */
	public int getSf503MpPosCashLimit() throws CFException {
        if (isSf503MpPosCashLimitModified()) { 
           sf503MpPosCashLimit = refreshSf503MpPosCashLimit();
        }
   		return sf503MpPosCashLimit;
	}
	
	/**
	 * 	Update Sf503MpPosCashLimit with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-POS-CASH-LIMIT
	 *	@param number
	 */
	public void setSf503MpPosCashLimit(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpPosCashLimit = checkSf503MpPosCashLimitMaxLimit(number); 
		serializeSf503MpPosCashLimit(sf503MpPosCashLimit);
	}


	public void setSf503MpPosCashLimit(long number) {
	    number = checkSf503MpPosCashLimitMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpPosCashLimit((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpXCodeLimit
	 *	@return sf503MpXCodeLimit
	 */
	public int getSf503MpXCodeLimit() throws CFException {
        if (isSf503MpXCodeLimitModified()) { 
           sf503MpXCodeLimit = refreshSf503MpXCodeLimit();
        }
   		return sf503MpXCodeLimit;
	}
	
	/**
	 * 	Update Sf503MpXCodeLimit with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-X-CODE-LIMIT
	 *	@param number
	 */
	public void setSf503MpXCodeLimit(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sf503MpXCodeLimit = checkSf503MpXCodeLimitMaxLimit(number); 
		serializeSf503MpXCodeLimit(sf503MpXCodeLimit);
	}


	public void setSf503MpXCodeLimit(long number) {
	    number = checkSf503MpXCodeLimitMaxLimit(number); // Truncate if value is beyond +/- Max range
		setSf503MpXCodeLimit((int)number);
	}
	
	/**
	 *	Returns the value of sf503MpRclFileInd
	 *	@return sf503MpRclFileInd
	 */
   public char[] getSf503MpRclFileInd() throws CFException{
     if (isSf503MpRclFileIndModified()) { 
        sf503MpRclFileInd = refreshSf503MpRclFileInd();
     }
   		return sf503MpRclFileInd;
   }

  
	/**
	*  set variable sf503MpRclFileInd
	*  Corresponding COBOL Variable is SF503-MP-RCL-FILE-IND
	*  @param value
	**/
   public void setSf503MpRclFileInd(char[] value) {
      sf503MpRclFileInd = checkSf503MpRclFileIndConstraints(value);
      serializeSf503MpRclFileInd(sf503MpRclFileInd);
   } 

     /**
	 * 	Update Sf503MpRclFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpRclFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpRclFileInd,sf503MpRclFileInd.length);
   	
   }
   
   public void setSf503MpRclFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpRclFileInd,sf503MpRclFileInd.length);
   	
   }
   
     /**
	 * 	Update Sf503MpRclFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpRclFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpRclFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpRclFileInd with another Field
	 *	@param value
	 */
   public void setSf503MpRclFileInd(Field source) {
       replace(source,0,source.length(),beginSf503MpRclFileInd,SF_503_MP_RCL_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpRclFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpRclFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpRclFileInd,SF_503_MP_RCL_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpRclFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpRclFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpRclFileInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503MpNegFileAvailInd
	 *	@return sf503MpNegFileAvailInd
	 */
   public char[] getSf503MpNegFileAvailInd() throws CFException{
     if (isSf503MpNegFileAvailIndModified()) { 
        sf503MpNegFileAvailInd = refreshSf503MpNegFileAvailInd();
     }
   		return sf503MpNegFileAvailInd;
   }

  
	/**
	*  set variable sf503MpNegFileAvailInd
	*  Corresponding COBOL Variable is SF503-MP-NEG-FILE-AVAIL-IND
	*  @param value
	**/
   public void setSf503MpNegFileAvailInd(char[] value) {
      sf503MpNegFileAvailInd = checkSf503MpNegFileAvailIndConstraints(value);
      serializeSf503MpNegFileAvailInd(sf503MpNegFileAvailInd);
   } 

     /**
	 * 	Update Sf503MpNegFileAvailInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpNegFileAvailInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpNegFileAvailInd,sf503MpNegFileAvailInd.length);
   	
   }
   
   public void setSf503MpNegFileAvailInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpNegFileAvailInd,sf503MpNegFileAvailInd.length);
   	
   }
   
     /**
	 * 	Update Sf503MpNegFileAvailInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpNegFileAvailInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpNegFileAvailInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpNegFileAvailInd with another Field
	 *	@param value
	 */
   public void setSf503MpNegFileAvailInd(Field source) {
       replace(source,0,source.length(),beginSf503MpNegFileAvailInd,SF_503_MP_NEG_FILE_AVAIL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpNegFileAvailInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpNegFileAvailInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpNegFileAvailInd,SF_503_MP_NEG_FILE_AVAIL_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpNegFileAvailInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpNegFileAvailInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpNegFileAvailInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503MpMbrDelayFileInd
	 *	@return sf503MpMbrDelayFileInd
	 */
   public char[] getSf503MpMbrDelayFileInd() throws CFException{
     if (isSf503MpMbrDelayFileIndModified()) { 
        sf503MpMbrDelayFileInd = refreshSf503MpMbrDelayFileInd();
     }
   		return sf503MpMbrDelayFileInd;
   }

  
	/**
	*  set variable sf503MpMbrDelayFileInd
	*  Corresponding COBOL Variable is SF503-MP-MBR-DELAY-FILE-IND
	*  @param value
	**/
   public void setSf503MpMbrDelayFileInd(char[] value) {
      sf503MpMbrDelayFileInd = checkSf503MpMbrDelayFileIndConstraints(value);
      serializeSf503MpMbrDelayFileInd(sf503MpMbrDelayFileInd);
   } 

     /**
	 * 	Update Sf503MpMbrDelayFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpMbrDelayFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpMbrDelayFileInd,sf503MpMbrDelayFileInd.length);
   	
   }
   
   public void setSf503MpMbrDelayFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpMbrDelayFileInd,sf503MpMbrDelayFileInd.length);
   	
   }
   
     /**
	 * 	Update Sf503MpMbrDelayFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMbrDelayFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpMbrDelayFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpMbrDelayFileInd with another Field
	 *	@param value
	 */
   public void setSf503MpMbrDelayFileInd(Field source) {
       replace(source,0,source.length(),beginSf503MpMbrDelayFileInd,SF_503_MP_MBR_DELAY_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpMbrDelayFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpMbrDelayFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpMbrDelayFileInd,SF_503_MP_MBR_DELAY_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpMbrDelayFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpMbrDelayFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpMbrDelayFileInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sf503MpLocalNegFileInd
	 *	@return sf503MpLocalNegFileInd
	 */
   public char[] getSf503MpLocalNegFileInd() throws CFException{
     if (isSf503MpLocalNegFileIndModified()) { 
        sf503MpLocalNegFileInd = refreshSf503MpLocalNegFileInd();
     }
   		return sf503MpLocalNegFileInd;
   }

  
	/**
	*  set variable sf503MpLocalNegFileInd
	*  Corresponding COBOL Variable is SF503-MP-LOCAL-NEG-FILE-IND
	*  @param value
	**/
   public void setSf503MpLocalNegFileInd(char[] value) {
      sf503MpLocalNegFileInd = checkSf503MpLocalNegFileIndConstraints(value);
      serializeSf503MpLocalNegFileInd(sf503MpLocalNegFileInd);
   } 

     /**
	 * 	Update Sf503MpLocalNegFileInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSf503MpLocalNegFileInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSf503MpLocalNegFileInd,sf503MpLocalNegFileInd.length);
   	
   }
   
   public void setSf503MpLocalNegFileInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLocalNegFileInd,sf503MpLocalNegFileInd.length);
   	
   }
   
     /**
	 * 	Update Sf503MpLocalNegFileInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpLocalNegFileInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLocalNegFileInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sf503MpLocalNegFileInd with another Field
	 *	@param value
	 */
   public void setSf503MpLocalNegFileInd(Field source) {
       replace(source,0,source.length(),beginSf503MpLocalNegFileInd,SF_503_MP_LOCAL_NEG_FILE_IND_LEN);
   	
   }  
   
     /**
	 * 	Update Sf503MpLocalNegFileInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSf503MpLocalNegFileInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSf503MpLocalNegFileInd,SF_503_MP_LOCAL_NEG_FILE_IND_LEN);
   	
   }
   
     /**
	 * 	Update Sf503MpLocalNegFileInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSf503MpLocalNegFileInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSf503MpLocalNegFileInd+targetIndex,targetLen);
    
   }
    /**
	 *	Returns the value of sf503MpIpqTimes
	 *  Corresponding COBOL Variable is SF503-MP-IPQ-TIMES
	 *	@return sf503MpIpqTimes
	 */
	public List<Integer> getSf503MpIpqTimes() throws CFException {
        List<Integer>	list = new ArrayList<>();  
        for (int index =0;index < SF_503_MP_IPQ_TIMES_SIZE;index++) {
        	list.add( getSf503MpIpqTimes( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position 
	 *  from the list
	 *  @param index
	 *	@return sf503MpIpqTimes
	 */
	public int getSf503MpIpqTimes(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getSf503MpIpqTimes(), resetting it to 0",index);
		    index = 0;
        } else if (index >= SF_503_MP_IPQ_TIMES_SIZE) {
             	index = SF_503_MP_IPQ_TIMES_SIZE -1; // can't exceed max array size
             	logger.trace("sf503MpIpqTimes - Array index exceeded max Size {}, resetting it to max allowed",SF_503_MP_IPQ_TIMES_SIZE); 
	    }   
         return getShort(beginSf503MpIpqTimes+ index*SF_503_MP_IPQ_TIMES_LEN);
   }
	
	/**
	 *	Update Sf503MpIpqTimes at index with the passed value
	 *  Corresponding COBOL Variable is SF503-MP-IPQ-TIMES
	 *  @param index
	 *	@param number
	 */
	public void setSf503MpIpqTimes(int index,int number) {
	   truncated = false; // reset left over truncated flag
        number = ((number >  MAX_64K || number <  -MAX_64K ) ? (number & MAX_64K /*truncate*/) : number); // Max value 2^16 allowed for Unsigned short
        number = (number < 0 ? -number : number); // Only positive number allowed   
		setSf503MpIpqTimes(index,number, true);
	}
	
	public void setSf503MpIpqTimes(int index,long number) {
			setSf503MpIpqTimes(index,(int)number, true);
	}
	
	/**
	 *	Update  Sf503MpIpqTimes at index with the passed value and serialize the object if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified
	 */
	private void setSf503MpIpqTimes(int index,int value, boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setSf503MpIpqTimes(int, String, boolean), resetting it to 0",index);
		    index = 0;
        } else if (index >= SF_503_MP_IPQ_TIMES_SIZE) {
             	index = SF_503_MP_IPQ_TIMES_SIZE -1; // can't exceed max array size
             	logger.trace("sf503MpIpqTimes - Array index exceeded max Size "+SF_503_MP_IPQ_TIMES_SIZE+", resetting it to max allowed"); 
	    }
	    //
        //	    
		if (setModified) {
			serializeSf503MpIpqTimes(index,value);
		}
   }

	
	
	

		public static int getSf503MpMipProfileLogFieldLength() {
			return SF_503_MP_MIP_PROFILE_LOG_LENGTH;
		}

}
  
