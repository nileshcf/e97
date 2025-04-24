package com.cloudframe.app.sf327010.dto;

/**
*  The class WhenCompTime800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:35. using version 5.0.0.254
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WhenCompTime800 extends WhenCompTime800Serialized { 
   

						private char[] whenTimeHh800 = new char[2];

						private char[] whenTimeMm800 = new char[2];

						private char[] whenTimeSs800 = new char[2];
	
	/**
	* Constructor for WhenCompTime800
	**/
    public WhenCompTime800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WhenCompTime800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WhenCompTime800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setWhenTimeHh800(fillSpace(2));
								setWhenTimeMm800(fillSpace(2));
								setWhenTimeSs800(fillSpace(2));
    } 

	/**
	 *	Returns the value of whenTimeHh800
	 *	@return whenTimeHh800
	 */
   public char[] getWhenTimeHh800() throws CFException{
     if (isWhenTimeHh800Modified()) { 
        whenTimeHh800 = refreshWhenTimeHh800();
     }
   		return whenTimeHh800;
   }

  
	/**
	*  set variable whenTimeHh800
	*  Corresponding COBOL Variable is 800-WHEN-TIME-HH
	*  @param value
	**/
   public void setWhenTimeHh800(char[] value) {
      whenTimeHh800 = checkWhenTimeHh800Constraints(value);
      serializeWhenTimeHh800(whenTimeHh800);
   } 

     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWhenTimeHh800,whenTimeHh800.length);
   	
   }
   
   public void setWhenTimeHh800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeHh800,whenTimeHh800.length);
   	
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeHh800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WhenTimeHh800 with another Field
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source) {
       replace(source,0,source.length(),beginWhenTimeHh800,WHEN_TIME_HH_800_LEN);
   	
   }  
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWhenTimeHh800,WHEN_TIME_HH_800_LEN);
   	
   }
   
     /**
	 * 	Update WhenTimeHh800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeHh800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeHh800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of whenTimeMm800
	 *	@return whenTimeMm800
	 */
   public char[] getWhenTimeMm800() throws CFException{
     if (isWhenTimeMm800Modified()) { 
        whenTimeMm800 = refreshWhenTimeMm800();
     }
   		return whenTimeMm800;
   }

  
	/**
	*  set variable whenTimeMm800
	*  Corresponding COBOL Variable is 800-WHEN-TIME-MM
	*  @param value
	**/
   public void setWhenTimeMm800(char[] value) {
      whenTimeMm800 = checkWhenTimeMm800Constraints(value);
      serializeWhenTimeMm800(whenTimeMm800);
   } 

     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWhenTimeMm800,whenTimeMm800.length);
   	
   }
   
   public void setWhenTimeMm800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeMm800,whenTimeMm800.length);
   	
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeMm800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WhenTimeMm800 with another Field
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source) {
       replace(source,0,source.length(),beginWhenTimeMm800,WHEN_TIME_MM_800_LEN);
   	
   }  
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWhenTimeMm800,WHEN_TIME_MM_800_LEN);
   	
   }
   
     /**
	 * 	Update WhenTimeMm800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeMm800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeMm800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of whenTimeSs800
	 *	@return whenTimeSs800
	 */
   public char[] getWhenTimeSs800() throws CFException{
     if (isWhenTimeSs800Modified()) { 
        whenTimeSs800 = refreshWhenTimeSs800();
     }
   		return whenTimeSs800;
   }

  
	/**
	*  set variable whenTimeSs800
	*  Corresponding COBOL Variable is 800-WHEN-TIME-SS
	*  @param value
	**/
   public void setWhenTimeSs800(char[] value) {
      whenTimeSs800 = checkWhenTimeSs800Constraints(value);
      serializeWhenTimeSs800(whenTimeSs800);
   } 

     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWhenTimeSs800,whenTimeSs800.length);
   	
   }
   
   public void setWhenTimeSs800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeSs800,whenTimeSs800.length);
   	
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeSs800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WhenTimeSs800 with another Field
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source) {
       replace(source,0,source.length(),beginWhenTimeSs800,WHEN_TIME_SS_800_LEN);
   	
   }  
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWhenTimeSs800,WHEN_TIME_SS_800_LEN);
   	
   }
   
     /**
	 * 	Update WhenTimeSs800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWhenTimeSs800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWhenTimeSs800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWhenCompTime800FieldLength() {
			return WHEN_COMP_TIME_800_LENGTH;
		}

}
  
