package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip90134EntryFoundGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import com.cloudframe.app.data.Field;


@GlobalDto
public class Ip90134EntryFoundGroup800 extends Ip90134EntryFoundGroup800Serialized { 
   

						private char[] ip90134EntryFound800 = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip90134EntryFoundGroup800
	**/
    public Ip90134EntryFoundGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip90134EntryFound800
	 *	@return ip90134EntryFound800
	 */
   public char[] getIp90134EntryFound800() throws CFException{
     if (isIp90134EntryFound800Modified()) { 
        ip90134EntryFound800 = refreshIp90134EntryFound800();
     }
   		return ip90134EntryFound800;
   }

  
	/**
	*  set variable ip90134EntryFound800
	*  Corresponding COBOL Variable is 800-IP90134-ENTRY-FOUND
	*  @param value
	**/
   public void setIp90134EntryFound800(char[] value) {
      ip90134EntryFound800 = checkIp90134EntryFound800Constraints(value);
      serializeIp90134EntryFound800(ip90134EntryFound800);
   } 

     /**
	 * 	Update Ip90134EntryFound800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp90134EntryFound800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp90134EntryFound800,ip90134EntryFound800.length);
   	
   }
   
   public void setIp90134EntryFound800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134EntryFound800,ip90134EntryFound800.length);
   	
   }
   
     /**
	 * 	Update Ip90134EntryFound800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EntryFound800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134EntryFound800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip90134EntryFound800 with another Field
	 *	@param value
	 */
   public void setIp90134EntryFound800(Field source) {
       replace(source,0,source.length(),beginIp90134EntryFound800,IP_90134_ENTRY_FOUND_800_LEN);
   	
   }  
   
     /**
	 * 	Update Ip90134EntryFound800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp90134EntryFound800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp90134EntryFound800,IP_90134_ENTRY_FOUND_800_LEN);
   	
   }
   
     /**
	 * 	Update Ip90134EntryFound800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp90134EntryFound800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp90134EntryFound800+targetIndex,targetLen);
    
   }
	char[] ip90134EntryFoundY8880088Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp90134EntryFoundY88800()
	 *	@return  Returns true if isIp90134EntryFoundY88800() is "Y"
	 */
   public boolean isIp90134EntryFoundY88800() throws CFException {
      return (  compareChars( getIp90134EntryFound800() , ip90134EntryFoundY8880088Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp90134EntryFoundY88800True() {  			
    	setIp90134EntryFound800( ip90134EntryFoundY8880088Value);
   	}
	char[] ip90134EntryFoundN8880088Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp90134EntryFoundN88800()
	 *	@return  Returns true if isIp90134EntryFoundN88800() is "N"
	 */
   public boolean isIp90134EntryFoundN88800() throws CFException {
      return (  compareChars( getIp90134EntryFound800() , ip90134EntryFoundN8880088Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp90134EntryFoundN88800True() {  			
    	setIp90134EntryFound800( ip90134EntryFoundN8880088Value);
   	}

	
	
	

		public static int getIp90134EntryFoundGroup800FieldLength() {
			return IP_90134_ENTRY_FOUND_GROUP_800_LENGTH;
		}

}
  
