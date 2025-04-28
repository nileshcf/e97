package com.cloudframe.app.refmod2.dto;

/**
*  The class BT210 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT210 extends BT210Serialized { 
   

						private char[] bTFld1210 = Field.fillLowValue(20);

						private char[] bTFld2210 = Field.fillLowValue(40);

						private char[] bTFld3210 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT210
	**/
    public BT210() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT210. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT210(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1210
	 *	@return bTFld1210
	 */
   public char[] getBTFld1210() throws CFException{
     if (isBTFld1210Modified()) { 
        bTFld1210 = refreshBTFld1210();
     }
   		return bTFld1210;
   }

  
	/**
	*  set variable bTFld1210
	*  Corresponding COBOL Variable is WS-2-10B-T-FLD1
	*  @param value
	**/
   public void setBTFld1210(char[] value) {
      bTFld1210 = checkBTFld1210Constraints(value);
      serializeBTFld1210(bTFld1210);
   } 

     /**
	 * 	Update BTFld1210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1210,bTFld1210.length);
   	
   }
   
   public void setBTFld1210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1210,bTFld1210.length);
   	
   }
   
     /**
	 * 	Update BTFld1210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1210 with another Field
	 *	@param value
	 */
   public void setBTFld1210(Field source) {
       replace(source,0,source.length(),beginBTFld1210,B_TFLD_1210_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1210,B_TFLD_1210_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2210
	 *	@return bTFld2210
	 */
   public char[] getBTFld2210() throws CFException{
     if (isBTFld2210Modified()) { 
        bTFld2210 = refreshBTFld2210();
     }
   		return bTFld2210;
   }

  
	/**
	*  set variable bTFld2210
	*  Corresponding COBOL Variable is WS-2-10B-T-FLD2
	*  @param value
	**/
   public void setBTFld2210(char[] value) {
      bTFld2210 = checkBTFld2210Constraints(value);
      serializeBTFld2210(bTFld2210);
   } 

     /**
	 * 	Update BTFld2210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2210,bTFld2210.length);
   	
   }
   
   public void setBTFld2210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2210,bTFld2210.length);
   	
   }
   
     /**
	 * 	Update BTFld2210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2210 with another Field
	 *	@param value
	 */
   public void setBTFld2210(Field source) {
       replace(source,0,source.length(),beginBTFld2210,B_TFLD_2210_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2210,B_TFLD_2210_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3210
	 *	@return bTFld3210
	 */
   public char[] getBTFld3210() throws CFException{
     if (isBTFld3210Modified()) { 
        bTFld3210 = refreshBTFld3210();
     }
   		return bTFld3210;
   }

  
	/**
	*  set variable bTFld3210
	*  Corresponding COBOL Variable is WS-2-10B-T-FLD3
	*  @param value
	**/
   public void setBTFld3210(char[] value) {
      bTFld3210 = checkBTFld3210Constraints(value);
      serializeBTFld3210(bTFld3210);
   } 

     /**
	 * 	Update BTFld3210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3210,bTFld3210.length);
   	
   }
   
   public void setBTFld3210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3210,bTFld3210.length);
   	
   }
   
     /**
	 * 	Update BTFld3210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3210 with another Field
	 *	@param value
	 */
   public void setBTFld3210(Field source) {
       replace(source,0,source.length(),beginBTFld3210,B_TFLD_3210_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3210,B_TFLD_3210_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3210+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT210
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1210(CONSTANTS.SPACE_20);
         setBTFld2210(CONSTANTS.SPACE_40);
         setBTFld3210(CONSTANTS.SPACE_30);
   }

		public static int getBT210FieldLength() {
			return B_T_210_LENGTH;
		}

}
  
