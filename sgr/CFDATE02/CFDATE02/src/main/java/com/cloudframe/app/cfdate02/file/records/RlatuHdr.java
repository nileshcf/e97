package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlatuHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlatuHdr extends RlatuHdrSerialized { 
   

						private char[] rlatuCustomerHeaderRec = Field.fillLowValue(129);
	
	/**
	* Constructor for RlatuHdr
	**/
    public RlatuHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlatuHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlatuHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlatuCustomerHeaderRec
	 *	@return rlatuCustomerHeaderRec
	 */
   public char[] getRlatuCustomerHeaderRec() throws CFException{
     if (isRlatuCustomerHeaderRecModified()) { 
        rlatuCustomerHeaderRec = refreshRlatuCustomerHeaderRec();
     }
   		return rlatuCustomerHeaderRec;
   }

  
	/**
	*  set variable rlatuCustomerHeaderRec
	*  Corresponding COBOL Variable is RLATU-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setRlatuCustomerHeaderRec(char[] value) {
      rlatuCustomerHeaderRec = checkRlatuCustomerHeaderRecConstraints(value);
      serializeRlatuCustomerHeaderRec(rlatuCustomerHeaderRec);
   } 

     /**
	 * 	Update RlatuCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlatuCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlatuCustomerHeaderRec,rlatuCustomerHeaderRec.length);
   	
   }
   
   public void setRlatuCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlatuCustomerHeaderRec,rlatuCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update RlatuCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlatuCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatuCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlatuCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setRlatuCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginRlatuCustomerHeaderRec,RLATU_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RlatuCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlatuCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlatuCustomerHeaderRec,RLATU_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update RlatuCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlatuCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlatuCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlatuHdrFieldLength() {
			return RLATU_HDR_LENGTH;
		}

}
  
