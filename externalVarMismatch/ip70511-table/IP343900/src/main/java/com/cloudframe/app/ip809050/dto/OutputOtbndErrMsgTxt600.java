package com.cloudframe.app.ip809050.dto;

/**
*  The class OutputOtbndErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OutputOtbndErrMsgTxt600 extends OutputOtbndErrMsgTxt600Serialized { 
   

						private char[] outputOutboundMsgDtl600 = new char[40];


						private char[] outputOtbndFileStatus600 = new char[2];
	
	/**
	* Constructor for OutputOtbndErrMsgTxt600
	**/
    public OutputOtbndErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setOutputOutboundMsgDtl600(fillSpace(40));
       replaceValue( // serialize and save the value
             (" FILE STATUS :      ").toCharArray()
             , getStartOffset() + 40
             ,20
             );
								setOutputOtbndFileStatus600(fillSpace(2));
    }


 

	/**
	 *	Returns the value of outputOutboundMsgDtl600
	 *	@return outputOutboundMsgDtl600
	 */
   public char[] getOutputOutboundMsgDtl600() throws CFException{
     if (isOutputOutboundMsgDtl600Modified()) { 
        outputOutboundMsgDtl600 = refreshOutputOutboundMsgDtl600();
     }
   		return outputOutboundMsgDtl600;
   }

  
	/**
	*  set variable outputOutboundMsgDtl600
	*  Corresponding COBOL Variable is 600-OUTPUT-OUTBOUND-MSG-DTL
	*  @param value
	**/
   public void setOutputOutboundMsgDtl600(char[] value) {
      outputOutboundMsgDtl600 = checkOutputOutboundMsgDtl600Constraints(value);
      serializeOutputOutboundMsgDtl600(outputOutboundMsgDtl600);
   } 

     /**
	 * 	Update OutputOutboundMsgDtl600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputOutboundMsgDtl600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutputOutboundMsgDtl600,outputOutboundMsgDtl600.length);
   	
   }
   
   public void setOutputOutboundMsgDtl600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutputOutboundMsgDtl600,outputOutboundMsgDtl600.length);
   	
   }
   
     /**
	 * 	Update OutputOutboundMsgDtl600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputOutboundMsgDtl600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputOutboundMsgDtl600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutputOutboundMsgDtl600 with another Field
	 *	@param value
	 */
   public void setOutputOutboundMsgDtl600(Field source) {
       replace(source,0,source.length(),beginOutputOutboundMsgDtl600,OUTPUT_OUTBOUND_MSG_DTL_600_LEN);
   	
   }  
   
     /**
	 * 	Update OutputOutboundMsgDtl600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputOutboundMsgDtl600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutputOutboundMsgDtl600,OUTPUT_OUTBOUND_MSG_DTL_600_LEN);
   	
   }
   
     /**
	 * 	Update OutputOutboundMsgDtl600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputOutboundMsgDtl600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputOutboundMsgDtl600+targetIndex,targetLen);
    
   }
	char[] outputOpenErrTxt8860088Value = "ERROR OPENING OUTPUT IPM OUTBOUND FILE  ".toCharArray();
	/**
	 *	Test condition "ERROR OPENING OUTPUT IPM OUTBOUND FILE" for isOutputOpenErrTxt88600()
	 *	@return  Returns true if isOutputOpenErrTxt88600() is "ERROR OPENING OUTPUT IPM OUTBOUND FILE"
	 */
   public boolean isOutputOpenErrTxt88600() throws CFException {
      return (  compareChars( getOutputOutboundMsgDtl600() , outputOpenErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR OPENING OUTPUT IPM OUTBOUND FILE"
	*/
   	public void setOutputOpenErrTxt88600True() {  			
    	setOutputOutboundMsgDtl600( outputOpenErrTxt8860088Value);
   	}
	char[] outputWriteErrTxt8860088Value = "ERROR WRITING OUTPUT IPM OUTBOUND FILE  ".toCharArray();
	/**
	 *	Test condition "ERROR WRITING OUTPUT IPM OUTBOUND FILE" for isOutputWriteErrTxt88600()
	 *	@return  Returns true if isOutputWriteErrTxt88600() is "ERROR WRITING OUTPUT IPM OUTBOUND FILE"
	 */
   public boolean isOutputWriteErrTxt88600() throws CFException {
      return (  compareChars( getOutputOutboundMsgDtl600() , outputWriteErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR WRITING OUTPUT IPM OUTBOUND FILE"
	*/
   	public void setOutputWriteErrTxt88600True() {  			
    	setOutputOutboundMsgDtl600( outputWriteErrTxt8860088Value);
   	}
	char[] outputCloseErrTxt8860088Value = "ERROR CLOSING OUTPUT IPM OUTBOUND FILE  ".toCharArray();
	/**
	 *	Test condition "ERROR CLOSING OUTPUT IPM OUTBOUND FILE" for isOutputCloseErrTxt88600()
	 *	@return  Returns true if isOutputCloseErrTxt88600() is "ERROR CLOSING OUTPUT IPM OUTBOUND FILE"
	 */
   public boolean isOutputCloseErrTxt88600() throws CFException {
      return (  compareChars( getOutputOutboundMsgDtl600() , outputCloseErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR CLOSING OUTPUT IPM OUTBOUND FILE"
	*/
   	public void setOutputCloseErrTxt88600True() {  			
    	setOutputOutboundMsgDtl600( outputCloseErrTxt8860088Value);
   	}
	/**
	 *	Returns the value of outputOtbndFileStatus600
	 *	@return outputOtbndFileStatus600
	 */
   public char[] getOutputOtbndFileStatus600() throws CFException{
     if (isOutputOtbndFileStatus600Modified()) { 
        outputOtbndFileStatus600 = refreshOutputOtbndFileStatus600();
     }
   		return outputOtbndFileStatus600;
   }

  
	/**
	*  set variable outputOtbndFileStatus600
	*  Corresponding COBOL Variable is 600-OUTPUT-OTBND-FILE-STATUS
	*  @param value
	**/
   public void setOutputOtbndFileStatus600(char[] value) {
      outputOtbndFileStatus600 = checkOutputOtbndFileStatus600Constraints(value);
      serializeOutputOtbndFileStatus600(outputOtbndFileStatus600);
   } 

     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOutputOtbndFileStatus600,outputOtbndFileStatus600.length);
   	
   }
   
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOutputOtbndFileStatus600,outputOtbndFileStatus600.length);
   	
   }
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputOtbndFileStatus600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OutputOtbndFileStatus600 with another Field
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source) {
       replace(source,0,source.length(),beginOutputOtbndFileStatus600,OUTPUT_OTBND_FILE_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOutputOtbndFileStatus600,OUTPUT_OTBND_FILE_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update OutputOtbndFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOutputOtbndFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOutputOtbndFileStatus600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOutputOtbndErrMsgTxt600FieldLength() {
			return OUTPUT_OTBND_ERR_MSG_TXT_600_LENGTH;
		}

}
  
