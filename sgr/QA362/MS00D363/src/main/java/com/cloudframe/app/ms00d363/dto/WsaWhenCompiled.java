package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaWhenCompiled is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WsaWhenCompiled extends WsaWhenCompiledSerialized {
   

						private char[] wsaCompiledDate = new char[8];

						private char[] wsaCompiledTime = new char[12];
	
	/**
	* Constructor for WsaWhenCompiled
	**/
    public WsaWhenCompiled() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaCompiledDate(fillSpace(8));
								setWsaCompiledTime(fillSpace(12));
    }


 

	/**
	 *	Returns the value of wsaCompiledDate
	 *	@return wsaCompiledDate
	 */
   public char[] getWsaCompiledDate() throws CFException{
     if (isWsaCompiledDateModified()) { 
        wsaCompiledDate = refreshWsaCompiledDate();
     }
   		return wsaCompiledDate;
   }

  
	/**
	*  set variable wsaCompiledDate
	*  Corresponding COBOL Variable is WSA-COMPILED-DATE
	*  @param value
	**/
   public void setWsaCompiledDate(char[] value) {
      wsaCompiledDate = checkWsaCompiledDateConstraints(value);
      serializeWsaCompiledDate(wsaCompiledDate);
   } 

     /**
	 * 	Update WsaCompiledDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaCompiledDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaCompiledDate,wsaCompiledDate.length);
   	
   }
   
   public void setWsaCompiledDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledDate,wsaCompiledDate.length);
   	
   }
   
     /**
	 * 	Update WsaCompiledDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaCompiledDate with another Field
	 *	@param value
	 */
   public void setWsaCompiledDate(Field source) {
       replace(source,0,source.length(),beginWsaCompiledDate,WSA_COMPILED_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WsaCompiledDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaCompiledDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaCompiledDate,WSA_COMPILED_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WsaCompiledDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsaCompiledTime
	 *	@return wsaCompiledTime
	 */
   public char[] getWsaCompiledTime() throws CFException{
     if (isWsaCompiledTimeModified()) { 
        wsaCompiledTime = refreshWsaCompiledTime();
     }
   		return wsaCompiledTime;
   }

  
	/**
	*  set variable wsaCompiledTime
	*  Corresponding COBOL Variable is WSA-COMPILED-TIME
	*  @param value
	**/
   public void setWsaCompiledTime(char[] value) {
      wsaCompiledTime = checkWsaCompiledTimeConstraints(value);
      serializeWsaCompiledTime(wsaCompiledTime);
   } 

     /**
	 * 	Update WsaCompiledTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaCompiledTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaCompiledTime,wsaCompiledTime.length);
   	
   }
   
   public void setWsaCompiledTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledTime,wsaCompiledTime.length);
   	
   }
   
     /**
	 * 	Update WsaCompiledTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaCompiledTime with another Field
	 *	@param value
	 */
   public void setWsaCompiledTime(Field source) {
       replace(source,0,source.length(),beginWsaCompiledTime,WSA_COMPILED_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update WsaCompiledTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaCompiledTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaCompiledTime,WSA_COMPILED_TIME_LEN);
   	
   }
   
     /**
	 * 	Update WsaCompiledTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledTime+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWsaWhenCompiledFieldLength() {
			return WSA_WHEN_COMPILED_LENGTH;
		}

}
  
