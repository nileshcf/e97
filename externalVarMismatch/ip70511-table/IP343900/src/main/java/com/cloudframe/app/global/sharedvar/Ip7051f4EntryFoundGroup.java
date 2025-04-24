package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip7051f4EntryFoundGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:39. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip7051f4EntryFoundGroup extends Ip7051f4EntryFoundGroupSerialized { 
   

						private char[] ip7051f4EntryFound = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip7051f4EntryFoundGroup
	**/
    public Ip7051f4EntryFoundGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip7051f4EntryFound
	 *	@return ip7051f4EntryFound
	 */
   public char[] getIp7051f4EntryFound() throws CFException{
     if (isIp7051f4EntryFoundModified()) { 
        ip7051f4EntryFound = refreshIp7051f4EntryFound();
     }
   		return ip7051f4EntryFound;
   }

  
	/**
	*  set variable ip7051f4EntryFound
	*  Corresponding COBOL Variable is IP7051F4-ENTRY-FOUND
	*  @param value
	**/
   public void setIp7051f4EntryFound(char[] value) {
      ip7051f4EntryFound = checkIp7051f4EntryFoundConstraints(value);
      serializeIp7051f4EntryFound(ip7051f4EntryFound);
   } 

     /**
	 * 	Update Ip7051f4EntryFound 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp7051f4EntryFound(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp7051f4EntryFound,ip7051f4EntryFound.length);
   	
   }
   
   public void setIp7051f4EntryFound(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4EntryFound,ip7051f4EntryFound.length);
   	
   }
   
     /**
	 * 	Update Ip7051f4EntryFound 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4EntryFound(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4EntryFound+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip7051f4EntryFound with another Field
	 *	@param value
	 */
   public void setIp7051f4EntryFound(Field source) {
       replace(source,0,source.length(),beginIp7051f4EntryFound,IP_7051F_4_ENTRY_FOUND_LEN);
   	
   }  
   
     /**
	 * 	Update Ip7051f4EntryFound 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp7051f4EntryFound(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp7051f4EntryFound,IP_7051F_4_ENTRY_FOUND_LEN);
   	
   }
   
     /**
	 * 	Update Ip7051f4EntryFound 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp7051f4EntryFound(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp7051f4EntryFound+targetIndex,targetLen);
    
   }
	char[] ip7051f4EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp7051f4EntryFoundY88()
	 *	@return  Returns true if isIp7051f4EntryFoundY88() is "Y"
	 */
   public boolean isIp7051f4EntryFoundY88() throws CFException {
      return (  compareChars( getIp7051f4EntryFound() , ip7051f4EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp7051f4EntryFoundY88True() {  			
    	setIp7051f4EntryFound( ip7051f4EntryFoundY8888Value);
   	}
	char[] ip7051f4EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp7051f4EntryFoundN88()
	 *	@return  Returns true if isIp7051f4EntryFoundN88() is "N"
	 */
   public boolean isIp7051f4EntryFoundN88() throws CFException {
      return (  compareChars( getIp7051f4EntryFound() , ip7051f4EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp7051f4EntryFoundN88True() {  			
    	setIp7051f4EntryFound( ip7051f4EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp7051f4EntryFoundGroupFieldLength() {
			return IP_7051F_4_ENTRY_FOUND_GROUP_LENGTH;
		}

}
  
