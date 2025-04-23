package com.cloudframe.app.cfdate02.file.records;

/**
*  The class Rl001HdrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001HdrRecord extends Rl001HdrRecordSerialized { 
   

						private char[] rl001CustomerHeaderRec = Field.fillLowValue(681);
	
	/**
	* Constructor for Rl001HdrRecord
	**/
    public Rl001HdrRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl001HdrRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001HdrRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rl001CustomerHeaderRec
	 *	@return rl001CustomerHeaderRec
	 */
   public char[] getRl001CustomerHeaderRec() throws CFException{
     if (isRl001CustomerHeaderRecModified()) { 
        rl001CustomerHeaderRec = refreshRl001CustomerHeaderRec();
     }
   		return rl001CustomerHeaderRec;
   }

  
	/**
	*  set variable rl001CustomerHeaderRec
	*  Corresponding COBOL Variable is RL001-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setRl001CustomerHeaderRec(char[] value) {
      rl001CustomerHeaderRec = checkRl001CustomerHeaderRecConstraints(value);
      serializeRl001CustomerHeaderRec(rl001CustomerHeaderRec);
   } 

     /**
	 * 	Update Rl001CustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001CustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001CustomerHeaderRec,rl001CustomerHeaderRec.length);
   	
   }
   
   public void setRl001CustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001CustomerHeaderRec,rl001CustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update Rl001CustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001CustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001CustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001CustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setRl001CustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginRl001CustomerHeaderRec,RL_001_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001CustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001CustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001CustomerHeaderRec,RL_001_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update Rl001CustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001CustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001CustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRl001HdrRecordFieldLength() {
			return RL_001_HDR_RECORD_LENGTH;
		}

}
  
