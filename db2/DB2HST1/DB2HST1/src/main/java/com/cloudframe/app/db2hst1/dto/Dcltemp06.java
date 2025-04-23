package com.cloudframe.app.db2hst1.dto;

/**
*  The class Dcltemp06 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:01. using version 5.0.0.254
**/


import com.cloudframe.app.db2hst1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Dcltemp06 extends Dcltemp06Serialized {
   

						private char[] hvEmpNo = Field.fillLowValue(4);

						private char[] hvEmpSal = Field.fillLowValue(5);
	
	/**
	* Constructor for Dcltemp06
	**/
    public Dcltemp06() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of hvEmpNo
	 *	@return hvEmpNo
	 */
   public char[] getHvEmpNo() throws CFException{
     if (isHvEmpNoModified()) { 
        hvEmpNo = refreshHvEmpNo();
     }
   		return hvEmpNo;
   }

  
	/**
	*  set variable hvEmpNo
	*  Corresponding COBOL Variable is HV-EMP-NO
	*  @param value
	**/
   public void setHvEmpNo(char[] value) {
      hvEmpNo = checkHvEmpNoConstraints(value);
      serializeHvEmpNo(hvEmpNo);
   } 

     /**
	 * 	Update HvEmpNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEmpNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvEmpNo,hvEmpNo.length);
   	
   }
   
   public void setHvEmpNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvEmpNo,hvEmpNo.length);
   	
   }
   
     /**
	 * 	Update HvEmpNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEmpNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvEmpNo with another Field
	 *	@param value
	 */
   public void setHvEmpNo(Field source) {
       replace(source,0,source.length(),beginHvEmpNo,HV_EMP_NO_LEN);
   	
   }  
   
     /**
	 * 	Update HvEmpNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEmpNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvEmpNo,HV_EMP_NO_LEN);
   	
   }
   
     /**
	 * 	Update HvEmpNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEmpNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hvEmpSal
	 *	@return hvEmpSal
	 */
   public char[] getHvEmpSal() throws CFException{
     if (isHvEmpSalModified()) { 
        hvEmpSal = refreshHvEmpSal();
     }
   		return hvEmpSal;
   }

  
	/**
	*  set variable hvEmpSal
	*  Corresponding COBOL Variable is HV-EMP-SAL
	*  @param value
	**/
   public void setHvEmpSal(char[] value) {
      hvEmpSal = checkHvEmpSalConstraints(value);
      serializeHvEmpSal(hvEmpSal);
   } 

     /**
	 * 	Update HvEmpSal 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHvEmpSal(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHvEmpSal,hvEmpSal.length);
   	
   }
   
   public void setHvEmpSal(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHvEmpSal,hvEmpSal.length);
   	
   }
   
     /**
	 * 	Update HvEmpSal 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpSal(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEmpSal+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HvEmpSal with another Field
	 *	@param value
	 */
   public void setHvEmpSal(Field source) {
       replace(source,0,source.length(),beginHvEmpSal,HV_EMP_SAL_LEN);
   	
   }  
   
     /**
	 * 	Update HvEmpSal 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHvEmpSal(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHvEmpSal,HV_EMP_SAL_LEN);
   	
   }
   
     /**
	 * 	Update HvEmpSal 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHvEmpSal(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHvEmpSal+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDcltemp06FieldLength() {
			return DCLTEMP_06_LENGTH;
		}

}
  
