package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip16901EntryFoundYGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip16901EntryFoundYGroup")

public class Ip16901EntryFoundYGroup extends Ip16901EntryFoundYGroupSerialized  implements InitializingBean {
   

						private char[] ip16901EntryFoundY = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip16901EntryFoundYGroup
	**/
    public Ip16901EntryFoundYGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip16901EntryFoundY
	 *	@return ip16901EntryFoundY
	 */
   public char[] getIp16901EntryFoundY() throws CFException{
     if (isIp16901EntryFoundYModified()) { 
        ip16901EntryFoundY = refreshIp16901EntryFoundY();
     }
   		return ip16901EntryFoundY;
   }

  
	/**
	*  set variable ip16901EntryFoundY
	*  Corresponding COBOL Variable is IP16901-ENTRY-FOUND-Y
	*  @param value
	**/
   public void setIp16901EntryFoundY(char[] value) {
      ip16901EntryFoundY = checkIp16901EntryFoundYConstraints(value);
      serializeIp16901EntryFoundY(ip16901EntryFoundY);
   } 

     /**
	 * 	Update Ip16901EntryFoundY 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp16901EntryFoundY(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp16901EntryFoundY,ip16901EntryFoundY.length);
   	
   }
   
   public void setIp16901EntryFoundY(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901EntryFoundY,ip16901EntryFoundY.length);
   	
   }
   
     /**
	 * 	Update Ip16901EntryFoundY 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901EntryFoundY(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901EntryFoundY+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip16901EntryFoundY with another Field
	 *	@param value
	 */
   public void setIp16901EntryFoundY(Field source) {
       replace(source,0,source.length(),beginIp16901EntryFoundY,IP_16901_ENTRY_FOUND_Y_LEN);
   	
   }  
   
     /**
	 * 	Update Ip16901EntryFoundY 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp16901EntryFoundY(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp16901EntryFoundY,IP_16901_ENTRY_FOUND_Y_LEN);
   	
   }
   
     /**
	 * 	Update Ip16901EntryFoundY 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901EntryFoundY(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp16901EntryFoundY+targetIndex,targetLen);
    
   }
	char[] ip16901EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp16901EntryFoundY88()
	 *	@return  Returns true if isIp16901EntryFoundY88() is "Y"
	 */
   public boolean isIp16901EntryFoundY88() throws CFException {
      return (  compareChars( getIp16901EntryFoundY() , ip16901EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp16901EntryFoundY88True() {  			
    	setIp16901EntryFoundY( ip16901EntryFoundY8888Value);
   	}
	char[] ip16901EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp16901EntryFoundN88()
	 *	@return  Returns true if isIp16901EntryFoundN88() is "N"
	 */
   public boolean isIp16901EntryFoundN88() throws CFException {
      return (  compareChars( getIp16901EntryFoundY() , ip16901EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp16901EntryFoundN88True() {  			
    	setIp16901EntryFoundY( ip16901EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp16901EntryFoundYGroupFieldLength() {
			return IP_16901_ENTRY_FOUND_YGROUP_LENGTH;
		}

}
  
