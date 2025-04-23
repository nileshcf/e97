package com.cloudframe.app.mc082.dto;

/**
*  The class Mc083ReadFileParm is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/


import com.cloudframe.app.mc082.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Mc083ReadFileParm extends Mc083ReadFileParmSerialized {
   

						private char[] mc083FileStatus = Field.fillLowValue(2);

						private char[] mc083Data = Field.fillLowValue(80);
	
	/**
	* Constructor for Mc083ReadFileParm
	**/
    public Mc083ReadFileParm() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of mc083FileStatus
	 *	@return mc083FileStatus
	 */
   public char[] getMc083FileStatus() throws CFException{
     if (isMc083FileStatusModified()) { 
        mc083FileStatus = refreshMc083FileStatus();
     }
   		return mc083FileStatus;
   }

  
	/**
	*  set variable mc083FileStatus
	*  Corresponding COBOL Variable is MC083-FILE-STATUS
	*  @param value
	**/
   public void setMc083FileStatus(char[] value) {
      mc083FileStatus = checkMc083FileStatusConstraints(value);
      serializeMc083FileStatus(mc083FileStatus);
   } 

     /**
	 * 	Update Mc083FileStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMc083FileStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMc083FileStatus,mc083FileStatus.length);
   	
   }
   
   public void setMc083FileStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMc083FileStatus,mc083FileStatus.length);
   	
   }
   
     /**
	 * 	Update Mc083FileStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMc083FileStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMc083FileStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Mc083FileStatus with another Field
	 *	@param value
	 */
   public void setMc083FileStatus(Field source) {
       replace(source,0,source.length(),beginMc083FileStatus,MC_083_FILE_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update Mc083FileStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMc083FileStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMc083FileStatus,MC_083_FILE_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update Mc083FileStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMc083FileStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMc083FileStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of mc083Data
	 *	@return mc083Data
	 */
   public char[] getMc083Data() throws CFException{
     if (isMc083DataModified()) { 
        mc083Data = refreshMc083Data();
     }
   		return mc083Data;
   }

  
	/**
	*  set variable mc083Data
	*  Corresponding COBOL Variable is MC083-DATA
	*  @param value
	**/
   public void setMc083Data(char[] value) {
      mc083Data = checkMc083DataConstraints(value);
      serializeMc083Data(mc083Data);
   } 

     /**
	 * 	Update Mc083Data 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setMc083Data(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginMc083Data,mc083Data.length);
   	
   }
   
   public void setMc083Data(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginMc083Data,mc083Data.length);
   	
   }
   
     /**
	 * 	Update Mc083Data 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMc083Data(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMc083Data+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Mc083Data with another Field
	 *	@param value
	 */
   public void setMc083Data(Field source) {
       replace(source,0,source.length(),beginMc083Data,MC_083_DATA_LEN);
   	
   }  
   
     /**
	 * 	Update Mc083Data 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setMc083Data(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginMc083Data,MC_083_DATA_LEN);
   	
   }
   
     /**
	 * 	Update Mc083Data 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMc083Data(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginMc083Data+targetIndex,targetLen);
    
   }

	
	
	

		public static int getMc083ReadFileParmFieldLength() {
			return MC_083_READ_FILE_PARM_LENGTH;
		}

}
  
