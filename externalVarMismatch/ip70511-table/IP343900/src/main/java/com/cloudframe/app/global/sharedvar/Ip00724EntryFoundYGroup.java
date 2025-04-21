package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00724EntryFoundYGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00724EntryFoundYGroup")

public class Ip00724EntryFoundYGroup extends Ip00724EntryFoundYGroupSerialized  implements InitializingBean {
   

						private char[] ip00724EntryFoundY = Field.fillLowValue(1);
	
	/**
	* Constructor for Ip00724EntryFoundYGroup
	**/
    public Ip00724EntryFoundYGroup() {
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
	 *	Returns the value of ip00724EntryFoundY
	 *	@return ip00724EntryFoundY
	 */
   public char[] getIp00724EntryFoundY() throws CFException{
     if (isIp00724EntryFoundYModified()) { 
        ip00724EntryFoundY = refreshIp00724EntryFoundY();
     }
   		return ip00724EntryFoundY;
   }

  
	/**
	*  set variable ip00724EntryFoundY
	*  Corresponding COBOL Variable is IP00724-ENTRY-FOUND-Y
	*  @param value
	**/
   public void setIp00724EntryFoundY(char[] value) {
      ip00724EntryFoundY = checkIp00724EntryFoundYConstraints(value);
      serializeIp00724EntryFoundY(ip00724EntryFoundY);
   } 

     /**
	 * 	Update Ip00724EntryFoundY 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp00724EntryFoundY(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp00724EntryFoundY,ip00724EntryFoundY.length);
   	
   }
   
   public void setIp00724EntryFoundY(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724EntryFoundY,ip00724EntryFoundY.length);
   	
   }
   
     /**
	 * 	Update Ip00724EntryFoundY 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00724EntryFoundY(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724EntryFoundY+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip00724EntryFoundY with another Field
	 *	@param value
	 */
   public void setIp00724EntryFoundY(Field source) {
       replace(source,0,source.length(),beginIp00724EntryFoundY,IP_00724_ENTRY_FOUND_Y_LEN);
   	
   }  
   
     /**
	 * 	Update Ip00724EntryFoundY 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp00724EntryFoundY(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp00724EntryFoundY,IP_00724_ENTRY_FOUND_Y_LEN);
   	
   }
   
     /**
	 * 	Update Ip00724EntryFoundY 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00724EntryFoundY(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp00724EntryFoundY+targetIndex,targetLen);
    
   }
	char[] ip00724EntryFoundY8888Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isIp00724EntryFoundY88()
	 *	@return  Returns true if isIp00724EntryFoundY88() is "Y"
	 */
   public boolean isIp00724EntryFoundY88() throws CFException {
      return (  compareChars( getIp00724EntryFoundY() , ip00724EntryFoundY8888Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setIp00724EntryFoundY88True() {  			
    	setIp00724EntryFoundY( ip00724EntryFoundY8888Value);
   	}
	char[] ip00724EntryFoundN8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp00724EntryFoundN88()
	 *	@return  Returns true if isIp00724EntryFoundN88() is "N"
	 */
   public boolean isIp00724EntryFoundN88() throws CFException {
      return (  compareChars( getIp00724EntryFoundY() , ip00724EntryFoundN8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp00724EntryFoundN88True() {  			
    	setIp00724EntryFoundY( ip00724EntryFoundN8888Value);
   	}

	
	
	

		public static int getIp00724EntryFoundYGroupFieldLength() {
			return IP_00724_ENTRY_FOUND_YGROUP_LENGTH;
		}

}
  
