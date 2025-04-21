package com.cloudframe.app.refmod3.dto;

/**
*  The class AT24 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT24 extends AT24Serialized {
   

						private char[] aTFld124 = Field.fillLowValue(20);

						private char[] aTFld224 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT24
	**/
    public AT24() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of aTFld124
	 *	@return aTFld124
	 */
   public char[] getATFld124() throws CFException{
     if (isATFld124Modified()) { 
        aTFld124 = refreshATFld124();
     }
   		return aTFld124;
   }

  
	/**
	*  set variable aTFld124
	*  Corresponding COBOL Variable is WS-2-4A-T-FLD1
	*  @param value
	**/
   public void setATFld124(char[] value) {
      aTFld124 = checkATFld124Constraints(value);
      serializeATFld124(aTFld124);
   } 

     /**
	 * 	Update ATFld124 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld124(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld124,aTFld124.length);
   	
   }
   
   public void setATFld124(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld124,aTFld124.length);
   	
   }
   
     /**
	 * 	Update ATFld124 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld124(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld124+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld124 with another Field
	 *	@param value
	 */
   public void setATFld124(Field source) {
       replace(source,0,source.length(),beginATFld124,A_TFLD_124_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld124 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld124(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld124,A_TFLD_124_LEN);
   	
   }
   
     /**
	 * 	Update ATFld124 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld124(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld124+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld224
	 *	@return aTFld224
	 */
   public char[] getATFld224() throws CFException{
     if (isATFld224Modified()) { 
        aTFld224 = refreshATFld224();
     }
   		return aTFld224;
   }

  
	/**
	*  set variable aTFld224
	*  Corresponding COBOL Variable is WS-2-4A-T-FLD2
	*  @param value
	**/
   public void setATFld224(char[] value) {
      aTFld224 = checkATFld224Constraints(value);
      serializeATFld224(aTFld224);
   } 

     /**
	 * 	Update ATFld224 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld224(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld224,aTFld224.length);
   	
   }
   
   public void setATFld224(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld224,aTFld224.length);
   	
   }
   
     /**
	 * 	Update ATFld224 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld224(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld224+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld224 with another Field
	 *	@param value
	 */
   public void setATFld224(Field source) {
       replace(source,0,source.length(),beginATFld224,A_TFLD_224_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld224 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld224(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld224,A_TFLD_224_LEN);
   	
   }
   
     /**
	 * 	Update ATFld224 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld224(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld224+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT24
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld124(CONSTANTS.SPACE_20);
         setATFld224(CONSTANTS.SPACE_40);
   }

		public static int getAT24FieldLength() {
			return A_T_24_LENGTH;
		}

}
  
