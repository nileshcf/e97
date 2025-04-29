package com.cloudframe.app.addrchk.dto;

/**
*  The class Var3 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.addrchk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Var3 extends Var3Serialized {
   

						private char[] data3 = Field.fillLowValue(10);
	
	/**
	* Constructor for Var3
	**/
    public Var3() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of data3
	 *	@return data3
	 */
   public char[] getData3() throws CFException{
     if (isData3Modified()) { 
        data3 = refreshData3();
     }
   		return data3;
   }

  
	/**
	*  set variable data3
	*  Corresponding COBOL Variable is LK-DATA3
	*  @param value
	**/
   public void setData3(char[] value) {
      data3 = checkData3Constraints(value);
      serializeData3(data3);
   } 

     /**
	 * 	Update Data3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginData3,data3.length);
   	
   }
   
   public void setData3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginData3,data3.length);
   	
   }
   
     /**
	 * 	Update Data3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Data3 with another Field
	 *	@param value
	 */
   public void setData3(Field source) {
       replace(source,0,source.length(),beginData3,DATA_3_LEN);
   	
   }  
   
     /**
	 * 	Update Data3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginData3,DATA_3_LEN);
   	
   }
   
     /**
	 * 	Update Data3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData3+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVar3FieldLength() {
			return VAR_3_LENGTH;
		}

}
  
