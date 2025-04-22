package com.cloudframe.app.refmod2.dto;

/**
*  The class AS21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AS21 extends AS21Serialized {
   

						private char[] aSFld121 = Field.fillLowValue(30);

						private char[] aSFld221 = Field.fillLowValue(40);
	
	/**
	* Constructor for AS21
	**/
    public AS21() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aSFld121
	 *	@return aSFld121
	 */
   public char[] getASFld121() throws CFException{
     if (isASFld121Modified()) { 
        aSFld121 = refreshASFld121();
     }
   		return aSFld121;
   }

  
	/**
	*  set variable aSFld121
	*  Corresponding COBOL Variable is WS-2-1A-S-FLD1
	*  @param value
	**/
   public void setASFld121(char[] value) {
      aSFld121 = checkASFld121Constraints(value);
      serializeASFld121(aSFld121);
   } 

     /**
	 * 	Update ASFld121 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld121(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld121,aSFld121.length);
   	
   }
   
   public void setASFld121(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld121,aSFld121.length);
   	
   }
   
     /**
	 * 	Update ASFld121 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld121(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld121+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld121 with another Field
	 *	@param value
	 */
   public void setASFld121(Field source) {
       replace(source,0,source.length(),beginASFld121,A_SFLD_121_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld121 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld121(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld121,A_SFLD_121_LEN);
   	
   }
   
     /**
	 * 	Update ASFld121 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld121(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld121+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aSFld221
	 *	@return aSFld221
	 */
   public char[] getASFld221() throws CFException{
     if (isASFld221Modified()) { 
        aSFld221 = refreshASFld221();
     }
   		return aSFld221;
   }

  
	/**
	*  set variable aSFld221
	*  Corresponding COBOL Variable is WS-2-1A-S-FLD2
	*  @param value
	**/
   public void setASFld221(char[] value) {
      aSFld221 = checkASFld221Constraints(value);
      serializeASFld221(aSFld221);
   } 

     /**
	 * 	Update ASFld221 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setASFld221(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginASFld221,aSFld221.length);
   	
   }
   
   public void setASFld221(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginASFld221,aSFld221.length);
   	
   }
   
     /**
	 * 	Update ASFld221 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setASFld221(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld221+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ASFld221 with another Field
	 *	@param value
	 */
   public void setASFld221(Field source) {
       replace(source,0,source.length(),beginASFld221,A_SFLD_221_LEN);
   	
   }  
   
     /**
	 * 	Update ASFld221 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setASFld221(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginASFld221,A_SFLD_221_LEN);
   	
   }
   
     /**
	 * 	Update ASFld221 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setASFld221(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginASFld221+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AS21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setASFld121(CONSTANTS.SPACE_30);
         setASFld221(CONSTANTS.SPACE_40);
   }

		public static int getAS21FieldLength() {
			return A_S_21_LENGTH;
		}

}
  
