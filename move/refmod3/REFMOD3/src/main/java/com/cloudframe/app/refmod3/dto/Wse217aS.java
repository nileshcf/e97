package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse217aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse217aS extends Wse217aSSerialized {
   

						private char[] wse217aSFld1 = Field.fillLowValue(30);

						private char[] wse217aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse217aS
	**/
    public Wse217aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse217aSFld1
	 *	@return wse217aSFld1
	 */
   public char[] getWse217aSFld1() throws CFException{
     if (isWse217aSFld1Modified()) { 
        wse217aSFld1 = refreshWse217aSFld1();
     }
   		return wse217aSFld1;
   }

  
	/**
	*  set variable wse217aSFld1
	*  Corresponding COBOL Variable is WSE-2-17A-S-FLD1
	*  @param value
	**/
   public void setWse217aSFld1(char[] value) {
      wse217aSFld1 = checkWse217aSFld1Constraints(value);
      serializeWse217aSFld1(wse217aSFld1);
   } 

     /**
	 * 	Update Wse217aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217aSFld1,wse217aSFld1.length);
   	
   }
   
   public void setWse217aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aSFld1,wse217aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse217aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217aSFld1 with another Field
	 *	@param value
	 */
   public void setWse217aSFld1(Field source) {
       replace(source,0,source.length(),beginWse217aSFld1,WSE_217A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217aSFld1,WSE_217A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse217aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse217aSFld2
	 *	@return wse217aSFld2
	 */
   public char[] getWse217aSFld2() throws CFException{
     if (isWse217aSFld2Modified()) { 
        wse217aSFld2 = refreshWse217aSFld2();
     }
   		return wse217aSFld2;
   }

  
	/**
	*  set variable wse217aSFld2
	*  Corresponding COBOL Variable is WSE-2-17A-S-FLD2
	*  @param value
	**/
   public void setWse217aSFld2(char[] value) {
      wse217aSFld2 = checkWse217aSFld2Constraints(value);
      serializeWse217aSFld2(wse217aSFld2);
   } 

     /**
	 * 	Update Wse217aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse217aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse217aSFld2,wse217aSFld2.length);
   	
   }
   
   public void setWse217aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aSFld2,wse217aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse217aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse217aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse217aSFld2 with another Field
	 *	@param value
	 */
   public void setWse217aSFld2(Field source) {
       replace(source,0,source.length(),beginWse217aSFld2,WSE_217A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse217aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse217aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse217aSFld2,WSE_217A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse217aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse217aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse217aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse217aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse217aSFld1(CONSTANTS.SPACE_30);
         setWse217aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse217aSFieldLength() {
			return WSE_217A_S_LENGTH;
		}

}
  
