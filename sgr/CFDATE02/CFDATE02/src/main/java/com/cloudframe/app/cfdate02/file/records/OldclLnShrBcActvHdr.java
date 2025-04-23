package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldclLnShrBcActvHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldclLnShrBcActvHdr extends OldclLnShrBcActvHdrSerialized { 
   

						private char[] oldclCustomerHeaderRec = Field.fillLowValue(329);
	
	/**
	* Constructor for OldclLnShrBcActvHdr
	**/
    public OldclLnShrBcActvHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OldclLnShrBcActvHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldclLnShrBcActvHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of oldclCustomerHeaderRec
	 *	@return oldclCustomerHeaderRec
	 */
   public char[] getOldclCustomerHeaderRec() throws CFException{
     if (isOldclCustomerHeaderRecModified()) { 
        oldclCustomerHeaderRec = refreshOldclCustomerHeaderRec();
     }
   		return oldclCustomerHeaderRec;
   }

  
	/**
	*  set variable oldclCustomerHeaderRec
	*  Corresponding COBOL Variable is OLDCL-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setOldclCustomerHeaderRec(char[] value) {
      oldclCustomerHeaderRec = checkOldclCustomerHeaderRecConstraints(value);
      serializeOldclCustomerHeaderRec(oldclCustomerHeaderRec);
   } 

     /**
	 * 	Update OldclCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldclCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldclCustomerHeaderRec,oldclCustomerHeaderRec.length);
   	
   }
   
   public void setOldclCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldclCustomerHeaderRec,oldclCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update OldclCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldclCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldclCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldclCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setOldclCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginOldclCustomerHeaderRec,OLDCL_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update OldclCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldclCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldclCustomerHeaderRec,OLDCL_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update OldclCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldclCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldclCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOldclLnShrBcActvHdrFieldLength() {
			return OLDCL_LN_SHR_BC_ACTV_HDR_LENGTH;
		}

}
  
