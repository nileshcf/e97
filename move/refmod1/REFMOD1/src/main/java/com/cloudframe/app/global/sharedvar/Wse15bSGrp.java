package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:04. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse15bSGrp")

public class Wse15bSGrp extends Wse15bSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller029 = Field.fillLowValue(3);
				private Wse15bS wse15bS = new Wse15bS();
	
	/**
	* Constructor for Wse15bSGrp
	**/
    public Wse15bSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse15bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller029
	 *	@return wseFiller029
	 */
   public char[] getWseFiller029() throws CFException{
     if (isWseFiller029Modified()) { 
        wseFiller029 = refreshWseFiller029();
     }
   		return wseFiller029;
   }

  
	/**
	*  set variable wseFiller029
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller029(char[] value) {
      wseFiller029 = checkWseFiller029Constraints(value);
      serializeWseFiller029(wseFiller029);
   } 

     /**
	 * 	Update WseFiller029 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller029(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller029,wseFiller029.length);
   	
   }
   
   public void setWseFiller029(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller029,wseFiller029.length);
   	
   }
   
     /**
	 * 	Update WseFiller029 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller029(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller029+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller029 with another Field
	 *	@param value
	 */
   public void setWseFiller029(Field source) {
       replace(source,0,source.length(),beginWseFiller029,WSE_FILLER_029_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller029 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller029(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller029,WSE_FILLER_029_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller029 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller029(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller029+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15bS
	 *	@return wse15bS
	 */   
	 public Wse15bS getWse15bS() {
   	return wse15bS;
   }
   /**
	* 	Update Wse15bS with the passed value
	*   Corresponding COBOL Variable is WSE-15B-S
	*	@param value
	*/
   public void setWse15bS(char[] value) {
      wse15bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse15bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse15bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15bS.begin,wse15bS.length());
   }
   
     /**
	 * 	Update Wse15bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse15bS with another Field
	 *	@param value
	 */
   public void setWse15bS(Field source) {
   	replace(source,0,source.length(),wse15bS.begin,wse15bS.length());
   }  
   
     /**
	 * 	Update Wse15bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse15bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15bS.begin,wse15bS.length());
   }
   
     /**
	 * 	Update Wse15bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15bS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse15bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller029(CONSTANTS.SPACE_3);
          wse15bS.initialize();
     
   }

		public static int getWse15bSGrpFieldLength() {
			return WSE_15B_SGRP_LENGTH;
		}

}
  
