package com.cloudframe.app.sf311010.dto;

/**
*  The class DataGroup1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DataGroup1000 extends DataGroup1000Serialized { 
   

						private char[] data1000 = Field.fillLowValue(16384);
	
	/**
	* Constructor for DataGroup1000
	**/
    public DataGroup1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of data1000
	 *	@return data1000
	 */
   public char[] getData1000() throws CFException{
     if (isData1000Modified()) { 
        data1000 = refreshData1000();
     }
   		return data1000;
   }

  
	/**
	*  set variable data1000
	*  Corresponding COBOL Variable is 1000-DATA
	*  @param value
	**/
   public void setData1000(char[] value) {
      data1000 = checkData1000Constraints(value);
      serializeData1000(data1000);
   } 

     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginData1000,data1000.length);
   	
   }
   
   public void setData1000(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginData1000,data1000.length);
   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData1000(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData1000+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Data1000 with another Field
	 *	@param value
	 */
   public void setData1000(Field source) {
       replace(source,0,source.length(),beginData1000,DATA_1000_LEN);
   	
   }  
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginData1000,DATA_1000_LEN);
   	
   }
   
     /**
	 * 	Update Data1000 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData1000(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData1000+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDataGroup1000FieldLength() {
			return DATA_GROUP_1000_LENGTH;
		}

}
  
