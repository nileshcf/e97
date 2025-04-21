package com.cloudframe.app.sf320010.dto;

/**
*  The class MciwinYearToWindow is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.sf320010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MciwinYearToWindow extends MciwinYearToWindowSerialized {
   
				private MciwinFormats mciwinFormats = new MciwinFormats();
				private MciwinFormatsRedefined01 mciwinFormatsRedefined01 = new MciwinFormatsRedefined01();
				private MciwinFormatsRedefined02 mciwinFormatsRedefined02 = new MciwinFormatsRedefined02();
				private MciwinFormatsRedefined mciwinFormatsRedefined = new MciwinFormatsRedefined();
	
	/**
	* Constructor for MciwinYearToWindow
	**/
    public MciwinYearToWindow() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			mciwinFormats.setParent(this,getStartOffset() + 0);
	       			mciwinFormatsRedefined01.setParent(this,getStartOffset() + 0);
	       			mciwinFormatsRedefined02.setParent(this,getStartOffset() + 0);
	       			mciwinFormatsRedefined.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mciwinFormats
	 *	@return mciwinFormats
	 */   
	 public MciwinFormats getMciwinFormats() {
   	return mciwinFormats;
   }
   /**
	* 	Update MciwinFormats with the passed value
	*   Corresponding COBOL Variable is MCIWIN-FORMATS
	*	@param value
	*/
   public void setMciwinFormats(char[] value) {
      mciwinFormats.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormats 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats.begin,mciwinFormats.length());
   }
   
     /**
	 * 	Update MciwinFormats 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormats with another Field
	 *	@param value
	 */
   public void setMciwinFormats(Field source) {
   	replace(source,0,source.length(),mciwinFormats.begin,mciwinFormats.length());
   }  
   
     /**
	 * 	Update MciwinFormats 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormats(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats.begin,mciwinFormats.length());
   }
   
     /**
	 * 	Update MciwinFormats 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormats(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormats.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciwinFormatsRedefined01
	 *	@return mciwinFormatsRedefined01
	 */   
	 public MciwinFormatsRedefined01 getMciwinFormatsRedefined01() {
   	return mciwinFormatsRedefined01;
   }
   /**
	* 	Update MciwinFormatsRedefined01 with the passed value
	*   Corresponding COBOL Variable is MCIWIN-FORMATS-REDEFINED
	*	@param value
	*/
   public void setMciwinFormatsRedefined01(char[] value) {
      mciwinFormatsRedefined01.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormatsRedefined01 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormatsRedefined01(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined01.begin,mciwinFormatsRedefined01.length());
   }
   
     /**
	 * 	Update MciwinFormatsRedefined01 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormatsRedefined01(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined01.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormatsRedefined01 with another Field
	 *	@param value
	 */
   public void setMciwinFormatsRedefined01(Field source) {
   	replace(source,0,source.length(),mciwinFormatsRedefined01.begin,mciwinFormatsRedefined01.length());
   }  
   
     /**
	 * 	Update MciwinFormatsRedefined01 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormatsRedefined01(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined01.begin,mciwinFormatsRedefined01.length());
   }
   
     /**
	 * 	Update MciwinFormatsRedefined01 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormatsRedefined01(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined01.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciwinFormatsRedefined02
	 *	@return mciwinFormatsRedefined02
	 */   
	 public MciwinFormatsRedefined02 getMciwinFormatsRedefined02() {
   	return mciwinFormatsRedefined02;
   }
   /**
	* 	Update MciwinFormatsRedefined02 with the passed value
	*   Corresponding COBOL Variable is MCIWIN-FORMATS-REDEFINED
	*	@param value
	*/
   public void setMciwinFormatsRedefined02(char[] value) {
      mciwinFormatsRedefined02.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormatsRedefined02 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormatsRedefined02(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined02.begin,mciwinFormatsRedefined02.length());
   }
   
     /**
	 * 	Update MciwinFormatsRedefined02 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormatsRedefined02(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined02.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormatsRedefined02 with another Field
	 *	@param value
	 */
   public void setMciwinFormatsRedefined02(Field source) {
   	replace(source,0,source.length(),mciwinFormatsRedefined02.begin,mciwinFormatsRedefined02.length());
   }  
   
     /**
	 * 	Update MciwinFormatsRedefined02 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormatsRedefined02(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined02.begin,mciwinFormatsRedefined02.length());
   }
   
     /**
	 * 	Update MciwinFormatsRedefined02 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormatsRedefined02(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined02.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of mciwinFormatsRedefined
	 *	@return mciwinFormatsRedefined
	 */   
	 public MciwinFormatsRedefined getMciwinFormatsRedefined() {
   	return mciwinFormatsRedefined;
   }
   /**
	* 	Update MciwinFormatsRedefined with the passed value
	*   Corresponding COBOL Variable is MCIWIN-FORMATS-REDEFINED
	*	@param value
	*/
   public void setMciwinFormatsRedefined(char[] value) {
      mciwinFormatsRedefined.setString(value); 
   }   
    
     /**
	 * 	Update MciwinFormatsRedefined 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormatsRedefined(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined.begin,mciwinFormatsRedefined.length());
   }
   
     /**
	 * 	Update MciwinFormatsRedefined 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormatsRedefined(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MciwinFormatsRedefined with another Field
	 *	@param value
	 */
   public void setMciwinFormatsRedefined(Field source) {
   	replace(source,0,source.length(),mciwinFormatsRedefined.begin,mciwinFormatsRedefined.length());
   }  
   
     /**
	 * 	Update MciwinFormatsRedefined 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMciwinFormatsRedefined(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined.begin,mciwinFormatsRedefined.length());
   }
   
     /**
	 * 	Update MciwinFormatsRedefined 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMciwinFormatsRedefined(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,mciwinFormatsRedefined.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getMciwinYearToWindowFieldLength() {
			return MCIWIN_YEAR_TO_WINDOW_LENGTH;
		}

}
  
