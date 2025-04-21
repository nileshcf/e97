package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse16aT is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse16aT extends Wse16aTSerialized { 
   

						private char[] wse16aTFld1 = Field.fillLowValue(30);

						private char[] wse16aTFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse16aT
	**/
    public Wse16aT() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse16aT. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse16aT(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse16aTFld1
	 *	@return wse16aTFld1
	 */
   public char[] getWse16aTFld1() throws CFException{
     if (isWse16aTFld1Modified()) { 
        wse16aTFld1 = refreshWse16aTFld1();
     }
   		return wse16aTFld1;
   }

  
	/**
	*  set variable wse16aTFld1
	*  Corresponding COBOL Variable is WSE-16A-T-FLD1
	*  @param value
	**/
   public void setWse16aTFld1(char[] value) {
      wse16aTFld1 = checkWse16aTFld1Constraints(value);
      serializeWse16aTFld1(wse16aTFld1);
   } 

     /**
	 * 	Update Wse16aTFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16aTFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16aTFld1,wse16aTFld1.length);
   	
   }
   
   public void setWse16aTFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTFld1,wse16aTFld1.length);
   	
   }
   
     /**
	 * 	Update Wse16aTFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16aTFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16aTFld1 with another Field
	 *	@param value
	 */
   public void setWse16aTFld1(Field source) {
       replace(source,0,source.length(),beginWse16aTFld1,WSE_16A_TFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16aTFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16aTFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16aTFld1,WSE_16A_TFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse16aTFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16aTFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse16aTFld2
	 *	@return wse16aTFld2
	 */
   public char[] getWse16aTFld2() throws CFException{
     if (isWse16aTFld2Modified()) { 
        wse16aTFld2 = refreshWse16aTFld2();
     }
   		return wse16aTFld2;
   }

  
	/**
	*  set variable wse16aTFld2
	*  Corresponding COBOL Variable is WSE-16A-T-FLD2
	*  @param value
	**/
   public void setWse16aTFld2(char[] value) {
      wse16aTFld2 = checkWse16aTFld2Constraints(value);
      serializeWse16aTFld2(wse16aTFld2);
   } 

     /**
	 * 	Update Wse16aTFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse16aTFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse16aTFld2,wse16aTFld2.length);
   	
   }
   
   public void setWse16aTFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTFld2,wse16aTFld2.length);
   	
   }
   
     /**
	 * 	Update Wse16aTFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse16aTFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse16aTFld2 with another Field
	 *	@param value
	 */
   public void setWse16aTFld2(Field source) {
       replace(source,0,source.length(),beginWse16aTFld2,WSE_16A_TFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse16aTFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse16aTFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse16aTFld2,WSE_16A_TFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse16aTFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse16aTFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse16aTFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse16aT
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse16aTFld1(CONSTANTS.SPACE_30);
         setWse16aTFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse16aTFieldLength() {
			return WSE_16A_T_LENGTH;
		}

}
  
