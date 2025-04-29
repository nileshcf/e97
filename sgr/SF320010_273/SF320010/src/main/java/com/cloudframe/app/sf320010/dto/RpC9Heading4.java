package com.cloudframe.app.sf320010.dto;

/**
*  The class RpC9Heading4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RpC9Heading4 extends RpC9Heading4Serialized {
   



						private char[] rpC9H4MipId = Field.fillLowValue(3);


						private char[] rpC9H4DtStamp = Field.fillLowValue(8);
	
	/**
	* Constructor for RpC9Heading4
	**/
    public RpC9Heading4() {
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
	 *	Returns the value of rpC9H4MipId
	 *	@return rpC9H4MipId
	 */
   public char[] getRpC9H4MipId() throws CFException{
     if (isRpC9H4MipIdModified()) { 
        rpC9H4MipId = refreshRpC9H4MipId();
     }
   		return rpC9H4MipId;
   }

  
	/**
	*  set variable rpC9H4MipId
	*  Corresponding COBOL Variable is RP-C9-H4-MIP-ID
	*  @param value
	**/
   public void setRpC9H4MipId(char[] value) {
      rpC9H4MipId = checkRpC9H4MipIdConstraints(value);
      serializeRpC9H4MipId(rpC9H4MipId);
   } 

     /**
	 * 	Update RpC9H4MipId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9H4MipId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9H4MipId,rpC9H4MipId.length);
   	
   }
   
   public void setRpC9H4MipId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H4MipId,rpC9H4MipId.length);
   	
   }
   
     /**
	 * 	Update RpC9H4MipId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9H4MipId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H4MipId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9H4MipId with another Field
	 *	@param value
	 */
   public void setRpC9H4MipId(Field source) {
       replace(source,0,source.length(),beginRpC9H4MipId,RP_C_9_H_4_MIP_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9H4MipId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9H4MipId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9H4MipId,RP_C_9_H_4_MIP_ID_LEN);
   	
   }
   
     /**
	 * 	Update RpC9H4MipId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9H4MipId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H4MipId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rpC9H4DtStamp
	 *	@return rpC9H4DtStamp
	 */
   public char[] getRpC9H4DtStamp() throws CFException{
     if (isRpC9H4DtStampModified()) { 
        rpC9H4DtStamp = refreshRpC9H4DtStamp();
     }
   		return rpC9H4DtStamp;
   }

  
	/**
	*  set variable rpC9H4DtStamp
	*  Corresponding COBOL Variable is RP-C9-H4-DT-STAMP
	*  @param value
	**/
   public void setRpC9H4DtStamp(char[] value) {
      rpC9H4DtStamp = checkRpC9H4DtStampConstraints(value);
      serializeRpC9H4DtStamp(rpC9H4DtStamp);
   } 

     /**
	 * 	Update RpC9H4DtStamp 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRpC9H4DtStamp(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRpC9H4DtStamp,rpC9H4DtStamp.length);
   	
   }
   
   public void setRpC9H4DtStamp(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H4DtStamp,rpC9H4DtStamp.length);
   	
   }
   
     /**
	 * 	Update RpC9H4DtStamp 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRpC9H4DtStamp(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H4DtStamp+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RpC9H4DtStamp with another Field
	 *	@param value
	 */
   public void setRpC9H4DtStamp(Field source) {
       replace(source,0,source.length(),beginRpC9H4DtStamp,RP_C_9_H_4_DT_STAMP_LEN);
   	
   }  
   
     /**
	 * 	Update RpC9H4DtStamp 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRpC9H4DtStamp(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRpC9H4DtStamp,RP_C_9_H_4_DT_STAMP_LEN);
   	
   }
   
     /**
	 * 	Update RpC9H4DtStamp 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRpC9H4DtStamp(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRpC9H4DtStamp+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRpC9Heading4FieldLength() {
			return RP_C_9_HEADING_4_LENGTH;
		}

}
  
