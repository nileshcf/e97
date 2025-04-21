package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0040ParameterMasterData extends Ip0040ParameterMasterDataSerialized { 
   
				private Ip0040TableId ip0040TableId = new Ip0040TableId();
	
	/**
	* Constructor for Ip0040ParameterMasterData
	**/
    public Ip0040ParameterMasterData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0040ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0040TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip0040TableId
	 *	@return ip0040TableId
	 */   
	 public Ip0040TableId getIp0040TableId() {
   	return ip0040TableId;
   }
   /**
	* 	Update Ip0040TableId with the passed value
	*   Corresponding COBOL Variable is IP0040-TABLE-ID
	*	@param value
	*/
   public void setIp0040TableId(char[] value) {
      ip0040TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip0040TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableId.begin,ip0040TableId.length());
   }
   
     /**
	 * 	Update Ip0040TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0040TableId with another Field
	 *	@param value
	 */
   public void setIp0040TableId(Field source) {
   	replace(source,0,source.length(),ip0040TableId.begin,ip0040TableId.length());
   }  
   
     /**
	 * 	Update Ip0040TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0040TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableId.begin,ip0040TableId.length());
   }
   
     /**
	 * 	Update Ip0040TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0040TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0040TableId.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0040ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip0040TableId.initialize();
     
   }

		public static int getIp0040ParameterMasterDataFieldLength() {
			return IP_0040_PARAMETER_MASTER_DATA_LENGTH;
		}

}
  
