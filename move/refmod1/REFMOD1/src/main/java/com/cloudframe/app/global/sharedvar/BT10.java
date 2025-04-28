package com.cloudframe.app.global.sharedvar;

/**
*  The class BT10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT10 extends BT10Serialized { 
   

						private char[] bTFld110 = Field.fillLowValue(20);

						private char[] bTFld210 = Field.fillLowValue(40);

						private char[] bTFld310 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT10
	**/
    public BT10() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT10. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT10(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld110
	 *	@return bTFld110
	 */
   public char[] getBTFld110() throws CFException{
     if (isBTFld110Modified()) { 
        bTFld110 = refreshBTFld110();
     }
   		return bTFld110;
   }

  
	/**
	*  set variable bTFld110
	*  Corresponding COBOL Variable is WS-10B-T-FLD1
	*  @param value
	**/
   public void setBTFld110(char[] value) {
      bTFld110 = checkBTFld110Constraints(value);
      serializeBTFld110(bTFld110);
   } 

     /**
	 * 	Update BTFld110 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld110(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld110,bTFld110.length);
   	
   }
   
   public void setBTFld110(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld110,bTFld110.length);
   	
   }
   
     /**
	 * 	Update BTFld110 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld110(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld110+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld110 with another Field
	 *	@param value
	 */
   public void setBTFld110(Field source) {
       replace(source,0,source.length(),beginBTFld110,B_TFLD_110_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld110 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld110(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld110,B_TFLD_110_LEN);
   	
   }
   
     /**
	 * 	Update BTFld110 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld110(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld110+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld210
	 *	@return bTFld210
	 */
   public char[] getBTFld210() throws CFException{
     if (isBTFld210Modified()) { 
        bTFld210 = refreshBTFld210();
     }
   		return bTFld210;
   }

  
	/**
	*  set variable bTFld210
	*  Corresponding COBOL Variable is WS-10B-T-FLD2
	*  @param value
	**/
   public void setBTFld210(char[] value) {
      bTFld210 = checkBTFld210Constraints(value);
      serializeBTFld210(bTFld210);
   } 

     /**
	 * 	Update BTFld210 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld210(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld210,bTFld210.length);
   	
   }
   
   public void setBTFld210(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld210,bTFld210.length);
   	
   }
   
     /**
	 * 	Update BTFld210 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld210(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld210+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld210 with another Field
	 *	@param value
	 */
   public void setBTFld210(Field source) {
       replace(source,0,source.length(),beginBTFld210,B_TFLD_210_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld210 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld210(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld210,B_TFLD_210_LEN);
   	
   }
   
     /**
	 * 	Update BTFld210 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld210(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld210+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld310
	 *	@return bTFld310
	 */
   public char[] getBTFld310() throws CFException{
     if (isBTFld310Modified()) { 
        bTFld310 = refreshBTFld310();
     }
   		return bTFld310;
   }

  
	/**
	*  set variable bTFld310
	*  Corresponding COBOL Variable is WS-10B-T-FLD3
	*  @param value
	**/
   public void setBTFld310(char[] value) {
      bTFld310 = checkBTFld310Constraints(value);
      serializeBTFld310(bTFld310);
   } 

     /**
	 * 	Update BTFld310 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld310(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld310,bTFld310.length);
   	
   }
   
   public void setBTFld310(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld310,bTFld310.length);
   	
   }
   
     /**
	 * 	Update BTFld310 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld310(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld310+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld310 with another Field
	 *	@param value
	 */
   public void setBTFld310(Field source) {
       replace(source,0,source.length(),beginBTFld310,B_TFLD_310_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld310 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld310(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld310,B_TFLD_310_LEN);
   	
   }
   
     /**
	 * 	Update BTFld310 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld310(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld310+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT10
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld110(CONSTANTS.SPACE_20);
         setBTFld210(CONSTANTS.SPACE_40);
         setBTFld310(CONSTANTS.SPACE_30);
   }

		public static int getBT10FieldLength() {
			return B_T_10_LENGTH;
		}

}
  
