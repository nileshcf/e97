package com.cloudframe.app.ip989010.dto;

/**
*  The class ErrorMsg6003014 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.ip989010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ErrorMsg6003014 extends ErrorMsg6003014Serialized {
   


						private char[] rtnCd6003014 = new char[8];
	
	/**
	* Constructor for ErrorMsg6003014
	**/
    public ErrorMsg6003014() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("BAD RETURN CODE FROM DATE CONVERSION. RC=").toCharArray()
             , getStartOffset() + 0
             ,41
             );
								setRtnCd6003014(fillSpace(8));
    }


 

	/**
	 *	Returns the value of rtnCd6003014
	 *	@return rtnCd6003014
	 */
   public char[] getRtnCd6003014() throws CFException{
     if (isRtnCd6003014Modified()) { 
        rtnCd6003014 = refreshRtnCd6003014();
     }
   		return rtnCd6003014;
   }

  
	/**
	*  set variable rtnCd6003014
	*  Corresponding COBOL Variable is 600-3014-RTN-CD
	*  @param value
	**/
   public void setRtnCd6003014(char[] value) {
      rtnCd6003014 = checkRtnCd6003014Constraints(value);
      serializeRtnCd6003014(rtnCd6003014);
   } 

     /**
	 * 	Update RtnCd6003014 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRtnCd6003014(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRtnCd6003014,rtnCd6003014.length);
   	
   }
   
   public void setRtnCd6003014(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRtnCd6003014,rtnCd6003014.length);
   	
   }
   
     /**
	 * 	Update RtnCd6003014 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRtnCd6003014(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRtnCd6003014+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RtnCd6003014 with another Field
	 *	@param value
	 */
   public void setRtnCd6003014(Field source) {
       replace(source,0,source.length(),beginRtnCd6003014,RTN_CD_6003014_LEN);
   	
   }  
   
     /**
	 * 	Update RtnCd6003014 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRtnCd6003014(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRtnCd6003014,RTN_CD_6003014_LEN);
   	
   }
   
     /**
	 * 	Update RtnCd6003014 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRtnCd6003014(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRtnCd6003014+targetIndex,targetLen);
    
   }

	
	
	

		public static int getErrorMsg6003014FieldLength() {
			return ERROR_MSG_6003014_LENGTH;
		}

}
  
