package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse211aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse211aS extends Wse211aSSerialized {
   

						private char[] wse211aSFld1 = Field.fillLowValue(30);

						private char[] wse211aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse211aS
	**/
    public Wse211aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse211aSFld1
	 *	@return wse211aSFld1
	 */
   public char[] getWse211aSFld1() throws CFException{
     if (isWse211aSFld1Modified()) { 
        wse211aSFld1 = refreshWse211aSFld1();
     }
   		return wse211aSFld1;
   }

  
	/**
	*  set variable wse211aSFld1
	*  Corresponding COBOL Variable is WSE-2-11A-S-FLD1
	*  @param value
	**/
   public void setWse211aSFld1(char[] value) {
      wse211aSFld1 = checkWse211aSFld1Constraints(value);
      serializeWse211aSFld1(wse211aSFld1);
   } 

     /**
	 * 	Update Wse211aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse211aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse211aSFld1,wse211aSFld1.length);
   	
   }
   
   public void setWse211aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aSFld1,wse211aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse211aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse211aSFld1 with another Field
	 *	@param value
	 */
   public void setWse211aSFld1(Field source) {
       replace(source,0,source.length(),beginWse211aSFld1,WSE_211A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse211aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse211aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse211aSFld1,WSE_211A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse211aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse211aSFld2
	 *	@return wse211aSFld2
	 */
   public char[] getWse211aSFld2() throws CFException{
     if (isWse211aSFld2Modified()) { 
        wse211aSFld2 = refreshWse211aSFld2();
     }
   		return wse211aSFld2;
   }

  
	/**
	*  set variable wse211aSFld2
	*  Corresponding COBOL Variable is WSE-2-11A-S-FLD2
	*  @param value
	**/
   public void setWse211aSFld2(char[] value) {
      wse211aSFld2 = checkWse211aSFld2Constraints(value);
      serializeWse211aSFld2(wse211aSFld2);
   } 

     /**
	 * 	Update Wse211aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse211aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse211aSFld2,wse211aSFld2.length);
   	
   }
   
   public void setWse211aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aSFld2,wse211aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse211aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse211aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse211aSFld2 with another Field
	 *	@param value
	 */
   public void setWse211aSFld2(Field source) {
       replace(source,0,source.length(),beginWse211aSFld2,WSE_211A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse211aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse211aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse211aSFld2,WSE_211A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse211aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse211aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse211aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse211aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse211aSFld1(CONSTANTS.SPACE_30);
         setWse211aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse211aSFieldLength() {
			return WSE_211A_S_LENGTH;
		}

}
  
