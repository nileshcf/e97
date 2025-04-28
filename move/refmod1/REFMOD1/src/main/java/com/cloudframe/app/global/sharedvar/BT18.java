package com.cloudframe.app.global.sharedvar;

/**
*  The class BT18 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT18 extends BT18Serialized { 
   

						private char[] bTFld118 = Field.fillLowValue(20);

						private char[] bTFld218 = Field.fillLowValue(40);

						private char[] bTFld318 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT18
	**/
    public BT18() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT18. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT18(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld118
	 *	@return bTFld118
	 */
   public char[] getBTFld118() throws CFException{
     if (isBTFld118Modified()) { 
        bTFld118 = refreshBTFld118();
     }
   		return bTFld118;
   }

  
	/**
	*  set variable bTFld118
	*  Corresponding COBOL Variable is WS-18B-T-FLD1
	*  @param value
	**/
   public void setBTFld118(char[] value) {
      bTFld118 = checkBTFld118Constraints(value);
      serializeBTFld118(bTFld118);
   } 

     /**
	 * 	Update BTFld118 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld118(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld118,bTFld118.length);
   	
   }
   
   public void setBTFld118(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld118,bTFld118.length);
   	
   }
   
     /**
	 * 	Update BTFld118 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld118(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld118+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld118 with another Field
	 *	@param value
	 */
   public void setBTFld118(Field source) {
       replace(source,0,source.length(),beginBTFld118,B_TFLD_118_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld118 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld118(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld118,B_TFLD_118_LEN);
   	
   }
   
     /**
	 * 	Update BTFld118 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld118(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld118+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld218
	 *	@return bTFld218
	 */
   public char[] getBTFld218() throws CFException{
     if (isBTFld218Modified()) { 
        bTFld218 = refreshBTFld218();
     }
   		return bTFld218;
   }

  
	/**
	*  set variable bTFld218
	*  Corresponding COBOL Variable is WS-18B-T-FLD2
	*  @param value
	**/
   public void setBTFld218(char[] value) {
      bTFld218 = checkBTFld218Constraints(value);
      serializeBTFld218(bTFld218);
   } 

     /**
	 * 	Update BTFld218 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld218(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld218,bTFld218.length);
   	
   }
   
   public void setBTFld218(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld218,bTFld218.length);
   	
   }
   
     /**
	 * 	Update BTFld218 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld218(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld218+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld218 with another Field
	 *	@param value
	 */
   public void setBTFld218(Field source) {
       replace(source,0,source.length(),beginBTFld218,B_TFLD_218_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld218 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld218(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld218,B_TFLD_218_LEN);
   	
   }
   
     /**
	 * 	Update BTFld218 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld218(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld218+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld318
	 *	@return bTFld318
	 */
   public char[] getBTFld318() throws CFException{
     if (isBTFld318Modified()) { 
        bTFld318 = refreshBTFld318();
     }
   		return bTFld318;
   }

  
	/**
	*  set variable bTFld318
	*  Corresponding COBOL Variable is WS-18B-T-FLD3
	*  @param value
	**/
   public void setBTFld318(char[] value) {
      bTFld318 = checkBTFld318Constraints(value);
      serializeBTFld318(bTFld318);
   } 

     /**
	 * 	Update BTFld318 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld318(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld318,bTFld318.length);
   	
   }
   
   public void setBTFld318(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld318,bTFld318.length);
   	
   }
   
     /**
	 * 	Update BTFld318 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld318(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld318+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld318 with another Field
	 *	@param value
	 */
   public void setBTFld318(Field source) {
       replace(source,0,source.length(),beginBTFld318,B_TFLD_318_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld318 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld318(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld318,B_TFLD_318_LEN);
   	
   }
   
     /**
	 * 	Update BTFld318 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld318(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld318+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT18
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld118(CONSTANTS.SPACE_20);
         setBTFld218(CONSTANTS.SPACE_40);
         setBTFld318(CONSTANTS.SPACE_30);
   }

		public static int getBT18FieldLength() {
			return B_T_18_LENGTH;
		}

}
  
