package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip65504PdsMapGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip65504PdsMapGroup")

public class Ip65504PdsMapGroup extends Ip65504PdsMapGroupSerialized  implements InitializingBean {
   
					private Ip65504PdsMap ip65504PdsMap = new Ip65504PdsMap();
					private Ip65504PdsNames ip65504PdsNames = new Ip65504PdsNames();
	
	/**
	* Constructor for Ip65504PdsMapGroup
	**/
    public Ip65504PdsMapGroup() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip65504PdsMap.setParent(this,getStartOffset() + 0);
	       			ip65504PdsNames.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip65504PdsMap
	 *	@return ip65504PdsMap
	 */   
	 public Ip65504PdsMap getIp65504PdsMap() {
   	return ip65504PdsMap;
   }
   /**
	* 	Update Ip65504PdsMap with the passed value
	*   Corresponding COBOL Variable is IP65504-PDS-MAP
	*	@param value
	*/
   public void setIp65504PdsMap(char[] value) {
      ip65504PdsMap.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504PdsMap 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsMap(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsMap.begin,ip65504PdsMap.length());
   }
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsMap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsMap.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504PdsMap with another Field
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source) {
   	replace(source,0,source.length(),ip65504PdsMap.begin,ip65504PdsMap.length());
   }  
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsMap.begin,ip65504PdsMap.length());
   }
   
     /**
	 * 	Update Ip65504PdsMap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsMap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsMap.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip65504PdsNames
	 *	@return ip65504PdsNames
	 */   
	 public Ip65504PdsNames getIp65504PdsNames() {
   	return ip65504PdsNames;
   }
   /**
	* 	Update Ip65504PdsNames with the passed value
	*   Corresponding COBOL Variable is IP65504-PDS-NAMES
	*	@param value
	*/
   public void setIp65504PdsNames(char[] value) {
      ip65504PdsNames.setString(value); 
   }   
    
     /**
	 * 	Update Ip65504PdsNames 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsNames(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsNames.begin,ip65504PdsNames.length());
   }
   
     /**
	 * 	Update Ip65504PdsNames 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsNames(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsNames.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip65504PdsNames with another Field
	 *	@param value
	 */
   public void setIp65504PdsNames(Field source) {
   	replace(source,0,source.length(),ip65504PdsNames.begin,ip65504PdsNames.length());
   }  
   
     /**
	 * 	Update Ip65504PdsNames 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp65504PdsNames(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsNames.begin,ip65504PdsNames.length());
   }
   
     /**
	 * 	Update Ip65504PdsNames 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp65504PdsNames(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip65504PdsNames.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIp65504PdsMapGroupFieldLength() {
			return IP_65504_PDS_MAP_GROUP_LENGTH;
		}

}
  
