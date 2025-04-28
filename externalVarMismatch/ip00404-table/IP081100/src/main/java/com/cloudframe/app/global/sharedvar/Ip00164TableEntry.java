package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00164TableEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip00164TableEntry")

public class Ip00164TableEntry extends Ip00164TableEntrySerialized  implements InitializingBean {
   
				private Ip00164TableData ip00164TableData = new Ip00164TableData();
	
	/**
	* Constructor for Ip00164TableEntry
	**/
    public Ip00164TableEntry() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip00164TableData.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip00164TableData
	 *	@return ip00164TableData
	 */   
	 public Ip00164TableData getIp00164TableData() {
   	return ip00164TableData;
   }
   /**
	* 	Update Ip00164TableData with the passed value
	*   Corresponding COBOL Variable is IP00164-TABLE-DATA
	*	@param value
	*/
   public void setIp00164TableData(char[] value) {
      ip00164TableData.setString(value); 
   }   
    
     /**
	 * 	Update Ip00164TableData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00164TableData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00164TableData.begin,ip00164TableData.length());
   }
   
     /**
	 * 	Update Ip00164TableData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00164TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00164TableData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00164TableData with another Field
	 *	@param value
	 */
   public void setIp00164TableData(Field source) {
   	replace(source,0,source.length(),ip00164TableData.begin,ip00164TableData.length());
   }  
   
     /**
	 * 	Update Ip00164TableData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00164TableData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00164TableData.begin,ip00164TableData.length());
   }
   
     /**
	 * 	Update Ip00164TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00164TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00164TableData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00164TableEntry
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00164TableData.initialize();
     
   }

		public static int getIp00164TableEntryFieldLength() {
			return IP_00164_TABLE_ENTRY_LENGTH;
		}

}
  
