package com.cloudframe.app.init1.dto;

/**
*  The class CmnTimeConvInput is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:59. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CmnTimeConvInput extends CmnTimeConvInputSerialized { 
   
				private CmnIsoTime cmnIsoTime = new CmnIsoTime();
				private CmnJisTime cmnJisTime = new CmnJisTime();
				private CmnNumTime cmnNumTime = new CmnNumTime();
	
	/**
	* Constructor for CmnTimeConvInput
	**/
    public CmnTimeConvInput() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for CmnTimeConvInput. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeConvInput(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			cmnIsoTime.setParent(this,getStartOffset() + 0);
	       			cmnJisTime.setParent(this,getStartOffset() + 8);
	       			cmnNumTime.setParent(this,getStartOffset() + 16);
    } 

	/**
	 *	Returns the value of cmnIsoTime
	 *	@return cmnIsoTime
	 */   
	 public CmnIsoTime getCmnIsoTime() {
   	return cmnIsoTime;
   }
   /**
	* 	Update CmnIsoTime with the passed value
	*   Corresponding COBOL Variable is CMN-ISO-TIME
	*	@param value
	*/
   public void setCmnIsoTime(char[] value) {
      cmnIsoTime.setString(value); 
   }   
    
     /**
	 * 	Update CmnIsoTime 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTime(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnIsoTime.begin,cmnIsoTime.length());
   }
   
     /**
	 * 	Update CmnIsoTime 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnIsoTime.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnIsoTime with another Field
	 *	@param value
	 */
   public void setCmnIsoTime(Field source) {
   	replace(source,0,source.length(),cmnIsoTime.begin,cmnIsoTime.length());
   }  
   
     /**
	 * 	Update CmnIsoTime 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnIsoTime(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnIsoTime.begin,cmnIsoTime.length());
   }
   
     /**
	 * 	Update CmnIsoTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnIsoTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnIsoTime.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnJisTime
	 *	@return cmnJisTime
	 */   
	 public CmnJisTime getCmnJisTime() {
   	return cmnJisTime;
   }
   /**
	* 	Update CmnJisTime with the passed value
	*   Corresponding COBOL Variable is CMN-JIS-TIME
	*	@param value
	*/
   public void setCmnJisTime(char[] value) {
      cmnJisTime.setString(value); 
   }   
    
     /**
	 * 	Update CmnJisTime 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTime(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnJisTime.begin,cmnJisTime.length());
   }
   
     /**
	 * 	Update CmnJisTime 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnJisTime.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnJisTime with another Field
	 *	@param value
	 */
   public void setCmnJisTime(Field source) {
   	replace(source,0,source.length(),cmnJisTime.begin,cmnJisTime.length());
   }  
   
     /**
	 * 	Update CmnJisTime 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnJisTime(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnJisTime.begin,cmnJisTime.length());
   }
   
     /**
	 * 	Update CmnJisTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnJisTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnJisTime.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cmnNumTime
	 *	@return cmnNumTime
	 */   
	 public CmnNumTime getCmnNumTime() {
   	return cmnNumTime;
   }
   /**
	* 	Update CmnNumTime with the passed value
	*   Corresponding COBOL Variable is CMN-NUM-TIME
	*	@param value
	*/
   public void setCmnNumTime(char[] value) {
      cmnNumTime.setString(value); 
   }   
    
     /**
	 * 	Update CmnNumTime 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCmnNumTime(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnNumTime.begin,cmnNumTime.length());
   }
   
     /**
	 * 	Update CmnNumTime 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCmnNumTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnNumTime.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CmnNumTime with another Field
	 *	@param value
	 */
   public void setCmnNumTime(Field source) {
   	replace(source,0,source.length(),cmnNumTime.begin,cmnNumTime.length());
   }  
   
     /**
	 * 	Update CmnNumTime 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCmnNumTime(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cmnNumTime.begin,cmnNumTime.length());
   }
   
     /**
	 * 	Update CmnNumTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCmnNumTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cmnNumTime.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getCmnTimeConvInputFieldLength() {
			return CMN_TIME_CONV_INPUT_LENGTH;
		}

}
  
