package com.cloudframe.app.addrchk.dto;

/**
*  The class Var1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:18. using version 5.0.0.254
**/


import com.cloudframe.app.addrchk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Var1 extends Var1Serialized {
   

						private char[] data101 = Field.fillLowValue(10);
	
	/**
	* Constructor for Var1
	**/
    public Var1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of data101
	 *	@return data101
	 */
   public char[] getData101() throws CFException{
     if (isData101Modified()) { 
        data101 = refreshData101();
     }
   		return data101;
   }

  
	/**
	*  set variable data101
	*  Corresponding COBOL Variable is LK-DATA1
	*  @param value
	**/
   public void setData101(char[] value) {
      data101 = checkData101Constraints(value);
      serializeData101(data101);
   } 

     /**
	 * 	Update Data101 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData101(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginData101,data101.length);
   	
   }
   
   public void setData101(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginData101,data101.length);
   	
   }
   
     /**
	 * 	Update Data101 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData101(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData101+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Data101 with another Field
	 *	@param value
	 */
   public void setData101(Field source) {
       replace(source,0,source.length(),beginData101,DATA_101_LEN);
   	
   }  
   
     /**
	 * 	Update Data101 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData101(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginData101,DATA_101_LEN);
   	
   }
   
     /**
	 * 	Update Data101 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData101(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData101+targetIndex,targetLen);
    
   }

	
	
	

		public static int getVar1FieldLength() {
			return VAR_1_LENGTH;
		}

}
  
