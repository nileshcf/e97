package com.cloudframe.app.ip809050.dto;

/**
*  The class InputOutboundErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class InputOutboundErrMsgTxt600 extends InputOutboundErrMsgTxt600Serialized {
   

						private char[] inputOutboundMsgDtl600 = new char[40];


						private char[] inputOtbndFileStatus600 = new char[2];
	
	/**
	* Constructor for InputOutboundErrMsgTxt600
	**/
    public InputOutboundErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setInputOutboundMsgDtl600(fillSpace(40));
       replaceValue( // serialize and save the value
             (" FILE STATUS : ").toCharArray()
             , getStartOffset() + 40
             ,15
             );
								setInputOtbndFileStatus600(fillSpace(2));
    }


 

	/**
	 *	Returns the value of inputOutboundMsgDtl600
	 *	@return inputOutboundMsgDtl600
	 */
   public char[] getInputOutboundMsgDtl600() throws CFException{
     if (isInputOutboundMsgDtl600Modified()) { 
        inputOutboundMsgDtl600 = refreshInputOutboundMsgDtl600();
     }
   		return inputOutboundMsgDtl600;
   }

  
	/**
	*  set variable inputOutboundMsgDtl600
	*  Corresponding COBOL Variable is 600-INPUT-OUTBOUND-MSG-DTL
	*  @param value
	**/
   public void setInputOutboundMsgDtl600(char[] value) {
      inputOutboundMsgDtl600 = checkInputOutboundMsgDtl600Constraints(value);
      serializeInputOutboundMsgDtl600(inputOutboundMsgDtl600);
   } 

     /**
	 * 	Update InputOutboundMsgDtl600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputOutboundMsgDtl600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputOutboundMsgDtl600,inputOutboundMsgDtl600.length);
   	
   }
   
   public void setInputOutboundMsgDtl600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputOutboundMsgDtl600,inputOutboundMsgDtl600.length);
   	
   }
   
     /**
	 * 	Update InputOutboundMsgDtl600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputOutboundMsgDtl600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputOutboundMsgDtl600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputOutboundMsgDtl600 with another Field
	 *	@param value
	 */
   public void setInputOutboundMsgDtl600(Field source) {
       replace(source,0,source.length(),beginInputOutboundMsgDtl600,INPUT_OUTBOUND_MSG_DTL_600_LEN);
   	
   }  
   
     /**
	 * 	Update InputOutboundMsgDtl600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputOutboundMsgDtl600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputOutboundMsgDtl600,INPUT_OUTBOUND_MSG_DTL_600_LEN);
   	
   }
   
     /**
	 * 	Update InputOutboundMsgDtl600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputOutboundMsgDtl600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputOutboundMsgDtl600+targetIndex,targetLen);
    
   }
	char[] inputFileOpenErrTxt8860088Value = "ERROR OPENING INPUT IPM OUTBOUND FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING INPUT IPM OUTBOUND FILE" for isInputFileOpenErrTxt88600()
	 *	@return  Returns true if isInputFileOpenErrTxt88600() is "ERROR OPENING INPUT IPM OUTBOUND FILE"
	 */
   public boolean isInputFileOpenErrTxt88600() throws CFException {
      return (  compareChars( getInputOutboundMsgDtl600() , inputFileOpenErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING INPUT IPM OUTBOUND FILE"
	*/
   	public void setInputFileOpenErrTxt88600True() {  			
    	setInputOutboundMsgDtl600( inputFileOpenErrTxt8860088Value);
   	}
	char[] inputFileReadErrTxt8860088Value = "ERROR READING INPUT IPM OUTBOUND FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR READING INPUT IPM OUTBOUND FILE" for isInputFileReadErrTxt88600()
	 *	@return  Returns true if isInputFileReadErrTxt88600() is "ERROR READING INPUT IPM OUTBOUND FILE"
	 */
   public boolean isInputFileReadErrTxt88600() throws CFException {
      return (  compareChars( getInputOutboundMsgDtl600() , inputFileReadErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR READING INPUT IPM OUTBOUND FILE"
	*/
   	public void setInputFileReadErrTxt88600True() {  			
    	setInputOutboundMsgDtl600( inputFileReadErrTxt8860088Value);
   	}
	char[] inputFileClosErrTxt8860088Value = "ERROR CLOSING INPUT IPM OUTBOUND FILE   ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING INPUT IPM OUTBOUND FILE" for isInputFileClosErrTxt88600()
	 *	@return  Returns true if isInputFileClosErrTxt88600() is "ERROR CLOSING INPUT IPM OUTBOUND FILE"
	 */
   public boolean isInputFileClosErrTxt88600() throws CFException {
      return (  compareChars( getInputOutboundMsgDtl600() , inputFileClosErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING INPUT IPM OUTBOUND FILE"
	*/
   	public void setInputFileClosErrTxt88600True() {  			
    	setInputOutboundMsgDtl600( inputFileClosErrTxt8860088Value);
   	}
	char[] inputFileEmtyErrTxt8860088Value = "EMPTY UNSCRUBBED IPM OUTBOUND FILE      ".toCharArray();
	/**
	 *	Test condition "EMPTY UNSCRUBBED IPM OUTBOUND FILE" for isInputFileEmtyErrTxt88600()
	 *	@return  Returns true if isInputFileEmtyErrTxt88600() is "EMPTY UNSCRUBBED IPM OUTBOUND FILE"
	 */
   public boolean isInputFileEmtyErrTxt88600() throws CFException {
      return (  compareChars( getInputOutboundMsgDtl600() , inputFileEmtyErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "EMPTY UNSCRUBBED IPM OUTBOUND FILE"
	*/
   	public void setInputFileEmtyErrTxt88600True() {  			
    	setInputOutboundMsgDtl600( inputFileEmtyErrTxt8860088Value);
   	}
	/**
	 *	Returns the value of inputOtbndFileStatus600
	 *	@return inputOtbndFileStatus600
	 */
   public char[] getInputOtbndFileStatus600() throws CFException{
     if (isInputOtbndFileStatus600Modified()) { 
        inputOtbndFileStatus600 = refreshInputOtbndFileStatus600();
     }
   		return inputOtbndFileStatus600;
   }

  
	/**
	*  set variable inputOtbndFileStatus600
	*  Corresponding COBOL Variable is 600-INPUT-OTBND-FILE-STATUS
	*  @param value
	**/
   public void setInputOtbndFileStatus600(char[] value) {
      inputOtbndFileStatus600 = checkInputOtbndFileStatus600Constraints(value);
      serializeInputOtbndFileStatus600(inputOtbndFileStatus600);
   } 

     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInputOtbndFileStatus600,inputOtbndFileStatus600.length);
   	
   }
   
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInputOtbndFileStatus600,inputOtbndFileStatus600.length);
   	
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputOtbndFileStatus600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source) {
       replace(source,0,source.length(),beginInputOtbndFileStatus600,INPUT_OTBND_FILE_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInputOtbndFileStatus600,INPUT_OTBND_FILE_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update InputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInputOtbndFileStatus600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getInputOutboundErrMsgTxt600FieldLength() {
			return INPUT_OUTBOUND_ERR_MSG_TXT_600_LENGTH;
		}

}
  
