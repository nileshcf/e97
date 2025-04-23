package com.cloudframe.app.cfdate02.file.records;

/**
*  The class RlduuInEocUsgBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class RlduuInEocUsgBlHdr extends RlduuInEocUsgBlHdrSerialized { 
   

						private char[] rlduuCustomerHeaderRec = Field.fillLowValue(989);
	
	/**
	* Constructor for RlduuInEocUsgBlHdr
	**/
    public RlduuInEocUsgBlHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for RlduuInEocUsgBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RlduuInEocUsgBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of rlduuCustomerHeaderRec
	 *	@return rlduuCustomerHeaderRec
	 */
   public char[] getRlduuCustomerHeaderRec() throws CFException{
     if (isRlduuCustomerHeaderRecModified()) { 
        rlduuCustomerHeaderRec = refreshRlduuCustomerHeaderRec();
     }
   		return rlduuCustomerHeaderRec;
   }

  
	/**
	*  set variable rlduuCustomerHeaderRec
	*  Corresponding COBOL Variable is RLDUU-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setRlduuCustomerHeaderRec(char[] value) {
      rlduuCustomerHeaderRec = checkRlduuCustomerHeaderRecConstraints(value);
      serializeRlduuCustomerHeaderRec(rlduuCustomerHeaderRec);
   } 

     /**
	 * 	Update RlduuCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRlduuCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRlduuCustomerHeaderRec,rlduuCustomerHeaderRec.length);
   	
   }
   
   public void setRlduuCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuCustomerHeaderRec,rlduuCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update RlduuCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlduuCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RlduuCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setRlduuCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginRlduuCustomerHeaderRec,RLDUU_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update RlduuCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRlduuCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRlduuCustomerHeaderRec,RLDUU_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update RlduuCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlduuCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRlduuCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getRlduuInEocUsgBlHdrFieldLength() {
			return RLDUU_IN_EOC_USG_BL_HDR_LENGTH;
		}

}
  
