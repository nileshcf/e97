package com.cloudframe.app.sf326010.dto;

/**
*  The class ZlogRecord801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ZlogRecord801 extends ZlogRecord801Serialized { 
   
				private FixedHeader801 fixedHeader801 = new FixedHeader801();
	
	/**
	* Constructor for ZlogRecord801
	**/
    public ZlogRecord801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ZlogRecord801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ZlogRecord801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fixedHeader801.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of fixedHeader801
	 *	@return fixedHeader801
	 */   
	 public FixedHeader801 getFixedHeader801() {
   	return fixedHeader801;
   }
   /**
	* 	Update FixedHeader801 with the passed value
	*   Corresponding COBOL Variable is 801-FIXED-HEADER
	*	@param value
	*/
   public void setFixedHeader801(char[] value) {
      fixedHeader801.setString(value); 
   }   
    
     /**
	 * 	Update FixedHeader801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFixedHeader801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin,fixedHeader801.length());
   }
   
     /**
	 * 	Update FixedHeader801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFixedHeader801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FixedHeader801 with another Field
	 *	@param value
	 */
   public void setFixedHeader801(Field source) {
   	replace(source,0,source.length(),fixedHeader801.begin,fixedHeader801.length());
   }  
   
     /**
	 * 	Update FixedHeader801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFixedHeader801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin,fixedHeader801.length());
   }
   
     /**
	 * 	Update FixedHeader801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFixedHeader801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fixedHeader801.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getZlogRecord801FieldLength() {
			return ZLOG_RECORD_801_LENGTH;
		}

}
  
