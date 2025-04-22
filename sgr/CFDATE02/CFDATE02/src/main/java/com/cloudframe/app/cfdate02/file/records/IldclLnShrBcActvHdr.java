package com.cloudframe.app.cfdate02.file.records;

/**
*  The class IldclLnShrBcActvHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IldclLnShrBcActvHdr extends IldclLnShrBcActvHdrSerialized { 
   

						private char[] ildclCustomerHeaderRec = Field.fillLowValue(329);
	
	/**
	* Constructor for IldclLnShrBcActvHdr
	**/
    public IldclLnShrBcActvHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for IldclLnShrBcActvHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IldclLnShrBcActvHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of ildclCustomerHeaderRec
	 *	@return ildclCustomerHeaderRec
	 */
   public char[] getIldclCustomerHeaderRec() throws CFException{
     if (isIldclCustomerHeaderRecModified()) { 
        ildclCustomerHeaderRec = refreshIldclCustomerHeaderRec();
     }
   		return ildclCustomerHeaderRec;
   }

  
	/**
	*  set variable ildclCustomerHeaderRec
	*  Corresponding COBOL Variable is ILDCL-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setIldclCustomerHeaderRec(char[] value) {
      ildclCustomerHeaderRec = checkIldclCustomerHeaderRecConstraints(value);
      serializeIldclCustomerHeaderRec(ildclCustomerHeaderRec);
   } 

     /**
	 * 	Update IldclCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIldclCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIldclCustomerHeaderRec,ildclCustomerHeaderRec.length);
   	
   }
   
   public void setIldclCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIldclCustomerHeaderRec,ildclCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update IldclCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIldclCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldclCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update IldclCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setIldclCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginIldclCustomerHeaderRec,ILDCL_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update IldclCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIldclCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIldclCustomerHeaderRec,ILDCL_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update IldclCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIldclCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIldclCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIldclLnShrBcActvHdrFieldLength() {
			return ILDCL_LN_SHR_BC_ACTV_HDR_LENGTH;
		}

}
  
