package com.cloudframe.app.mcissues.dto;

/**
*  The class Date2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Date2 extends Date2Serialized { 
   

						private char[] date21 = Field.fillLowValue(8);

						private char[] date22 = Field.fillLowValue(2);
	
	/**
	* Constructor for Date2
	**/
    public Date2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of date21
	 *	@return date21
	 */
   public char[] getDate21() throws CFException{
     if (isDate21Modified()) { 
        date21 = refreshDate21();
     }
   		return date21;
   }

  
	/**
	*  set variable date21
	*  Corresponding COBOL Variable is WS-DATE-2-1
	*  @param value
	**/
   public void setDate21(char[] value) {
      date21 = checkDate21Constraints(value);
      serializeDate21(date21);
   } 

     /**
	 * 	Update Date21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDate21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDate21,date21.length);
   	
   }
   
   public void setDate21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDate21,date21.length);
   	
   }
   
     /**
	 * 	Update Date21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDate21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDate21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Date21 with another Field
	 *	@param value
	 */
   public void setDate21(Field source) {
       replace(source,0,source.length(),beginDate21,DATE_21_LEN);
   	
   }  
   
     /**
	 * 	Update Date21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDate21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDate21,DATE_21_LEN);
   	
   }
   
     /**
	 * 	Update Date21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDate21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDate21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of date22
	 *	@return date22
	 */
   public char[] getDate22() throws CFException{
     if (isDate22Modified()) { 
        date22 = refreshDate22();
     }
   		return date22;
   }

  
	/**
	*  set variable date22
	*  Corresponding COBOL Variable is WS-DATE-2-2
	*  @param value
	**/
   public void setDate22(char[] value) {
      date22 = checkDate22Constraints(value);
      serializeDate22(date22);
   } 

     /**
	 * 	Update Date22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDate22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDate22,date22.length);
   	
   }
   
   public void setDate22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDate22,date22.length);
   	
   }
   
     /**
	 * 	Update Date22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDate22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDate22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Date22 with another Field
	 *	@param value
	 */
   public void setDate22(Field source) {
       replace(source,0,source.length(),beginDate22,DATE_22_LEN);
   	
   }  
   
     /**
	 * 	Update Date22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDate22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDate22,DATE_22_LEN);
   	
   }
   
     /**
	 * 	Update Date22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDate22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDate22+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDate2FieldLength() {
			return DATE_2_LENGTH;
		}

}
  
