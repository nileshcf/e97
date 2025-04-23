package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse20cSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse20cSGrp")

public class Wse20cSGrp extends Wse20cSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller040 = Field.fillLowValue(5);
				private Wse20cS wse20cS = new Wse20cS();
	
	/**
	* Constructor for Wse20cSGrp
	**/
    public Wse20cSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse20cS.setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller040
	 *	@return wseFiller040
	 */
   public char[] getWseFiller040() throws CFException{
     if (isWseFiller040Modified()) { 
        wseFiller040 = refreshWseFiller040();
     }
   		return wseFiller040;
   }

  
	/**
	*  set variable wseFiller040
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller040(char[] value) {
      wseFiller040 = checkWseFiller040Constraints(value);
      serializeWseFiller040(wseFiller040);
   } 

     /**
	 * 	Update WseFiller040 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller040(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller040,wseFiller040.length);
   	
   }
   
   public void setWseFiller040(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller040,wseFiller040.length);
   	
   }
   
     /**
	 * 	Update WseFiller040 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller040(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller040+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller040 with another Field
	 *	@param value
	 */
   public void setWseFiller040(Field source) {
       replace(source,0,source.length(),beginWseFiller040,WSE_FILLER_040_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller040 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller040(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller040,WSE_FILLER_040_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller040 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller040(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller040+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse20cS
	 *	@return wse20cS
	 */   
	 public Wse20cS getWse20cS() {
   	return wse20cS;
   }
   /**
	* 	Update Wse20cS with the passed value
	*   Corresponding COBOL Variable is WSE-20C-S
	*	@param value
	*/
   public void setWse20cS(char[] value) {
      wse20cS.setString(value); 
   }   
    
     /**
	 * 	Update Wse20cS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse20cS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20cS.begin,wse20cS.length());
   }
   
     /**
	 * 	Update Wse20cS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse20cS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20cS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse20cS with another Field
	 *	@param value
	 */
   public void setWse20cS(Field source) {
   	replace(source,0,source.length(),wse20cS.begin,wse20cS.length());
   }  
   
     /**
	 * 	Update Wse20cS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse20cS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse20cS.begin,wse20cS.length());
   }
   
     /**
	 * 	Update Wse20cS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse20cS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse20cS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse20cSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller040(CONSTANTS.SPACE_5);
          wse20cS.initialize();
     
   }

		public static int getWse20cSGrpFieldLength() {
			return WSE_20C_SGRP_LENGTH;
		}

}
  
