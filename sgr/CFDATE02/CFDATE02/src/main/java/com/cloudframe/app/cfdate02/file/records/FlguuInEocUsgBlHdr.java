package com.cloudframe.app.cfdate02.file.records;

/**
*  The class FlguuInEocUsgBlHdr is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:06. using version 5.0.0.256
**/


import com.cloudframe.app.cfdate02.file.records.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FlguuInEocUsgBlHdr extends FlguuInEocUsgBlHdrSerialized { 
   

						private char[] flguuCustomerHeaderRec = Field.fillLowValue(989);
	
	/**
	* Constructor for FlguuInEocUsgBlHdr
	**/
    public FlguuInEocUsgBlHdr() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FlguuInEocUsgBlHdr. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FlguuInEocUsgBlHdr(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of flguuCustomerHeaderRec
	 *	@return flguuCustomerHeaderRec
	 */
   public char[] getFlguuCustomerHeaderRec() throws CFException{
     if (isFlguuCustomerHeaderRecModified()) { 
        flguuCustomerHeaderRec = refreshFlguuCustomerHeaderRec();
     }
   		return flguuCustomerHeaderRec;
   }

  
	/**
	*  set variable flguuCustomerHeaderRec
	*  Corresponding COBOL Variable is FLGUU-CUSTOMER-HEADER-REC
	*  @param value
	**/
   public void setFlguuCustomerHeaderRec(char[] value) {
      flguuCustomerHeaderRec = checkFlguuCustomerHeaderRecConstraints(value);
      serializeFlguuCustomerHeaderRec(flguuCustomerHeaderRec);
   } 

     /**
	 * 	Update FlguuCustomerHeaderRec 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFlguuCustomerHeaderRec(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFlguuCustomerHeaderRec,flguuCustomerHeaderRec.length);
   	
   }
   
   public void setFlguuCustomerHeaderRec(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuCustomerHeaderRec,flguuCustomerHeaderRec.length);
   	
   }
   
     /**
	 * 	Update FlguuCustomerHeaderRec 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFlguuCustomerHeaderRec(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuCustomerHeaderRec+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FlguuCustomerHeaderRec with another Field
	 *	@param value
	 */
   public void setFlguuCustomerHeaderRec(Field source) {
       replace(source,0,source.length(),beginFlguuCustomerHeaderRec,FLGUU_CUSTOMER_HEADER_REC_LEN);
   	
   }  
   
     /**
	 * 	Update FlguuCustomerHeaderRec 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFlguuCustomerHeaderRec(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFlguuCustomerHeaderRec,FLGUU_CUSTOMER_HEADER_REC_LEN);
   	
   }
   
     /**
	 * 	Update FlguuCustomerHeaderRec 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFlguuCustomerHeaderRec(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFlguuCustomerHeaderRec+targetIndex,targetLen);
    
   }

	
	
	

		public static int getFlguuInEocUsgBlHdrFieldLength() {
			return FLGUU_IN_EOC_USG_BL_HDR_LENGTH;
		}

}
  
