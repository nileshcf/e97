package com.cloudframe.app.refmod1.dto;

/**
*  The class Wse3aS is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:06. using version 5.0.0.256
**/


import com.cloudframe.app.refmod1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Wse3aS extends Wse3aSSerialized {
   

						private char[] wse3aSFld1 = Field.fillLowValue(30);

						private char[] wse3aSFld2 = Field.fillLowValue(30);
	
	/**
	* Constructor for Wse3aS
	**/
    public Wse3aS() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of wse3aSFld1
	 *	@return wse3aSFld1
	 */
   public char[] getWse3aSFld1() throws CFException{
     if (isWse3aSFld1Modified()) { 
        wse3aSFld1 = refreshWse3aSFld1();
     }
   		return wse3aSFld1;
   }

  
	/**
	*  set variable wse3aSFld1
	*  Corresponding COBOL Variable is WSE-3A-S-FLD1
	*  @param value
	**/
   public void setWse3aSFld1(char[] value) {
      wse3aSFld1 = checkWse3aSFld1Constraints(value);
      serializeWse3aSFld1(wse3aSFld1);
   } 

     /**
	 * 	Update Wse3aSFld1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3aSFld1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3aSFld1,wse3aSFld1.length);
   	
   }
   
   public void setWse3aSFld1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aSFld1,wse3aSFld1.length);
   	
   }
   
     /**
	 * 	Update Wse3aSFld1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3aSFld1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aSFld1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3aSFld1 with another Field
	 *	@param value
	 */
   public void setWse3aSFld1(Field source) {
       replace(source,0,source.length(),beginWse3aSFld1,WSE_3A_SFLD_1_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3aSFld1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3aSFld1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3aSFld1,WSE_3A_SFLD_1_LEN);
   	
   }
   
     /**
	 * 	Update Wse3aSFld1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3aSFld1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aSFld1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse3aSFld2
	 *	@return wse3aSFld2
	 */
   public char[] getWse3aSFld2() throws CFException{
     if (isWse3aSFld2Modified()) { 
        wse3aSFld2 = refreshWse3aSFld2();
     }
   		return wse3aSFld2;
   }

  
	/**
	*  set variable wse3aSFld2
	*  Corresponding COBOL Variable is WSE-3A-S-FLD2
	*  @param value
	**/
   public void setWse3aSFld2(char[] value) {
      wse3aSFld2 = checkWse3aSFld2Constraints(value);
      serializeWse3aSFld2(wse3aSFld2);
   } 

     /**
	 * 	Update Wse3aSFld2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWse3aSFld2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWse3aSFld2,wse3aSFld2.length);
   	
   }
   
   public void setWse3aSFld2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aSFld2,wse3aSFld2.length);
   	
   }
   
     /**
	 * 	Update Wse3aSFld2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse3aSFld2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aSFld2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Wse3aSFld2 with another Field
	 *	@param value
	 */
   public void setWse3aSFld2(Field source) {
       replace(source,0,source.length(),beginWse3aSFld2,WSE_3A_SFLD_2_LEN);
   	
   }  
   
     /**
	 * 	Update Wse3aSFld2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWse3aSFld2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWse3aSFld2,WSE_3A_SFLD_2_LEN);
   	
   }
   
     /**
	 * 	Update Wse3aSFld2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse3aSFld2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWse3aSFld2+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Wse3aS
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWse3aSFld1(CONSTANTS.SPACE_30);
         setWse3aSFld2(CONSTANTS.SPACE_30);
   }

		public static int getWse3aSFieldLength() {
			return WSE_3A_S_LENGTH;
		}

}
  
