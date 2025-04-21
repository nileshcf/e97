package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00694TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00694TableEntry")

public class Ip00694TableEntry extends Ip00694TableEntrySerialized  implements InitializingBean {
   
				private Ip00694TableData ip00694TableData = new Ip00694TableData();
	
	/**
	* Constructor for Ip00694TableEntry
	**/
    public Ip00694TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip00694TableData.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip00694TableData
	 *	@return ip00694TableData
	 */   
	 public Ip00694TableData getIp00694TableData() {
   	return ip00694TableData;
   }
   /**
	* 	Update Ip00694TableData with the passed value
	*   Corresponding COBOL Variable is IP00694-TABLE-DATA
	*	@param value
	*/
   public void setIp00694TableData(char[] value) {
      ip00694TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00694TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00694TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00694TableData.begin,ip00694TableData.length());
   }
   
     /**
	 * 	Update Ip00694TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00694TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00694TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00694TableData with another Field
	 *	@param value
	 */
   public void setIp00694TableData(Field source) {
   	replace(source,0,source.length(),ip00694TableData.begin,ip00694TableData.length());
   }  
   
     /**
	 * 	Update Ip00694TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00694TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00694TableData.begin,ip00694TableData.length());
   }
   
     /**
	 * 	Update Ip00694TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00694TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00694TableData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00694TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00694TableData.initialize();
     
   }

		public static int getIp00694TableEntryFieldLength() {
			return IP_00694_TABLE_ENTRY_LENGTH;
		}

}
  
