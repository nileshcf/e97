package com.cloudframe.app.ar640010.dto;

/**
*  The class CopybookTable500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CopybookTable500 extends CopybookTable500Serialized {
   
				private CopybookData500 copybookData500 = new CopybookData500();
				private CopybookData500Redefined copybookData500Redefined = new CopybookData500Redefined();
	
	/**
	* Constructor for CopybookTable500
	**/
    public CopybookTable500() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			copybookData500.setParent(this,getStartOffset() + 0);
	       			copybookData500Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of copybookData500
	 *	@return copybookData500
	 */   
	 public CopybookData500 getCopybookData500() {
   	return copybookData500;
   }
   /**
	* 	Update CopybookData500 with the passed value
	*   Corresponding COBOL Variable is 500-COPYBOOK-DATA
	*	@param value
	*/
   public void setCopybookData500(char[] value) {
      copybookData500.setString(value); 
   }   
    
     /**
	 * 	Update CopybookData500 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCopybookData500(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500.begin,copybookData500.length());
   }
   
     /**
	 * 	Update CopybookData500 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybookData500(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CopybookData500 with another Field
	 *	@param value
	 */
   public void setCopybookData500(Field source) {
   	replace(source,0,source.length(),copybookData500.begin,copybookData500.length());
   }  
   
     /**
	 * 	Update CopybookData500 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCopybookData500(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500.begin,copybookData500.length());
   }
   
     /**
	 * 	Update CopybookData500 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybookData500(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of copybookData500Redefined
	 *	@return copybookData500Redefined
	 */   
	 public CopybookData500Redefined getCopybookData500Redefined() {
   	return copybookData500Redefined;
   }
   /**
	* 	Update CopybookData500Redefined with the passed value
	*   Corresponding COBOL Variable is 500-COPYBOOK-DATA-REDEFINED
	*	@param value
	*/
   public void setCopybookData500Redefined(char[] value) {
      copybookData500Redefined.setString(value); 
   }   
    
     /**
	 * 	Update CopybookData500Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCopybookData500Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500Redefined.begin,copybookData500Redefined.length());
   }
   
     /**
	 * 	Update CopybookData500Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCopybookData500Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CopybookData500Redefined with another Field
	 *	@param value
	 */
   public void setCopybookData500Redefined(Field source) {
   	replace(source,0,source.length(),copybookData500Redefined.begin,copybookData500Redefined.length());
   }  
   
     /**
	 * 	Update CopybookData500Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCopybookData500Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500Redefined.begin,copybookData500Redefined.length());
   }
   
     /**
	 * 	Update CopybookData500Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCopybookData500Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,copybookData500Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCopybookTable500FieldLength() {
			return COPYBOOK_TABLE_500_LENGTH;
		}

}
  
