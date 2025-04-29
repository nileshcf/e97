package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004IntMsgDtlRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Ip40004IntMsgDtlRec extends Ip40004IntMsgDtlRecSerialized { 
   
				private Ip40004MsgDatax ip40004MsgDatax = new Ip40004MsgDatax();
				private Ip40004MsgData ip40004MsgData = new Ip40004MsgData();
	
	/**
	* Constructor for Ip40004IntMsgDtlRec
	**/
    public Ip40004IntMsgDtlRec() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Ip40004IntMsgDtlRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004IntMsgDtlRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			ip40004MsgDatax.setParent(this,getStartOffset() + 0);
	       			ip40004MsgData.setParent(this,getStartOffset() + 613);
    } 

	/**
	 *	Returns the value of ip40004MsgDatax
	 *	@return ip40004MsgDatax
	 */   
	 public Ip40004MsgDatax getIp40004MsgDatax() {
   	return ip40004MsgDatax;
   }
   /**
	* 	Update Ip40004MsgDatax with the passed value
	*   Corresponding COBOL Variable is IP40004-MSG-DATAX
	*	@param value
	*/
   public void setIp40004MsgDatax(char[] value) {
      ip40004MsgDatax.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004MsgDatax 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004MsgDatax(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgDatax.begin,ip40004MsgDatax.length());
   }
   
     /**
	 * 	Update Ip40004MsgDatax 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MsgDatax(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgDatax.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004MsgDatax with another Field
	 *	@param value
	 */
   public void setIp40004MsgDatax(Field source) {
   	replace(source,0,source.length(),ip40004MsgDatax.begin,ip40004MsgDatax.length());
   }  
   
     /**
	 * 	Update Ip40004MsgDatax 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004MsgDatax(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgDatax.begin,ip40004MsgDatax.length());
   }
   
     /**
	 * 	Update Ip40004MsgDatax 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MsgDatax(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgDatax.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip40004MsgData
	 *	@return ip40004MsgData
	 */   
	 public Ip40004MsgData getIp40004MsgData() {
   	return ip40004MsgData;
   }
   /**
	* 	Update Ip40004MsgData with the passed value
	*   Corresponding COBOL Variable is IP40004-MSG-DATA
	*	@param value
	*/
   public void setIp40004MsgData(char[] value) {
      ip40004MsgData.setString(value); 
   }   
    
     /**
	 * 	Update Ip40004MsgData 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp40004MsgData(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgData.begin,ip40004MsgData.length());
   }
   
     /**
	 * 	Update Ip40004MsgData 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MsgData(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgData.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip40004MsgData with another Field
	 *	@param value
	 */
   public void setIp40004MsgData(Field source) {
   	replace(source,0,source.length(),ip40004MsgData.begin,ip40004MsgData.length());
   }  
   
     /**
	 * 	Update Ip40004MsgData 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp40004MsgData(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgData.begin,ip40004MsgData.length());
   }
   
     /**
	 * 	Update Ip40004MsgData 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp40004MsgData(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip40004MsgData.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip40004IntMsgDtlRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip40004MsgDatax.initialize();
     
          ip40004MsgData.initialize();
     
   }

		public static int getIp40004IntMsgDtlRecFieldLength() {
			return IP_40004_INT_MSG_DTL_REC_LENGTH;
		}

}
  
