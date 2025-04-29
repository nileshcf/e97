package com.cloudframe.app.refmod2.dto;

/**
*  The class AT22 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT22 extends AT22Serialized {
   

						private char[] aTFld122 = Field.fillLowValue(20);

						private char[] aTFld222 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT22
	**/
    public AT22() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld122
	 *	@return aTFld122
	 */
   public char[] getATFld122() throws CFException{
     if (isATFld122Modified()) { 
        aTFld122 = refreshATFld122();
     }
   		return aTFld122;
   }

  
	/**
	*  set variable aTFld122
	*  Corresponding COBOL Variable is WS-2-2A-T-FLD1
	*  @param value
	**/
   public void setATFld122(char[] value) {
      aTFld122 = checkATFld122Constraints(value);
      serializeATFld122(aTFld122);
   } 

     /**
	 * 	Update ATFld122 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld122(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld122,aTFld122.length);
   	
   }
   
   public void setATFld122(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld122,aTFld122.length);
   	
   }
   
     /**
	 * 	Update ATFld122 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld122(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld122+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld122 with another Field
	 *	@param value
	 */
   public void setATFld122(Field source) {
       replace(source,0,source.length(),beginATFld122,A_TFLD_122_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld122 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld122(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld122,A_TFLD_122_LEN);
   	
   }
   
     /**
	 * 	Update ATFld122 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld122(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld122+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld222
	 *	@return aTFld222
	 */
   public char[] getATFld222() throws CFException{
     if (isATFld222Modified()) { 
        aTFld222 = refreshATFld222();
     }
   		return aTFld222;
   }

  
	/**
	*  set variable aTFld222
	*  Corresponding COBOL Variable is WS-2-2A-T-FLD2
	*  @param value
	**/
   public void setATFld222(char[] value) {
      aTFld222 = checkATFld222Constraints(value);
      serializeATFld222(aTFld222);
   } 

     /**
	 * 	Update ATFld222 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld222(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld222,aTFld222.length);
   	
   }
   
   public void setATFld222(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld222,aTFld222.length);
   	
   }
   
     /**
	 * 	Update ATFld222 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld222(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld222+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld222 with another Field
	 *	@param value
	 */
   public void setATFld222(Field source) {
       replace(source,0,source.length(),beginATFld222,A_TFLD_222_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld222 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld222(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld222,A_TFLD_222_LEN);
   	
   }
   
     /**
	 * 	Update ATFld222 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld222(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld222+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT22
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld122(CONSTANTS.SPACE_20);
         setATFld222(CONSTANTS.SPACE_40);
   }

		public static int getAT22FieldLength() {
			return A_T_22_LENGTH;
		}

}
  
