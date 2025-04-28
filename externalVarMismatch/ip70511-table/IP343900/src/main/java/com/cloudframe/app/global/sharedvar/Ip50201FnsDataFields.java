package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50201FnsDataFields is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip50201FnsDataFields extends Ip50201FnsDataFieldsSerialized { 
   
				private Ip50201FaaData ip50201FaaData = new Ip50201FaaData();
	
	/**
	* Constructor for Ip50201FnsDataFields
	**/
    public Ip50201FnsDataFields() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip50201FnsDataFields. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50201FnsDataFields(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip50201FaaData.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip50201FaaData
	 *	@return ip50201FaaData
	 */   
	 public Ip50201FaaData getIp50201FaaData() {
   	return ip50201FaaData;
   }
   /**
	* 	Update Ip50201FaaData with the passed value
	*   Corresponding COBOL Variable is IP50201-FAA-DATA
	*	@param value
	*/
   public void setIp50201FaaData(char[] value) {
      ip50201FaaData.setString(value); 
   }   
    
     /**
	 * 	Update Ip50201FaaData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp50201FaaData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FaaData.begin,ip50201FaaData.length());
   }
   
     /**
	 * 	Update Ip50201FaaData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp50201FaaData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FaaData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip50201FaaData with another Field
	 *	@param value
	 */
   public void setIp50201FaaData(Field source) {
   	replace(source,0,source.length(),ip50201FaaData.begin,ip50201FaaData.length());
   }  
   
     /**
	 * 	Update Ip50201FaaData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp50201FaaData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FaaData.begin,ip50201FaaData.length());
   }
   
     /**
	 * 	Update Ip50201FaaData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp50201FaaData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip50201FaaData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip50201FnsDataFields
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip50201FaaData.initialize();
     
   }

		public static int getIp50201FnsDataFieldsFieldLength() {
			return IP_50201_FNS_DATA_FIELDS_LENGTH;
		}

}
  
