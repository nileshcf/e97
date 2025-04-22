package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlgusInEocRefBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlgusInEocRefBlHdr extends FlgusInEocRefBlHdrSerialized { 
   

						private char[] flgusCustomerHeaderRec = Field.fillLowValue(141);
	
	/**
	* Constructor for FlgusInEocRefBlHdr
	**/
    public FlgusInEocRefBlHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlgusInEocRefBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlgusInEocRefBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flgusCustomerHeaderRec
	 *	@return flgusCustomerHeaderRec
	 */
   public char[] getFlgusCustomerHeaderRec() throws CFException{
     if (isFlgusCustomerHeaderRecModified()) { 
        flgusCustomerHeaderRec = refreshFlgusCustomerHeaderRec();
     }
   		return flgusCustomerHeaderRec;
   }

  
	/**
	*  set variable flgusCustomerHeaderRec
	*  Corresponding COBOL Variable is FLGUS-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setFlgusCustomerHeaderRec(char[] value) {
      flgusCustomerHeaderRec = checkFlgusCustomerHeaderRecConstraints(value);
      serializeFlgusCustomerHeaderRec(flgusCustomerHeaderRec);
   } 

     /**
	 * 	Update FlgusCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlgusCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlgusCustomerHeaderRec,flgusCustomerHeaderRec.length);
   	
   }
   
   public void setFlgusCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusCustomerHeaderRec,flgusCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update FlgusCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlgusCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlgusCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setFlgusCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginFlgusCustomerHeaderRec,FLGUS_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update FlgusCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlgusCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlgusCustomerHeaderRec,FLGUS_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update FlgusCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlgusCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlgusCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlgusInEocRefBlHdrFieldLength() {
			return FLGUS_IN_EOC_REF_BL_HDR_LENGTH;
		}

}
  
