package com.cloudframe.app.sf311010.dto;

/**
*  The class A01PassedParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:23. using version 5.0.0.257
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class A01PassedParm extends A01PassedParmSerialized {
   

								private short a01PassedParmLength;

						private char[] a01PassedCycleId = Field.fillLowValue(1);

						private char[] a01PassedVoiceIca = Field.fillLowValue(6);
	
	/**
	* Constructor for A01PassedParm
	**/
    public A01PassedParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of a01PassedParmLength
	 *	@return a01PassedParmLength
	 */
	public short getA01PassedParmLength() throws CFException {
        if (isA01PassedParmLengthModified()) { 
           a01PassedParmLength = refreshA01PassedParmLength();
        }
   		return a01PassedParmLength;
	}
	
	/**
	 * 	Update A01PassedParmLength with the passed value
	 *  Corresponding COBOL Variable is A01-PASSED-PARM-LENGTH
	 *	@param number
	 */
	public void setA01PassedParmLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    a01PassedParmLength = checkA01PassedParmLengthMaxLimit(number); 
		serializeA01PassedParmLength(a01PassedParmLength);
	}

	public void setA01PassedParmLength(int number) {
	    number = checkA01PassedParmLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setA01PassedParmLength((short)number);
	}
	public void setA01PassedParmLength(long number) {
	    number = checkA01PassedParmLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setA01PassedParmLength((short)number);
	}
	

	/**
	 *	Returns the value of a01PassedCycleId
	 *	@return a01PassedCycleId
	 */
   public char[] getA01PassedCycleId() throws CFException{
     if (isA01PassedCycleIdModified()) { 
        a01PassedCycleId = refreshA01PassedCycleId();
     }
   		return a01PassedCycleId;
   }

  
	/**
	*  set variable a01PassedCycleId
	*  Corresponding COBOL Variable is A01-PASSED-CYCLE-ID
	*  @param value
	**/
   public void setA01PassedCycleId(char[] value) {
      a01PassedCycleId = checkA01PassedCycleIdConstraints(value);
      serializeA01PassedCycleId(a01PassedCycleId);
   } 

     /**
	 * 	Update A01PassedCycleId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setA01PassedCycleId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginA01PassedCycleId,a01PassedCycleId.length);
   	
   }
   
   public void setA01PassedCycleId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginA01PassedCycleId,a01PassedCycleId.length);
   	
   }
   
     /**
	 * 	Update A01PassedCycleId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setA01PassedCycleId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginA01PassedCycleId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update A01PassedCycleId with another Field
	 *	@param value
	 */
   public void setA01PassedCycleId(Field source) {
       replace(source,0,source.length(),beginA01PassedCycleId,A_01_PASSED_CYCLE_ID_LEN);
   	
   }  
   
     /**
	 * 	Update A01PassedCycleId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setA01PassedCycleId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginA01PassedCycleId,A_01_PASSED_CYCLE_ID_LEN);
   	
   }
   
     /**
	 * 	Update A01PassedCycleId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setA01PassedCycleId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginA01PassedCycleId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of a01PassedVoiceIca
	 *	@return a01PassedVoiceIca
	 */
   public char[] getA01PassedVoiceIca() throws CFException{
     if (isA01PassedVoiceIcaModified()) { 
        a01PassedVoiceIca = refreshA01PassedVoiceIca();
     }
   		return a01PassedVoiceIca;
   }

  
	/**
	*  set variable a01PassedVoiceIca
	*  Corresponding COBOL Variable is A01-PASSED-VOICE-ICA
	*  @param value
	**/
   public void setA01PassedVoiceIca(char[] value) {
      a01PassedVoiceIca = checkA01PassedVoiceIcaConstraints(value);
      serializeA01PassedVoiceIca(a01PassedVoiceIca);
   } 

     /**
	 * 	Update A01PassedVoiceIca 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setA01PassedVoiceIca(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginA01PassedVoiceIca,a01PassedVoiceIca.length);
   	
   }
   
   public void setA01PassedVoiceIca(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginA01PassedVoiceIca,a01PassedVoiceIca.length);
   	
   }
   
     /**
	 * 	Update A01PassedVoiceIca 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setA01PassedVoiceIca(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginA01PassedVoiceIca+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update A01PassedVoiceIca with another Field
	 *	@param value
	 */
   public void setA01PassedVoiceIca(Field source) {
       replace(source,0,source.length(),beginA01PassedVoiceIca,A_01_PASSED_VOICE_ICA_LEN);
   	
   }  
   
     /**
	 * 	Update A01PassedVoiceIca 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setA01PassedVoiceIca(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginA01PassedVoiceIca,A_01_PASSED_VOICE_ICA_LEN);
   	
   }
   
     /**
	 * 	Update A01PassedVoiceIca 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setA01PassedVoiceIca(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginA01PassedVoiceIca+targetIndex,targetLen);
    
   }

	
	
	

		public static int getA01PassedParmFieldLength() {
			return A_01_PASSED_PARM_LENGTH;
		}

}
  
