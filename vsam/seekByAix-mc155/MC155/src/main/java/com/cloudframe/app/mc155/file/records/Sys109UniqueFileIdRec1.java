package com.cloudframe.app.mc155.file.records;

/**
*  The class Sys109UniqueFileIdRec1 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/


import com.cloudframe.app.mc155.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Sys109UniqueFileIdRec1 extends Sys109UniqueFileIdRec1Serialized { 
   

						private char[] sys109ProcessSeqnoKey = Field.fillLowValue(13);
	
	/**
	* Constructor for Sys109UniqueFileIdRec1
	**/
    public Sys109UniqueFileIdRec1() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Sys109UniqueFileIdRec1. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sys109UniqueFileIdRec1(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of sys109ProcessSeqnoKey
	 *	@return sys109ProcessSeqnoKey
	 */
   public char[] getSys109ProcessSeqnoKey() throws CFException{
     if (isSys109ProcessSeqnoKeyModified()) { 
        sys109ProcessSeqnoKey = refreshSys109ProcessSeqnoKey();
     }
   		return sys109ProcessSeqnoKey;
   }

  
	/**
	*  set variable sys109ProcessSeqnoKey
	*  Corresponding COBOL Variable is SYS109-PROCESS-SEQNO-KEY
	*  @param value
	**/
   public void setSys109ProcessSeqnoKey(char[] value) {
      sys109ProcessSeqnoKey = checkSys109ProcessSeqnoKeyConstraints(value);
      serializeSys109ProcessSeqnoKey(sys109ProcessSeqnoKey);
   } 

     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys109ProcessSeqnoKey,sys109ProcessSeqnoKey.length);
   	
   }
   
   public void setSys109ProcessSeqnoKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys109ProcessSeqnoKey,sys109ProcessSeqnoKey.length);
   	
   }
   
     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys109ProcessSeqnoKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys109ProcessSeqnoKey with another Field
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(Field source) {
       replace(source,0,source.length(),beginSys109ProcessSeqnoKey,SYS_109_PROCESS_SEQNO_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys109ProcessSeqnoKey,SYS_109_PROCESS_SEQNO_KEY_LEN);
   	
   }
   
     /**
	 * 	Update Sys109ProcessSeqnoKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys109ProcessSeqnoKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys109ProcessSeqnoKey+targetIndex,targetLen);
    
   }

	
	
	

		public static int getSys109UniqueFileIdRec1FieldLength() {
			return SYS_109_UNIQUE_FILE_ID_REC_1_LENGTH;
		}

}
  
