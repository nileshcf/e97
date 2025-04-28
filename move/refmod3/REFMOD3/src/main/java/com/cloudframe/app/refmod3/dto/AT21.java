package com.cloudframe.app.refmod3.dto;

/**
*  The class AT21 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:00. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT21 extends AT21Serialized { 
   

						private char[] aTFld121 = Field.fillLowValue(20);

						private char[] aTFld221 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT21
	**/
    public AT21() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld121
	 *	@return aTFld121
	 */
   public char[] getATFld121() throws CFException{
     if (isATFld121Modified()) { 
        aTFld121 = refreshATFld121();
     }
   		return aTFld121;
   }

  
	/**
	*  set variable aTFld121
	*  Corresponding COBOL Variable is WS-2-1A-T-FLD1
	*  @param value
	**/
   public void setATFld121(char[] value) {
      aTFld121 = checkATFld121Constraints(value);
      serializeATFld121(aTFld121);
   } 

     /**
	 * 	Update ATFld121 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld121(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld121,aTFld121.length);
   	
   }
   
   public void setATFld121(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld121,aTFld121.length);
   	
   }
   
     /**
	 * 	Update ATFld121 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld121(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld121+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld121 with another Field
	 *	@param value
	 */
   public void setATFld121(Field source) {
       replace(source,0,source.length(),beginATFld121,A_TFLD_121_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld121 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld121(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld121,A_TFLD_121_LEN);
   	
   }
   
     /**
	 * 	Update ATFld121 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld121(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld121+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld221
	 *	@return aTFld221
	 */
   public char[] getATFld221() throws CFException{
     if (isATFld221Modified()) { 
        aTFld221 = refreshATFld221();
     }
   		return aTFld221;
   }

  
	/**
	*  set variable aTFld221
	*  Corresponding COBOL Variable is WS-2-1A-T-FLD2
	*  @param value
	**/
   public void setATFld221(char[] value) {
      aTFld221 = checkATFld221Constraints(value);
      serializeATFld221(aTFld221);
   } 

     /**
	 * 	Update ATFld221 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld221(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld221,aTFld221.length);
   	
   }
   
   public void setATFld221(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld221,aTFld221.length);
   	
   }
   
     /**
	 * 	Update ATFld221 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld221(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld221+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld221 with another Field
	 *	@param value
	 */
   public void setATFld221(Field source) {
       replace(source,0,source.length(),beginATFld221,A_TFLD_221_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld221 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld221(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld221,A_TFLD_221_LEN);
   	
   }
   
     /**
	 * 	Update ATFld221 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld221(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld221+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT21
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld121(CONSTANTS.SPACE_20);
         setATFld221(CONSTANTS.SPACE_40);
   }

		public static int getAT21FieldLength() {
			return A_T_21_LENGTH;
		}

}
  
