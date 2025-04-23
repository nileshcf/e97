package com.cloudframe.app.mcwin.dto;

/**
*  The class MciwinYearToWindow800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/


import com.cloudframe.app.mcwin.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinYearToWindow800 extends MciwinYearToWindow800Serialized {
   
				private MciwinFormats800 mciwinFormats800 = new MciwinFormats800();
				private MciwinFormats800Redefined01 mciwinFormats800Redefined01 = new MciwinFormats800Redefined01();
				private MciwinFormats800Redefined02 mciwinFormats800Redefined02 = new MciwinFormats800Redefined02();
				private MciwinFormats800Redefined mciwinFormats800Redefined = new MciwinFormats800Redefined();
	
	/**
	* Constructor for MciwinYearToWindow800
	**/
    public MciwinYearToWindow800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mciwinFormats800.setParent(this,getStartOffset() + 0);
	       			mciwinFormats800Redefined01.setParent(this,getStartOffset() + 0);
	       			mciwinFormats800Redefined02.setParent(this,getStartOffset() + 0);
	       			mciwinFormats800Redefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mciwinFormats800
	 *	@return mciwinFormats800
	 */   
	 public MciwinFormats800 getMciwinFormats800() {
   	return mciwinFormats800;
   }
   /**
	* 	Update MciwinFormats800 with the passed value
	*   Corresponding COBOL Variable is 800-MCIWIN-FORMATS
	*	@param value
	*/
   public void setMciwinFormats800(char[] value) {
      mciwinFormats800.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormats800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800.begin,mciwinFormats800.length());
   }
   
     /**
	 * 	Update MciwinFormats800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormats800 with another Field
	 *	@param value
	 */
   public void setMciwinFormats800(Field source) {
   	replace(source,0,source.length(),mciwinFormats800.begin,mciwinFormats800.length());
   }  
   
     /**
	 * 	Update MciwinFormats800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800.begin,mciwinFormats800.length());
   }
   
     /**
	 * 	Update MciwinFormats800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciwinFormats800Redefined01
	 *	@return mciwinFormats800Redefined01
	 */   
	 public MciwinFormats800Redefined01 getMciwinFormats800Redefined01() {
   	return mciwinFormats800Redefined01;
   }
   /**
	* 	Update MciwinFormats800Redefined01 with the passed value
	*   Corresponding COBOL Variable is 800-MCIWIN-FORMATS-REDEFINED
	*	@param value
	*/
   public void setMciwinFormats800Redefined01(char[] value) {
      mciwinFormats800Redefined01.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormats800Redefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800Redefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined01.begin,mciwinFormats800Redefined01.length());
   }
   
     /**
	 * 	Update MciwinFormats800Redefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800Redefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormats800Redefined01 with another Field
	 *	@param value
	 */
   public void setMciwinFormats800Redefined01(Field source) {
   	replace(source,0,source.length(),mciwinFormats800Redefined01.begin,mciwinFormats800Redefined01.length());
   }  
   
     /**
	 * 	Update MciwinFormats800Redefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800Redefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined01.begin,mciwinFormats800Redefined01.length());
   }
   
     /**
	 * 	Update MciwinFormats800Redefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800Redefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciwinFormats800Redefined02
	 *	@return mciwinFormats800Redefined02
	 */   
	 public MciwinFormats800Redefined02 getMciwinFormats800Redefined02() {
   	return mciwinFormats800Redefined02;
   }
   /**
	* 	Update MciwinFormats800Redefined02 with the passed value
	*   Corresponding COBOL Variable is 800-MCIWIN-FORMATS-REDEFINED
	*	@param value
	*/
   public void setMciwinFormats800Redefined02(char[] value) {
      mciwinFormats800Redefined02.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormats800Redefined02 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800Redefined02(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined02.begin,mciwinFormats800Redefined02.length());
   }
   
     /**
	 * 	Update MciwinFormats800Redefined02 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800Redefined02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined02.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormats800Redefined02 with another Field
	 *	@param value
	 */
   public void setMciwinFormats800Redefined02(Field source) {
   	replace(source,0,source.length(),mciwinFormats800Redefined02.begin,mciwinFormats800Redefined02.length());
   }  
   
     /**
	 * 	Update MciwinFormats800Redefined02 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800Redefined02(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined02.begin,mciwinFormats800Redefined02.length());
   }
   
     /**
	 * 	Update MciwinFormats800Redefined02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800Redefined02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined02.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciwinFormats800Redefined
	 *	@return mciwinFormats800Redefined
	 */   
	 public MciwinFormats800Redefined getMciwinFormats800Redefined() {
   	return mciwinFormats800Redefined;
   }
   /**
	* 	Update MciwinFormats800Redefined with the passed value
	*   Corresponding COBOL Variable is 800-MCIWIN-FORMATS-REDEFINED
	*	@param value
	*/
   public void setMciwinFormats800Redefined(char[] value) {
      mciwinFormats800Redefined.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormats800Redefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800Redefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined.begin,mciwinFormats800Redefined.length());
   }
   
     /**
	 * 	Update MciwinFormats800Redefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800Redefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormats800Redefined with another Field
	 *	@param value
	 */
   public void setMciwinFormats800Redefined(Field source) {
   	replace(source,0,source.length(),mciwinFormats800Redefined.begin,mciwinFormats800Redefined.length());
   }  
   
     /**
	 * 	Update MciwinFormats800Redefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats800Redefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined.begin,mciwinFormats800Redefined.length());
   }
   
     /**
	 * 	Update MciwinFormats800Redefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats800Redefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats800Redefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMciwinYearToWindow800FieldLength() {
			return MCIWIN_YEAR_TO_WINDOW_800_LENGTH;
		}

}
  
