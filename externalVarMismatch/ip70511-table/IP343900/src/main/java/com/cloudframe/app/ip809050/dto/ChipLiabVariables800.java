package com.cloudframe.app.ip809050.dto;

/**
*  The class ChipLiabVariables800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ChipLiabVariables800 extends ChipLiabVariables800Serialized {
   

						private char[] txnPrimAcctNbr800 = new char[19];


						private char[] sndrMbrId800 = new char[11];


						private char[] custName800 = new char[30];


						private char[] countryCode800 = new char[3];


						private char[] region800 = new char[10];


						private char[] errorNum800 = new char[4];


						private char[] editNum800 = new char[4];

				private ErrorDesc800 errorDesc800 = new ErrorDesc800();

				private De0311800 de0311800 = new De0311800();

				private CbhRefNum1800 cbhRefNum1800 = new CbhRefNum1800();


						private char[] cbhDate800 = new char[8];

				private De0221800 de0221800 = new De0221800();

				private TxnAmt1800 txnAmt1800 = new TxnAmt1800();


						private char[] txnCurr800 = new char[3];

				private UsdAmt1800 usdAmt1800 = new UsdAmt1800();

	
	/**
	* Constructor for ChipLiabVariables800
	**/
    public ChipLiabVariables800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			errorDesc800.setParent(this,getStartOffset() + 88);
	       			de0311800.setParent(this,getStartOffset() + 295);
	       			cbhRefNum1800.setParent(this,getStartOffset() + 321);
	       			de0221800.setParent(this,getStartOffset() + 343);
	       			txnAmt1800.setParent(this,getStartOffset() + 358);
	       			usdAmt1800.setParent(this,getStartOffset() + 376);
	   	/*  end of offset */
								setTxnPrimAcctNbr800("0000000000000000000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 19
             ,1
             );
								setSndrMbrId800("00000000000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 31
             ,1
             );
								setCustName800(fillSpace(30));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 62
             ,1
             );
								setCountryCode800(fillSpace(3));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 66
             ,1
             );
								setRegion800(fillSpace(10));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 77
             ,1
             );
								setErrorNum800("0000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 82
             ,1
             );
								setEditNum800("0000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 87
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 294
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 320
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 333
             ,1
             );
								setCbhDate800(fillSpace(8));
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 342
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 357
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 371
             ,1
             );
								setTxnCurr800("000".toCharArray());
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 375
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 389
             ,1
             );
    }


 

	/**
	 *	Returns the value of txnPrimAcctNbr800
	 *	@return txnPrimAcctNbr800
	 */
   public char[] getTxnPrimAcctNbr800() throws CFException{
     if (isTxnPrimAcctNbr800Modified()) { 
        txnPrimAcctNbr800 = refreshTxnPrimAcctNbr800();
     }
   		return txnPrimAcctNbr800;
   }

  
	/**
	*  set variable txnPrimAcctNbr800
	*  Corresponding COBOL Variable is 800-TXN-PRIM-ACCT-NBR
	*  @param value
	**/
   public void setTxnPrimAcctNbr800(char[] value) {
      txnPrimAcctNbr800 = checkTxnPrimAcctNbr800Constraints(value);
      serializeTxnPrimAcctNbr800(txnPrimAcctNbr800);
   } 

     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTxnPrimAcctNbr800,txnPrimAcctNbr800.length);
   	
   }
   
   public void setTxnPrimAcctNbr800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTxnPrimAcctNbr800,txnPrimAcctNbr800.length);
   	
   }
   
     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnPrimAcctNbr800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TxnPrimAcctNbr800 with another Field
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(Field source) {
       replace(source,0,source.length(),beginTxnPrimAcctNbr800,TXN_PRIM_ACCT_NBR_800_LEN);
   	
   }  
   
     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTxnPrimAcctNbr800,TXN_PRIM_ACCT_NBR_800_LEN);
   	
   }
   
     /**
	 * 	Update TxnPrimAcctNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnPrimAcctNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnPrimAcctNbr800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sndrMbrId800
	 *	@return sndrMbrId800
	 */
   public char[] getSndrMbrId800() throws CFException{
     if (isSndrMbrId800Modified()) { 
        sndrMbrId800 = refreshSndrMbrId800();
     }
   		return sndrMbrId800;
   }

  
	/**
	*  set variable sndrMbrId800
	*  Corresponding COBOL Variable is 800-SNDR-MBR-ID
	*  @param value
	**/
   public void setSndrMbrId800(char[] value) {
      sndrMbrId800 = checkSndrMbrId800Constraints(value);
      serializeSndrMbrId800(sndrMbrId800);
   } 

     /**
	 * 	Update SndrMbrId800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSndrMbrId800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSndrMbrId800,sndrMbrId800.length);
   	
   }
   
   public void setSndrMbrId800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSndrMbrId800,sndrMbrId800.length);
   	
   }
   
     /**
	 * 	Update SndrMbrId800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSndrMbrId800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSndrMbrId800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SndrMbrId800 with another Field
	 *	@param value
	 */
   public void setSndrMbrId800(Field source) {
       replace(source,0,source.length(),beginSndrMbrId800,SNDR_MBR_ID_800_LEN);
   	
   }  
   
     /**
	 * 	Update SndrMbrId800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSndrMbrId800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSndrMbrId800,SNDR_MBR_ID_800_LEN);
   	
   }
   
     /**
	 * 	Update SndrMbrId800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSndrMbrId800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSndrMbrId800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of custName800
	 *	@return custName800
	 */
   public char[] getCustName800() throws CFException{
     if (isCustName800Modified()) { 
        custName800 = refreshCustName800();
     }
   		return custName800;
   }

  
	/**
	*  set variable custName800
	*  Corresponding COBOL Variable is 800-CUST-NAME
	*  @param value
	**/
   public void setCustName800(char[] value) {
      custName800 = checkCustName800Constraints(value);
      serializeCustName800(custName800);
   } 

     /**
	 * 	Update CustName800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustName800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustName800,custName800.length);
   	
   }
   
   public void setCustName800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustName800,custName800.length);
   	
   }
   
     /**
	 * 	Update CustName800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustName800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustName800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustName800 with another Field
	 *	@param value
	 */
   public void setCustName800(Field source) {
       replace(source,0,source.length(),beginCustName800,CUST_NAME_800_LEN);
   	
   }  
   
     /**
	 * 	Update CustName800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustName800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustName800,CUST_NAME_800_LEN);
   	
   }
   
     /**
	 * 	Update CustName800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustName800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustName800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of countryCode800
	 *	@return countryCode800
	 */
   public char[] getCountryCode800() throws CFException{
     if (isCountryCode800Modified()) { 
        countryCode800 = refreshCountryCode800();
     }
   		return countryCode800;
   }

  
	/**
	*  set variable countryCode800
	*  Corresponding COBOL Variable is 800-COUNTRY-CODE
	*  @param value
	**/
   public void setCountryCode800(char[] value) {
      countryCode800 = checkCountryCode800Constraints(value);
      serializeCountryCode800(countryCode800);
   } 

     /**
	 * 	Update CountryCode800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCountryCode800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCountryCode800,countryCode800.length);
   	
   }
   
   public void setCountryCode800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode800,countryCode800.length);
   	
   }
   
     /**
	 * 	Update CountryCode800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CountryCode800 with another Field
	 *	@param value
	 */
   public void setCountryCode800(Field source) {
       replace(source,0,source.length(),beginCountryCode800,COUNTRY_CODE_800_LEN);
   	
   }  
   
     /**
	 * 	Update CountryCode800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCountryCode800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCountryCode800,COUNTRY_CODE_800_LEN);
   	
   }
   
     /**
	 * 	Update CountryCode800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCountryCode800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCountryCode800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of region800
	 *	@return region800
	 */
   public char[] getRegion800() throws CFException{
     if (isRegion800Modified()) { 
        region800 = refreshRegion800();
     }
   		return region800;
   }

  
	/**
	*  set variable region800
	*  Corresponding COBOL Variable is 800-REGION
	*  @param value
	**/
   public void setRegion800(char[] value) {
      region800 = checkRegion800Constraints(value);
      serializeRegion800(region800);
   } 

     /**
	 * 	Update Region800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRegion800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRegion800,region800.length);
   	
   }
   
   public void setRegion800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRegion800,region800.length);
   	
   }
   
     /**
	 * 	Update Region800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRegion800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRegion800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Region800 with another Field
	 *	@param value
	 */
   public void setRegion800(Field source) {
       replace(source,0,source.length(),beginRegion800,REGION_800_LEN);
   	
   }  
   
     /**
	 * 	Update Region800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRegion800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRegion800,REGION_800_LEN);
   	
   }
   
     /**
	 * 	Update Region800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRegion800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRegion800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorNum800
	 *	@return errorNum800
	 */
   public char[] getErrorNum800() throws CFException{
     if (isErrorNum800Modified()) { 
        errorNum800 = refreshErrorNum800();
     }
   		return errorNum800;
   }

  
	/**
	*  set variable errorNum800
	*  Corresponding COBOL Variable is 800-ERROR-NUM
	*  @param value
	**/
   public void setErrorNum800(char[] value) {
      errorNum800 = checkErrorNum800Constraints(value);
      serializeErrorNum800(errorNum800);
   } 

     /**
	 * 	Update ErrorNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorNum800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorNum800,errorNum800.length);
   	
   }
   
   public void setErrorNum800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorNum800,errorNum800.length);
   	
   }
   
     /**
	 * 	Update ErrorNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorNum800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorNum800 with another Field
	 *	@param value
	 */
   public void setErrorNum800(Field source) {
       replace(source,0,source.length(),beginErrorNum800,ERROR_NUM_800_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorNum800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorNum800,ERROR_NUM_800_LEN);
   	
   }
   
     /**
	 * 	Update ErrorNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorNum800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of editNum800
	 *	@return editNum800
	 */
   public char[] getEditNum800() throws CFException{
     if (isEditNum800Modified()) { 
        editNum800 = refreshEditNum800();
     }
   		return editNum800;
   }

  
	/**
	*  set variable editNum800
	*  Corresponding COBOL Variable is 800-EDIT-NUM
	*  @param value
	**/
   public void setEditNum800(char[] value) {
      editNum800 = checkEditNum800Constraints(value);
      serializeEditNum800(editNum800);
   } 

     /**
	 * 	Update EditNum800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setEditNum800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginEditNum800,editNum800.length);
   	
   }
   
   public void setEditNum800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginEditNum800,editNum800.length);
   	
   }
   
     /**
	 * 	Update EditNum800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEditNum800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEditNum800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update EditNum800 with another Field
	 *	@param value
	 */
   public void setEditNum800(Field source) {
       replace(source,0,source.length(),beginEditNum800,EDIT_NUM_800_LEN);
   	
   }  
   
     /**
	 * 	Update EditNum800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setEditNum800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginEditNum800,EDIT_NUM_800_LEN);
   	
   }
   
     /**
	 * 	Update EditNum800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEditNum800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginEditNum800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of errorDesc800
	 *	@return errorDesc800
	 */   
	 public ErrorDesc800 getErrorDesc800() {
   	return errorDesc800;
   }
   /**
	* 	Update ErrorDesc800 with the passed value
	*   Corresponding COBOL Variable is 800-ERROR-DESC
	*	@param value
	*/
   public void setErrorDesc800(char[] value) {
      errorDesc800.setString(value); 
   }   
    
     /**
	 * 	Update ErrorDesc800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrorDesc800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errorDesc800.begin,errorDesc800.length());
   }
   
     /**
	 * 	Update ErrorDesc800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorDesc800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errorDesc800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrorDesc800 with another Field
	 *	@param value
	 */
   public void setErrorDesc800(Field source) {
   	replace(source,0,source.length(),errorDesc800.begin,errorDesc800.length());
   }  
   
     /**
	 * 	Update ErrorDesc800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrorDesc800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errorDesc800.begin,errorDesc800.length());
   }
   
     /**
	 * 	Update ErrorDesc800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorDesc800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errorDesc800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of de0311800
	 *	@return de0311800
	 */   
	 public De0311800 getDe0311800() {
   	return de0311800;
   }
   /**
	* 	Update De0311800 with the passed value
	*   Corresponding COBOL Variable is 800-DE031-1
	*	@param value
	*/
   public void setDe0311800(char[] value) {
      de0311800.setString(value); 
   }   
    
     /**
	 * 	Update De0311800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe0311800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de0311800.begin,de0311800.length());
   }
   
     /**
	 * 	Update De0311800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe0311800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de0311800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De0311800 with another Field
	 *	@param value
	 */
   public void setDe0311800(Field source) {
   	replace(source,0,source.length(),de0311800.begin,de0311800.length());
   }  
   
     /**
	 * 	Update De0311800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe0311800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de0311800.begin,de0311800.length());
   }
   
     /**
	 * 	Update De0311800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe0311800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de0311800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cbhRefNum1800
	 *	@return cbhRefNum1800
	 */   
	 public CbhRefNum1800 getCbhRefNum1800() {
   	return cbhRefNum1800;
   }
   /**
	* 	Update CbhRefNum1800 with the passed value
	*   Corresponding COBOL Variable is 800-CBH-REF-NUM1
	*	@param value
	*/
   public void setCbhRefNum1800(char[] value) {
      cbhRefNum1800.setString(value); 
   }   
    
     /**
	 * 	Update CbhRefNum1800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setCbhRefNum1800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cbhRefNum1800.begin,cbhRefNum1800.length());
   }
   
     /**
	 * 	Update CbhRefNum1800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCbhRefNum1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cbhRefNum1800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update CbhRefNum1800 with another Field
	 *	@param value
	 */
   public void setCbhRefNum1800(Field source) {
   	replace(source,0,source.length(),cbhRefNum1800.begin,cbhRefNum1800.length());
   }  
   
     /**
	 * 	Update CbhRefNum1800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setCbhRefNum1800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,cbhRefNum1800.begin,cbhRefNum1800.length());
   }
   
     /**
	 * 	Update CbhRefNum1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCbhRefNum1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,cbhRefNum1800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of cbhDate800
	 *	@return cbhDate800
	 */
   public char[] getCbhDate800() throws CFException{
     if (isCbhDate800Modified()) { 
        cbhDate800 = refreshCbhDate800();
     }
   		return cbhDate800;
   }

  
	/**
	*  set variable cbhDate800
	*  Corresponding COBOL Variable is 800-CBH-DATE
	*  @param value
	**/
   public void setCbhDate800(char[] value) {
      cbhDate800 = checkCbhDate800Constraints(value);
      serializeCbhDate800(cbhDate800);
   } 

     /**
	 * 	Update CbhDate800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCbhDate800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCbhDate800,cbhDate800.length);
   	
   }
   
   public void setCbhDate800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCbhDate800,cbhDate800.length);
   	
   }
   
     /**
	 * 	Update CbhDate800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCbhDate800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCbhDate800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CbhDate800 with another Field
	 *	@param value
	 */
   public void setCbhDate800(Field source) {
       replace(source,0,source.length(),beginCbhDate800,CBH_DATE_800_LEN);
   	
   }  
   
     /**
	 * 	Update CbhDate800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCbhDate800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCbhDate800,CBH_DATE_800_LEN);
   	
   }
   
     /**
	 * 	Update CbhDate800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCbhDate800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCbhDate800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of de0221800
	 *	@return de0221800
	 */   
	 public De0221800 getDe0221800() {
   	return de0221800;
   }
   /**
	* 	Update De0221800 with the passed value
	*   Corresponding COBOL Variable is 800-DE022-1
	*	@param value
	*/
   public void setDe0221800(char[] value) {
      de0221800.setString(value); 
   }   
    
     /**
	 * 	Update De0221800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDe0221800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de0221800.begin,de0221800.length());
   }
   
     /**
	 * 	Update De0221800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDe0221800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de0221800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update De0221800 with another Field
	 *	@param value
	 */
   public void setDe0221800(Field source) {
   	replace(source,0,source.length(),de0221800.begin,de0221800.length());
   }  
   
     /**
	 * 	Update De0221800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDe0221800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,de0221800.begin,de0221800.length());
   }
   
     /**
	 * 	Update De0221800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDe0221800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,de0221800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of txnAmt1800
	 *	@return txnAmt1800
	 */   
	 public TxnAmt1800 getTxnAmt1800() {
   	return txnAmt1800;
   }
   /**
	* 	Update TxnAmt1800 with the passed value
	*   Corresponding COBOL Variable is 800-TXN-AMT1
	*	@param value
	*/
   public void setTxnAmt1800(char[] value) {
      txnAmt1800.setString(value); 
   }   
    
     /**
	 * 	Update TxnAmt1800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setTxnAmt1800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,txnAmt1800.begin,txnAmt1800.length());
   }
   
     /**
	 * 	Update TxnAmt1800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,txnAmt1800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update TxnAmt1800 with another Field
	 *	@param value
	 */
   public void setTxnAmt1800(Field source) {
   	replace(source,0,source.length(),txnAmt1800.begin,txnAmt1800.length());
   }  
   
     /**
	 * 	Update TxnAmt1800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setTxnAmt1800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,txnAmt1800.begin,txnAmt1800.length());
   }
   
     /**
	 * 	Update TxnAmt1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,txnAmt1800.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of txnCurr800
	 *	@return txnCurr800
	 */
   public char[] getTxnCurr800() throws CFException{
     if (isTxnCurr800Modified()) { 
        txnCurr800 = refreshTxnCurr800();
     }
   		return txnCurr800;
   }

  
	/**
	*  set variable txnCurr800
	*  Corresponding COBOL Variable is 800-TXN-CURR
	*  @param value
	**/
   public void setTxnCurr800(char[] value) {
      txnCurr800 = checkTxnCurr800Constraints(value);
      serializeTxnCurr800(txnCurr800);
   } 

     /**
	 * 	Update TxnCurr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnCurr800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTxnCurr800,txnCurr800.length);
   	
   }
   
   public void setTxnCurr800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTxnCurr800,txnCurr800.length);
   	
   }
   
     /**
	 * 	Update TxnCurr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnCurr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnCurr800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TxnCurr800 with another Field
	 *	@param value
	 */
   public void setTxnCurr800(Field source) {
       replace(source,0,source.length(),beginTxnCurr800,TXN_CURR_800_LEN);
   	
   }  
   
     /**
	 * 	Update TxnCurr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnCurr800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTxnCurr800,TXN_CURR_800_LEN);
   	
   }
   
     /**
	 * 	Update TxnCurr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnCurr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnCurr800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usdAmt1800
	 *	@return usdAmt1800
	 */   
	 public UsdAmt1800 getUsdAmt1800() {
   	return usdAmt1800;
   }
   /**
	* 	Update UsdAmt1800 with the passed value
	*   Corresponding COBOL Variable is 800-USD-AMT1
	*	@param value
	*/
   public void setUsdAmt1800(char[] value) {
      usdAmt1800.setString(value); 
   }   
    
     /**
	 * 	Update UsdAmt1800 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setUsdAmt1800(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,usdAmt1800.begin,usdAmt1800.length());
   }
   
     /**
	 * 	Update UsdAmt1800 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmt1800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,usdAmt1800.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update UsdAmt1800 with another Field
	 *	@param value
	 */
   public void setUsdAmt1800(Field source) {
   	replace(source,0,source.length(),usdAmt1800.begin,usdAmt1800.length());
   }  
   
     /**
	 * 	Update UsdAmt1800 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setUsdAmt1800(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,usdAmt1800.begin,usdAmt1800.length());
   }
   
     /**
	 * 	Update UsdAmt1800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsdAmt1800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,usdAmt1800.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getChipLiabVariables800FieldLength() {
			return CHIP_LIAB_VARIABLES_800_LENGTH;
		}

}
  
