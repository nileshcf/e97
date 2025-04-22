package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip66601UserTagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:06. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip66601UserTagId extends Ip66601UserTagIdSerialized { 
   
				private Ip66601UserElementId ip66601UserElementId = new Ip66601UserElementId();

								private short ip66601UserTagOccurrence;

								private short ip66601UserTagSubfldNo;
	
	/**
	* Constructor for Ip66601UserTagId
	**/
    public Ip66601UserTagId() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip66601UserTagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip66601UserElementId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip66601UserElementId
	 *	@return ip66601UserElementId
	 */   
	 public Ip66601UserElementId getIp66601UserElementId() {
   	return ip66601UserElementId;
   }
   /**
	* 	Update Ip66601UserElementId with the passed value
	*   Corresponding COBOL Variable is IP66601-USER-ELEMENT-ID
	*	@param value
	*/
   public void setIp66601UserElementId(char[] value) {
      ip66601UserElementId.setString(value); 
   }   
    
     /**
	 * 	Update Ip66601UserElementId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserElementId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserElementId.begin,ip66601UserElementId.length());
   }
   
     /**
	 * 	Update Ip66601UserElementId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserElementId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserElementId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip66601UserElementId with another Field
	 *	@param value
	 */
   public void setIp66601UserElementId(Field source) {
   	replace(source,0,source.length(),ip66601UserElementId.begin,ip66601UserElementId.length());
   }  
   
     /**
	 * 	Update Ip66601UserElementId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp66601UserElementId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserElementId.begin,ip66601UserElementId.length());
   }
   
     /**
	 * 	Update Ip66601UserElementId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp66601UserElementId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip66601UserElementId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip66601UserTagOccurrence
	 *	@return ip66601UserTagOccurrence
	 */
	public short getIp66601UserTagOccurrence() throws CFException {
        if (isIp66601UserTagOccurrenceModified()) { 
           ip66601UserTagOccurrence = refreshIp66601UserTagOccurrence();
        }
   		return ip66601UserTagOccurrence;
	}
	
	/**
	 * 	Update Ip66601UserTagOccurrence with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG-OCCURRENCE
	 *	@param number
	 */
	public void setIp66601UserTagOccurrence(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagOccurrence = checkIp66601UserTagOccurrenceMaxLimit(number); 
		serializeIp66601UserTagOccurrence(ip66601UserTagOccurrence);
	}

	public void setIp66601UserTagOccurrence(int number) {
	    number = checkIp66601UserTagOccurrenceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagOccurrence((short)number);
	}
	public void setIp66601UserTagOccurrence(long number) {
	    number = checkIp66601UserTagOccurrenceMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagOccurrence((short)number);
	}
	

	/**
	 *	Returns the value of ip66601UserTagSubfldNo
	 *	@return ip66601UserTagSubfldNo
	 */
	public short getIp66601UserTagSubfldNo() throws CFException {
        if (isIp66601UserTagSubfldNoModified()) { 
           ip66601UserTagSubfldNo = refreshIp66601UserTagSubfldNo();
        }
   		return ip66601UserTagSubfldNo;
	}
	
	/**
	 * 	Update Ip66601UserTagSubfldNo with the passed value
	 *  Corresponding COBOL Variable is IP66601-USER-TAG-SUBFLD-NO
	 *	@param number
	 */
	public void setIp66601UserTagSubfldNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip66601UserTagSubfldNo = checkIp66601UserTagSubfldNoMaxLimit(number); 
		serializeIp66601UserTagSubfldNo(ip66601UserTagSubfldNo);
	}

	public void setIp66601UserTagSubfldNo(int number) {
	    number = checkIp66601UserTagSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagSubfldNo((short)number);
	}
	public void setIp66601UserTagSubfldNo(long number) {
	    number = checkIp66601UserTagSubfldNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp66601UserTagSubfldNo((short)number);
	}
	


	
	
	
	/**
	 * 	initializes Ip66601UserTagId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip66601UserElementId.initialize();
     
         	setIp66601UserTagOccurrence((short)0);
         	setIp66601UserTagSubfldNo((short)0);
   }

		public static int getIp66601UserTagIdFieldLength() {
			return IP_66601_USER_TAG_ID_LENGTH;
		}

}
  
