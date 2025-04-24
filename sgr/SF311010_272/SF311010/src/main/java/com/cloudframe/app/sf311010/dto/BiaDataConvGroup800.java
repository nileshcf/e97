package com.cloudframe.app.sf311010.dto;

/**
*  The class BiaDataConvGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/


import com.cloudframe.app.sf311010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BiaDataConvGroup800 extends BiaDataConvGroup800Serialized { 
   
					private BiaDataConv800 biaDataConv800 = new BiaDataConv800();
					private BiaDataConv800Redefined biaDataConv800Redefined = new BiaDataConv800Redefined();
	
	/**
	* Constructor for BiaDataConvGroup800
	**/
    public BiaDataConvGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			biaDataConv800.setParent(this,getStartOffset() + 0);
	       			biaDataConv800Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of biaDataConv800
	 *	@return biaDataConv800
	 */   
	 public BiaDataConv800 getBiaDataConv800() {
   	return biaDataConv800;
   }
   /**
	* 	Update BiaDataConv800 with the passed value
	*   Corresponding COBOL Variable is 800-BIA-DATA-CONV
	*	@param value
	*/
   public void setBiaDataConv800(char[] value) {
      biaDataConv800.setString(value); 
   }   
    
     /**
	 * 	Update BiaDataConv800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBiaDataConv800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800.begin,biaDataConv800.length());
   }
   
     /**
	 * 	Update BiaDataConv800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBiaDataConv800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BiaDataConv800 with another Field
	 *	@param value
	 */
   public void setBiaDataConv800(Field source) {
   	replace(source,0,source.length(),biaDataConv800.begin,biaDataConv800.length());
   }  
   
     /**
	 * 	Update BiaDataConv800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBiaDataConv800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800.begin,biaDataConv800.length());
   }
   
     /**
	 * 	Update BiaDataConv800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBiaDataConv800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of biaDataConv800Redefined
	 *	@return biaDataConv800Redefined
	 */   
	 public BiaDataConv800Redefined getBiaDataConv800Redefined() {
   	return biaDataConv800Redefined;
   }
   /**
	* 	Update BiaDataConv800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-BIA-DATA-CONV-REDEFINED
	*	@param value
	*/
   public void setBiaDataConv800Redefined(char[] value) {
      biaDataConv800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update BiaDataConv800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setBiaDataConv800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800Redefined.begin,biaDataConv800Redefined.length());
   }
   
     /**
	 * 	Update BiaDataConv800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBiaDataConv800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update BiaDataConv800Redefined with another Field
	 *	@param value
	 */
   public void setBiaDataConv800Redefined(Field source) {
   	replace(source,0,source.length(),biaDataConv800Redefined.begin,biaDataConv800Redefined.length());
   }  
   
     /**
	 * 	Update BiaDataConv800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setBiaDataConv800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800Redefined.begin,biaDataConv800Redefined.length());
   }
   
     /**
	 * 	Update BiaDataConv800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBiaDataConv800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,biaDataConv800Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getBiaDataConvGroup800FieldLength() {
			return BIA_DATA_CONV_GROUP_800_LENGTH;
		}

}
  
