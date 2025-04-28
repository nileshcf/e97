package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip655o4TagArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip655o4TagArea extends Ip655o4TagAreaSerialized { 
   
				private Ip655o4TagId ip655o4TagId = new Ip655o4TagId();
	
	/**
	* Constructor for Ip655o4TagArea
	**/
    public Ip655o4TagArea() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip655o4TagArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip655o4TagArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip655o4TagId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip655o4TagId
	 *	@return ip655o4TagId
	 */   
	 public Ip655o4TagId getIp655o4TagId() {
   	return ip655o4TagId;
   }
   /**
	* 	Update Ip655o4TagId with the passed value
	*   Corresponding COBOL Variable is IP655O4-TAG-ID
	*	@param value
	*/
   public void setIp655o4TagId(char[] value) {
      ip655o4TagId.setString(value); 
   }   
    
     /**
	 * 	Update Ip655o4TagId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp655o4TagId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip655o4TagId.begin,ip655o4TagId.length());
   }
   
     /**
	 * 	Update Ip655o4TagId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp655o4TagId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip655o4TagId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip655o4TagId with another Field
	 *	@param value
	 */
   public void setIp655o4TagId(Field source) {
   	replace(source,0,source.length(),ip655o4TagId.begin,ip655o4TagId.length());
   }  
   
     /**
	 * 	Update Ip655o4TagId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp655o4TagId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip655o4TagId.begin,ip655o4TagId.length());
   }
   
     /**
	 * 	Update Ip655o4TagId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp655o4TagId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip655o4TagId.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip655o4TagArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip655o4TagId.initialize();
     
   }

		public static int getIp655o4TagAreaFieldLength() {
			return IP_655O_4_TAG_AREA_LENGTH;
		}

}
  
