package com.cloudframe.app.ip699930.dto;

/**
*  The class ProcessAgrmntNotFndMsg600 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.ip699930.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProcessAgrmntNotFndMsg600 extends ProcessAgrmntNotFndMsg600Serialized { 
   


						private char[] processAgrmntNotFndPa600 = Field.fillLowValue(11);
	
	/**
	* Constructor for ProcessAgrmntNotFndMsg600
	**/
    public ProcessAgrmntNotFndMsg600() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("PROCESSING AGREEMENT NOT FOUND IN THE ONE DAY FILE FOR: ").toCharArray()
             , getStartOffset() + 0
             ,56
             );
    }


 

	/**
	 *	Returns the value of processAgrmntNotFndPa600
	 *	@return processAgrmntNotFndPa600
	 */
   public char[] getProcessAgrmntNotFndPa600() throws CFException{
     if (isProcessAgrmntNotFndPa600Modified()) { 
        processAgrmntNotFndPa600 = refreshProcessAgrmntNotFndPa600();
     }
   		return processAgrmntNotFndPa600;
   }

  
	/**
	*  set variable processAgrmntNotFndPa600
	*  Corresponding COBOL Variable is 600-PROCESS-AGRMNT-NOT-FND-PA
	*  @param value
	**/
   public void setProcessAgrmntNotFndPa600(char[] value) {
      processAgrmntNotFndPa600 = checkProcessAgrmntNotFndPa600Constraints(value);
      serializeProcessAgrmntNotFndPa600(processAgrmntNotFndPa600);
   } 

     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProcessAgrmntNotFndPa600,processAgrmntNotFndPa600.length);
   	
   }
   
   public void setProcessAgrmntNotFndPa600(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProcessAgrmntNotFndPa600,processAgrmntNotFndPa600.length);
   	
   }
   
     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcessAgrmntNotFndPa600+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProcessAgrmntNotFndPa600 with another Field
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(Field source) {
       replace(source,0,source.length(),beginProcessAgrmntNotFndPa600,PROCESS_AGRMNT_NOT_FND_PA_600_LEN);
   	
   }  
   
     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProcessAgrmntNotFndPa600,PROCESS_AGRMNT_NOT_FND_PA_600_LEN);
   	
   }
   
     /**
	 * 	Update ProcessAgrmntNotFndPa600 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProcessAgrmntNotFndPa600(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProcessAgrmntNotFndPa600+targetIndex,targetLen);
    
   }

	
	
	

		public static int getProcessAgrmntNotFndMsg600FieldLength() {
			return PROCESS_AGRMNT_NOT_FND_MSG_600_LENGTH;
		}

}
  
