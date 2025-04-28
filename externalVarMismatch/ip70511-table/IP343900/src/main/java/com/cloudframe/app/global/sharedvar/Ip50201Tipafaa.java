package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201Tipafaa is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip50201Tipafaa")

public class Ip50201Tipafaa extends Ip50201TipafaaSerialized  implements InitializingBean {
   
				private Ip50201FnsDataFields ip50201FnsDataFields = new Ip50201FnsDataFields();
	
	/**
	* Constructor for Ip50201Tipafaa
	**/
    public Ip50201Tipafaa() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip50201FnsDataFields.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip50201FnsDataFields
	 *	@return ip50201FnsDataFields
	 */   
	 public Ip50201FnsDataFields getIp50201FnsDataFields() {
   	return ip50201FnsDataFields;
   }
   /**
	* 	Update Ip50201FnsDataFields with the passed value
	*   Corresponding COBOL Variable is IP50201-FNS-DATA-FIELDS
	*	@param value
	*/
   public void setIp50201FnsDataFields(char[] value) {
      ip50201FnsDataFields.setString(value); 
   }   
    
     /**
	 * 	Update Ip50201FnsDataFields 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201FnsDataFields(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FnsDataFields.begin,ip50201FnsDataFields.length());
   }
   
     /**
	 * 	Update Ip50201FnsDataFields 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201FnsDataFields(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FnsDataFields.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50201FnsDataFields with another Field
	 *	@param value
	 */
   public void setIp50201FnsDataFields(Field source) {
   	replace(source,0,source.length(),ip50201FnsDataFields.begin,ip50201FnsDataFields.length());
   }  
   
     /**
	 * 	Update Ip50201FnsDataFields 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201FnsDataFields(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FnsDataFields.begin,ip50201FnsDataFields.length());
   }
   
     /**
	 * 	Update Ip50201FnsDataFields 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201FnsDataFields(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FnsDataFields.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50201Tipafaa
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50201FnsDataFields.initialize();
     
   }

		public static int getIp50201TipafaaFieldLength() {
			return IP_50201_TIPAFAA_LENGTH;
		}

}
  
