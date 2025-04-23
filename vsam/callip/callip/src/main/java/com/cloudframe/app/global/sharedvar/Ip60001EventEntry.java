package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip60001EventEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:21. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip60001EventEntry extends Ip60001EventEntrySerialized { 
   

						private char[] ip60001PgmName = Field.fillLowValue(8);
	
	/**
	* Constructor for Ip60001EventEntry
	**/
    public Ip60001EventEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip60001EventEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip60001EventEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ip60001PgmName
	 *	@return ip60001PgmName
	 */
   public char[] getIp60001PgmName() throws CFException{
     if (isIp60001PgmNameModified()) { 
        ip60001PgmName = refreshIp60001PgmName();
     }
   		return ip60001PgmName;
   }

  
	/**
	*  set variable ip60001PgmName
	*  Corresponding COBOL Variable is IP60001-PGM-NAME
	*  @param value
	**/
   public void setIp60001PgmName(char[] value) {
      ip60001PgmName = checkIp60001PgmNameConstraints(value);
      serializeIp60001PgmName(ip60001PgmName);
   } 

     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp60001PgmName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp60001PgmName,ip60001PgmName.length);
   	
   }
   
   public void setIp60001PgmName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001PgmName,ip60001PgmName.length);
   	
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001PgmName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip60001PgmName with another Field
	 *	@param value
	 */
   public void setIp60001PgmName(Field source) {
       replace(source,0,source.length(),beginIp60001PgmName,IP_60001_PGM_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp60001PgmName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp60001PgmName,IP_60001_PGM_NAME_LEN);
   	
   }
   
     /**
	 * 	Update Ip60001PgmName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp60001PgmName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp60001PgmName+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip60001EventEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp60001PgmName(CONSTANTS.SPACE_8);
   }

		public static int getIp60001EventEntryFieldLength() {
			return IP_60001_EVENT_ENTRY_LENGTH;
		}

}
  
