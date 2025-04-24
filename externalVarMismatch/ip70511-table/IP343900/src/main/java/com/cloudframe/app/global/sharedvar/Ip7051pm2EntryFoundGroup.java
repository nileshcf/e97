package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051pm2EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip7051pm2EntryFoundGroup extends Ip7051pm2EntryFoundGroupSerialized { 
   

						private char[] ip7051pm2EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip7051pm2EntryFoundGroup
	**/
    public Ip7051pm2EntryFoundGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip7051pm2EntryFound
	 *	@return ip7051pm2EntryFound
	 */
   public char[] getIp7051pm2EntryFound() throws CFException{
     if (isIp7051pm2EntryFoundModified()) { 
        ip7051pm2EntryFound = refreshIp7051pm2EntryFound();
     }
   		return ip7051pm2EntryFound;
   }

  
	/**
	*  set variable ip7051pm2EntryFound
	*  Corresponding COBOL Variable is IP7051PM2-ENTRY-FOUND
	*  @param value
	**/
   public void setIp7051pm2EntryFound(char[] value) {
      ip7051pm2EntryFound = checkIp7051pm2EntryFoundConstraints(value);
      serializeIp7051pm2EntryFound(ip7051pm2EntryFound);
   } 

     /**
	 * 	Update Ip7051pm2EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051pm2EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051pm2EntryFound,ip7051pm2EntryFound.length);
   	
   }
   
   public void setIp7051pm2EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2EntryFound,ip7051pm2EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip7051pm2EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051pm2EntryFound with another Field
	 *	@param value
	 */
   public void setIp7051pm2EntryFound(Field source) {
       replace(source,0,source.length(),beginIp7051pm2EntryFound,IP_7051PM_2_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051pm2EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051pm2EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051pm2EntryFound,IP_7051PM_2_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051pm2EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051pm2EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051pm2EntryFound+targetIndex,targetLen);
    
   }
	char[] ip7051pm2EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7051pm2EntryFoundY88()
	 *	@return  Returns true if isIp7051pm2EntryFoundY88() is "Y"
	 */
   public boolean isIp7051pm2EntryFoundY88() throws CFException {
      return (  compareChars( getIp7051pm2EntryFound() , ip7051pm2EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7051pm2EntryFoundY88True() {  			
    	setIp7051pm2EntryFound( ip7051pm2EntryFoundY8888Value);
   	}
	char[] ip7051pm2EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7051pm2EntryFoundN88()
	 *	@return  Returns true if isIp7051pm2EntryFoundN88() is "N"
	 */
   public boolean isIp7051pm2EntryFoundN88() throws CFException {
      return (  compareChars( getIp7051pm2EntryFound() , ip7051pm2EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7051pm2EntryFoundN88True() {  			
    	setIp7051pm2EntryFound( ip7051pm2EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp7051pm2EntryFoundGroupFieldLength() {
			return IP_7051PM_2_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
