package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip57901Tipaqpr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip57901Tipaqpr")

public class Ip57901Tipaqpr extends Ip57901TipaqprSerialized  implements InitializingBean {
   
				private Ip57901TipaqprEntries ip57901TipaqprEntries = new Ip57901TipaqprEntries();
	
	/**
	* Constructor for Ip57901Tipaqpr
	**/
    public Ip57901Tipaqpr() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip57901TipaqprEntries.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip57901TipaqprEntries
	 *	@return ip57901TipaqprEntries
	 */   
	 public Ip57901TipaqprEntries getIp57901TipaqprEntries() {
   	return ip57901TipaqprEntries;
   }
   /**
	* 	Update Ip57901TipaqprEntries with the passed value
	*   Corresponding COBOL Variable is IP57901-TIPAQPR-ENTRIES
	*	@param value
	*/
   public void setIp57901TipaqprEntries(char[] value) {
      ip57901TipaqprEntries.setString(value); 
   }   
    
     /**
	 * 	Update Ip57901TipaqprEntries 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp57901TipaqprEntries(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip57901TipaqprEntries.begin,ip57901TipaqprEntries.length());
   }
   
     /**
	 * 	Update Ip57901TipaqprEntries 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp57901TipaqprEntries(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip57901TipaqprEntries.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip57901TipaqprEntries with another Field
	 *	@param value
	 */
   public void setIp57901TipaqprEntries(Field source) {
   	replace(source,0,source.length(),ip57901TipaqprEntries.begin,ip57901TipaqprEntries.length());
   }  
   
     /**
	 * 	Update Ip57901TipaqprEntries 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp57901TipaqprEntries(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip57901TipaqprEntries.begin,ip57901TipaqprEntries.length());
   }
   
     /**
	 * 	Update Ip57901TipaqprEntries 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp57901TipaqprEntries(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip57901TipaqprEntries.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip57901Tipaqpr
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip57901TipaqprEntries.initialize();
     
   }

		public static int getIp57901TipaqprFieldLength() {
			return IP_57901_TIPAQPR_LENGTH;
		}

}
  
