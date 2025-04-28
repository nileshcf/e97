package com.cloudframe.app.ip343690.dto;

/**
*  The class Msg3001a600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Msg3001a600 extends Msg3001a600Serialized {
   


						private char[] msg3001aFileStatus600 = new char[2];
	
	/**
	* Constructor for Msg3001a600
	**/
    public Msg3001a600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("ERROR PROCESSING DB2CLONE FILE:                 ").toCharArray()
             , getStartOffset() + 0
             ,48
             );
								setMsg3001aFileStatus600(fillSpace(2));
    }


 

	/**
	 *	Returns the value of msg3001aFileStatus600
	 *	@return msg3001aFileStatus600
	 */
   public char[] getMsg3001aFileStatus600() throws CFException{
     if (isMsg3001aFileStatus600Modified()) { 
        msg3001aFileStatus600 = refreshMsg3001aFileStatus600();
     }
   		return msg3001aFileStatus600;
   }

  
	/**
	*  set variable msg3001aFileStatus600
	*  Corresponding COBOL Variable is 600-MSG-3001A-FILE-STATUS
	*  @param value
	**/
   public void setMsg3001aFileStatus600(char[] value) {
      msg3001aFileStatus600 = checkMsg3001aFileStatus600Constraints(value);
      serializeMsg3001aFileStatus600(msg3001aFileStatus600);
   } 

     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMsg3001aFileStatus600,msg3001aFileStatus600.length);
   	
   }
   
   public void setMsg3001aFileStatus600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMsg3001aFileStatus600,msg3001aFileStatus600.length);
   	
   }
   
     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsg3001aFileStatus600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Msg3001aFileStatus600 with another Field
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(Field source) {
       replace(source,0,source.length(),beginMsg3001aFileStatus600,MSG_3001A_FILE_STATUS_600_LEN);
   	
   }  
   
     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMsg3001aFileStatus600,MSG_3001A_FILE_STATUS_600_LEN);
   	
   }
   
     /**
	 * 	Update Msg3001aFileStatus600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsg3001aFileStatus600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMsg3001aFileStatus600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMsg3001a600FieldLength() {
			return MSG_3001A_600_LENGTH;
		}

}
  
