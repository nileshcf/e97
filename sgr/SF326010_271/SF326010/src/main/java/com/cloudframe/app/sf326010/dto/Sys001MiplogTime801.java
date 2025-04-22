package com.cloudframe.app.sf326010.dto;

/**
*  The class Sys001MiplogTime801 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:12. using version 5.0.0.254
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001MiplogTime801 extends Sys001MiplogTime801Serialized { 
   

						private char[] sys001MiplogTimeHh801 = Field.fillLowValue(1);

						private char[] sys001MiplogTimeMm801 = Field.fillLowValue(1);

						private char[] sys001MiplogTimeSs801 = Field.fillLowValue(1);
	
	/**
	* Constructor for Sys001MiplogTime801
	**/
    public Sys001MiplogTime801() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys001MiplogTime801. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys001MiplogTime801(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys001MiplogTimeHh801
	 *	@return sys001MiplogTimeHh801
	 */
   public char[] getSys001MiplogTimeHh801() throws CFException{
     if (isSys001MiplogTimeHh801Modified()) { 
        sys001MiplogTimeHh801 = refreshSys001MiplogTimeHh801();
     }
   		return sys001MiplogTimeHh801;
   }

  
	/**
	*  set variable sys001MiplogTimeHh801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-TIME-HH
	*  @param value
	**/
   public void setSys001MiplogTimeHh801(char[] value) {
      sys001MiplogTimeHh801 = checkSys001MiplogTimeHh801Constraints(value);
      serializeSys001MiplogTimeHh801(sys001MiplogTimeHh801);
   } 

     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogTimeHh801,sys001MiplogTimeHh801.length);
   	
   }
   
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeHh801,sys001MiplogTimeHh801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeHh801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogTimeHh801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogTimeHh801,SYS_001_MIPLOG_TIME_HH_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeHh801,SYS_001_MIPLOG_TIME_HH_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeHh801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeHh801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeHh801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogTimeMm801
	 *	@return sys001MiplogTimeMm801
	 */
   public char[] getSys001MiplogTimeMm801() throws CFException{
     if (isSys001MiplogTimeMm801Modified()) { 
        sys001MiplogTimeMm801 = refreshSys001MiplogTimeMm801();
     }
   		return sys001MiplogTimeMm801;
   }

  
	/**
	*  set variable sys001MiplogTimeMm801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-TIME-MM
	*  @param value
	**/
   public void setSys001MiplogTimeMm801(char[] value) {
      sys001MiplogTimeMm801 = checkSys001MiplogTimeMm801Constraints(value);
      serializeSys001MiplogTimeMm801(sys001MiplogTimeMm801);
   } 

     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogTimeMm801,sys001MiplogTimeMm801.length);
   	
   }
   
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeMm801,sys001MiplogTimeMm801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeMm801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogTimeMm801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogTimeMm801,SYS_001_MIPLOG_TIME_MM_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeMm801,SYS_001_MIPLOG_TIME_MM_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeMm801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeMm801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeMm801+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001MiplogTimeSs801
	 *	@return sys001MiplogTimeSs801
	 */
   public char[] getSys001MiplogTimeSs801() throws CFException{
     if (isSys001MiplogTimeSs801Modified()) { 
        sys001MiplogTimeSs801 = refreshSys001MiplogTimeSs801();
     }
   		return sys001MiplogTimeSs801;
   }

  
	/**
	*  set variable sys001MiplogTimeSs801
	*  Corresponding COBOL Variable is 801-SYS001-MIPLOG-TIME-SS
	*  @param value
	**/
   public void setSys001MiplogTimeSs801(char[] value) {
      sys001MiplogTimeSs801 = checkSys001MiplogTimeSs801Constraints(value);
      serializeSys001MiplogTimeSs801(sys001MiplogTimeSs801);
   } 

     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogTimeSs801,sys001MiplogTimeSs801.length);
   	
   }
   
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeSs801,sys001MiplogTimeSs801.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeSs801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogTimeSs801 with another Field
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source) {
       replace(source,0,source.length(),beginSys001MiplogTimeSs801,SYS_001_MIPLOG_TIME_SS_801_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeSs801,SYS_001_MIPLOG_TIME_SS_801_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogTimeSs801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogTimeSs801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogTimeSs801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys001MiplogTime801FieldLength() {
			return SYS_001_MIPLOG_TIME_801_LENGTH;
		}

}
  
