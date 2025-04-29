package com.cloudframe.app.addrchk.dto;

/**
*  The class Groupvar1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.addrchk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Groupvar1 extends Groupvar1Serialized {
   

						private char[] data1 = new char[10];
	
	/**
	* Constructor for Groupvar1
	**/
    public Groupvar1() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setData1(("1234567890").toCharArray());
    }


 

	/**
	 *	Returns the value of data1
	 *	@return data1
	 */
   public char[] getData1() throws CFException{
     if (isData1Modified()) { 
        data1 = refreshData1();
     }
   		return data1;
   }

  
	/**
	*  set variable data1
	*  Corresponding COBOL Variable is WS-DATA1
	*  @param value
	**/
   public void setData1(char[] value) {
      data1 = checkData1Constraints(value);
      serializeData1(data1);
   } 

     /**
	 * 	Update Data1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginData1,data1.length);
   	
   }
   
   public void setData1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginData1,data1.length);
   	
   }
   
     /**
	 * 	Update Data1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Data1 with another Field
	 *	@param value
	 */
   public void setData1(Field source) {
       replace(source,0,source.length(),beginData1,DATA_1_LEN);
   	
   }  
   
     /**
	 * 	Update Data1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginData1,DATA_1_LEN);
   	
   }
   
     /**
	 * 	Update Data1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData1+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGroupvar1FieldLength() {
			return GROUPVAR_1_LENGTH;
		}

}
  
