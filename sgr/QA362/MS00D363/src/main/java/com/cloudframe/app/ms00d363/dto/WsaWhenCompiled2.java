package com.cloudframe.app.ms00d363.dto;

/**
*  The class WsaWhenCompiled2 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WsaWhenCompiled2 extends WsaWhenCompiled2Serialized { 
   

						private char[] wsaCompiledDate2 = new char[8];


						private char[] wsaCompiledTime2 = new char[12];
	
	/**
	* Constructor for WsaWhenCompiled2
	**/
    public WsaWhenCompiled2() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setWsaCompiledDate2(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 8
             ,1
             );
								setWsaCompiledTime2(fillSpace(12));
    }


 

	/**
	 *	Returns the value of wsaCompiledDate2
	 *	@return wsaCompiledDate2
	 */
   public char[] getWsaCompiledDate2() throws CFException{
     if (isWsaCompiledDate2Modified()) { 
        wsaCompiledDate2 = refreshWsaCompiledDate2();
     }
   		return wsaCompiledDate2;
   }

  
	/**
	*  set variable wsaCompiledDate2
	*  Corresponding COBOL Variable is WSA-COMPILED-DATE2
	*  @param value
	**/
   public void setWsaCompiledDate2(char[] value) {
      wsaCompiledDate2 = checkWsaCompiledDate2Constraints(value);
      serializeWsaCompiledDate2(wsaCompiledDate2);
   } 

     /**
	 * 	Update WsaCompiledDate2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaCompiledDate2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaCompiledDate2,wsaCompiledDate2.length);
   	
   }
   
   public void setWsaCompiledDate2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledDate2,wsaCompiledDate2.length);
   	
   }
   
     /**
	 * 	Update WsaCompiledDate2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledDate2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledDate2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaCompiledDate2 with another Field
	 *	@param value
	 */
   public void setWsaCompiledDate2(Field source) {
       replace(source,0,source.length(),beginWsaCompiledDate2,WSA_COMPILED_DATE_2_LEN);
   	
   }  
   
     /**
	 * 	Update WsaCompiledDate2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaCompiledDate2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaCompiledDate2,WSA_COMPILED_DATE_2_LEN);
   	
   }
   
     /**
	 * 	Update WsaCompiledDate2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledDate2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledDate2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wsaCompiledTime2
	 *	@return wsaCompiledTime2
	 */
   public char[] getWsaCompiledTime2() throws CFException{
     if (isWsaCompiledTime2Modified()) { 
        wsaCompiledTime2 = refreshWsaCompiledTime2();
     }
   		return wsaCompiledTime2;
   }

  
	/**
	*  set variable wsaCompiledTime2
	*  Corresponding COBOL Variable is WSA-COMPILED-TIME2
	*  @param value
	**/
   public void setWsaCompiledTime2(char[] value) {
      wsaCompiledTime2 = checkWsaCompiledTime2Constraints(value);
      serializeWsaCompiledTime2(wsaCompiledTime2);
   } 

     /**
	 * 	Update WsaCompiledTime2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWsaCompiledTime2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWsaCompiledTime2,wsaCompiledTime2.length);
   	
   }
   
   public void setWsaCompiledTime2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledTime2,wsaCompiledTime2.length);
   	
   }
   
     /**
	 * 	Update WsaCompiledTime2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledTime2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledTime2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WsaCompiledTime2 with another Field
	 *	@param value
	 */
   public void setWsaCompiledTime2(Field source) {
       replace(source,0,source.length(),beginWsaCompiledTime2,WSA_COMPILED_TIME_2_LEN);
   	
   }  
   
     /**
	 * 	Update WsaCompiledTime2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWsaCompiledTime2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWsaCompiledTime2,WSA_COMPILED_TIME_2_LEN);
   	
   }
   
     /**
	 * 	Update WsaCompiledTime2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWsaCompiledTime2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWsaCompiledTime2+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWsaWhenCompiled2FieldLength() {
			return WSA_WHEN_COMPILED_2_LENGTH;
		}

}
  
