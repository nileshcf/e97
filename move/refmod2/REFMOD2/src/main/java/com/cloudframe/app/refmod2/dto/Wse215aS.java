package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse215aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.refmod2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse215aS extends Wse215aSSerialized { 
   

						private char[] wse215aSFld1 = Field.fillLowValue(30);

						private char[] wse215aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse215aS
	**/
    public Wse215aS() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Wse215aS. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Wse215aS(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of wse215aSFld1
	 *	@return wse215aSFld1
	 */
   public char[] getWse215aSFld1() throws CFException{
     if (isWse215aSFld1Modified()) { 
        wse215aSFld1 = refreshWse215aSFld1();
     }
   		return wse215aSFld1;
   }

  
	/**
	*  set variable wse215aSFld1
	*  Corresponding COBOL Variable is WSE-2-15A-S-FLD1
	*  @param value
	**/
   public void setWse215aSFld1(char[] value) {
      wse215aSFld1 = checkWse215aSFld1Constraints(value);
      serializeWse215aSFld1(wse215aSFld1);
   } 

     /**
	 * 	Update Wse215aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215aSFld1,wse215aSFld1.length);
   	
   }
   
   public void setWse215aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aSFld1,wse215aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse215aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215aSFld1 with another Field
	 *	@param value
	 */
   public void setWse215aSFld1(Field source) {
       replace(source,0,source.length(),beginWse215aSFld1,WSE_215A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215aSFld1,WSE_215A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse215aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse215aSFld2
	 *	@return wse215aSFld2
	 */
   public char[] getWse215aSFld2() throws CFException{
     if (isWse215aSFld2Modified()) { 
        wse215aSFld2 = refreshWse215aSFld2();
     }
   		return wse215aSFld2;
   }

  
	/**
	*  set variable wse215aSFld2
	*  Corresponding COBOL Variable is WSE-2-15A-S-FLD2
	*  @param value
	**/
   public void setWse215aSFld2(char[] value) {
      wse215aSFld2 = checkWse215aSFld2Constraints(value);
      serializeWse215aSFld2(wse215aSFld2);
   } 

     /**
	 * 	Update Wse215aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse215aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse215aSFld2,wse215aSFld2.length);
   	
   }
   
   public void setWse215aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aSFld2,wse215aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse215aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse215aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse215aSFld2 with another Field
	 *	@param value
	 */
   public void setWse215aSFld2(Field source) {
       replace(source,0,source.length(),beginWse215aSFld2,WSE_215A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse215aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse215aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse215aSFld2,WSE_215A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse215aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse215aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse215aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse215aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse215aSFld1(CONSTANTS.SPACE_30);
         setWse215aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse215aSFieldLength() {
			return WSE_215A_S_LENGTH;
		}

}
  
