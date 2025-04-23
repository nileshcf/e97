package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip0041ParameterMasterData extends Ip0041ParameterMasterDataSerialized { 
   
				private Ip0041TableId ip0041TableId = new Ip0041TableId();
	
	/**
	* Constructor for Ip0041ParameterMasterData
	**/
    public Ip0041ParameterMasterData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip0041ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip0041TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip0041TableId
	 *	@return ip0041TableId
	 */   
	 public Ip0041TableId getIp0041TableId() {
   	return ip0041TableId;
   }
   /**
	* 	Update Ip0041TableId with the passed value
	*   Corresponding COBOL Variable is IP0041-TABLE-ID
	*	@param value
	*/
   public void setIp0041TableId(char[] value) {
      ip0041TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip0041TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp0041TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableId.begin,ip0041TableId.length());
   }
   
     /**
	 * 	Update Ip0041TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp0041TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip0041TableId with another Field
	 *	@param value
	 */
   public void setIp0041TableId(Field source) {
   	replace(source,0,source.length(),ip0041TableId.begin,ip0041TableId.length());
   }  
   
     /**
	 * 	Update Ip0041TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp0041TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableId.begin,ip0041TableId.length());
   }
   
     /**
	 * 	Update Ip0041TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp0041TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip0041TableId.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip0041ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip0041TableId.initialize();
     
   }

		public static int getIp0041ParameterMasterDataFieldLength() {
			return IP_0041_PARAMETER_MASTER_DATA_LENGTH;
		}

}
  
