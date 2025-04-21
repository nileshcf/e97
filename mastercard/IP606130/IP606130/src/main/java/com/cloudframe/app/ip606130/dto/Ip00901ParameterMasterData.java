package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/


import com.cloudframe.app.ip606130.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip00901ParameterMasterData extends Ip00901ParameterMasterDataSerialized { 
   
				private Ip00901TableId ip00901TableId = new Ip00901TableId();
	
	/**
	* Constructor for Ip00901ParameterMasterData
	**/
    public Ip00901ParameterMasterData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip00901ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip00901TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip00901TableId
	 *	@return ip00901TableId
	 */   
	 public Ip00901TableId getIp00901TableId() {
   	return ip00901TableId;
   }
   /**
	* 	Update Ip00901TableId with the passed value
	*   Corresponding COBOL Variable is IP00901-TABLE-ID
	*	@param value
	*/
   public void setIp00901TableId(char[] value) {
      ip00901TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip00901TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp00901TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableId.begin,ip00901TableId.length());
   }
   
     /**
	 * 	Update Ip00901TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp00901TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip00901TableId with another Field
	 *	@param value
	 */
   public void setIp00901TableId(Field source) {
   	replace(source,0,source.length(),ip00901TableId.begin,ip00901TableId.length());
   }  
   
     /**
	 * 	Update Ip00901TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp00901TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableId.begin,ip00901TableId.length());
   }
   
     /**
	 * 	Update Ip00901TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp00901TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip00901TableId.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip00901ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip00901TableId.initialize();
     
   }

		public static int getIp00901ParameterMasterDataFieldLength() {
			return IP_00901_PARAMETER_MASTER_DATA_LENGTH;
		}

}
  
