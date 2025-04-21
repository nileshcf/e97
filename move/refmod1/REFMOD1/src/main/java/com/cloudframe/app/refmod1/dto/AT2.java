package com.cloudframe.app.refmod1.dto;

/**
*  The class AT2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class AT2 extends AT2Serialized { 
   

						private char[] aTFld12 = Field.fillLowValue(20);

						private char[] aTFld22 = Field.fillLowValue(40);
	
	/**
	* Constructor for AT2
	**/
    public AT2() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for AT2. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AT2(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of aTFld12
	 *	@return aTFld12
	 */
   public char[] getATFld12() throws CFException{
     if (isATFld12Modified()) { 
        aTFld12 = refreshATFld12();
     }
   		return aTFld12;
   }

  
	/**
	*  set variable aTFld12
	*  Corresponding COBOL Variable is WS-2A-T-FLD1
	*  @param value
	**/
   public void setATFld12(char[] value) {
      aTFld12 = checkATFld12Constraints(value);
      serializeATFld12(aTFld12);
   } 

     /**
	 * 	Update ATFld12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld12,aTFld12.length);
   	
   }
   
   public void setATFld12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld12,aTFld12.length);
   	
   }
   
     /**
	 * 	Update ATFld12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld12 with another Field
	 *	@param value
	 */
   public void setATFld12(Field source) {
       replace(source,0,source.length(),beginATFld12,A_TFLD_12_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld12,A_TFLD_12_LEN);
   	
   }
   
     /**
	 * 	Update ATFld12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of aTFld22
	 *	@return aTFld22
	 */
   public char[] getATFld22() throws CFException{
     if (isATFld22Modified()) { 
        aTFld22 = refreshATFld22();
     }
   		return aTFld22;
   }

  
	/**
	*  set variable aTFld22
	*  Corresponding COBOL Variable is WS-2A-T-FLD2
	*  @param value
	**/
   public void setATFld22(char[] value) {
      aTFld22 = checkATFld22Constraints(value);
      serializeATFld22(aTFld22);
   } 

     /**
	 * 	Update ATFld22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setATFld22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginATFld22,aTFld22.length);
   	
   }
   
   public void setATFld22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginATFld22,aTFld22.length);
   	
   }
   
     /**
	 * 	Update ATFld22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setATFld22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ATFld22 with another Field
	 *	@param value
	 */
   public void setATFld22(Field source) {
       replace(source,0,source.length(),beginATFld22,A_TFLD_22_LEN);
   	
   }  
   
     /**
	 * 	Update ATFld22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setATFld22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginATFld22,A_TFLD_22_LEN);
   	
   }
   
     /**
	 * 	Update ATFld22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setATFld22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginATFld22+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes AT2
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setATFld12(CONSTANTS.SPACE_20);
         setATFld22(CONSTANTS.SPACE_40);
   }

		public static int getAT2FieldLength() {
			return A_T_2_LENGTH;
		}

}
  
