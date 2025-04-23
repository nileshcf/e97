package com.cloudframe.app.addrchk.dto;

/**
*  The class Groupvar2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/


import com.cloudframe.app.addrchk.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Groupvar2 extends Groupvar2Serialized {
   

						private char[] data2 = new char[10];
	
	/**
	* Constructor for Groupvar2
	**/
    public Groupvar2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setData2(("ABCDEFGHIJ").toCharArray());
    }


 

	/**
	 *	Returns the value of data2
	 *	@return data2
	 */
   public char[] getData2() throws CFException{
     if (isData2Modified()) { 
        data2 = refreshData2();
     }
   		return data2;
   }

  
	/**
	*  set variable data2
	*  Corresponding COBOL Variable is WS-DATA2
	*  @param value
	**/
   public void setData2(char[] value) {
      data2 = checkData2Constraints(value);
      serializeData2(data2);
   } 

     /**
	 * 	Update Data2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginData2,data2.length);
   	
   }
   
   public void setData2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginData2,data2.length);
   	
   }
   
     /**
	 * 	Update Data2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Data2 with another Field
	 *	@param value
	 */
   public void setData2(Field source) {
       replace(source,0,source.length(),beginData2,DATA_2_LEN);
   	
   }  
   
     /**
	 * 	Update Data2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginData2,DATA_2_LEN);
   	
   }
   
     /**
	 * 	Update Data2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGroupvar2FieldLength() {
			return GROUPVAR_2_LENGTH;
		}

}
  
