package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003009 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003009 extends ErrorMsg6003009Serialized {
   


						private char[] tag6003009 = new char[1];

	
	/**
	* Constructor for ErrorMsg6003009
	**/
    public ErrorMsg6003009() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("INVALID TAG '").toCharArray()
             , getStartOffset() + 0
             ,13
             );
								setTag6003009(fillSpace(1));
       replaceValue( // serialize and save the value
             ("'").toCharArray()
             , getStartOffset() + 14
             ,1
             );
    }


 

	/**
	 *	Returns the value of tag6003009
	 *	@return tag6003009
	 */
   public char[] getTag6003009() throws CFException{
     if (isTag6003009Modified()) { 
        tag6003009 = refreshTag6003009();
     }
   		return tag6003009;
   }

  
	/**
	*  set variable tag6003009
	*  Corresponding COBOL Variable is 600-3009-TAG
	*  @param value
	**/
   public void setTag6003009(char[] value) {
      tag6003009 = checkTag6003009Constraints(value);
      serializeTag6003009(tag6003009);
   } 

     /**
	 * 	Update Tag6003009 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTag6003009(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTag6003009,tag6003009.length);
   	
   }
   
   public void setTag6003009(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTag6003009,tag6003009.length);
   	
   }
   
     /**
	 * 	Update Tag6003009 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTag6003009(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTag6003009+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tag6003009 with another Field
	 *	@param value
	 */
   public void setTag6003009(Field source) {
       replace(source,0,source.length(),beginTag6003009,TAG_6003009_LEN);
   	
   }  
   
     /**
	 * 	Update Tag6003009 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTag6003009(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTag6003009,TAG_6003009_LEN);
   	
   }
   
     /**
	 * 	Update Tag6003009 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTag6003009(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTag6003009+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003009FieldLength() {
			return ERROR_MSG_6003009_LENGTH;
		}

}
  
