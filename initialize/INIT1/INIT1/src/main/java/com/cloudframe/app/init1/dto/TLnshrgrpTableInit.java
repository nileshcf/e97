package com.cloudframe.app.init1.dto;

/**
*  The class TLnshrgrpTableInit is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TLnshrgrpTableInit extends TLnshrgrpTableInitSerialized {
   
				private TLnshrgrpInit tLnshrgrpInit = new TLnshrgrpInit();
	
	/**
	* Constructor for TLnshrgrpTableInit
	**/
    public TLnshrgrpTableInit() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			tLnshrgrpInit.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of tLnshrgrpInit
	 *	@return tLnshrgrpInit
	 */   
	 public TLnshrgrpInit getTLnshrgrpInit() {
   	return tLnshrgrpInit;
   }
   /**
	* 	Update TLnshrgrpInit with the passed value
	*   Corresponding COBOL Variable is T-LNSHRGRP-INIT
	*	@param value
	*/
   public void setTLnshrgrpInit(char[] value) {
      tLnshrgrpInit.setString(value); 
   }   
    
     /**
	 * 	Update TLnshrgrpInit 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTLnshrgrpInit(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tLnshrgrpInit.begin,tLnshrgrpInit.length());
   }
   
     /**
	 * 	Update TLnshrgrpInit 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTLnshrgrpInit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tLnshrgrpInit.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TLnshrgrpInit with another Field
	 *	@param value
	 */
   public void setTLnshrgrpInit(Field source) {
   	replace(source,0,source.length(),tLnshrgrpInit.begin,tLnshrgrpInit.length());
   }  
   
     /**
	 * 	Update TLnshrgrpInit 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTLnshrgrpInit(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,tLnshrgrpInit.begin,tLnshrgrpInit.length());
   }
   
     /**
	 * 	Update TLnshrgrpInit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTLnshrgrpInit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,tLnshrgrpInit.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getTLnshrgrpTableInitFieldLength() {
			return T_LNSHRGRP_TABLE_INIT_LENGTH;
		}

}
  
