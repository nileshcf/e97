package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip5000ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class Ip5000ParameterMasterData extends Ip5000ParameterMasterDataSerialized { 
   
				private Ip5000TableId ip5000TableId = new Ip5000TableId();

						private char[] ip5000TableData = Field.fillLowValue(32737);
	
	/**
	* Constructor for Ip5000ParameterMasterData
	**/
    public Ip5000ParameterMasterData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip5000ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip5000ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip5000TableId.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of ip5000TableId
	 *	@return ip5000TableId
	 */   
	 public Ip5000TableId getIp5000TableId() {
   	return ip5000TableId;
   }
   /**
	* 	Update Ip5000TableId with the passed value
	*   Corresponding COBOL Variable is IP5000-TABLE-ID
	*	@param value
	*/
   public void setIp5000TableId(char[] value) {
      ip5000TableId.setString(value); 
   }   
    
     /**
	 * 	Update Ip5000TableId 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp5000TableId(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip5000TableId.begin,ip5000TableId.length());
   }
   
     /**
	 * 	Update Ip5000TableId 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp5000TableId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip5000TableId.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip5000TableId with another Field
	 *	@param value
	 */
   public void setIp5000TableId(Field source) {
   	replace(source,0,source.length(),ip5000TableId.begin,ip5000TableId.length());
   }  
   
     /**
	 * 	Update Ip5000TableId 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp5000TableId(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip5000TableId.begin,ip5000TableId.length());
   }
   
     /**
	 * 	Update Ip5000TableId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp5000TableId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip5000TableId.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip5000TableData
	 *	@return ip5000TableData
	 */
   public char[] getIp5000TableData() throws CFException{
     if (isIp5000TableDataModified()) { 
        ip5000TableData = refreshIp5000TableData();
     }
   		return ip5000TableData;
   }

  
	/**
	*  set variable ip5000TableData
	*  Corresponding COBOL Variable is IP5000-TABLE-DATA
	*  @param value
	**/
   public void setIp5000TableData(char[] value) {
      ip5000TableData = checkIp5000TableDataConstraints(value);
      serializeIp5000TableData(ip5000TableData);
   } 

     /**
	 * 	Update Ip5000TableData 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp5000TableData(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp5000TableData,ip5000TableData.length);
   	
   }
   
   public void setIp5000TableData(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000TableData,ip5000TableData.length);
   	
   }
   
     /**
	 * 	Update Ip5000TableData 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp5000TableData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000TableData+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip5000TableData with another Field
	 *	@param value
	 */
   public void setIp5000TableData(Field source) {
       replace(source,0,source.length(),beginIp5000TableData,IP_5000_TABLE_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Ip5000TableData 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp5000TableData(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp5000TableData,IP_5000_TABLE_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Ip5000TableData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp5000TableData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp5000TableData+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes Ip5000ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip5000TableId.initialize();
     
         setIp5000TableData(CONSTANTS.SPACE_32737);
   }

		public static int getIp5000ParameterMasterDataFieldLength() {
			return IP_5000_PARAMETER_MASTER_DATA_LENGTH;
		}

}
  
