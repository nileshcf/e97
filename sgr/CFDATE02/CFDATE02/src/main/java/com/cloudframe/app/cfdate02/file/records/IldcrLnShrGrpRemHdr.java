package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldcrLnShrGrpRemHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldcrLnShrGrpRemHdr extends IldcrLnShrGrpRemHdrSerialized { 
   

						private char[] ildcrCustomerHeaderRec = Field.fillLowValue(152);
	
	/**
	* Constructor for IldcrLnShrGrpRemHdr
	**/
    public IldcrLnShrGrpRemHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IldcrLnShrGrpRemHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldcrLnShrGrpRemHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ildcrCustomerHeaderRec
	 *	@return ildcrCustomerHeaderRec
	 */
   public char[] getIldcrCustomerHeaderRec() throws CFException{
     if (isIldcrCustomerHeaderRecModified()) { 
        ildcrCustomerHeaderRec = refreshIldcrCustomerHeaderRec();
     }
   		return ildcrCustomerHeaderRec;
   }

  
	/**
	*  set variable ildcrCustomerHeaderRec
	*  Corresponding COBOL Variable is ILDCR-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setIldcrCustomerHeaderRec(char[] value) {
      ildcrCustomerHeaderRec = checkIldcrCustomerHeaderRecConstraints(value);
      serializeIldcrCustomerHeaderRec(ildcrCustomerHeaderRec);
   } 

     /**
	 * 	Update IldcrCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIldcrCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIldcrCustomerHeaderRec,ildcrCustomerHeaderRec.length);
   	
   }
   
   public void setIldcrCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrCustomerHeaderRec,ildcrCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update IldcrCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldcrCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IldcrCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setIldcrCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginIldcrCustomerHeaderRec,ILDCR_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update IldcrCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIldcrCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIldcrCustomerHeaderRec,ILDCR_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update IldcrCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldcrCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldcrCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIldcrLnShrGrpRemHdrFieldLength() {
			return ILDCR_LN_SHR_GRP_REM_HDR_LENGTH;
		}

}
  
