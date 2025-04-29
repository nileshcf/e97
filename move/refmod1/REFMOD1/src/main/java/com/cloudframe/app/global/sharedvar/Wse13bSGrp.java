package com.cloudframe.app.global.sharedvar;

/**
*  The class Wse13bSGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;

            @Component("global_wse13bSGrp")

public class Wse13bSGrp extends Wse13bSGrpSerialized  implements InitializingBean {
   

						private char[] wseFiller022 = Field.fillLowValue(3);
				private Wse13bS wse13bS = new Wse13bS();
	
	/**
	* Constructor for Wse13bSGrp
	**/
    public Wse13bSGrp() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			wse13bS.setParent(this,getStartOffset() + 3);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of wseFiller022
	 *	@return wseFiller022
	 */
   public char[] getWseFiller022() throws CFException{
     if (isWseFiller022Modified()) { 
        wseFiller022 = refreshWseFiller022();
     }
   		return wseFiller022;
   }

  
	/**
	*  set variable wseFiller022
	*  Corresponding COBOL Variable is WSE-FILLER
	*  @param value
	**/
   public void setWseFiller022(char[] value) {
      wseFiller022 = checkWseFiller022Constraints(value);
      serializeWseFiller022(wseFiller022);
   } 

     /**
	 * 	Update WseFiller022 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWseFiller022(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWseFiller022,wseFiller022.length);
   	
   }
   
   public void setWseFiller022(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller022,wseFiller022.length);
   	
   }
   
     /**
	 * 	Update WseFiller022 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller022(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller022+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WseFiller022 with another Field
	 *	@param value
	 */
   public void setWseFiller022(Field source) {
       replace(source,0,source.length(),beginWseFiller022,WSE_FILLER_022_LEN);
   	
   }  
   
     /**
	 * 	Update WseFiller022 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWseFiller022(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWseFiller022,WSE_FILLER_022_LEN);
   	
   }
   
     /**
	 * 	Update WseFiller022 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWseFiller022(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWseFiller022+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wse13bS
	 *	@return wse13bS
	 */   
	 public Wse13bS getWse13bS() {
   	return wse13bS;
   }
   /**
	* 	Update Wse13bS with the passed value
	*   Corresponding COBOL Variable is WSE-13B-S
	*	@param value
	*/
   public void setWse13bS(char[] value) {
      wse13bS.setString(value); 
   }   
    
     /**
	 * 	Update Wse13bS 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWse13bS(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13bS.begin,wse13bS.length());
   }
   
     /**
	 * 	Update Wse13bS 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWse13bS(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13bS.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Wse13bS with another Field
	 *	@param value
	 */
   public void setWse13bS(Field source) {
   	replace(source,0,source.length(),wse13bS.begin,wse13bS.length());
   }  
   
     /**
	 * 	Update Wse13bS 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWse13bS(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wse13bS.begin,wse13bS.length());
   }
   
     /**
	 * 	Update Wse13bS 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWse13bS(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wse13bS.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Wse13bSGrp
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWseFiller022(CONSTANTS.SPACE_3);
          wse13bS.initialize();
     
   }

		public static int getWse13bSGrpFieldLength() {
			return WSE_13B_SGRP_LENGTH;
		}

}
  
