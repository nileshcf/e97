package com.cloudframe.app.ip809050.dto;

/**
*  The class TxnAmt1800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/


import com.cloudframe.app.ip809050.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TxnAmt1800 extends TxnAmt1800Serialized { 
   

						private char[] txnAmt800 = new char[10];


						private char[] txnAmtDec800 = new char[2];
	
	/**
	* Constructor for TxnAmt1800
	**/
    public TxnAmt1800() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for TxnAmt1800. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TxnAmt1800(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTxnAmt800("0000000000".toCharArray());
       replaceValue( // serialize and save the value
             (".").toCharArray()
             , getStartOffset() + 10
             ,1
             );
								setTxnAmtDec800("00".toCharArray());
    } 

	/**
	 *	Returns the value of txnAmt800
	 *	@return txnAmt800
	 */
   public char[] getTxnAmt800() throws CFException{
     if (isTxnAmt800Modified()) { 
        txnAmt800 = refreshTxnAmt800();
     }
   		return txnAmt800;
   }

  
	/**
	*  set variable txnAmt800
	*  Corresponding COBOL Variable is 800-TXN-AMT
	*  @param value
	**/
   public void setTxnAmt800(char[] value) {
      txnAmt800 = checkTxnAmt800Constraints(value);
      serializeTxnAmt800(txnAmt800);
   } 

     /**
	 * 	Update TxnAmt800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnAmt800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTxnAmt800,txnAmt800.length);
   	
   }
   
   public void setTxnAmt800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTxnAmt800,txnAmt800.length);
   	
   }
   
     /**
	 * 	Update TxnAmt800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnAmt800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TxnAmt800 with another Field
	 *	@param value
	 */
   public void setTxnAmt800(Field source) {
       replace(source,0,source.length(),beginTxnAmt800,TXN_AMT_800_LEN);
   	
   }  
   
     /**
	 * 	Update TxnAmt800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnAmt800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTxnAmt800,TXN_AMT_800_LEN);
   	
   }
   
     /**
	 * 	Update TxnAmt800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmt800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnAmt800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of txnAmtDec800
	 *	@return txnAmtDec800
	 */
   public char[] getTxnAmtDec800() throws CFException{
     if (isTxnAmtDec800Modified()) { 
        txnAmtDec800 = refreshTxnAmtDec800();
     }
   		return txnAmtDec800;
   }

  
	/**
	*  set variable txnAmtDec800
	*  Corresponding COBOL Variable is 800-TXN-AMT-DEC
	*  @param value
	**/
   public void setTxnAmtDec800(char[] value) {
      txnAmtDec800 = checkTxnAmtDec800Constraints(value);
      serializeTxnAmtDec800(txnAmtDec800);
   } 

     /**
	 * 	Update TxnAmtDec800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTxnAmtDec800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTxnAmtDec800,txnAmtDec800.length);
   	
   }
   
   public void setTxnAmtDec800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTxnAmtDec800,txnAmtDec800.length);
   	
   }
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmtDec800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnAmtDec800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TxnAmtDec800 with another Field
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source) {
       replace(source,0,source.length(),beginTxnAmtDec800,TXN_AMT_DEC_800_LEN);
   	
   }  
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTxnAmtDec800,TXN_AMT_DEC_800_LEN);
   	
   }
   
     /**
	 * 	Update TxnAmtDec800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTxnAmtDec800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTxnAmtDec800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTxnAmt1800FieldLength() {
			return TXN_AMT_1800_LENGTH;
		}

}
  
