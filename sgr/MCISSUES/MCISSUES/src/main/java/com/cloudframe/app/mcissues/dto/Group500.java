package com.cloudframe.app.mcissues.dto;

/**
*  The class Group500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Group500 extends Group500Serialized { 
   

						private char[] data500 = Field.fillLowValue(4);
	
	/**
	* Constructor for Group500
	**/
    public Group500() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Group500. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Group500(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of data500
	 *	@return data500
	 */
   public char[] getData500() throws CFException{
     if (isData500Modified()) { 
        data500 = refreshData500();
     }
   		return data500;
   }

  
	/**
	*  set variable data500
	*  Corresponding COBOL Variable is 500-DATA
	*  @param value
	**/
   public void setData500(char[] value) {
      data500 = checkData500Constraints(value);
      serializeData500(data500);
   } 

     /**
	 * 	Update Data500 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setData500(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginData500,data500.length);
   	
   }
   
   public void setData500(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginData500,data500.length);
   	
   }
   
     /**
	 * 	Update Data500 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setData500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData500+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Data500 with another Field
	 *	@param value
	 */
   public void setData500(Field source) {
       replace(source,0,source.length(),beginData500,DATA_500_LEN);
   	
   }  
   
     /**
	 * 	Update Data500 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setData500(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginData500,DATA_500_LEN);
   	
   }
   
     /**
	 * 	Update Data500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setData500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginData500+targetIndex,targetLen);
    
   }

	
	
	

		public static int getGroup500FieldLength() {
			return GROUP_500_LENGTH;
		}

}
  
