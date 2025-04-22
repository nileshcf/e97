package com.cloudframe.app.refmod3.dto;

/**
*  The class AT216 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT216 extends AT216Serialized {
   

						private char[] aTFld1216 = Field.fillLowValue(20);

						private char[] aTFld2216 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT216
	**/
    public AT216() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld1216
	 *	@return aTFld1216
	 */
   public char[] getATFld1216() throws CFException{
     if (isATFld1216Modified()) { 
        aTFld1216 = refreshATFld1216();
     }
   		return aTFld1216;
   }

  
	/**
	*  set variable aTFld1216
	*  Corresponding COBOL Variable is WS-2-16A-T-FLD1
	*  @param value
	**/
   public void setATFld1216(char[] value) {
      aTFld1216 = checkATFld1216Constraints(value);
      serializeATFld1216(aTFld1216);
   } 

     /**
	 * 	Update ATFld1216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld1216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld1216,aTFld1216.length);
   	
   }
   
   public void setATFld1216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1216,aTFld1216.length);
   	
   }
   
     /**
	 * 	Update ATFld1216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld1216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld1216 with another Field
	 *	@param value
	 */
   public void setATFld1216(Field source) {
       replace(source,0,source.length(),beginATFld1216,A_TFLD_1216_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld1216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld1216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld1216,A_TFLD_1216_LEN);
   	
   }
   
     /**
	 * 	Update ATFld1216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld1216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld1216+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld2216
	 *	@return aTFld2216
	 */
   public char[] getATFld2216() throws CFException{
     if (isATFld2216Modified()) { 
        aTFld2216 = refreshATFld2216();
     }
   		return aTFld2216;
   }

  
	/**
	*  set variable aTFld2216
	*  Corresponding COBOL Variable is WS-2-16A-T-FLD2
	*  @param value
	**/
   public void setATFld2216(char[] value) {
      aTFld2216 = checkATFld2216Constraints(value);
      serializeATFld2216(aTFld2216);
   } 

     /**
	 * 	Update ATFld2216 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld2216(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld2216,aTFld2216.length);
   	
   }
   
   public void setATFld2216(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2216,aTFld2216.length);
   	
   }
   
     /**
	 * 	Update ATFld2216 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld2216(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2216+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld2216 with another Field
	 *	@param value
	 */
   public void setATFld2216(Field source) {
       replace(source,0,source.length(),beginATFld2216,A_TFLD_2216_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld2216 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld2216(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld2216,A_TFLD_2216_LEN);
   	
   }
   
     /**
	 * 	Update ATFld2216 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld2216(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld2216+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT216
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld1216(CONSTANTS.SPACE_20);
         setATFld2216(CONSTANTS.SPACE_40);
   }

		public static int getAT216FieldLength() {
			return A_T_216_LENGTH;
		}

}
  
