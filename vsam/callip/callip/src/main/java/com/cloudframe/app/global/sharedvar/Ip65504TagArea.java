package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504TagArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip65504TagArea extends Ip65504TagAreaSerialized { 
   
				private Ip65504TagId ip65504TagId = new Ip65504TagId();

								private short ip65504TagSubFldNo;

								private short ip65504TagStarts;

								private short ip65504TagLngth;

						private char[] ip65504TagStatus = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip65504TagArea
	**/
    public Ip65504TagArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip65504TagArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504TagArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip65504TagId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip65504TagId
	 *	@return ip65504TagId
	 */   
	 public Ip65504TagId getIp65504TagId() {
   	return ip65504TagId;
   }
   /**
	* 	Update Ip65504TagId with the passed value
	*   Corresponding COBOL Variable is IP65504-TAG-ID
	*	@param value
	*/
   public void setIp65504TagId(char[] value) {
      ip65504TagId.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504TagId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504TagId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504TagId.begin,ip65504TagId.length());
   }
   
     /**
	 * 	Update Ip65504TagId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504TagId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504TagId with another Field
	 *	@param value
	 */
   public void setIp65504TagId(Field source) {
   	replace(source,0,source.length(),ip65504TagId.begin,ip65504TagId.length());
   }  
   
     /**
	 * 	Update Ip65504TagId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504TagId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504TagId.begin,ip65504TagId.length());
   }
   
     /**
	 * 	Update Ip65504TagId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504TagId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504TagSubFldNo
	 *	@return ip65504TagSubFldNo
	 */
	public short getIp65504TagSubFldNo() throws CFException {
        if (isIp65504TagSubFldNoModified()) { 
           ip65504TagSubFldNo = refreshIp65504TagSubFldNo();
        }
   		return ip65504TagSubFldNo;
	}
	
	/**
	 * 	Update Ip65504TagSubFldNo with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-SUB-FLD-NO
	 *	@param number
	 */
	public void setIp65504TagSubFldNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504TagSubFldNo = checkIp65504TagSubFldNoMaxLimit(number); 
		serializeIp65504TagSubFldNo(ip65504TagSubFldNo);
	}

	public void setIp65504TagSubFldNo(int number) {
	    number = checkIp65504TagSubFldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagSubFldNo((short)number);
	}
	public void setIp65504TagSubFldNo(long number) {
	    number = checkIp65504TagSubFldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagSubFldNo((short)number);
	}
	

	/**
	 *	Returns the value of ip65504TagStarts
	 *	@return ip65504TagStarts
	 */
	public short getIp65504TagStarts() throws CFException {
        if (isIp65504TagStartsModified()) { 
           ip65504TagStarts = refreshIp65504TagStarts();
        }
   		return ip65504TagStarts;
	}
	
	/**
	 * 	Update Ip65504TagStarts with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-STARTS
	 *	@param number
	 */
	public void setIp65504TagStarts(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504TagStarts = checkIp65504TagStartsMaxLimit(number); 
		serializeIp65504TagStarts(ip65504TagStarts);
	}

	public void setIp65504TagStarts(int number) {
	    number = checkIp65504TagStartsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagStarts((short)number);
	}
	public void setIp65504TagStarts(long number) {
	    number = checkIp65504TagStartsMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagStarts((short)number);
	}
	

	/**
	 *	Returns the value of ip65504TagLngth
	 *	@return ip65504TagLngth
	 */
	public short getIp65504TagLngth() throws CFException {
        if (isIp65504TagLngthModified()) { 
           ip65504TagLngth = refreshIp65504TagLngth();
        }
   		return ip65504TagLngth;
	}
	
	/**
	 * 	Update Ip65504TagLngth with the passed value
	 *  Corresponding COBOL Variable is IP65504-TAG-LNGTH
	 *	@param number
	 */
	public void setIp65504TagLngth(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip65504TagLngth = checkIp65504TagLngthMaxLimit(number); 
		serializeIp65504TagLngth(ip65504TagLngth);
	}

	public void setIp65504TagLngth(int number) {
	    number = checkIp65504TagLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagLngth((short)number);
	}
	public void setIp65504TagLngth(long number) {
	    number = checkIp65504TagLngthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp65504TagLngth((short)number);
	}
	

	/**
	 *	Returns the value of ip65504TagStatus
	 *	@return ip65504TagStatus
	 */
   public char[] getIp65504TagStatus() throws CFException{
     if (isIp65504TagStatusModified()) { 
        ip65504TagStatus = refreshIp65504TagStatus();
     }
   		return ip65504TagStatus;
   }

  
	/**
	*  set variable ip65504TagStatus
	*  Corresponding COBOL Variable is IP65504-TAG-STATUS
	*  @param value
	**/
   public void setIp65504TagStatus(char[] value) {
      ip65504TagStatus = checkIp65504TagStatusConstraints(value);
      serializeIp65504TagStatus(ip65504TagStatus);
   } 

     /**
	 * 	Update Ip65504TagStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp65504TagStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp65504TagStatus,ip65504TagStatus.length);
   	
   }
   
   public void setIp65504TagStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp65504TagStatus,ip65504TagStatus.length);
   	
   }
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp65504TagStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip65504TagStatus with another Field
	 *	@param value
	 */
   public void setIp65504TagStatus(Field source) {
       replace(source,0,source.length(),beginIp65504TagStatus,IP_65504_TAG_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp65504TagStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp65504TagStatus,IP_65504_TAG_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Ip65504TagStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504TagStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp65504TagStatus+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip65504TagArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip65504TagId.initialize();
     
         	setIp65504TagSubFldNo((short)0);
         	setIp65504TagStarts((short)0);
         	setIp65504TagLngth((short)0);
         setIp65504TagStatus(CONSTANTS.SPACE);
   }

		public static int getIp65504TagAreaFieldLength() {
			return IP_65504_TAG_AREA_LENGTH;
		}

}
  
