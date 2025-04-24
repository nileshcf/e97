package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC7Heading4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC7Heading4 extends RpC7Heading4Serialized { 
   



						private char[] rpC7H4MipId = Field.fillLowValue(3);


						private char[] rpC7H4DtStamp = Field.fillLowValue(8);
	
	/**
	* Constructor for RpC7Heading4
	**/
    public RpC7Heading4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0").toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             ("  MIP IDENTIFICATION -  ").toCharArray()
             , getStartOffset() + 1
             ,24
             );
       replaceValue( // serialize and save the value
             ("         JULIAN DATE -  ").toCharArray()
             , getStartOffset() + 28
             ,24
             );
    }


 

	/**
	 *	Returns the value of rpC7H4MipId
	 *	@return rpC7H4MipId
	 */
   public char[] getRpC7H4MipId() throws CFException{
     if (isRpC7H4MipIdModified()) { 
        rpC7H4MipId = refreshRpC7H4MipId();
     }
   		return rpC7H4MipId;
   }

  
	/**
	*  set variable rpC7H4MipId
	*  Corresponding COBOL Variable is RP-C7-H4-MIP-ID
	*  @param value
	**/
   public void setRpC7H4MipId(char[] value) {
      rpC7H4MipId = checkRpC7H4MipIdConstraints(value);
      serializeRpC7H4MipId(rpC7H4MipId);
   } 

     /**
	 * 	Update RpC7H4MipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7H4MipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7H4MipId,rpC7H4MipId.length);
   	
   }
   
   public void setRpC7H4MipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H4MipId,rpC7H4MipId.length);
   	
   }
   
     /**
	 * 	Update RpC7H4MipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7H4MipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H4MipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7H4MipId with another Field
	 *	@param value
	 */
   public void setRpC7H4MipId(Field source) {
       replace(source,0,source.length(),beginRpC7H4MipId,RP_C_7_H_4_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7H4MipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7H4MipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7H4MipId,RP_C_7_H_4_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpC7H4MipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7H4MipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H4MipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC7H4DtStamp
	 *	@return rpC7H4DtStamp
	 */
   public char[] getRpC7H4DtStamp() throws CFException{
     if (isRpC7H4DtStampModified()) { 
        rpC7H4DtStamp = refreshRpC7H4DtStamp();
     }
   		return rpC7H4DtStamp;
   }

  
	/**
	*  set variable rpC7H4DtStamp
	*  Corresponding COBOL Variable is RP-C7-H4-DT-STAMP
	*  @param value
	**/
   public void setRpC7H4DtStamp(char[] value) {
      rpC7H4DtStamp = checkRpC7H4DtStampConstraints(value);
      serializeRpC7H4DtStamp(rpC7H4DtStamp);
   } 

     /**
	 * 	Update RpC7H4DtStamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC7H4DtStamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC7H4DtStamp,rpC7H4DtStamp.length);
   	
   }
   
   public void setRpC7H4DtStamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H4DtStamp,rpC7H4DtStamp.length);
   	
   }
   
     /**
	 * 	Update RpC7H4DtStamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC7H4DtStamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H4DtStamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC7H4DtStamp with another Field
	 *	@param value
	 */
   public void setRpC7H4DtStamp(Field source) {
       replace(source,0,source.length(),beginRpC7H4DtStamp,RP_C_7_H_4_DT_STAMP_LEN);
   	
   }  
   
     /**
	 * 	Update RpC7H4DtStamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC7H4DtStamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC7H4DtStamp,RP_C_7_H_4_DT_STAMP_LEN);
   	
   }
   
     /**
	 * 	Update RpC7H4DtStamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC7H4DtStamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC7H4DtStamp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC7Heading4FieldLength() {
			return RP_C_7_HEADING_4_LENGTH;
		}

}
  
