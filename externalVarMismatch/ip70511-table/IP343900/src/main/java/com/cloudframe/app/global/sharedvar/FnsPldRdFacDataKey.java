package com.cloudframe.app.global.sharedvar;

/**
*  The class FnsPldRdFacDataKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:09. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class FnsPldRdFacDataKey extends FnsPldRdFacDataKeySerialized { 
   

						private char[] fnsPldRdPrimaryAcctNbr = Field.fillLowValue(19);
				private FnsPldRdExpirationDate fnsPldRdExpirationDate = new FnsPldRdExpirationDate();
	
	/**
	* Constructor for FnsPldRdFacDataKey
	**/
    public FnsPldRdFacDataKey() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for FnsPldRdFacDataKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FnsPldRdFacDataKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			fnsPldRdExpirationDate.setParent(this,getStartOffset() + 19);
    } 

	/**
	 *	Returns the value of fnsPldRdPrimaryAcctNbr
	 *	@return fnsPldRdPrimaryAcctNbr
	 */
   public char[] getFnsPldRdPrimaryAcctNbr() throws CFException{
     if (isFnsPldRdPrimaryAcctNbrModified()) { 
        fnsPldRdPrimaryAcctNbr = refreshFnsPldRdPrimaryAcctNbr();
     }
   		return fnsPldRdPrimaryAcctNbr;
   }

  
	/**
	*  set variable fnsPldRdPrimaryAcctNbr
	*  Corresponding COBOL Variable is FNS-PLD-RD-PRIMARY-ACCT-NBR
	*  @param value
	**/
   public void setFnsPldRdPrimaryAcctNbr(char[] value) {
      fnsPldRdPrimaryAcctNbr = checkFnsPldRdPrimaryAcctNbrConstraints(value);
      serializeFnsPldRdPrimaryAcctNbr(fnsPldRdPrimaryAcctNbr);
   } 

     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFnsPldRdPrimaryAcctNbr,fnsPldRdPrimaryAcctNbr.length);
   	
   }
   
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdPrimaryAcctNbr,fnsPldRdPrimaryAcctNbr.length);
   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdPrimaryAcctNbr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FnsPldRdPrimaryAcctNbr with another Field
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source) {
       replace(source,0,source.length(),beginFnsPldRdPrimaryAcctNbr,FNS_PLD_RD_PRIMARY_ACCT_NBR_LEN);
   	
   }  
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFnsPldRdPrimaryAcctNbr,FNS_PLD_RD_PRIMARY_ACCT_NBR_LEN);
   	
   }
   
     /**
	 * 	Update FnsPldRdPrimaryAcctNbr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdPrimaryAcctNbr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFnsPldRdPrimaryAcctNbr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fnsPldRdExpirationDate
	 *	@return fnsPldRdExpirationDate
	 */   
	 public FnsPldRdExpirationDate getFnsPldRdExpirationDate() {
   	return fnsPldRdExpirationDate;
   }
   /**
	* 	Update FnsPldRdExpirationDate with the passed value
	*   Corresponding COBOL Variable is FNS-PLD-RD-EXPIRATION-DATE
	*	@param value
	*/
   public void setFnsPldRdExpirationDate(char[] value) {
      fnsPldRdExpirationDate.setString(value); 
   }   
    
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExpirationDate.begin,fnsPldRdExpirationDate.length());
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExpirationDate.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FnsPldRdExpirationDate with another Field
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source) {
   	replace(source,0,source.length(),fnsPldRdExpirationDate.begin,fnsPldRdExpirationDate.length());
   }  
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExpirationDate.begin,fnsPldRdExpirationDate.length());
   }
   
     /**
	 * 	Update FnsPldRdExpirationDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFnsPldRdExpirationDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fnsPldRdExpirationDate.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes FnsPldRdFacDataKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setFnsPldRdPrimaryAcctNbr(CONSTANTS.SPACE_19);
          fnsPldRdExpirationDate.initialize();
     
   }

		public static int getFnsPldRdFacDataKeyFieldLength() {
			return FNS_PLD_RD_FAC_DATA_KEY_LENGTH;
		}

}
  
