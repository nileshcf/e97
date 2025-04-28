package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00911ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00911ParameterMasterData extends Ip00911ParameterMasterDataSerialized { 
   
				private Ip00911TableId ip00911TableId = new Ip00911TableId();
	
	/**
	* Constructor for Ip00911ParameterMasterData
	**/
    public Ip00911ParameterMasterData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00911ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00911TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip00911TableId
	 *	@return ip00911TableId
	 */   
	 public Ip00911TableId getIp00911TableId() {
   	return ip00911TableId;
   }
   /**
	* 	Update Ip00911TableId with the passed value
	*   Corresponding COBOL Variable is IP00911-TABLE-ID
	*	@param value
	*/
   public void setIp00911TableId(char[] value) {
      ip00911TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip00911TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00911TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableId.begin,ip00911TableId.length());
   }
   
     /**
	 * 	Update Ip00911TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00911TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00911TableId with another Field
	 *	@param value
	 */
   public void setIp00911TableId(Field source) {
   	replace(source,0,source.length(),ip00911TableId.begin,ip00911TableId.length());
   }  
   
     /**
	 * 	Update Ip00911TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00911TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableId.begin,ip00911TableId.length());
   }
   
     /**
	 * 	Update Ip00911TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00911TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00911TableId.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00911ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00911TableId.initialize();
     
   }

		public static int getIp00911ParameterMasterDataFieldLength() {
			return IP_00911_PARAMETER_MASTER_DATA_LENGTH;
		}

}
  
