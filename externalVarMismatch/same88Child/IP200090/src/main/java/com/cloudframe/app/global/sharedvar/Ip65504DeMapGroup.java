package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504DeMapGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip65504DeMapGroup")

public class Ip65504DeMapGroup extends Ip65504DeMapGroupSerialized  implements InitializingBean {
   
					private Ip65504DeMap ip65504DeMap = new Ip65504DeMap();
					private Ip65504DeNames ip65504DeNames = new Ip65504DeNames();
	
	/**
	* Constructor for Ip65504DeMapGroup
	**/
    public Ip65504DeMapGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip65504DeMap.setParent(this,getStartOffset() + 0);
	       			ip65504DeNames.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip65504DeMap
	 *	@return ip65504DeMap
	 */   
	 public Ip65504DeMap getIp65504DeMap() {
   	return ip65504DeMap;
   }
   /**
	* 	Update Ip65504DeMap with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-MAP
	*	@param value
	*/
   public void setIp65504DeMap(char[] value) {
      ip65504DeMap.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeMap(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeMap.begin,ip65504DeMap.length());
   }
   
     /**
	 * 	Update Ip65504DeMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeMap.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeMap with another Field
	 *	@param value
	 */
   public void setIp65504DeMap(Field source) {
   	replace(source,0,source.length(),ip65504DeMap.begin,ip65504DeMap.length());
   }  
   
     /**
	 * 	Update Ip65504DeMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeMap(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeMap.begin,ip65504DeMap.length());
   }
   
     /**
	 * 	Update Ip65504DeMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeMap.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504DeNames
	 *	@return ip65504DeNames
	 */   
	 public Ip65504DeNames getIp65504DeNames() {
   	return ip65504DeNames;
   }
   /**
	* 	Update Ip65504DeNames with the passed value
	*   Corresponding COBOL Variable is IP65504-DE-NAMES
	*	@param value
	*/
   public void setIp65504DeNames(char[] value) {
      ip65504DeNames.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504DeNames 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNames(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNames.begin,ip65504DeNames.length());
   }
   
     /**
	 * 	Update Ip65504DeNames 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNames(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNames.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504DeNames with another Field
	 *	@param value
	 */
   public void setIp65504DeNames(Field source) {
   	replace(source,0,source.length(),ip65504DeNames.begin,ip65504DeNames.length());
   }  
   
     /**
	 * 	Update Ip65504DeNames 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504DeNames(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNames.begin,ip65504DeNames.length());
   }
   
     /**
	 * 	Update Ip65504DeNames 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504DeNames(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504DeNames.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp65504DeMapGroupFieldLength() {
			return IP_65504_DE_MAP_GROUP_LENGTH;
		}

}
  
