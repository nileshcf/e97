package com.cloudframe.app.global.sharedvar;

/**
*  The class IrdExtrFileRec800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.InitializingBean;
import com.cloudframe.app.data.Field;

            @Component("global_irdExtrFileRec800")

public class IrdExtrFileRec800 extends IrdExtrFileRec800Serialized  implements InitializingBean {
   
				private Key800 key800 = new Key800();
	
	/**
	* Constructor for IrdExtrFileRec800
	**/
    public IrdExtrFileRec800() {
	// TO-DO auto generated code
    }

   		    @Override
	public void afterPropertiesSet() throws Exception {
		// the below code can be moved to constructor after full testing
    	init(0);
    	/*  set the parent of each child as this which are a group variable */
	       			key800.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }

 

	/**
	 *	Returns the value of key800
	 *	@return key800
	 */   
	 public Key800 getKey800() {
   	return key800;
   }
   /**
	* 	Update Key800 with the passed value
	*   Corresponding COBOL Variable is 800-KEY
	*	@param value
	*/
   public void setKey800(char[] value) {
      key800.setString(value); 
   }   
    
     /**
	 * 	Update Key800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,key800.begin,key800.length());
   }
   
     /**
	 * 	Update Key800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKey800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,key800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Key800 with another Field
	 *	@param value
	 */
   public void setKey800(Field source) {
   	replace(source,0,source.length(),key800.begin,key800.length());
   }  
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,key800.begin,key800.length());
   }
   
     /**
	 * 	Update Key800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKey800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,key800.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes IrdExtrFileRec800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          key800.initialize();
     
   }

		public static int getIrdExtrFileRec800FieldLength() {
			return IRD_EXTR_FILE_REC_800_LENGTH;
		}

}
  
