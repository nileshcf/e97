package com.cloudframe.app.sf326010.dto;

/**
*  The class Sys001MiplogRecordGroup800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/


import com.cloudframe.app.sf326010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys001MiplogRecordGroup800 extends Sys001MiplogRecordGroup800Serialized {
   

						private char[] sys001MiplogRecord800 = new char[32752];
					private ZlogRecord801 zlogRecord801 = new ZlogRecord801();
	
	/**
	* Constructor for Sys001MiplogRecordGroup800
	**/
    public Sys001MiplogRecordGroup800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			zlogRecord801.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setSys001MiplogRecord800(pad(32752," ".toCharArray(),' ',RIGHT_PAD));
    }


 

	/**
	 *	Returns the value of sys001MiplogRecord800
	 *	@return sys001MiplogRecord800
	 */
   public char[] getSys001MiplogRecord800() throws CFException{
     if (isSys001MiplogRecord800Modified()) { 
        sys001MiplogRecord800 = refreshSys001MiplogRecord800();
     }
   		return sys001MiplogRecord800;
   }

  
	/**
	*  set variable sys001MiplogRecord800
	*  Corresponding COBOL Variable is 800-SYS001-MIPLOG-RECORD
	*  @param value
	**/
   public void setSys001MiplogRecord800(char[] value) {
      sys001MiplogRecord800 = checkSys001MiplogRecord800Constraints(value);
      serializeSys001MiplogRecord800(sys001MiplogRecord800);
   } 

     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001MiplogRecord800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001MiplogRecord800,sys001MiplogRecord800.length);
   	
   }
   
   public void setSys001MiplogRecord800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRecord800,sys001MiplogRecord800.length);
   	
   }
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecord800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRecord800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001MiplogRecord800 with another Field
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source) {
       replace(source,0,source.length(),beginSys001MiplogRecord800,SYS_001_MIPLOG_RECORD_800_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001MiplogRecord800,SYS_001_MIPLOG_RECORD_800_LEN);
   	
   }
   
     /**
	 * 	Update Sys001MiplogRecord800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001MiplogRecord800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001MiplogRecord800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of zlogRecord801
	 *	@return zlogRecord801
	 */   
	 public ZlogRecord801 getZlogRecord801() {
   	return zlogRecord801;
   }
   /**
	* 	Update ZlogRecord801 with the passed value
	*   Corresponding COBOL Variable is 801-ZLOG-RECORD
	*	@param value
	*/
   public void setZlogRecord801(char[] value) {
      zlogRecord801.setString(value); 
   }   
    
     /**
	 * 	Update ZlogRecord801 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setZlogRecord801(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,zlogRecord801.begin,zlogRecord801.length());
   }
   
     /**
	 * 	Update ZlogRecord801 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,zlogRecord801.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ZlogRecord801 with another Field
	 *	@param value
	 */
   public void setZlogRecord801(Field source) {
   	replace(source,0,source.length(),zlogRecord801.begin,zlogRecord801.length());
   }  
   
     /**
	 * 	Update ZlogRecord801 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setZlogRecord801(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,zlogRecord801.begin,zlogRecord801.length());
   }
   
     /**
	 * 	Update ZlogRecord801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setZlogRecord801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,zlogRecord801.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getSys001MiplogRecordGroup800FieldLength() {
			return SYS_001_MIPLOG_RECORD_GROUP_800_LENGTH;
		}

}
  
