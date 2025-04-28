package com.cloudframe.app.ip809050.dto;

/**
*  The class ReadParserErrMsgTxt600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ReadParserErrMsgTxt600 extends ReadParserErrMsgTxt600Serialized { 
   

						private char[] readParserMsgDtl600 = new char[47];


						private char[] readParserReturnCode600 = new char[4];
	
	/**
	* Constructor for ReadParserErrMsgTxt600
	**/
    public ReadParserErrMsgTxt600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setReadParserMsgDtl600(fillSpace(47));
       replaceValue( // serialize and save the value
             ("RETURN CODE:  ").toCharArray()
             , getStartOffset() + 47
             ,14
             );
								setReadParserReturnCode600(fillSpace(4));
    }


 

	/**
	 *	Returns the value of readParserMsgDtl600
	 *	@return readParserMsgDtl600
	 */
   public char[] getReadParserMsgDtl600() throws CFException{
     if (isReadParserMsgDtl600Modified()) { 
        readParserMsgDtl600 = refreshReadParserMsgDtl600();
     }
   		return readParserMsgDtl600;
   }

  
	/**
	*  set variable readParserMsgDtl600
	*  Corresponding COBOL Variable is 600-READ-PARSER-MSG-DTL
	*  @param value
	**/
   public void setReadParserMsgDtl600(char[] value) {
      readParserMsgDtl600 = checkReadParserMsgDtl600Constraints(value);
      serializeReadParserMsgDtl600(readParserMsgDtl600);
   } 

     /**
	 * 	Update ReadParserMsgDtl600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReadParserMsgDtl600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReadParserMsgDtl600,readParserMsgDtl600.length);
   	
   }
   
   public void setReadParserMsgDtl600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReadParserMsgDtl600,readParserMsgDtl600.length);
   	
   }
   
     /**
	 * 	Update ReadParserMsgDtl600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadParserMsgDtl600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReadParserMsgDtl600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReadParserMsgDtl600 with another Field
	 *	@param value
	 */
   public void setReadParserMsgDtl600(Field source) {
       replace(source,0,source.length(),beginReadParserMsgDtl600,READ_PARSER_MSG_DTL_600_LEN);
   	
   }  
   
     /**
	 * 	Update ReadParserMsgDtl600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReadParserMsgDtl600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReadParserMsgDtl600,READ_PARSER_MSG_DTL_600_LEN);
   	
   }
   
     /**
	 * 	Update ReadParserMsgDtl600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadParserMsgDtl600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReadParserMsgDtl600+targetIndex,targetLen);
    
   }
	char[] readParserErrTxt8860088Value = "ERROR IN PARSING IPM MESSAGE USING READ PARSER ".toCharArray();
	/**
	 *	Test condition "ERROR IN PARSING IPM MESSAGE USING READ PARSER" for isReadParserErrTxt88600()
	 *	@return  Returns true if isReadParserErrTxt88600() is "ERROR IN PARSING IPM MESSAGE USING READ PARSER"
	 */
   public boolean isReadParserErrTxt88600() throws CFException {
      return (  compareChars( getReadParserMsgDtl600() , readParserErrTxt8860088Value)  == 0  );
   }


	/**
	*  set values "ERROR IN PARSING IPM MESSAGE USING READ PARSER"
	*/
   	public void setReadParserErrTxt88600True() {  			
    	setReadParserMsgDtl600( readParserErrTxt8860088Value);
   	}
	/**
	 *	Returns the value of readParserReturnCode600
	 *	@return readParserReturnCode600
	 */
   public char[] getReadParserReturnCode600() throws CFException{
     if (isReadParserReturnCode600Modified()) { 
        readParserReturnCode600 = refreshReadParserReturnCode600();
     }
   		return readParserReturnCode600;
   }

  
	/**
	*  set variable readParserReturnCode600
	*  Corresponding COBOL Variable is 600-READ-PARSER-RETURN-CODE
	*  @param value
	**/
   public void setReadParserReturnCode600(char[] value) {
      readParserReturnCode600 = checkReadParserReturnCode600Constraints(value);
      serializeReadParserReturnCode600(readParserReturnCode600);
   } 

     /**
	 * 	Update ReadParserReturnCode600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReadParserReturnCode600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReadParserReturnCode600,readParserReturnCode600.length);
   	
   }
   
   public void setReadParserReturnCode600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReadParserReturnCode600,readParserReturnCode600.length);
   	
   }
   
     /**
	 * 	Update ReadParserReturnCode600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReadParserReturnCode600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReadParserReturnCode600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReadParserReturnCode600 with another Field
	 *	@param value
	 */
   public void setReadParserReturnCode600(Field source) {
       replace(source,0,source.length(),beginReadParserReturnCode600,READ_PARSER_RETURN_CODE_600_LEN);
   	
   }  
   
     /**
	 * 	Update ReadParserReturnCode600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReadParserReturnCode600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReadParserReturnCode600,READ_PARSER_RETURN_CODE_600_LEN);
   	
   }
   
     /**
	 * 	Update ReadParserReturnCode600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReadParserReturnCode600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReadParserReturnCode600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getReadParserErrMsgTxt600FieldLength() {
			return READ_PARSER_ERR_MSG_TXT_600_LENGTH;
		}

}
  
