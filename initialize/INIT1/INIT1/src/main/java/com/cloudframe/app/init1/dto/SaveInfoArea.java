package com.cloudframe.app.init1.dto;

/**
*  The class SaveInfoArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


public class SaveInfoArea extends SaveInfoAreaSerialized { 
   
				private KeyInvCustAcct keyInvCustAcct = new KeyInvCustAcct();
				private KeyCpduCustAcct keyCpduCustAcct = new KeyCpduCustAcct();
				private KeyLsbcaCustAcct keyLsbcaCustAcct = new KeyLsbcaCustAcct();
				private KeyLsgremCustAcct keyLsgremCustAcct = new KeyLsgremCustAcct();
				private KeyAtdsumCustAcct keyAtdsumCustAcct = new KeyAtdsumCustAcct();
				private KeyCpduMtn keyCpduMtn = new KeyCpduMtn();
				private KeyCpduPrev keyCpduPrev = new KeyCpduPrev();
				private KeyLsbcaMtn keyLsbcaMtn = new KeyLsbcaMtn();
				private KeyLsbcaPrev keyLsbcaPrev = new KeyLsbcaPrev();

								private int hldIldclLnShrGrpNo;

								private int hldIldcrLnShrGrpNo;

						private char[] cpduOffrTypCd = new char[2];
				private KeyUsgCustAcct keyUsgCustAcct = new KeyUsgCustAcct();
				private KeyUsgMtn keyUsgMtn = new KeyUsgMtn();
				private KeyUsgPrev keyUsgPrev = new KeyUsgPrev();
				private KeyLsgPrev keyLsgPrev = new KeyLsgPrev();

						private char[] usgOffrTypCd = new char[2];

								private long usgBeginDtIso;

								private long lsgBlPerFromDtIso;

								private long lsgBlPerToDtIso;
				private KeyMtnFile keyMtnFile = new KeyMtnFile();

						private char[] custMtnStatCd = new char[1];
				private KeyGlbCustAcct keyGlbCustAcct = new KeyGlbCustAcct();
				private KeyM2mPromo keyM2mPromo = new KeyM2mPromo();
				private ErrAcctRecord errAcctRecord = new ErrAcctRecord();
				private ErrAcctRecordSave errAcctRecordSave = new ErrAcctRecordSave();

								private long invJitrEligDtIso;

								private long invCycEffDtIso;

						private char[] invPrevBlCycNo = new char[2];

						private char[] delayedCycNo = new char[2];

								private long invInvoiceNo;

						private char[] tooLateFlagSw = new char[1];
				private Parm parm = new Parm();

								private int rl001DtlBlSegregateNo;
				private FgvUsgRecord fgvUsgRecord = new FgvUsgRecord();
	
	/**
	* Constructor for SaveInfoArea
	**/
    public SaveInfoArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			keyInvCustAcct.setParent(this,getStartOffset() + 0);
	       			keyCpduCustAcct.setParent(this,getStartOffset() + 8);
	       			keyLsbcaCustAcct.setParent(this,getStartOffset() + 16);
	       			keyLsgremCustAcct.setParent(this,getStartOffset() + 24);
	       			keyAtdsumCustAcct.setParent(this,getStartOffset() + 32);
	       			keyCpduMtn.setParent(this,getStartOffset() + 40);
	       			keyCpduPrev.setParent(this,getStartOffset() + 50);
	       			keyLsbcaMtn.setParent(this,getStartOffset() + 138);
	       			keyLsbcaPrev.setParent(this,getStartOffset() + 148);
	       			keyUsgCustAcct.setParent(this,getStartOffset() + 220);
	       			keyUsgMtn.setParent(this,getStartOffset() + 228);
	       			keyUsgPrev.setParent(this,getStartOffset() + 238);
	       			keyLsgPrev.setParent(this,getStartOffset() + 328);
	       			keyMtnFile.setParent(this,getStartOffset() + 387);
	       			keyGlbCustAcct.setParent(this,getStartOffset() + 406);
	       			keyM2mPromo.setParent(this,getStartOffset() + 414);
	       			errAcctRecord.setParent(this,getStartOffset() + 432);
	       			errAcctRecordSave.setParent(this,getStartOffset() + 498);
	       			parm.setParent(this,getStartOffset() + 594);
	       			fgvUsgRecord.setParent(this,getStartOffset() + 611);
	   	/*  end of offset */
								setHldIldclLnShrGrpNo(0);
								setHldIldcrLnShrGrpNo(0);
								setCpduOffrTypCd(fillSpace(2));
								setUsgOffrTypCd(fillSpace(2));
								setCustMtnStatCd(fillSpace(1));
								setInvJitrEligDtIso(0L);
								setInvCycEffDtIso(0L);
								setInvPrevBlCycNo(fillSpace(2));
								setDelayedCycNo(fillSpace(2));
								setInvInvoiceNo(0L);
								setTooLateFlagSw(fillSpace(1));
    }


 

	/**
	 *	Returns the value of keyInvCustAcct
	 *	@return keyInvCustAcct
	 */   
	 public KeyInvCustAcct getKeyInvCustAcct() {
   	return keyInvCustAcct;
   }
   /**
	* 	Update KeyInvCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-INV-CUST-ACCT
	*	@param value
	*/
   public void setKeyInvCustAcct(char[] value) {
      keyInvCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyInvCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyInvCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyInvCustAcct.begin,keyInvCustAcct.length());
   }
   
     /**
	 * 	Update KeyInvCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyInvCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyInvCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyInvCustAcct with another Field
	 *	@param value
	 */
   public void setKeyInvCustAcct(Field source) {
   	replace(source,0,source.length(),keyInvCustAcct.begin,keyInvCustAcct.length());
   }  
   
     /**
	 * 	Update KeyInvCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyInvCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyInvCustAcct.begin,keyInvCustAcct.length());
   }
   
     /**
	 * 	Update KeyInvCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyInvCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyInvCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyCpduCustAcct
	 *	@return keyCpduCustAcct
	 */   
	 public KeyCpduCustAcct getKeyCpduCustAcct() {
   	return keyCpduCustAcct;
   }
   /**
	* 	Update KeyCpduCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-CPDU-CUST-ACCT
	*	@param value
	*/
   public void setKeyCpduCustAcct(char[] value) {
      keyCpduCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyCpduCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyCpduCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduCustAcct.begin,keyCpduCustAcct.length());
   }
   
     /**
	 * 	Update KeyCpduCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyCpduCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyCpduCustAcct with another Field
	 *	@param value
	 */
   public void setKeyCpduCustAcct(Field source) {
   	replace(source,0,source.length(),keyCpduCustAcct.begin,keyCpduCustAcct.length());
   }  
   
     /**
	 * 	Update KeyCpduCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyCpduCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduCustAcct.begin,keyCpduCustAcct.length());
   }
   
     /**
	 * 	Update KeyCpduCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyCpduCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyLsbcaCustAcct
	 *	@return keyLsbcaCustAcct
	 */   
	 public KeyLsbcaCustAcct getKeyLsbcaCustAcct() {
   	return keyLsbcaCustAcct;
   }
   /**
	* 	Update KeyLsbcaCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-LSBCA-CUST-ACCT
	*	@param value
	*/
   public void setKeyLsbcaCustAcct(char[] value) {
      keyLsbcaCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyLsbcaCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyLsbcaCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaCustAcct.begin,keyLsbcaCustAcct.length());
   }
   
     /**
	 * 	Update KeyLsbcaCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsbcaCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyLsbcaCustAcct with another Field
	 *	@param value
	 */
   public void setKeyLsbcaCustAcct(Field source) {
   	replace(source,0,source.length(),keyLsbcaCustAcct.begin,keyLsbcaCustAcct.length());
   }  
   
     /**
	 * 	Update KeyLsbcaCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyLsbcaCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaCustAcct.begin,keyLsbcaCustAcct.length());
   }
   
     /**
	 * 	Update KeyLsbcaCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsbcaCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyLsgremCustAcct
	 *	@return keyLsgremCustAcct
	 */   
	 public KeyLsgremCustAcct getKeyLsgremCustAcct() {
   	return keyLsgremCustAcct;
   }
   /**
	* 	Update KeyLsgremCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-LSGREM-CUST-ACCT
	*	@param value
	*/
   public void setKeyLsgremCustAcct(char[] value) {
      keyLsgremCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyLsgremCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyLsgremCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgremCustAcct.begin,keyLsgremCustAcct.length());
   }
   
     /**
	 * 	Update KeyLsgremCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsgremCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgremCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyLsgremCustAcct with another Field
	 *	@param value
	 */
   public void setKeyLsgremCustAcct(Field source) {
   	replace(source,0,source.length(),keyLsgremCustAcct.begin,keyLsgremCustAcct.length());
   }  
   
     /**
	 * 	Update KeyLsgremCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyLsgremCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgremCustAcct.begin,keyLsgremCustAcct.length());
   }
   
     /**
	 * 	Update KeyLsgremCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsgremCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgremCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyAtdsumCustAcct
	 *	@return keyAtdsumCustAcct
	 */   
	 public KeyAtdsumCustAcct getKeyAtdsumCustAcct() {
   	return keyAtdsumCustAcct;
   }
   /**
	* 	Update KeyAtdsumCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-ATDSUM-CUST-ACCT
	*	@param value
	*/
   public void setKeyAtdsumCustAcct(char[] value) {
      keyAtdsumCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyAtdsumCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyAtdsumCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyAtdsumCustAcct.begin,keyAtdsumCustAcct.length());
   }
   
     /**
	 * 	Update KeyAtdsumCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyAtdsumCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyAtdsumCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyAtdsumCustAcct with another Field
	 *	@param value
	 */
   public void setKeyAtdsumCustAcct(Field source) {
   	replace(source,0,source.length(),keyAtdsumCustAcct.begin,keyAtdsumCustAcct.length());
   }  
   
     /**
	 * 	Update KeyAtdsumCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyAtdsumCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyAtdsumCustAcct.begin,keyAtdsumCustAcct.length());
   }
   
     /**
	 * 	Update KeyAtdsumCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyAtdsumCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyAtdsumCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyCpduMtn
	 *	@return keyCpduMtn
	 */   
	 public KeyCpduMtn getKeyCpduMtn() {
   	return keyCpduMtn;
   }
   /**
	* 	Update KeyCpduMtn with the passed value
	*   Corresponding COBOL Variable is WS-KEY-CPDU-MTN
	*	@param value
	*/
   public void setKeyCpduMtn(char[] value) {
      keyCpduMtn.setString(value); 
   }   
    
     /**
	 * 	Update KeyCpduMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyCpduMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduMtn.begin,keyCpduMtn.length());
   }
   
     /**
	 * 	Update KeyCpduMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyCpduMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyCpduMtn with another Field
	 *	@param value
	 */
   public void setKeyCpduMtn(Field source) {
   	replace(source,0,source.length(),keyCpduMtn.begin,keyCpduMtn.length());
   }  
   
     /**
	 * 	Update KeyCpduMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyCpduMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduMtn.begin,keyCpduMtn.length());
   }
   
     /**
	 * 	Update KeyCpduMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyCpduMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduMtn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyCpduPrev
	 *	@return keyCpduPrev
	 */   
	 public KeyCpduPrev getKeyCpduPrev() {
   	return keyCpduPrev;
   }
   /**
	* 	Update KeyCpduPrev with the passed value
	*   Corresponding COBOL Variable is WS-KEY-CPDU-PREV
	*	@param value
	*/
   public void setKeyCpduPrev(char[] value) {
      keyCpduPrev.setString(value); 
   }   
    
     /**
	 * 	Update KeyCpduPrev 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyCpduPrev(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduPrev.begin,keyCpduPrev.length());
   }
   
     /**
	 * 	Update KeyCpduPrev 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyCpduPrev(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduPrev.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyCpduPrev with another Field
	 *	@param value
	 */
   public void setKeyCpduPrev(Field source) {
   	replace(source,0,source.length(),keyCpduPrev.begin,keyCpduPrev.length());
   }  
   
     /**
	 * 	Update KeyCpduPrev 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyCpduPrev(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduPrev.begin,keyCpduPrev.length());
   }
   
     /**
	 * 	Update KeyCpduPrev 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyCpduPrev(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyCpduPrev.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyLsbcaMtn
	 *	@return keyLsbcaMtn
	 */   
	 public KeyLsbcaMtn getKeyLsbcaMtn() {
   	return keyLsbcaMtn;
   }
   /**
	* 	Update KeyLsbcaMtn with the passed value
	*   Corresponding COBOL Variable is WS-KEY-LSBCA-MTN
	*	@param value
	*/
   public void setKeyLsbcaMtn(char[] value) {
      keyLsbcaMtn.setString(value); 
   }   
    
     /**
	 * 	Update KeyLsbcaMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyLsbcaMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaMtn.begin,keyLsbcaMtn.length());
   }
   
     /**
	 * 	Update KeyLsbcaMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsbcaMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyLsbcaMtn with another Field
	 *	@param value
	 */
   public void setKeyLsbcaMtn(Field source) {
   	replace(source,0,source.length(),keyLsbcaMtn.begin,keyLsbcaMtn.length());
   }  
   
     /**
	 * 	Update KeyLsbcaMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyLsbcaMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaMtn.begin,keyLsbcaMtn.length());
   }
   
     /**
	 * 	Update KeyLsbcaMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsbcaMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaMtn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyLsbcaPrev
	 *	@return keyLsbcaPrev
	 */   
	 public KeyLsbcaPrev getKeyLsbcaPrev() {
   	return keyLsbcaPrev;
   }
   /**
	* 	Update KeyLsbcaPrev with the passed value
	*   Corresponding COBOL Variable is WS-KEY-LSBCA-PREV
	*	@param value
	*/
   public void setKeyLsbcaPrev(char[] value) {
      keyLsbcaPrev.setString(value); 
   }   
    
     /**
	 * 	Update KeyLsbcaPrev 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyLsbcaPrev(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaPrev.begin,keyLsbcaPrev.length());
   }
   
     /**
	 * 	Update KeyLsbcaPrev 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsbcaPrev(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaPrev.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyLsbcaPrev with another Field
	 *	@param value
	 */
   public void setKeyLsbcaPrev(Field source) {
   	replace(source,0,source.length(),keyLsbcaPrev.begin,keyLsbcaPrev.length());
   }  
   
     /**
	 * 	Update KeyLsbcaPrev 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyLsbcaPrev(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaPrev.begin,keyLsbcaPrev.length());
   }
   
     /**
	 * 	Update KeyLsbcaPrev 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsbcaPrev(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsbcaPrev.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of hldIldclLnShrGrpNo
	 *	@return hldIldclLnShrGrpNo
	 */
	public int getHldIldclLnShrGrpNo() throws CFException {
        if (isHldIldclLnShrGrpNoModified()) { 
           hldIldclLnShrGrpNo = refreshHldIldclLnShrGrpNo();
        }
   		return hldIldclLnShrGrpNo;
	}
	
	/**
	 * 	Update HldIldclLnShrGrpNo with the passed value
	 *  Corresponding COBOL Variable is WS-HLD-ILDCL-LN-SHR-GRP-NO
	 *	@param number
	 */
	public void setHldIldclLnShrGrpNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    hldIldclLnShrGrpNo = checkHldIldclLnShrGrpNoMaxLimit(number); 
		serializeHldIldclLnShrGrpNo(hldIldclLnShrGrpNo);
	}


	public void setHldIldclLnShrGrpNo(long number) {
	    number = checkHldIldclLnShrGrpNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHldIldclLnShrGrpNo((int)number);
	}
	
	/**
	 *	Returns the value of hldIldcrLnShrGrpNo
	 *	@return hldIldcrLnShrGrpNo
	 */
	public int getHldIldcrLnShrGrpNo() throws CFException {
        if (isHldIldcrLnShrGrpNoModified()) { 
           hldIldcrLnShrGrpNo = refreshHldIldcrLnShrGrpNo();
        }
   		return hldIldcrLnShrGrpNo;
	}
	
	/**
	 * 	Update HldIldcrLnShrGrpNo with the passed value
	 *  Corresponding COBOL Variable is WS-HLD-ILDCR-LN-SHR-GRP-NO
	 *	@param number
	 */
	public void setHldIldcrLnShrGrpNo(int number) {
	     // Truncate if the number is beyond +/- Max range
	    hldIldcrLnShrGrpNo = checkHldIldcrLnShrGrpNoMaxLimit(number); 
		serializeHldIldcrLnShrGrpNo(hldIldcrLnShrGrpNo);
	}


	public void setHldIldcrLnShrGrpNo(long number) {
	    number = checkHldIldcrLnShrGrpNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setHldIldcrLnShrGrpNo((int)number);
	}
	
	/**
	 *	Returns the value of cpduOffrTypCd
	 *	@return cpduOffrTypCd
	 */
   public char[] getCpduOffrTypCd() throws CFException{
     if (isCpduOffrTypCdModified()) { 
        cpduOffrTypCd = refreshCpduOffrTypCd();
     }
   		return cpduOffrTypCd;
   }

  
	/**
	*  set variable cpduOffrTypCd
	*  Corresponding COBOL Variable is WS-CPDU-OFFR-TYP-CD
	*  @param value
	**/
   public void setCpduOffrTypCd(char[] value) {
      cpduOffrTypCd = checkCpduOffrTypCdConstraints(value);
      serializeCpduOffrTypCd(cpduOffrTypCd);
   } 

     /**
	 * 	Update CpduOffrTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCpduOffrTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCpduOffrTypCd,cpduOffrTypCd.length);
   	
   }
   
   public void setCpduOffrTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCpduOffrTypCd,cpduOffrTypCd.length);
   	
   }
   
     /**
	 * 	Update CpduOffrTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCpduOffrTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduOffrTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CpduOffrTypCd with another Field
	 *	@param value
	 */
   public void setCpduOffrTypCd(Field source) {
       replace(source,0,source.length(),beginCpduOffrTypCd,CPDU_OFFR_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CpduOffrTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCpduOffrTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCpduOffrTypCd,CPDU_OFFR_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update CpduOffrTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCpduOffrTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCpduOffrTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of keyUsgCustAcct
	 *	@return keyUsgCustAcct
	 */   
	 public KeyUsgCustAcct getKeyUsgCustAcct() {
   	return keyUsgCustAcct;
   }
   /**
	* 	Update KeyUsgCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-USG-CUST-ACCT
	*	@param value
	*/
   public void setKeyUsgCustAcct(char[] value) {
      keyUsgCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyUsgCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgCustAcct.begin,keyUsgCustAcct.length());
   }
   
     /**
	 * 	Update KeyUsgCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyUsgCustAcct with another Field
	 *	@param value
	 */
   public void setKeyUsgCustAcct(Field source) {
   	replace(source,0,source.length(),keyUsgCustAcct.begin,keyUsgCustAcct.length());
   }  
   
     /**
	 * 	Update KeyUsgCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgCustAcct.begin,keyUsgCustAcct.length());
   }
   
     /**
	 * 	Update KeyUsgCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyUsgMtn
	 *	@return keyUsgMtn
	 */   
	 public KeyUsgMtn getKeyUsgMtn() {
   	return keyUsgMtn;
   }
   /**
	* 	Update KeyUsgMtn with the passed value
	*   Corresponding COBOL Variable is WS-KEY-USG-MTN
	*	@param value
	*/
   public void setKeyUsgMtn(char[] value) {
      keyUsgMtn.setString(value); 
   }   
    
     /**
	 * 	Update KeyUsgMtn 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgMtn(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgMtn.begin,keyUsgMtn.length());
   }
   
     /**
	 * 	Update KeyUsgMtn 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgMtn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgMtn.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyUsgMtn with another Field
	 *	@param value
	 */
   public void setKeyUsgMtn(Field source) {
   	replace(source,0,source.length(),keyUsgMtn.begin,keyUsgMtn.length());
   }  
   
     /**
	 * 	Update KeyUsgMtn 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgMtn(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgMtn.begin,keyUsgMtn.length());
   }
   
     /**
	 * 	Update KeyUsgMtn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgMtn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgMtn.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyUsgPrev
	 *	@return keyUsgPrev
	 */   
	 public KeyUsgPrev getKeyUsgPrev() {
   	return keyUsgPrev;
   }
   /**
	* 	Update KeyUsgPrev with the passed value
	*   Corresponding COBOL Variable is WS-KEY-USG-PREV
	*	@param value
	*/
   public void setKeyUsgPrev(char[] value) {
      keyUsgPrev.setString(value); 
   }   
    
     /**
	 * 	Update KeyUsgPrev 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgPrev(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgPrev.begin,keyUsgPrev.length());
   }
   
     /**
	 * 	Update KeyUsgPrev 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgPrev(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgPrev.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyUsgPrev with another Field
	 *	@param value
	 */
   public void setKeyUsgPrev(Field source) {
   	replace(source,0,source.length(),keyUsgPrev.begin,keyUsgPrev.length());
   }  
   
     /**
	 * 	Update KeyUsgPrev 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyUsgPrev(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgPrev.begin,keyUsgPrev.length());
   }
   
     /**
	 * 	Update KeyUsgPrev 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyUsgPrev(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyUsgPrev.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyLsgPrev
	 *	@return keyLsgPrev
	 */   
	 public KeyLsgPrev getKeyLsgPrev() {
   	return keyLsgPrev;
   }
   /**
	* 	Update KeyLsgPrev with the passed value
	*   Corresponding COBOL Variable is WS-KEY-LSG-PREV
	*	@param value
	*/
   public void setKeyLsgPrev(char[] value) {
      keyLsgPrev.setString(value); 
   }   
    
     /**
	 * 	Update KeyLsgPrev 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyLsgPrev(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgPrev.begin,keyLsgPrev.length());
   }
   
     /**
	 * 	Update KeyLsgPrev 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsgPrev(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgPrev.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyLsgPrev with another Field
	 *	@param value
	 */
   public void setKeyLsgPrev(Field source) {
   	replace(source,0,source.length(),keyLsgPrev.begin,keyLsgPrev.length());
   }  
   
     /**
	 * 	Update KeyLsgPrev 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyLsgPrev(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgPrev.begin,keyLsgPrev.length());
   }
   
     /**
	 * 	Update KeyLsgPrev 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyLsgPrev(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyLsgPrev.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of usgOffrTypCd
	 *	@return usgOffrTypCd
	 */
   public char[] getUsgOffrTypCd() throws CFException{
     if (isUsgOffrTypCdModified()) { 
        usgOffrTypCd = refreshUsgOffrTypCd();
     }
   		return usgOffrTypCd;
   }

  
	/**
	*  set variable usgOffrTypCd
	*  Corresponding COBOL Variable is WS-USG-OFFR-TYP-CD
	*  @param value
	**/
   public void setUsgOffrTypCd(char[] value) {
      usgOffrTypCd = checkUsgOffrTypCdConstraints(value);
      serializeUsgOffrTypCd(usgOffrTypCd);
   } 

     /**
	 * 	Update UsgOffrTypCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUsgOffrTypCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUsgOffrTypCd,usgOffrTypCd.length);
   	
   }
   
   public void setUsgOffrTypCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUsgOffrTypCd,usgOffrTypCd.length);
   	
   }
   
     /**
	 * 	Update UsgOffrTypCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUsgOffrTypCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgOffrTypCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UsgOffrTypCd with another Field
	 *	@param value
	 */
   public void setUsgOffrTypCd(Field source) {
       replace(source,0,source.length(),beginUsgOffrTypCd,USG_OFFR_TYP_CD_LEN);
   	
   }  
   
     /**
	 * 	Update UsgOffrTypCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUsgOffrTypCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUsgOffrTypCd,USG_OFFR_TYP_CD_LEN);
   	
   }
   
     /**
	 * 	Update UsgOffrTypCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUsgOffrTypCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUsgOffrTypCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of usgBeginDtIso
	 *	@return usgBeginDtIso
	 */
	public long getUsgBeginDtIso() throws CFException {
       if (isUsgBeginDtIsoModified()) { 
           usgBeginDtIso = refreshUsgBeginDtIso();
        }
   		return usgBeginDtIso;
	}
	

	
	   
	/**
	 * 	Update UsgBeginDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-USG-BEGIN-DT-ISO
	 *	@param number
	 */
	public void setUsgBeginDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    usgBeginDtIso = checkUsgBeginDtIsoMaxLimit(number); 
		serializeUsgBeginDtIso(usgBeginDtIso);
	}
	

	/**
	 * 	Update UsgBeginDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setUsgBeginDtIso(char[] value) throws CFException {
		 usgBeginDtIso = serializeUsgBeginDtIso(value);
	}
	/**
	 * 	Update UsgBeginDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setUsgBeginDtIsoString(char[] value) throws CFException {
		 setUsgBeginDtIso(value);
	}
	/**
	 *	Returns the value of lsgBlPerFromDtIso
	 *	@return lsgBlPerFromDtIso
	 */
	public long getLsgBlPerFromDtIso() throws CFException {
       if (isLsgBlPerFromDtIsoModified()) { 
           lsgBlPerFromDtIso = refreshLsgBlPerFromDtIso();
        }
   		return lsgBlPerFromDtIso;
	}
	

	
	   
	/**
	 * 	Update LsgBlPerFromDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-LSG-BL-PER-FROM-DT-ISO
	 *	@param number
	 */
	public void setLsgBlPerFromDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsgBlPerFromDtIso = checkLsgBlPerFromDtIsoMaxLimit(number); 
		serializeLsgBlPerFromDtIso(lsgBlPerFromDtIso);
	}
	

	/**
	 * 	Update LsgBlPerFromDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsgBlPerFromDtIso(char[] value) throws CFException {
		 lsgBlPerFromDtIso = serializeLsgBlPerFromDtIso(value);
	}
	/**
	 * 	Update LsgBlPerFromDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsgBlPerFromDtIsoString(char[] value) throws CFException {
		 setLsgBlPerFromDtIso(value);
	}
	/**
	 *	Returns the value of lsgBlPerToDtIso
	 *	@return lsgBlPerToDtIso
	 */
	public long getLsgBlPerToDtIso() throws CFException {
       if (isLsgBlPerToDtIsoModified()) { 
           lsgBlPerToDtIso = refreshLsgBlPerToDtIso();
        }
   		return lsgBlPerToDtIso;
	}
	

	
	   
	/**
	 * 	Update LsgBlPerToDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-LSG-BL-PER-TO-DT-ISO
	 *	@param number
	 */
	public void setLsgBlPerToDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    lsgBlPerToDtIso = checkLsgBlPerToDtIsoMaxLimit(number); 
		serializeLsgBlPerToDtIso(lsgBlPerToDtIso);
	}
	

	/**
	 * 	Update LsgBlPerToDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setLsgBlPerToDtIso(char[] value) throws CFException {
		 lsgBlPerToDtIso = serializeLsgBlPerToDtIso(value);
	}
	/**
	 * 	Update LsgBlPerToDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setLsgBlPerToDtIsoString(char[] value) throws CFException {
		 setLsgBlPerToDtIso(value);
	}
	/**
	 *	Returns the value of keyMtnFile
	 *	@return keyMtnFile
	 */   
	 public KeyMtnFile getKeyMtnFile() {
   	return keyMtnFile;
   }
   /**
	* 	Update KeyMtnFile with the passed value
	*   Corresponding COBOL Variable is WS-KEY-MTN-FILE
	*	@param value
	*/
   public void setKeyMtnFile(char[] value) {
      keyMtnFile.setString(value); 
   }   
    
     /**
	 * 	Update KeyMtnFile 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnFile(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnFile.begin,keyMtnFile.length());
   }
   
     /**
	 * 	Update KeyMtnFile 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnFile(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnFile.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyMtnFile with another Field
	 *	@param value
	 */
   public void setKeyMtnFile(Field source) {
   	replace(source,0,source.length(),keyMtnFile.begin,keyMtnFile.length());
   }  
   
     /**
	 * 	Update KeyMtnFile 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyMtnFile(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnFile.begin,keyMtnFile.length());
   }
   
     /**
	 * 	Update KeyMtnFile 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyMtnFile(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyMtnFile.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of custMtnStatCd
	 *	@return custMtnStatCd
	 */
   public char[] getCustMtnStatCd() throws CFException{
     if (isCustMtnStatCdModified()) { 
        custMtnStatCd = refreshCustMtnStatCd();
     }
   		return custMtnStatCd;
   }

  
	/**
	*  set variable custMtnStatCd
	*  Corresponding COBOL Variable is WS-CUST-MTN-STAT-CD
	*  @param value
	**/
   public void setCustMtnStatCd(char[] value) {
      custMtnStatCd = checkCustMtnStatCdConstraints(value);
      serializeCustMtnStatCd(custMtnStatCd);
   } 

     /**
	 * 	Update CustMtnStatCd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCustMtnStatCd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCustMtnStatCd,custMtnStatCd.length);
   	
   }
   
   public void setCustMtnStatCd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCustMtnStatCd,custMtnStatCd.length);
   	
   }
   
     /**
	 * 	Update CustMtnStatCd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCustMtnStatCd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustMtnStatCd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CustMtnStatCd with another Field
	 *	@param value
	 */
   public void setCustMtnStatCd(Field source) {
       replace(source,0,source.length(),beginCustMtnStatCd,CUST_MTN_STAT_CD_LEN);
   	
   }  
   
     /**
	 * 	Update CustMtnStatCd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCustMtnStatCd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCustMtnStatCd,CUST_MTN_STAT_CD_LEN);
   	
   }
   
     /**
	 * 	Update CustMtnStatCd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCustMtnStatCd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCustMtnStatCd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of keyGlbCustAcct
	 *	@return keyGlbCustAcct
	 */   
	 public KeyGlbCustAcct getKeyGlbCustAcct() {
   	return keyGlbCustAcct;
   }
   /**
	* 	Update KeyGlbCustAcct with the passed value
	*   Corresponding COBOL Variable is WS-KEY-GLB-CUST-ACCT
	*	@param value
	*/
   public void setKeyGlbCustAcct(char[] value) {
      keyGlbCustAcct.setString(value); 
   }   
    
     /**
	 * 	Update KeyGlbCustAcct 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyGlbCustAcct(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyGlbCustAcct.begin,keyGlbCustAcct.length());
   }
   
     /**
	 * 	Update KeyGlbCustAcct 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyGlbCustAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyGlbCustAcct.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyGlbCustAcct with another Field
	 *	@param value
	 */
   public void setKeyGlbCustAcct(Field source) {
   	replace(source,0,source.length(),keyGlbCustAcct.begin,keyGlbCustAcct.length());
   }  
   
     /**
	 * 	Update KeyGlbCustAcct 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyGlbCustAcct(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyGlbCustAcct.begin,keyGlbCustAcct.length());
   }
   
     /**
	 * 	Update KeyGlbCustAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyGlbCustAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyGlbCustAcct.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of keyM2mPromo
	 *	@return keyM2mPromo
	 */   
	 public KeyM2mPromo getKeyM2mPromo() {
   	return keyM2mPromo;
   }
   /**
	* 	Update KeyM2mPromo with the passed value
	*   Corresponding COBOL Variable is WS-KEY-M2M-PROMO
	*	@param value
	*/
   public void setKeyM2mPromo(char[] value) {
      keyM2mPromo.setString(value); 
   }   
    
     /**
	 * 	Update KeyM2mPromo 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setKeyM2mPromo(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyM2mPromo.begin,keyM2mPromo.length());
   }
   
     /**
	 * 	Update KeyM2mPromo 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setKeyM2mPromo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyM2mPromo.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update KeyM2mPromo with another Field
	 *	@param value
	 */
   public void setKeyM2mPromo(Field source) {
   	replace(source,0,source.length(),keyM2mPromo.begin,keyM2mPromo.length());
   }  
   
     /**
	 * 	Update KeyM2mPromo 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setKeyM2mPromo(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,keyM2mPromo.begin,keyM2mPromo.length());
   }
   
     /**
	 * 	Update KeyM2mPromo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setKeyM2mPromo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,keyM2mPromo.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of errAcctRecord
	 *	@return errAcctRecord
	 */   
	 public ErrAcctRecord getErrAcctRecord() {
   	return errAcctRecord;
   }
   /**
	* 	Update ErrAcctRecord with the passed value
	*   Corresponding COBOL Variable is WS-ERR-ACCT-RECORD
	*	@param value
	*/
   public void setErrAcctRecord(char[] value) {
      errAcctRecord.setString(value); 
   }   
    
     /**
	 * 	Update ErrAcctRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecord.begin,errAcctRecord.length());
   }
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrAcctRecord with another Field
	 *	@param value
	 */
   public void setErrAcctRecord(Field source) {
   	replace(source,0,source.length(),errAcctRecord.begin,errAcctRecord.length());
   }  
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecord.begin,errAcctRecord.length());
   }
   
     /**
	 * 	Update ErrAcctRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecord.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of errAcctRecordSave
	 *	@return errAcctRecordSave
	 */   
	 public ErrAcctRecordSave getErrAcctRecordSave() {
   	return errAcctRecordSave;
   }
   /**
	* 	Update ErrAcctRecordSave with the passed value
	*   Corresponding COBOL Variable is WS-ERR-ACCT-RECORD-SAVE
	*	@param value
	*/
   public void setErrAcctRecordSave(char[] value) {
      errAcctRecordSave.setString(value); 
   }   
    
     /**
	 * 	Update ErrAcctRecordSave 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecordSave(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecordSave.begin,errAcctRecordSave.length());
   }
   
     /**
	 * 	Update ErrAcctRecordSave 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecordSave(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecordSave.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ErrAcctRecordSave with another Field
	 *	@param value
	 */
   public void setErrAcctRecordSave(Field source) {
   	replace(source,0,source.length(),errAcctRecordSave.begin,errAcctRecordSave.length());
   }  
   
     /**
	 * 	Update ErrAcctRecordSave 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setErrAcctRecordSave(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecordSave.begin,errAcctRecordSave.length());
   }
   
     /**
	 * 	Update ErrAcctRecordSave 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrAcctRecordSave(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,errAcctRecordSave.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of invJitrEligDtIso
	 *	@return invJitrEligDtIso
	 */
	public long getInvJitrEligDtIso() throws CFException {
       if (isInvJitrEligDtIsoModified()) { 
           invJitrEligDtIso = refreshInvJitrEligDtIso();
        }
   		return invJitrEligDtIso;
	}
	

	
	   
	/**
	 * 	Update InvJitrEligDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-INV-JITR-ELIG-DT-ISO
	 *	@param number
	 */
	public void setInvJitrEligDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    invJitrEligDtIso = checkInvJitrEligDtIsoMaxLimit(number); 
		serializeInvJitrEligDtIso(invJitrEligDtIso);
	}
	

	/**
	 * 	Update InvJitrEligDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setInvJitrEligDtIso(char[] value) throws CFException {
		 invJitrEligDtIso = serializeInvJitrEligDtIso(value);
	}
	/**
	 * 	Update InvJitrEligDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInvJitrEligDtIsoString(char[] value) throws CFException {
		 setInvJitrEligDtIso(value);
	}
	/**
	 *	Returns the value of invCycEffDtIso
	 *	@return invCycEffDtIso
	 */
	public long getInvCycEffDtIso() throws CFException {
       if (isInvCycEffDtIsoModified()) { 
           invCycEffDtIso = refreshInvCycEffDtIso();
        }
   		return invCycEffDtIso;
	}
	

	
	   
	/**
	 * 	Update InvCycEffDtIso with the passed value
	 *  Corresponding COBOL Variable is WS-INV-CYC-EFF-DT-ISO
	 *	@param number
	 */
	public void setInvCycEffDtIso(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    invCycEffDtIso = checkInvCycEffDtIsoMaxLimit(number); 
		serializeInvCycEffDtIso(invCycEffDtIso);
	}
	

	/**
	 * 	Update InvCycEffDtIso with the passed value
	 *	@param value (String or char[])
	 */
	public void setInvCycEffDtIso(char[] value) throws CFException {
		 invCycEffDtIso = serializeInvCycEffDtIso(value);
	}
	/**
	 * 	Update InvCycEffDtIso with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInvCycEffDtIsoString(char[] value) throws CFException {
		 setInvCycEffDtIso(value);
	}
	/**
	 *	Returns the value of invPrevBlCycNo
	 *	@return invPrevBlCycNo
	 */
   public char[] getInvPrevBlCycNo() throws CFException{
     if (isInvPrevBlCycNoModified()) { 
        invPrevBlCycNo = refreshInvPrevBlCycNo();
     }
   		return invPrevBlCycNo;
   }

  
	/**
	*  set variable invPrevBlCycNo
	*  Corresponding COBOL Variable is WS-INV-PREV-BL-CYC-NO
	*  @param value
	**/
   public void setInvPrevBlCycNo(char[] value) {
      invPrevBlCycNo = checkInvPrevBlCycNoConstraints(value);
      serializeInvPrevBlCycNo(invPrevBlCycNo);
   } 

     /**
	 * 	Update InvPrevBlCycNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInvPrevBlCycNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInvPrevBlCycNo,invPrevBlCycNo.length);
   	
   }
   
   public void setInvPrevBlCycNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInvPrevBlCycNo,invPrevBlCycNo.length);
   	
   }
   
     /**
	 * 	Update InvPrevBlCycNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInvPrevBlCycNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvPrevBlCycNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InvPrevBlCycNo with another Field
	 *	@param value
	 */
   public void setInvPrevBlCycNo(Field source) {
       replace(source,0,source.length(),beginInvPrevBlCycNo,INV_PREV_BL_CYC_NO_LEN);
   	
   }  
   
     /**
	 * 	Update InvPrevBlCycNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInvPrevBlCycNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInvPrevBlCycNo,INV_PREV_BL_CYC_NO_LEN);
   	
   }
   
     /**
	 * 	Update InvPrevBlCycNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInvPrevBlCycNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInvPrevBlCycNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of delayedCycNo
	 *	@return delayedCycNo
	 */
   public char[] getDelayedCycNo() throws CFException{
     if (isDelayedCycNoModified()) { 
        delayedCycNo = refreshDelayedCycNo();
     }
   		return delayedCycNo;
   }

  
	/**
	*  set variable delayedCycNo
	*  Corresponding COBOL Variable is WS-DELAYED-CYC-NO
	*  @param value
	**/
   public void setDelayedCycNo(char[] value) {
      delayedCycNo = checkDelayedCycNoConstraints(value);
      serializeDelayedCycNo(delayedCycNo);
   } 

     /**
	 * 	Update DelayedCycNo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDelayedCycNo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDelayedCycNo,delayedCycNo.length);
   	
   }
   
   public void setDelayedCycNo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDelayedCycNo,delayedCycNo.length);
   	
   }
   
     /**
	 * 	Update DelayedCycNo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDelayedCycNo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDelayedCycNo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DelayedCycNo with another Field
	 *	@param value
	 */
   public void setDelayedCycNo(Field source) {
       replace(source,0,source.length(),beginDelayedCycNo,DELAYED_CYC_NO_LEN);
   	
   }  
   
     /**
	 * 	Update DelayedCycNo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDelayedCycNo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDelayedCycNo,DELAYED_CYC_NO_LEN);
   	
   }
   
     /**
	 * 	Update DelayedCycNo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDelayedCycNo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDelayedCycNo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of invInvoiceNo
	 *	@return invInvoiceNo
	 */
	public long getInvInvoiceNo() throws CFException {
       if (isInvInvoiceNoModified()) { 
           invInvoiceNo = refreshInvInvoiceNo();
        }
   		return invInvoiceNo;
	}
	

	
	   
	/**
	 * 	Update InvInvoiceNo with the passed value
	 *  Corresponding COBOL Variable is WS-INV-INVOICE-NO
	 *	@param number
	 */
	public void setInvInvoiceNo(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    invInvoiceNo = checkInvInvoiceNoMaxLimit(number); 
		serializeInvInvoiceNo(invInvoiceNo);
	}
	

	/**
	 * 	Update InvInvoiceNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setInvInvoiceNo(char[] value) throws CFException {
		 invInvoiceNo = serializeInvInvoiceNo(value);
	}
	/**
	 * 	Update InvInvoiceNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setInvInvoiceNoString(char[] value) throws CFException {
		 setInvInvoiceNo(value);
	}
	/**
	 *	Returns the value of tooLateFlagSw
	 *	@return tooLateFlagSw
	 */
   public char[] getTooLateFlagSw() throws CFException{
     if (isTooLateFlagSwModified()) { 
        tooLateFlagSw = refreshTooLateFlagSw();
     }
   		return tooLateFlagSw;
   }

  
	/**
	*  set variable tooLateFlagSw
	*  Corresponding COBOL Variable is WS-TOO-LATE-FLAG-SW
	*  @param value
	**/
   public void setTooLateFlagSw(char[] value) {
      tooLateFlagSw = checkTooLateFlagSwConstraints(value);
      serializeTooLateFlagSw(tooLateFlagSw);
   } 

     /**
	 * 	Update TooLateFlagSw 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTooLateFlagSw(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTooLateFlagSw,tooLateFlagSw.length);
   	
   }
   
   public void setTooLateFlagSw(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTooLateFlagSw,tooLateFlagSw.length);
   	
   }
   
     /**
	 * 	Update TooLateFlagSw 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTooLateFlagSw(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTooLateFlagSw+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TooLateFlagSw with another Field
	 *	@param value
	 */
   public void setTooLateFlagSw(Field source) {
       replace(source,0,source.length(),beginTooLateFlagSw,TOO_LATE_FLAG_SW_LEN);
   	
   }  
   
     /**
	 * 	Update TooLateFlagSw 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTooLateFlagSw(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTooLateFlagSw,TOO_LATE_FLAG_SW_LEN);
   	
   }
   
     /**
	 * 	Update TooLateFlagSw 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTooLateFlagSw(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTooLateFlagSw+targetIndex,targetLen);
    
   }
	char[] tooLateFlag88Value = "Y".toCharArray();
	/**
	 *	Test condition "Y" for isTooLateFlag()
	 *	@return  Returns true if isTooLateFlag() is "Y"
	 */
   public boolean isTooLateFlag() throws CFException {
      return (  compareChars( getTooLateFlagSw() , tooLateFlag88Value)  == 0  );
   }


	/**
	*  set values "Y"
	*/
   	public void setTooLateFlagTrue() {  			
    	setTooLateFlagSw( tooLateFlag88Value);
   	}
	/**
	 *	Returns the value of parm
	 *	@return parm
	 */   
	 public Parm getParm() {
   	return parm;
   }
   /**
	* 	Update Parm with the passed value
	*   Corresponding COBOL Variable is WS-PARM
	*	@param value
	*/
   public void setParm(char[] value) {
      parm.setString(value); 
   }   
    
     /**
	 * 	Update Parm 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setParm(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm.begin,parm.length());
   }
   
     /**
	 * 	Update Parm 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParm(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Parm with another Field
	 *	@param value
	 */
   public void setParm(Field source) {
   	replace(source,0,source.length(),parm.begin,parm.length());
   }  
   
     /**
	 * 	Update Parm 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setParm(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,parm.begin,parm.length());
   }
   
     /**
	 * 	Update Parm 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParm(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,parm.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of rl001DtlBlSegregateNo
	 *	@return rl001DtlBlSegregateNo
	 */
	public int getRl001DtlBlSegregateNo() throws CFException {
       if (isRl001DtlBlSegregateNoModified()) { 
           rl001DtlBlSegregateNo = refreshRl001DtlBlSegregateNo();
        }
   		return rl001DtlBlSegregateNo;
	}
	

	
	   
	/**
	 * 	Update Rl001DtlBlSegregateNo with the passed value
	 *  Corresponding COBOL Variable is WS-RL001-DTL-BL-SEGREGATE-NO
	 *	@param number
	 */
	public void setRl001DtlBlSegregateNo(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    rl001DtlBlSegregateNo = checkRl001DtlBlSegregateNoMaxLimit(number); 
		serializeRl001DtlBlSegregateNo(rl001DtlBlSegregateNo);
	}
	

	public void setRl001DtlBlSegregateNo(long number) {
	    number = checkRl001DtlBlSegregateNoMaxLimit(number); // Truncate if value is beyond +/- Max range
		setRl001DtlBlSegregateNo((int)number);
	}
	
	/**
	 * 	Update Rl001DtlBlSegregateNo with the passed value
	 *	@param value (String or char[])
	 */
	public void setRl001DtlBlSegregateNo(char[] value) throws CFException {
		 rl001DtlBlSegregateNo = serializeRl001DtlBlSegregateNo(value);
	}
	/**
	 * 	Update Rl001DtlBlSegregateNo with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setRl001DtlBlSegregateNoString(char[] value) throws CFException {
		 setRl001DtlBlSegregateNo(value);
	}
	/**
	 *	Returns the value of fgvUsgRecord
	 *	@return fgvUsgRecord
	 */   
	 public FgvUsgRecord getFgvUsgRecord() {
   	return fgvUsgRecord;
   }
   /**
	* 	Update FgvUsgRecord with the passed value
	*   Corresponding COBOL Variable is WS-FGV-USG-RECORD
	*	@param value
	*/
   public void setFgvUsgRecord(char[] value) {
      fgvUsgRecord.setString(value); 
   }   
    
     /**
	 * 	Update FgvUsgRecord 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setFgvUsgRecord(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fgvUsgRecord.begin,fgvUsgRecord.length());
   }
   
     /**
	 * 	Update FgvUsgRecord 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFgvUsgRecord(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fgvUsgRecord.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update FgvUsgRecord with another Field
	 *	@param value
	 */
   public void setFgvUsgRecord(Field source) {
   	replace(source,0,source.length(),fgvUsgRecord.begin,fgvUsgRecord.length());
   }  
   
     /**
	 * 	Update FgvUsgRecord 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setFgvUsgRecord(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,fgvUsgRecord.begin,fgvUsgRecord.length());
   }
   
     /**
	 * 	Update FgvUsgRecord 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFgvUsgRecord(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,fgvUsgRecord.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes SaveInfoArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          keyInvCustAcct.initialize();
     
          keyCpduCustAcct.initialize();
     
          keyLsbcaCustAcct.initialize();
     
          keyLsgremCustAcct.initialize();
     
          keyAtdsumCustAcct.initialize();
     
          keyCpduMtn.initialize();
     
          keyCpduPrev.initialize();
     
          keyLsbcaMtn.initialize();
     
          keyLsbcaPrev.initialize();
     
                     setHldIldclLnShrGrpNo(0);
                     setHldIldcrLnShrGrpNo(0);
         setCpduOffrTypCd(CONSTANTS.SPACE_2);
          keyUsgCustAcct.initialize();
     
          keyUsgMtn.initialize();
     
          keyUsgPrev.initialize();
     
          keyLsgPrev.initialize();
     
         setUsgOffrTypCd(CONSTANTS.SPACE_2);
                     setUsgBeginDtIso(0);
                     setLsgBlPerFromDtIso(0);
                     setLsgBlPerToDtIso(0);
          keyMtnFile.initialize();
     
         setCustMtnStatCd(CONSTANTS.SPACE);
          keyGlbCustAcct.initialize();
     
          keyM2mPromo.initialize();
     
          errAcctRecord.initialize();
     
          errAcctRecordSave.initialize();
     
                     setInvJitrEligDtIso(0);
                     setInvCycEffDtIso(0);
         setInvPrevBlCycNo(CONSTANTS.SPACE_2);
         setDelayedCycNo(CONSTANTS.SPACE_2);
                     setInvInvoiceNo(0);
         setTooLateFlagSw(CONSTANTS.SPACE);
          parm.initialize();
     
                     setRl001DtlBlSegregateNo(0);
          fgvUsgRecord.initialize();
     
   }

		public static int getSaveInfoAreaFieldLength() {
			return SAVE_INFO_AREA_LENGTH;
		}

}
  
