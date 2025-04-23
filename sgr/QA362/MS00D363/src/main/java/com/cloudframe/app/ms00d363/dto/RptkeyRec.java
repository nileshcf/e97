package com.cloudframe.app.ms00d363.dto;

/**
*  The class RptkeyRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RptkeyRec extends RptkeyRecSerialized {
   

						private char[] rptkeyId = Field.fillLowValue(3);

						private char[] rptkeyDesc = Field.fillLowValue(18);
	
	/**
	* Constructor for RptkeyRec
	**/
    public RptkeyRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rptkeyId
	 *	@return rptkeyId
	 */
   public char[] getRptkeyId() throws CFException{
     if (isRptkeyIdModified()) { 
        rptkeyId = refreshRptkeyId();
     }
   		return rptkeyId;
   }

  
	/**
	*  set variable rptkeyId
	*  Corresponding COBOL Variable is WS-RPTKEY-ID
	*  @param value
	**/
   public void setRptkeyId(char[] value) {
      rptkeyId = checkRptkeyIdConstraints(value);
      serializeRptkeyId(rptkeyId);
   } 

     /**
	 * 	Update RptkeyId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRptkeyId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRptkeyId,rptkeyId.length);
   	
   }
   
   public void setRptkeyId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyId,rptkeyId.length);
   	
   }
   
     /**
	 * 	Update RptkeyId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRptkeyId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RptkeyId with another Field
	 *	@param value
	 */
   public void setRptkeyId(Field source) {
       replace(source,0,source.length(),beginRptkeyId,RPTKEY_ID_LEN);
   	
   }  
   
     /**
	 * 	Update RptkeyId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRptkeyId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRptkeyId,RPTKEY_ID_LEN);
   	
   }
   
     /**
	 * 	Update RptkeyId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRptkeyId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of rptkeyDesc
	 *	@return rptkeyDesc
	 */
   public char[] getRptkeyDesc() throws CFException{
     if (isRptkeyDescModified()) { 
        rptkeyDesc = refreshRptkeyDesc();
     }
   		return rptkeyDesc;
   }

  
	/**
	*  set variable rptkeyDesc
	*  Corresponding COBOL Variable is WS-RPTKEY-DESC
	*  @param value
	**/
   public void setRptkeyDesc(char[] value) {
      rptkeyDesc = checkRptkeyDescConstraints(value);
      serializeRptkeyDesc(rptkeyDesc);
   } 

     /**
	 * 	Update RptkeyDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRptkeyDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRptkeyDesc,rptkeyDesc.length);
   	
   }
   
   public void setRptkeyDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyDesc,rptkeyDesc.length);
   	
   }
   
     /**
	 * 	Update RptkeyDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRptkeyDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RptkeyDesc with another Field
	 *	@param value
	 */
   public void setRptkeyDesc(Field source) {
       replace(source,0,source.length(),beginRptkeyDesc,RPTKEY_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update RptkeyDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRptkeyDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRptkeyDesc,RPTKEY_DESC_LEN);
   	
   }
   
     /**
	 * 	Update RptkeyDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRptkeyDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRptkeyDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRptkeyRecFieldLength() {
			return RPTKEY_REC_LENGTH;
		}

}
  
