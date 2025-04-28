package com.cloudframe.app.ip662010.dto;

/**
*  The class BadRecLngth600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/


import com.cloudframe.app.ip662010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BadRecLngth600 extends BadRecLngth600Serialized { 
   


								private char[] parsedLngth600 = Field.fillLowValue(6);


								private char[] rdwLngth600 = Field.fillLowValue(6);

	
	/**
	* Constructor for BadRecLngth600
	**/
    public BadRecLngth600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PARSED MSG LENGTH ( ").toCharArray()
             , getStartOffset() + 0
             ,20
             );
       replaceValue( // serialize and save the value
             (") NOT EQUAL TO RECORD LENGTH (").toCharArray()
             , getStartOffset() + 26
             ,30
             );
       replaceValue( // serialize and save the value
             (").").toCharArray()
             , getStartOffset() + 62
             ,2
             );
    }


 

	/**
	 *	Returns the value of parsedLngth600
	 *	@return parsedLngth600
	 */
   public char[] getParsedLngth600() throws CFException{
     if (isParsedLngth600Modified()) { 
        parsedLngth600 = refreshParsedLngth600();
     }
   		return parsedLngth600;
   }

  
	/**
	*  set variable parsedLngth600
	*  Corresponding COBOL Variable is 600-PARSED-LNGTH
	*  @param value
	**/
   public void setParsedLngth600(char[] value) {
      parsedLngth600 = checkParsedLngth600Constraints(value);
      serializeParsedLngth600(parsedLngth600);
   } 

     /**
	 * 	Update ParsedLngth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParsedLngth600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParsedLngth600,parsedLngth600.length);
   	
   }
   
   public void setParsedLngth600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParsedLngth600,parsedLngth600.length);
   	
   }
   
     /**
	 * 	Update ParsedLngth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParsedLngth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParsedLngth600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParsedLngth600 with another Field
	 *	@param value
	 */
   public void setParsedLngth600(Field source) {
       replace(source,0,source.length(),beginParsedLngth600,PARSED_LNGTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update ParsedLngth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParsedLngth600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParsedLngth600,PARSED_LNGTH_600_LEN);
   	
   }
   
     /**
	 * 	Update ParsedLngth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParsedLngth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParsedLngth600+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rdwLngth600
	 *	@return rdwLngth600
	 */
   public char[] getRdwLngth600() throws CFException{
     if (isRdwLngth600Modified()) { 
        rdwLngth600 = refreshRdwLngth600();
     }
   		return rdwLngth600;
   }

  
	/**
	*  set variable rdwLngth600
	*  Corresponding COBOL Variable is 600-RDW-LNGTH
	*  @param value
	**/
   public void setRdwLngth600(char[] value) {
      rdwLngth600 = checkRdwLngth600Constraints(value);
      serializeRdwLngth600(rdwLngth600);
   } 

     /**
	 * 	Update RdwLngth600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRdwLngth600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRdwLngth600,rdwLngth600.length);
   	
   }
   
   public void setRdwLngth600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRdwLngth600,rdwLngth600.length);
   	
   }
   
     /**
	 * 	Update RdwLngth600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRdwLngth600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRdwLngth600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RdwLngth600 with another Field
	 *	@param value
	 */
   public void setRdwLngth600(Field source) {
       replace(source,0,source.length(),beginRdwLngth600,RDW_LNGTH_600_LEN);
   	
   }  
   
     /**
	 * 	Update RdwLngth600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRdwLngth600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRdwLngth600,RDW_LNGTH_600_LEN);
   	
   }
   
     /**
	 * 	Update RdwLngth600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRdwLngth600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRdwLngth600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getBadRecLngth600FieldLength() {
			return BAD_REC_LNGTH_600_LENGTH;
		}

}
  
