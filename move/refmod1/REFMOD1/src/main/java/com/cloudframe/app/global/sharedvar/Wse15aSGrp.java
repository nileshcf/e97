package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse15aSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse15aSGrp")

public class Wse15aSGrp extends Wse15aSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller028 = Field.fillLowValue(3);
				private Wse15aS wse15aS = new Wse15aS();
	
	/**
	* Constructor for Wse15aSGrp
	**/
    public Wse15aSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse15aS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller028
	 *	@return wseFiller028
	 */
   public char[] getWseFiller028() throws CFException{
     if (isWseFiller028Modified()) { 
        wseFiller028 = refreshWseFiller028();
     }
   		return wseFiller028;
   }

  
	/**
	*  set variable wseFiller028
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller028(char[] value) {
      wseFiller028 = checkWseFiller028Constraints(value);
      serializeWseFiller028(wseFiller028);
   } 

     /**
	 * 	Update WseFiller028 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller028(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller028,wseFiller028.length);
   	
   }
   
   public void setWseFiller028(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller028,wseFiller028.length);
   	
   }
   
     /**
	 * 	Update WseFiller028 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller028(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller028+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller028 with another Field
	 *	@param value
	 */
   public void setWseFiller028(Field source) {
       replace(source,0,source.length(),beginWseFiller028,WSE_FILLER_028_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller028 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller028(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller028,WSE_FILLER_028_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller028 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller028(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller028+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse15aS
	 *	@return wse15aS
	 */   
	 public Wse15aS getWse15aS() {
   	return wse15aS;
   }
   /**
	* 	Update Wse15aS with the passed value
	*   Corresponding COBOL Variable is WSE-15A-S
	*	@param value
	*/
   public void setWse15aS(char[] value) {
      wse15aS.setString(value); 
   }   
    
     /**
	 * 	Update Wse15aS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse15aS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15aS.begin,wse15aS.length());
   }
   
     /**
	 * 	Update Wse15aS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse15aS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15aS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse15aS with another Field
	 *	@param value
	 */
   public void setWse15aS(Field source) {
   	replace(source,0,source.length(),wse15aS.begin,wse15aS.length());
   }  
   
     /**
	 * 	Update Wse15aS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse15aS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse15aS.begin,wse15aS.length());
   }
   
     /**
	 * 	Update Wse15aS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse15aS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse15aS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse15aSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller028(CONSTANTS.SPACE_3);
          wse15aS.initialize();
     
   }

		public static int getWse15aSGrpFieldLength() {
			return WSE_15A_SGRP_LENGTH;
		}

}
  
