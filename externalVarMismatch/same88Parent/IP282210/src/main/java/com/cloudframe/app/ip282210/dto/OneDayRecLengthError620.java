package com.cloudframe.app.ip282210.dto;

/**
*  The class OneDayRecLengthError620 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip282210.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.utility.CFUtil;
import com.cloudframe.app.data.Field;


public class OneDayRecLengthError620 extends OneDayRecLengthError620Serialized { 
   


								private char[] errorLength620 = new char[8];
							
	
	/**
	* Constructor for OneDayRecLengthError620
	**/
    public OneDayRecLengthError620() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             (" TBL IP0201T1 RECORD LENGTH ERROR; LENGTH = ").toCharArray()
             , getStartOffset() + 0
             ,44
             );
								setErrorLength620(CFUtil.cobolNumberFormatter("ZZZZZZZ9".toCharArray(),"0".toCharArray()));
    }


 

	/**
	 *	Returns the value of errorLength620
	 *	@return errorLength620
	 */
   public char[] getErrorLength620() throws CFException{
     if (isErrorLength620Modified()) { 
        errorLength620 = refreshErrorLength620();
     }
   		return errorLength620;
   }

  
	/**
	*  set variable errorLength620
	*  Corresponding COBOL Variable is 620-ERROR-LENGTH
	*  @param value
	**/
   public void setErrorLength620(char[] value) {
      errorLength620 = checkErrorLength620Constraints(value);
      serializeErrorLength620(errorLength620);
   } 

     /**
	 * 	Update ErrorLength620 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorLength620(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorLength620,errorLength620.length);
   	
   }
   
   public void setErrorLength620(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorLength620,errorLength620.length);
   	
   }
   
     /**
	 * 	Update ErrorLength620 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorLength620(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorLength620+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorLength620 with another Field
	 *	@param value
	 */
   public void setErrorLength620(Field source) {
       replace(source,0,source.length(),beginErrorLength620,ERROR_LENGTH_620_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorLength620 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorLength620(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorLength620,ERROR_LENGTH_620_LEN);
   	
   }
   
     /**
	 * 	Update ErrorLength620 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorLength620(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorLength620+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOneDayRecLengthError620FieldLength() {
			return ONE_DAY_REC_LENGTH_ERROR_620_LENGTH;
		}

}
  
