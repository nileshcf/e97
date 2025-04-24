package com.cloudframe.app.refmod2.dto;

/**
*  The class BT220 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class BT220 extends BT220Serialized { 
   

						private char[] bTFld1220 = Field.fillLowValue(20);

						private char[] bTFld2220 = Field.fillLowValue(40);

						private char[] bTFld3220 = Field.fillLowValue(30);
	
	/**
	* Constructor for BT220
	**/
    public BT220() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BT220. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BT220(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bTFld1220
	 *	@return bTFld1220
	 */
   public char[] getBTFld1220() throws CFException{
     if (isBTFld1220Modified()) { 
        bTFld1220 = refreshBTFld1220();
     }
   		return bTFld1220;
   }

  
	/**
	*  set variable bTFld1220
	*  Corresponding COBOL Variable is WS-2-20B-T-FLD1
	*  @param value
	**/
   public void setBTFld1220(char[] value) {
      bTFld1220 = checkBTFld1220Constraints(value);
      serializeBTFld1220(bTFld1220);
   } 

     /**
	 * 	Update BTFld1220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld1220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld1220,bTFld1220.length);
   	
   }
   
   public void setBTFld1220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1220,bTFld1220.length);
   	
   }
   
     /**
	 * 	Update BTFld1220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld1220 with another Field
	 *	@param value
	 */
   public void setBTFld1220(Field source) {
       replace(source,0,source.length(),beginBTFld1220,B_TFLD_1220_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld1220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld1220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld1220,B_TFLD_1220_LEN);
   	
   }
   
     /**
	 * 	Update BTFld1220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld1220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld1220+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld2220
	 *	@return bTFld2220
	 */
   public char[] getBTFld2220() throws CFException{
     if (isBTFld2220Modified()) { 
        bTFld2220 = refreshBTFld2220();
     }
   		return bTFld2220;
   }

  
	/**
	*  set variable bTFld2220
	*  Corresponding COBOL Variable is WS-2-20B-T-FLD2
	*  @param value
	**/
   public void setBTFld2220(char[] value) {
      bTFld2220 = checkBTFld2220Constraints(value);
      serializeBTFld2220(bTFld2220);
   } 

     /**
	 * 	Update BTFld2220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld2220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld2220,bTFld2220.length);
   	
   }
   
   public void setBTFld2220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2220,bTFld2220.length);
   	
   }
   
     /**
	 * 	Update BTFld2220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld2220 with another Field
	 *	@param value
	 */
   public void setBTFld2220(Field source) {
       replace(source,0,source.length(),beginBTFld2220,B_TFLD_2220_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld2220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld2220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld2220,B_TFLD_2220_LEN);
   	
   }
   
     /**
	 * 	Update BTFld2220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld2220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld2220+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bTFld3220
	 *	@return bTFld3220
	 */
   public char[] getBTFld3220() throws CFException{
     if (isBTFld3220Modified()) { 
        bTFld3220 = refreshBTFld3220();
     }
   		return bTFld3220;
   }

  
	/**
	*  set variable bTFld3220
	*  Corresponding COBOL Variable is WS-2-20B-T-FLD3
	*  @param value
	**/
   public void setBTFld3220(char[] value) {
      bTFld3220 = checkBTFld3220Constraints(value);
      serializeBTFld3220(bTFld3220);
   } 

     /**
	 * 	Update BTFld3220 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBTFld3220(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBTFld3220,bTFld3220.length);
   	
   }
   
   public void setBTFld3220(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3220,bTFld3220.length);
   	
   }
   
     /**
	 * 	Update BTFld3220 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3220(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3220+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BTFld3220 with another Field
	 *	@param value
	 */
   public void setBTFld3220(Field source) {
       replace(source,0,source.length(),beginBTFld3220,B_TFLD_3220_LEN);
   	
   }  
   
     /**
	 * 	Update BTFld3220 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBTFld3220(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBTFld3220,B_TFLD_3220_LEN);
   	
   }
   
     /**
	 * 	Update BTFld3220 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBTFld3220(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBTFld3220+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes BT220
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setBTFld1220(CONSTANTS.SPACE_20);
         setBTFld2220(CONSTANTS.SPACE_40);
         setBTFld3220(CONSTANTS.SPACE_30);
   }

		public static int getBT220FieldLength() {
			return B_T_220_LENGTH;
		}

}
  
