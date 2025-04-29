package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip16901RewardsParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_ip16901RewardsParm")

public class Ip16901RewardsParm extends Ip16901RewardsParmSerialized  implements InitializingBean {
   
				private Ip16901RewardParms ip16901RewardParms = new Ip16901RewardParms();
	
	/**
	* Constructor for Ip16901RewardsParm
	**/
    public Ip16901RewardsParm() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			ip16901RewardParms.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of ip16901RewardParms
	 *	@return ip16901RewardParms
	 */   
	 public Ip16901RewardParms getIp16901RewardParms() {
   	return ip16901RewardParms;
   }
   /**
	* 	Update Ip16901RewardParms with the passed value
	*   Corresponding COBOL Variable is IP16901-REWARD-PARMS
	*	@param value
	*/
   public void setIp16901RewardParms(char[] value) {
      ip16901RewardParms.setString(value); 
   }   
    
     /**
	 * 	Update Ip16901RewardParms 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setIp16901RewardParms(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip16901RewardParms.begin,ip16901RewardParms.length());
   }
   
     /**
	 * 	Update Ip16901RewardParms 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp16901RewardParms(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip16901RewardParms.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Ip16901RewardParms with another Field
	 *	@param value
	 */
   public void setIp16901RewardParms(Field source) {
   	replace(source,0,source.length(),ip16901RewardParms.begin,ip16901RewardParms.length());
   }  
   
     /**
	 * 	Update Ip16901RewardParms 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setIp16901RewardParms(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,ip16901RewardParms.begin,ip16901RewardParms.length());
   }
   
     /**
	 * 	Update Ip16901RewardParms 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp16901RewardParms(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,ip16901RewardParms.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Ip16901RewardsParm
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          ip16901RewardParms.initialize();
     
   }

		public static int getIp16901RewardsParmFieldLength() {
			return IP_16901_REWARDS_PARM_LENGTH;
		}

}
  
