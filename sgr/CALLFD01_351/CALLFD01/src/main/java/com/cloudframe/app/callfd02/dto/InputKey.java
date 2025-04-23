package com.cloudframe.app.callfd02.dto;

/**
*  The class InputKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/


import com.cloudframe.app.callfd02.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputKey extends InputKeySerialized { 
   

						private char[] ioType = Field.fillLowValue(2);


								private long inputSeq;
	
	/**
	* Constructor for InputKey
	**/
    public InputKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for InputKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InputKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ioType
	 *	@return ioType
	 */
   public char[] getIoType() throws CFException{
     if (isIoTypeModified()) { 
        ioType = refreshIoType();
     }
   		return ioType;
   }

  
	/**
	*  set variable ioType
	*  Corresponding COBOL Variable is LK-IO-TYPE
	*  @param value
	**/
   public void setIoType(char[] value) {
      ioType = checkIoTypeConstraints(value);
      serializeIoType(ioType);
   } 

     /**
	 * 	Update IoType 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIoType(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIoType,ioType.length);
   	
   }
   
   public void setIoType(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIoType,ioType.length);
   	
   }
   
     /**
	 * 	Update IoType 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIoType(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoType+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IoType with another Field
	 *	@param value
	 */
   public void setIoType(Field source) {
       replace(source,0,source.length(),beginIoType,IO_TYPE_LEN);
   	
   }  
   
     /**
	 * 	Update IoType 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIoType(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIoType,IO_TYPE_LEN);
   	
   }
   
     /**
	 * 	Update IoType 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIoType(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIoType+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of inputSeq
	 *	@return inputSeq
	 */
	public long getInputSeq() throws CFException {
       if (isInputSeqModified()) { 
           inputSeq = refreshInputSeq();
        }
   		return inputSeq;
	}
	

	
	   
	/**
	 * 	Update InputSeq with the passed value
	 *  Corresponding COBOL Variable is LK-INPUT-SEQ
	 *	@param number
	 */
	public void setInputSeq(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    inputSeq = checkInputSeqMaxLimit(number); 
		serializeInputSeq(inputSeq);
	}
	

	/**
	 * 	Update InputSeq with the passed value
	 *	@param value (String or char[])
	 */
	public void setInputSeq(char[] value) throws CFException {
		 inputSeq = serializeInputSeq(value);
	}
	/**
	 * 	Update InputSeq with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInputSeqString(char[] value) throws CFException {
		 setInputSeq(value);
	}

	
	
	

		public static int getInputKeyFieldLength() {
			return INPUT_KEY_LENGTH;
		}

}
  
