package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse20aT extends Wse20aTSerialized { 
   

						private char[] wse20aTFld1 = Field.fillLowValue(30);

						private char[] wse20aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse20aT
	**/
    public Wse20aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse20aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse20aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse20aTFld1
	 *	@return wse20aTFld1
	 */
   public char[] getWse20aTFld1() throws CFException{
     if (isWse20aTFld1Modified()) { 
        wse20aTFld1 = refreshWse20aTFld1();
     }
   		return wse20aTFld1;
   }

  
	/**
	*  set variable wse20aTFld1
	*  Corresponding COBOL Variable is WSE-20A-T-FLD1
	*  @param value
	**/
   public void setWse20aTFld1(char[] value) {
      wse20aTFld1 = checkWse20aTFld1Constraints(value);
      serializeWse20aTFld1(wse20aTFld1);
   } 

     /**
	 * 	Update Wse20aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20aTFld1,wse20aTFld1.length);
   	
   }
   
   public void setWse20aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTFld1,wse20aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse20aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20aTFld1 with another Field
	 *	@param value
	 */
   public void setWse20aTFld1(Field source) {
       replace(source,0,source.length(),beginWse20aTFld1,WSE_20A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20aTFld1,WSE_20A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse20aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20aTFld2
	 *	@return wse20aTFld2
	 */
   public char[] getWse20aTFld2() throws CFException{
     if (isWse20aTFld2Modified()) { 
        wse20aTFld2 = refreshWse20aTFld2();
     }
   		return wse20aTFld2;
   }

  
	/**
	*  set variable wse20aTFld2
	*  Corresponding COBOL Variable is WSE-20A-T-FLD2
	*  @param value
	**/
   public void setWse20aTFld2(char[] value) {
      wse20aTFld2 = checkWse20aTFld2Constraints(value);
      serializeWse20aTFld2(wse20aTFld2);
   } 

     /**
	 * 	Update Wse20aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse20aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse20aTFld2,wse20aTFld2.length);
   	
   }
   
   public void setWse20aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTFld2,wse20aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse20aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse20aTFld2 with another Field
	 *	@param value
	 */
   public void setWse20aTFld2(Field source) {
       replace(source,0,source.length(),beginWse20aTFld2,WSE_20A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse20aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse20aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse20aTFld2,WSE_20A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse20aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse20aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse20aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse20aTFld1(CONSTANTS.SPACE_30);
         setWse20aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse20aTFieldLength() {
			return WSE_20A_T_LENGTH;
		}

}
  
