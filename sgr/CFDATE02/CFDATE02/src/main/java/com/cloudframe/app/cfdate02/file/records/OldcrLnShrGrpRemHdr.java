package com.cloudframe.app.cfdate02.file.records;

/**
*  The class OldcrLnShrGrpRemHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class OldcrLnShrGrpRemHdr extends OldcrLnShrGrpRemHdrSerialized { 
   

						private char[] oldcrCustomerHeaderRec = Field.fillLowValue(152);
	
	/**
	* Constructor for OldcrLnShrGrpRemHdr
	**/
    public OldcrLnShrGrpRemHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for OldcrLnShrGrpRemHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OldcrLnShrGrpRemHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of oldcrCustomerHeaderRec
	 *	@return oldcrCustomerHeaderRec
	 */
   public char[] getOldcrCustomerHeaderRec() throws CFException{
     if (isOldcrCustomerHeaderRecModified()) { 
        oldcrCustomerHeaderRec = refreshOldcrCustomerHeaderRec();
     }
   		return oldcrCustomerHeaderRec;
   }

  
	/**
	*  set variable oldcrCustomerHeaderRec
	*  Corresponding COBOL Variable is OLDCR-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setOldcrCustomerHeaderRec(char[] value) {
      oldcrCustomerHeaderRec = checkOldcrCustomerHeaderRecConstraints(value);
      serializeOldcrCustomerHeaderRec(oldcrCustomerHeaderRec);
   } 

     /**
	 * 	Update OldcrCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOldcrCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOldcrCustomerHeaderRec,oldcrCustomerHeaderRec.length);
   	
   }
   
   public void setOldcrCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrCustomerHeaderRec,oldcrCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update OldcrCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOldcrCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OldcrCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setOldcrCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginOldcrCustomerHeaderRec,OLDCR_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update OldcrCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOldcrCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOldcrCustomerHeaderRec,OLDCR_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update OldcrCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOldcrCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOldcrCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getOldcrLnShrGrpRemHdrFieldLength() {
			return OLDCR_LN_SHR_GRP_REM_HDR_LENGTH;
		}

}
  
