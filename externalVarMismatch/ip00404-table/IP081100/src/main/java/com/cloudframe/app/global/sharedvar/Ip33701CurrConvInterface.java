package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip33701CurrConvInterface is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip33701CurrConvInterface")

public class Ip33701CurrConvInterface extends Ip33701CurrConvInterfaceSerialized  implements InitializingBean {
   
				private Ip33701CurrConvInput ip33701CurrConvInput = new Ip33701CurrConvInput();
				private Ip33701CurrConvOutput ip33701CurrConvOutput = new Ip33701CurrConvOutput();
	
	/**
	* Constructor for Ip33701CurrConvInterface
	**/
    public Ip33701CurrConvInterface() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip33701CurrConvInput.setParent(this,getStartOffset() + 0);
	       			ip33701CurrConvOutput.setParent(this,getStartOffset() + 39);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip33701CurrConvInput
	 *	@return ip33701CurrConvInput
	 */   
	 public Ip33701CurrConvInput getIp33701CurrConvInput() {
   	return ip33701CurrConvInput;
   }
   /**
	* 	Update Ip33701CurrConvInput with the passed value
	*   Corresponding COBOL Variable is IP33701-CURR-CONV-INPUT
	*	@param value
	*/
   public void setIp33701CurrConvInput(char[] value) {
      ip33701CurrConvInput.setString(value); 
   }   
    
     /**
	 * 	Update Ip33701CurrConvInput 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp33701CurrConvInput(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvInput.begin,ip33701CurrConvInput.length());
   }
   
     /**
	 * 	Update Ip33701CurrConvInput 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701CurrConvInput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvInput.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip33701CurrConvInput with another Field
	 *	@param value
	 */
   public void setIp33701CurrConvInput(Field source) {
   	replace(source,0,source.length(),ip33701CurrConvInput.begin,ip33701CurrConvInput.length());
   }  
   
     /**
	 * 	Update Ip33701CurrConvInput 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp33701CurrConvInput(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvInput.begin,ip33701CurrConvInput.length());
   }
   
     /**
	 * 	Update Ip33701CurrConvInput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701CurrConvInput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvInput.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of ip33701CurrConvOutput
	 *	@return ip33701CurrConvOutput
	 */   
	 public Ip33701CurrConvOutput getIp33701CurrConvOutput() {
   	return ip33701CurrConvOutput;
   }
   /**
	* 	Update Ip33701CurrConvOutput with the passed value
	*   Corresponding COBOL Variable is IP33701-CURR-CONV-OUTPUT
	*	@param value
	*/
   public void setIp33701CurrConvOutput(char[] value) {
      ip33701CurrConvOutput.setString(value); 
   }   
    
     /**
	 * 	Update Ip33701CurrConvOutput 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp33701CurrConvOutput(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvOutput.begin,ip33701CurrConvOutput.length());
   }
   
     /**
	 * 	Update Ip33701CurrConvOutput 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp33701CurrConvOutput(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvOutput.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip33701CurrConvOutput with another Field
	 *	@param value
	 */
   public void setIp33701CurrConvOutput(Field source) {
   	replace(source,0,source.length(),ip33701CurrConvOutput.begin,ip33701CurrConvOutput.length());
   }  
   
     /**
	 * 	Update Ip33701CurrConvOutput 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp33701CurrConvOutput(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvOutput.begin,ip33701CurrConvOutput.length());
   }
   
     /**
	 * 	Update Ip33701CurrConvOutput 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp33701CurrConvOutput(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip33701CurrConvOutput.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip33701CurrConvInterface
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip33701CurrConvInput.initialize();
     
          ip33701CurrConvOutput.initialize();
     
   }

		public static int getIp33701CurrConvInterfaceFieldLength() {
			return IP_33701_CURR_CONV_INTERFACE_LENGTH;
		}

}
  
