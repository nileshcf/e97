package com.cloudframe.app.refmod3.dto;

/**
*  The class BT217 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:10. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT217 extends BT217Serialized { 
   

						private char[] bTFld1217 = Field.fillLowValue(20);

						private char[] bTFld2217 = Field.fillLowValue(40);

						private char[] bTFld3217 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT217
	**/
    public BT217() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT217. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT217(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1217
	 *	@return bTFld1217
	 */
   public char[] getBTFld1217() throws CFException{
     if (isBTFld1217Modified()) { 
        bTFld1217 = refreshBTFld1217();
     }
   		return bTFld1217;
   }

  
	/**
	*  set variable bTFld1217
	*  Corresponding COBOL Variable is WS-2-17B-T-FLD1
	*  @param value
	**/
   public void setBTFld1217(char[] value) {
      bTFld1217 = checkBTFld1217Constraints(value);
      serializeBTFld1217(bTFld1217);
   } 

     /**
	 * 	Update BTFld1217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1217,bTFld1217.length);
   	
   }
   
   public void setBTFld1217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1217,bTFld1217.length);
   	
   }
   
     /**
	 * 	Update BTFld1217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1217 with another Field
	 *	@param value
	 */
   public void setBTFld1217(Field source) {
       replace(source,0,source.length(),beginBTFld1217,B_TFLD_1217_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1217,B_TFLD_1217_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1217+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2217
	 *	@return bTFld2217
	 */
   public char[] getBTFld2217() throws CFException{
     if (isBTFld2217Modified()) { 
        bTFld2217 = refreshBTFld2217();
     }
   		return bTFld2217;
   }

  
	/**
	*  set variable bTFld2217
	*  Corresponding COBOL Variable is WS-2-17B-T-FLD2
	*  @param value
	**/
   public void setBTFld2217(char[] value) {
      bTFld2217 = checkBTFld2217Constraints(value);
      serializeBTFld2217(bTFld2217);
   } 

     /**
	 * 	Update BTFld2217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2217,bTFld2217.length);
   	
   }
   
   public void setBTFld2217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2217,bTFld2217.length);
   	
   }
   
     /**
	 * 	Update BTFld2217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2217 with another Field
	 *	@param value
	 */
   public void setBTFld2217(Field source) {
       replace(source,0,source.length(),beginBTFld2217,B_TFLD_2217_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2217,B_TFLD_2217_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2217+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3217
	 *	@return bTFld3217
	 */
   public char[] getBTFld3217() throws CFException{
     if (isBTFld3217Modified()) { 
        bTFld3217 = refreshBTFld3217();
     }
   		return bTFld3217;
   }

  
	/**
	*  set variable bTFld3217
	*  Corresponding COBOL Variable is WS-2-17B-T-FLD3
	*  @param value
	**/
   public void setBTFld3217(char[] value) {
      bTFld3217 = checkBTFld3217Constraints(value);
      serializeBTFld3217(bTFld3217);
   } 

     /**
	 * 	Update BTFld3217 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3217(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3217,bTFld3217.length);
   	
   }
   
   public void setBTFld3217(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3217,bTFld3217.length);
   	
   }
   
     /**
	 * 	Update BTFld3217 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3217(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3217+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3217 with another Field
	 *	@param value
	 */
   public void setBTFld3217(Field source) {
       replace(source,0,source.length(),beginBTFld3217,B_TFLD_3217_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3217 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3217(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3217,B_TFLD_3217_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3217 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3217(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3217+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT217
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1217(CONSTANTS.SPACE_20);
         setBTFld2217(CONSTANTS.SPACE_40);
         setBTFld3217(CONSTANTS.SPACE_30);
   }

		public static int getBT217FieldLength() {
			return B_T_217_LENGTH;
		}

}
  
