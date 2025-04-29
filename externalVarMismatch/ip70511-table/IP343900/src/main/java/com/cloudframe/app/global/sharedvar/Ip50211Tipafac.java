package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50211Tipafac is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50211Tipafac")

public class Ip50211Tipafac extends Ip50211TipafacSerialized  implements InitializingBean {
   
				private Ip50211FnsDataFields ip50211FnsDataFields = new Ip50211FnsDataFields();
	
	/**
	* Constructor for Ip50211Tipafac
	**/
    public Ip50211Tipafac() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip50211FnsDataFields.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50211FnsDataFields
	 *	@return ip50211FnsDataFields
	 */   
	 public Ip50211FnsDataFields getIp50211FnsDataFields() {
   	return ip50211FnsDataFields;
   }
   /**
	* 	Update Ip50211FnsDataFields with the passed value
	*   Corresponding COBOL Variable is IP50211-FNS-DATA-FIELDS
	*	@param value
	*/
   public void setIp50211FnsDataFields(char[] value) {
      ip50211FnsDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip50211FnsDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50211FnsDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FnsDataFields.begin,ip50211FnsDataFields.length());
   }
   
     /**
	 * 	Update Ip50211FnsDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50211FnsDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FnsDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50211FnsDataFields with another Field
	 *	@param value
	 */
   public void setIp50211FnsDataFields(Field source) {
   	replace(source,0,source.length(),ip50211FnsDataFields.begin,ip50211FnsDataFields.length());
   }  
   
     /**
	 * 	Update Ip50211FnsDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50211FnsDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FnsDataFields.begin,ip50211FnsDataFields.length());
   }
   
     /**
	 * 	Update Ip50211FnsDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50211FnsDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50211FnsDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50211Tipafac
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50211FnsDataFields.initialize();
     
   }

		public static int getIp50211TipafacFieldLength() {
			return IP_50211_TIPAFAC_LENGTH;
		}

}
  
