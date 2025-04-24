package com.cloudframe.app.ar640010.dto;

/**
*  The class LogEntry570 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class LogEntry570 extends LogEntry570Serialized { 
   

						private char[] logMessage570 = new char[115];
	
	/**
	* Constructor for LogEntry570
	**/
    public LogEntry570() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for LogEntry570. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LogEntry570(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setLogMessage570(pad(115," ".toCharArray(),' ',RIGHT_PAD));
    } 

	/**
	 *	Returns the value of logMessage570
	 *	@return logMessage570
	 */
   public char[] getLogMessage570() throws CFException{
     if (isLogMessage570Modified()) { 
        logMessage570 = refreshLogMessage570();
     }
   		return logMessage570;
   }

  
	/**
	*  set variable logMessage570
	*  Corresponding COBOL Variable is 570-LOG-MESSAGE
	*  @param value
	**/
   public void setLogMessage570(char[] value) {
      logMessage570 = checkLogMessage570Constraints(value);
      serializeLogMessage570(logMessage570);
   } 

     /**
	 * 	Update LogMessage570 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLogMessage570(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLogMessage570,logMessage570.length);
   	
   }
   
   public void setLogMessage570(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLogMessage570,logMessage570.length);
   	
   }
   
     /**
	 * 	Update LogMessage570 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLogMessage570(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogMessage570+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LogMessage570 with another Field
	 *	@param value
	 */
   public void setLogMessage570(Field source) {
       replace(source,0,source.length(),beginLogMessage570,LOG_MESSAGE_570_LEN);
   	
   }  
   
     /**
	 * 	Update LogMessage570 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLogMessage570(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLogMessage570,LOG_MESSAGE_570_LEN);
   	
   }
   
     /**
	 * 	Update LogMessage570 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLogMessage570(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLogMessage570+targetIndex,targetLen);
    
   }

	
	
	

		public static int getLogEntry570FieldLength() {
			return LOG_ENTRY_570_LENGTH;
		}

}
  
