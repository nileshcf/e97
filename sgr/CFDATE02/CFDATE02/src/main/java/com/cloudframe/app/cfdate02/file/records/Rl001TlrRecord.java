package com.cloudframe.app.cfdate02.file.records;

/**
*  The class Rl001TlrRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Rl001TlrRecord extends Rl001TlrRecordSerialized { 
   

						private char[] rl001CustomerTrailerRec = Field.fillLowValue(681);
	
	/**
	* Constructor for Rl001TlrRecord
	**/
    public Rl001TlrRecord() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Rl001TlrRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rl001TlrRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rl001CustomerTrailerRec
	 *	@return rl001CustomerTrailerRec
	 */
   public char[] getRl001CustomerTrailerRec() throws CFException{
     if (isRl001CustomerTrailerRecModified()) { 
        rl001CustomerTrailerRec = refreshRl001CustomerTrailerRec();
     }
   		return rl001CustomerTrailerRec;
   }

  
	/**
	*  set variable rl001CustomerTrailerRec
	*  Corresponding COBOL Variable is RL001-CUSTOMER-TRAILER-REC
	*  @param value
	**/
   public void setRl001CustomerTrailerRec(char[] value) {
      rl001CustomerTrailerRec = checkRl001CustomerTrailerRecConstraints(value);
      serializeRl001CustomerTrailerRec(rl001CustomerTrailerRec);
   } 

     /**
	 * 	Update Rl001CustomerTrailerRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRl001CustomerTrailerRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRl001CustomerTrailerRec,rl001CustomerTrailerRec.length);
   	
   }
   
   public void setRl001CustomerTrailerRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRl001CustomerTrailerRec,rl001CustomerTrailerRec.length);
   	
   }
   
     /**
	 * 	Update Rl001CustomerTrailerRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRl001CustomerTrailerRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001CustomerTrailerRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Rl001CustomerTrailerRec with another Field
	 *	@param value
	 */
   public void setRl001CustomerTrailerRec(Field source) {
       replace(source,0,source.length(),beginRl001CustomerTrailerRec,RL_001_CUSTOMER_TRAILER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update Rl001CustomerTrailerRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRl001CustomerTrailerRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRl001CustomerTrailerRec,RL_001_CUSTOMER_TRAILER_REC_LEN);
   	
   }
   
     /**
	 * 	Update Rl001CustomerTrailerRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRl001CustomerTrailerRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRl001CustomerTrailerRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRl001TlrRecordFieldLength() {
			return RL_001_TLR_RECORD_LENGTH;
		}

}
  
