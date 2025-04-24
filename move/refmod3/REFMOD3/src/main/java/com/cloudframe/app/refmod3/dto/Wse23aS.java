package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse23aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:34. using version 5.0.0.254
**/


import com.cloudframe.app.refmod3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse23aS extends Wse23aSSerialized { 
   

						private char[] wse23aSFld1 = Field.fillLowValue(30);

						private char[] wse23aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse23aS
	**/
    public Wse23aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse23aSFld1
	 *	@return wse23aSFld1
	 */
   public char[] getWse23aSFld1() throws CFException{
     if (isWse23aSFld1Modified()) { 
        wse23aSFld1 = refreshWse23aSFld1();
     }
   		return wse23aSFld1;
   }

  
	/**
	*  set variable wse23aSFld1
	*  Corresponding COBOL Variable is WSE-2-3A-S-FLD1
	*  @param value
	**/
   public void setWse23aSFld1(char[] value) {
      wse23aSFld1 = checkWse23aSFld1Constraints(value);
      serializeWse23aSFld1(wse23aSFld1);
   } 

     /**
	 * 	Update Wse23aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23aSFld1,wse23aSFld1.length);
   	
   }
   
   public void setWse23aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23aSFld1,wse23aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse23aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23aSFld1 with another Field
	 *	@param value
	 */
   public void setWse23aSFld1(Field source) {
       replace(source,0,source.length(),beginWse23aSFld1,WSE_23A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23aSFld1,WSE_23A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse23aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse23aSFld2
	 *	@return wse23aSFld2
	 */
   public char[] getWse23aSFld2() throws CFException{
     if (isWse23aSFld2Modified()) { 
        wse23aSFld2 = refreshWse23aSFld2();
     }
   		return wse23aSFld2;
   }

  
	/**
	*  set variable wse23aSFld2
	*  Corresponding COBOL Variable is WSE-2-3A-S-FLD2
	*  @param value
	**/
   public void setWse23aSFld2(char[] value) {
      wse23aSFld2 = checkWse23aSFld2Constraints(value);
      serializeWse23aSFld2(wse23aSFld2);
   } 

     /**
	 * 	Update Wse23aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse23aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse23aSFld2,wse23aSFld2.length);
   	
   }
   
   public void setWse23aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse23aSFld2,wse23aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse23aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse23aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse23aSFld2 with another Field
	 *	@param value
	 */
   public void setWse23aSFld2(Field source) {
       replace(source,0,source.length(),beginWse23aSFld2,WSE_23A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse23aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse23aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse23aSFld2,WSE_23A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse23aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse23aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse23aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse23aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse23aSFld1(CONSTANTS.SPACE_30);
         setWse23aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse23aSFieldLength() {
			return WSE_23A_S_LENGTH;
		}

}
  
