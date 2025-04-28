package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


public class WvExtrDetails extends WvExtrDetailsSerialized { 
   

						private char[] wvExtrParcel = Field.fillLowValue(8);


						private char[] wvExtrCounterparty = Field.fillLowValue(9);


						private char[] wvExtrOwner = Field.fillLowValue(9);


						private char[] wvExtrLoadDateFrom = Field.fillLowValue(10);


						private char[] wvExtrLoadDateTo = Field.fillLowValue(10);


						private char[] wvExtrDiscDateFrom = Field.fillLowValue(10);


						private char[] wvExtrDiscDateTo = Field.fillLowValue(10);


						private char[] wvExtrSettlementDate = Field.fillLowValue(10);


						private char[] wvExtrSettlementOride = Field.fillLowValue(1);

				private WvExtrValueX wvExtrValueX = new WvExtrValueX();


						private char[] wvExtrBlDate = Field.fillLowValue(10);


						private char[] wvExtrDcDate = Field.fillLowValue(10);


						private char[] wvExtrLatestPriceDate = Field.fillLowValue(10);


						private char[] wvExtrOperator = Field.fillLowValue(9);

				private WvExtrQuantityX wvExtrQuantityX = new WvExtrQuantityX();


						private char[] wvExtrUnitCode = Field.fillLowValue(3);

				private WvExtrLdgBblX wvExtrLdgBblX = new WvExtrLdgBblX();

				private WvExtrLdgMtX wvExtrLdgMtX = new WvExtrLdgMtX();

				private WvExtrDchBblX wvExtrDchBblX = new WvExtrDchBblX();

				private WvExtrDchMtX wvExtrDchMtX = new WvExtrDchMtX();


						private char[] wvExtrSettleTerms1 = Field.fillLowValue(6);


						private char[] wvExtrSettleTerms2 = Field.fillLowValue(6);


						private char[] wvExtrEarlyLate = Field.fillLowValue(1);


						private char[] wvExtrInvoiced = Field.fillLowValue(1);


						private char[] wvExtrBuySell = Field.fillLowValue(1);


						private char[] wvExtrGrade = Field.fillLowValue(5);


						private char[] wvExtrTerms = Field.fillLowValue(5);


						private char[] wvExtrVessel = Field.fillLowValue(75);


						private char[] wvExtrLdgNorDate = Field.fillLowValue(10);


						private char[] wvExtrLdgNorTime = Field.fillLowValue(5);


						private char[] wvExtrDchNorDate = Field.fillLowValue(10);


						private char[] wvExtrDchNorTime = Field.fillLowValue(5);


						private char[] wvExtrSapDocCode = Field.fillLowValue(10);


						private char[] wvExtrSetlCurr = Field.fillLowValue(3);


						private char[] wvExtrLcStatus = Field.fillLowValue(1);


						private char[] wvExtrSancStatus = Field.fillLowValue(3);


						private char[] wvExtrCalcWork = Field.fillLowValue(1);

				private WvExtrRefDensityX wvExtrRefDensityX = new WvExtrRefDensityX();

				private WvExtrActDensityX wvExtrActDensityX = new WvExtrActDensityX();


						private char[] wvExtrStiFlag = Field.fillLowValue(1);


						private char[] wvExtrMethod = Field.fillLowValue(2);


						private char[] wvExtrPrclNote = Field.fillLowValue(1);


						private char[] wvExtrSendToGsap = Field.fillLowValue(1);


						private char[] wvExtrLinkedFrom = Field.fillLowValue(10);


						private char[] wvExtrSecToShell = Field.fillLowValue(5);


								private char[] wvExtrInvoiceQty = Field.fillLowValue(12);


						private char[] wvExtrInvoiceUnit = Field.fillLowValue(3);


						private char[] wvExtrLloydsNum = Field.fillLowValue(7);

				private WvExtrLdgUsgX wvExtrLdgUsgX = new WvExtrLdgUsgX();

				private WvExtrLdgM315X wvExtrLdgM315X = new WvExtrLdgM315X();

				private WvExtrLdgM320X wvExtrLdgM320X = new WvExtrLdgM320X();

				private WvExtrLdgM330X wvExtrLdgM330X = new WvExtrLdgM330X();

				private WvExtrLdgM3AmbX wvExtrLdgM3AmbX = new WvExtrLdgM3AmbX();

				private WvExtrDchUsgX wvExtrDchUsgX = new WvExtrDchUsgX();

				private WvExtrDchM315X wvExtrDchM315X = new WvExtrDchM315X();

				private WvExtrDchM320X wvExtrDchM320X = new WvExtrDchM320X();

				private WvExtrDchM330X wvExtrDchM330X = new WvExtrDchM330X();

				private WvExtrDchM3AmbX wvExtrDchM3AmbX = new WvExtrDchM3AmbX();


						private char[] wvExtrFrmlName = Field.fillLowValue(15);


								private char[] wvExtrFrmlVers = Field.fillLowValue(2);


						private char[] wvExtrLoadPort = Field.fillLowValue(10);


						private char[] wvExtrDiscPort = Field.fillLowValue(10);
	
	/**
	* Constructor for WvExtrDetails
	**/
    public WvExtrDetails() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for WvExtrDetails. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WvExtrDetails(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			wvExtrValueX.setParent(this,getStartOffset() + 86);
	       			wvExtrQuantityX.setParent(this,getStartOffset() + 142);
	       			wvExtrLdgBblX.setParent(this,getStartOffset() + 156);
	       			wvExtrLdgMtX.setParent(this,getStartOffset() + 170);
	       			wvExtrDchBblX.setParent(this,getStartOffset() + 184);
	       			wvExtrDchMtX.setParent(this,getStartOffset() + 198);
	       			wvExtrRefDensityX.setParent(this,getStartOffset() + 377);
	       			wvExtrActDensityX.setParent(this,getStartOffset() + 390);
	       			wvExtrLdgUsgX.setParent(this,getStartOffset() + 454);
	       			wvExtrLdgM315X.setParent(this,getStartOffset() + 467);
	       			wvExtrLdgM320X.setParent(this,getStartOffset() + 480);
	       			wvExtrLdgM330X.setParent(this,getStartOffset() + 493);
	       			wvExtrLdgM3AmbX.setParent(this,getStartOffset() + 506);
	       			wvExtrDchUsgX.setParent(this,getStartOffset() + 519);
	       			wvExtrDchM315X.setParent(this,getStartOffset() + 532);
	       			wvExtrDchM320X.setParent(this,getStartOffset() + 545);
	       			wvExtrDchM330X.setParent(this,getStartOffset() + 558);
	       			wvExtrDchM3AmbX.setParent(this,getStartOffset() + 571);
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 8
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 18
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 28
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 50
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 61
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 72
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 83
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 85
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 98
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 109
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 120
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 131
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 141
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 151
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 155
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 169
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 183
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 197
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 211
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 218
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 225
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 227
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 229
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 231
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 237
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 243
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 319
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 330
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 336
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 347
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 353
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 364
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 368
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 370
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 374
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 376
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 389
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 402
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 404
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 407
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 409
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 411
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 422
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 428
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 441
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 445
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 453
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 466
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 479
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 492
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 505
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 518
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 531
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 544
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 557
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 570
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 583
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 599
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 602
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 613
             ,1
             );
    } 

	/**
	 *	Returns the value of wvExtrParcel
	 *	@return wvExtrParcel
	 */
   public char[] getWvExtrParcel() throws CFException{
     if (isWvExtrParcelModified()) { 
        wvExtrParcel = refreshWvExtrParcel();
     }
   		return wvExtrParcel;
   }

  
	/**
	*  set variable wvExtrParcel
	*  Corresponding COBOL Variable is WV-EXTR-PARCEL
	*  @param value
	**/
   public void setWvExtrParcel(char[] value) {
      wvExtrParcel = checkWvExtrParcelConstraints(value);
      serializeWvExtrParcel(wvExtrParcel);
   } 

     /**
	 * 	Update WvExtrParcel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrParcel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrParcel,wvExtrParcel.length);
   	
   }
   
   public void setWvExtrParcel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrParcel,wvExtrParcel.length);
   	
   }
   
     /**
	 * 	Update WvExtrParcel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrParcel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrParcel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrParcel with another Field
	 *	@param value
	 */
   public void setWvExtrParcel(Field source) {
       replace(source,0,source.length(),beginWvExtrParcel,WV_EXTR_PARCEL_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrParcel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrParcel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrParcel,WV_EXTR_PARCEL_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrParcel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrParcel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrParcel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrCounterparty
	 *	@return wvExtrCounterparty
	 */
   public char[] getWvExtrCounterparty() throws CFException{
     if (isWvExtrCounterpartyModified()) { 
        wvExtrCounterparty = refreshWvExtrCounterparty();
     }
   		return wvExtrCounterparty;
   }

  
	/**
	*  set variable wvExtrCounterparty
	*  Corresponding COBOL Variable is WV-EXTR-COUNTERPARTY
	*  @param value
	**/
   public void setWvExtrCounterparty(char[] value) {
      wvExtrCounterparty = checkWvExtrCounterpartyConstraints(value);
      serializeWvExtrCounterparty(wvExtrCounterparty);
   } 

     /**
	 * 	Update WvExtrCounterparty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrCounterparty(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrCounterparty,wvExtrCounterparty.length);
   	
   }
   
   public void setWvExtrCounterparty(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrCounterparty,wvExtrCounterparty.length);
   	
   }
   
     /**
	 * 	Update WvExtrCounterparty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrCounterparty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrCounterparty+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrCounterparty with another Field
	 *	@param value
	 */
   public void setWvExtrCounterparty(Field source) {
       replace(source,0,source.length(),beginWvExtrCounterparty,WV_EXTR_COUNTERPARTY_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrCounterparty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrCounterparty(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrCounterparty,WV_EXTR_COUNTERPARTY_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrCounterparty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrCounterparty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrCounterparty+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrOwner
	 *	@return wvExtrOwner
	 */
   public char[] getWvExtrOwner() throws CFException{
     if (isWvExtrOwnerModified()) { 
        wvExtrOwner = refreshWvExtrOwner();
     }
   		return wvExtrOwner;
   }

  
	/**
	*  set variable wvExtrOwner
	*  Corresponding COBOL Variable is WV-EXTR-OWNER
	*  @param value
	**/
   public void setWvExtrOwner(char[] value) {
      wvExtrOwner = checkWvExtrOwnerConstraints(value);
      serializeWvExtrOwner(wvExtrOwner);
   } 

     /**
	 * 	Update WvExtrOwner 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOwner(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrOwner,wvExtrOwner.length);
   	
   }
   
   public void setWvExtrOwner(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOwner,wvExtrOwner.length);
   	
   }
   
     /**
	 * 	Update WvExtrOwner 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOwner(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOwner+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrOwner with another Field
	 *	@param value
	 */
   public void setWvExtrOwner(Field source) {
       replace(source,0,source.length(),beginWvExtrOwner,WV_EXTR_OWNER_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrOwner 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOwner(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrOwner,WV_EXTR_OWNER_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrOwner 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOwner(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOwner+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLoadDateFrom
	 *	@return wvExtrLoadDateFrom
	 */
   public char[] getWvExtrLoadDateFrom() throws CFException{
     if (isWvExtrLoadDateFromModified()) { 
        wvExtrLoadDateFrom = refreshWvExtrLoadDateFrom();
     }
   		return wvExtrLoadDateFrom;
   }

  
	/**
	*  set variable wvExtrLoadDateFrom
	*  Corresponding COBOL Variable is WV-EXTR-LOAD-DATE-FROM
	*  @param value
	**/
   public void setWvExtrLoadDateFrom(char[] value) {
      wvExtrLoadDateFrom = checkWvExtrLoadDateFromConstraints(value);
      serializeWvExtrLoadDateFrom(wvExtrLoadDateFrom);
   } 

     /**
	 * 	Update WvExtrLoadDateFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLoadDateFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLoadDateFrom,wvExtrLoadDateFrom.length);
   	
   }
   
   public void setWvExtrLoadDateFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateFrom,wvExtrLoadDateFrom.length);
   	
   }
   
     /**
	 * 	Update WvExtrLoadDateFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLoadDateFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLoadDateFrom with another Field
	 *	@param value
	 */
   public void setWvExtrLoadDateFrom(Field source) {
       replace(source,0,source.length(),beginWvExtrLoadDateFrom,WV_EXTR_LOAD_DATE_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLoadDateFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLoadDateFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateFrom,WV_EXTR_LOAD_DATE_FROM_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLoadDateFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLoadDateFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLoadDateTo
	 *	@return wvExtrLoadDateTo
	 */
   public char[] getWvExtrLoadDateTo() throws CFException{
     if (isWvExtrLoadDateToModified()) { 
        wvExtrLoadDateTo = refreshWvExtrLoadDateTo();
     }
   		return wvExtrLoadDateTo;
   }

  
	/**
	*  set variable wvExtrLoadDateTo
	*  Corresponding COBOL Variable is WV-EXTR-LOAD-DATE-TO
	*  @param value
	**/
   public void setWvExtrLoadDateTo(char[] value) {
      wvExtrLoadDateTo = checkWvExtrLoadDateToConstraints(value);
      serializeWvExtrLoadDateTo(wvExtrLoadDateTo);
   } 

     /**
	 * 	Update WvExtrLoadDateTo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLoadDateTo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLoadDateTo,wvExtrLoadDateTo.length);
   	
   }
   
   public void setWvExtrLoadDateTo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateTo,wvExtrLoadDateTo.length);
   	
   }
   
     /**
	 * 	Update WvExtrLoadDateTo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLoadDateTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateTo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLoadDateTo with another Field
	 *	@param value
	 */
   public void setWvExtrLoadDateTo(Field source) {
       replace(source,0,source.length(),beginWvExtrLoadDateTo,WV_EXTR_LOAD_DATE_TO_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLoadDateTo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLoadDateTo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateTo,WV_EXTR_LOAD_DATE_TO_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLoadDateTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLoadDateTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadDateTo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrDiscDateFrom
	 *	@return wvExtrDiscDateFrom
	 */
   public char[] getWvExtrDiscDateFrom() throws CFException{
     if (isWvExtrDiscDateFromModified()) { 
        wvExtrDiscDateFrom = refreshWvExtrDiscDateFrom();
     }
   		return wvExtrDiscDateFrom;
   }

  
	/**
	*  set variable wvExtrDiscDateFrom
	*  Corresponding COBOL Variable is WV-EXTR-DISC-DATE-FROM
	*  @param value
	**/
   public void setWvExtrDiscDateFrom(char[] value) {
      wvExtrDiscDateFrom = checkWvExtrDiscDateFromConstraints(value);
      serializeWvExtrDiscDateFrom(wvExtrDiscDateFrom);
   } 

     /**
	 * 	Update WvExtrDiscDateFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDiscDateFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDiscDateFrom,wvExtrDiscDateFrom.length);
   	
   }
   
   public void setWvExtrDiscDateFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateFrom,wvExtrDiscDateFrom.length);
   	
   }
   
     /**
	 * 	Update WvExtrDiscDateFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDiscDateFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDiscDateFrom with another Field
	 *	@param value
	 */
   public void setWvExtrDiscDateFrom(Field source) {
       replace(source,0,source.length(),beginWvExtrDiscDateFrom,WV_EXTR_DISC_DATE_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDiscDateFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDiscDateFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateFrom,WV_EXTR_DISC_DATE_FROM_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDiscDateFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDiscDateFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrDiscDateTo
	 *	@return wvExtrDiscDateTo
	 */
   public char[] getWvExtrDiscDateTo() throws CFException{
     if (isWvExtrDiscDateToModified()) { 
        wvExtrDiscDateTo = refreshWvExtrDiscDateTo();
     }
   		return wvExtrDiscDateTo;
   }

  
	/**
	*  set variable wvExtrDiscDateTo
	*  Corresponding COBOL Variable is WV-EXTR-DISC-DATE-TO
	*  @param value
	**/
   public void setWvExtrDiscDateTo(char[] value) {
      wvExtrDiscDateTo = checkWvExtrDiscDateToConstraints(value);
      serializeWvExtrDiscDateTo(wvExtrDiscDateTo);
   } 

     /**
	 * 	Update WvExtrDiscDateTo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDiscDateTo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDiscDateTo,wvExtrDiscDateTo.length);
   	
   }
   
   public void setWvExtrDiscDateTo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateTo,wvExtrDiscDateTo.length);
   	
   }
   
     /**
	 * 	Update WvExtrDiscDateTo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDiscDateTo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateTo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDiscDateTo with another Field
	 *	@param value
	 */
   public void setWvExtrDiscDateTo(Field source) {
       replace(source,0,source.length(),beginWvExtrDiscDateTo,WV_EXTR_DISC_DATE_TO_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDiscDateTo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDiscDateTo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateTo,WV_EXTR_DISC_DATE_TO_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDiscDateTo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDiscDateTo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscDateTo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSettlementDate
	 *	@return wvExtrSettlementDate
	 */
   public char[] getWvExtrSettlementDate() throws CFException{
     if (isWvExtrSettlementDateModified()) { 
        wvExtrSettlementDate = refreshWvExtrSettlementDate();
     }
   		return wvExtrSettlementDate;
   }

  
	/**
	*  set variable wvExtrSettlementDate
	*  Corresponding COBOL Variable is WV-EXTR-SETTLEMENT-DATE
	*  @param value
	**/
   public void setWvExtrSettlementDate(char[] value) {
      wvExtrSettlementDate = checkWvExtrSettlementDateConstraints(value);
      serializeWvExtrSettlementDate(wvExtrSettlementDate);
   } 

     /**
	 * 	Update WvExtrSettlementDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSettlementDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSettlementDate,wvExtrSettlementDate.length);
   	
   }
   
   public void setWvExtrSettlementDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettlementDate,wvExtrSettlementDate.length);
   	
   }
   
     /**
	 * 	Update WvExtrSettlementDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettlementDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettlementDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSettlementDate with another Field
	 *	@param value
	 */
   public void setWvExtrSettlementDate(Field source) {
       replace(source,0,source.length(),beginWvExtrSettlementDate,WV_EXTR_SETTLEMENT_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSettlementDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSettlementDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSettlementDate,WV_EXTR_SETTLEMENT_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSettlementDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettlementDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettlementDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSettlementOride
	 *	@return wvExtrSettlementOride
	 */
   public char[] getWvExtrSettlementOride() throws CFException{
     if (isWvExtrSettlementOrideModified()) { 
        wvExtrSettlementOride = refreshWvExtrSettlementOride();
     }
   		return wvExtrSettlementOride;
   }

  
	/**
	*  set variable wvExtrSettlementOride
	*  Corresponding COBOL Variable is WV-EXTR-SETTLEMENT-ORIDE
	*  @param value
	**/
   public void setWvExtrSettlementOride(char[] value) {
      wvExtrSettlementOride = checkWvExtrSettlementOrideConstraints(value);
      serializeWvExtrSettlementOride(wvExtrSettlementOride);
   } 

     /**
	 * 	Update WvExtrSettlementOride 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSettlementOride(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSettlementOride,wvExtrSettlementOride.length);
   	
   }
   
   public void setWvExtrSettlementOride(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettlementOride,wvExtrSettlementOride.length);
   	
   }
   
     /**
	 * 	Update WvExtrSettlementOride 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettlementOride(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettlementOride+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSettlementOride with another Field
	 *	@param value
	 */
   public void setWvExtrSettlementOride(Field source) {
       replace(source,0,source.length(),beginWvExtrSettlementOride,WV_EXTR_SETTLEMENT_ORIDE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSettlementOride 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSettlementOride(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSettlementOride,WV_EXTR_SETTLEMENT_ORIDE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSettlementOride 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettlementOride(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettlementOride+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrValueX
	 *	@return wvExtrValueX
	 */   
	 public WvExtrValueX getWvExtrValueX() {
   	return wvExtrValueX;
   }
   /**
	* 	Update WvExtrValueX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-VALUE-X
	*	@param value
	*/
   public void setWvExtrValueX(char[] value) {
      wvExtrValueX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrValueX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrValueX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrValueX.begin,wvExtrValueX.length());
   }
   
     /**
	 * 	Update WvExtrValueX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrValueX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrValueX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrValueX with another Field
	 *	@param value
	 */
   public void setWvExtrValueX(Field source) {
   	replace(source,0,source.length(),wvExtrValueX.begin,wvExtrValueX.length());
   }  
   
     /**
	 * 	Update WvExtrValueX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrValueX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrValueX.begin,wvExtrValueX.length());
   }
   
     /**
	 * 	Update WvExtrValueX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrValueX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrValueX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrBlDate
	 *	@return wvExtrBlDate
	 */
   public char[] getWvExtrBlDate() throws CFException{
     if (isWvExtrBlDateModified()) { 
        wvExtrBlDate = refreshWvExtrBlDate();
     }
   		return wvExtrBlDate;
   }

  
	/**
	*  set variable wvExtrBlDate
	*  Corresponding COBOL Variable is WV-EXTR-BL-DATE
	*  @param value
	**/
   public void setWvExtrBlDate(char[] value) {
      wvExtrBlDate = checkWvExtrBlDateConstraints(value);
      serializeWvExtrBlDate(wvExtrBlDate);
   } 

     /**
	 * 	Update WvExtrBlDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrBlDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrBlDate,wvExtrBlDate.length);
   	
   }
   
   public void setWvExtrBlDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBlDate,wvExtrBlDate.length);
   	
   }
   
     /**
	 * 	Update WvExtrBlDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBlDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBlDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrBlDate with another Field
	 *	@param value
	 */
   public void setWvExtrBlDate(Field source) {
       replace(source,0,source.length(),beginWvExtrBlDate,WV_EXTR_BL_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrBlDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrBlDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrBlDate,WV_EXTR_BL_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrBlDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBlDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBlDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrDcDate
	 *	@return wvExtrDcDate
	 */
   public char[] getWvExtrDcDate() throws CFException{
     if (isWvExtrDcDateModified()) { 
        wvExtrDcDate = refreshWvExtrDcDate();
     }
   		return wvExtrDcDate;
   }

  
	/**
	*  set variable wvExtrDcDate
	*  Corresponding COBOL Variable is WV-EXTR-DC-DATE
	*  @param value
	**/
   public void setWvExtrDcDate(char[] value) {
      wvExtrDcDate = checkWvExtrDcDateConstraints(value);
      serializeWvExtrDcDate(wvExtrDcDate);
   } 

     /**
	 * 	Update WvExtrDcDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDcDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDcDate,wvExtrDcDate.length);
   	
   }
   
   public void setWvExtrDcDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDcDate,wvExtrDcDate.length);
   	
   }
   
     /**
	 * 	Update WvExtrDcDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDcDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDcDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDcDate with another Field
	 *	@param value
	 */
   public void setWvExtrDcDate(Field source) {
       replace(source,0,source.length(),beginWvExtrDcDate,WV_EXTR_DC_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDcDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDcDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDcDate,WV_EXTR_DC_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDcDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDcDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDcDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLatestPriceDate
	 *	@return wvExtrLatestPriceDate
	 */
   public char[] getWvExtrLatestPriceDate() throws CFException{
     if (isWvExtrLatestPriceDateModified()) { 
        wvExtrLatestPriceDate = refreshWvExtrLatestPriceDate();
     }
   		return wvExtrLatestPriceDate;
   }

  
	/**
	*  set variable wvExtrLatestPriceDate
	*  Corresponding COBOL Variable is WV-EXTR-LATEST-PRICE-DATE
	*  @param value
	**/
   public void setWvExtrLatestPriceDate(char[] value) {
      wvExtrLatestPriceDate = checkWvExtrLatestPriceDateConstraints(value);
      serializeWvExtrLatestPriceDate(wvExtrLatestPriceDate);
   } 

     /**
	 * 	Update WvExtrLatestPriceDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLatestPriceDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLatestPriceDate,wvExtrLatestPriceDate.length);
   	
   }
   
   public void setWvExtrLatestPriceDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLatestPriceDate,wvExtrLatestPriceDate.length);
   	
   }
   
     /**
	 * 	Update WvExtrLatestPriceDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLatestPriceDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLatestPriceDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLatestPriceDate with another Field
	 *	@param value
	 */
   public void setWvExtrLatestPriceDate(Field source) {
       replace(source,0,source.length(),beginWvExtrLatestPriceDate,WV_EXTR_LATEST_PRICE_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLatestPriceDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLatestPriceDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLatestPriceDate,WV_EXTR_LATEST_PRICE_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLatestPriceDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLatestPriceDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLatestPriceDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrOperator
	 *	@return wvExtrOperator
	 */
   public char[] getWvExtrOperator() throws CFException{
     if (isWvExtrOperatorModified()) { 
        wvExtrOperator = refreshWvExtrOperator();
     }
   		return wvExtrOperator;
   }

  
	/**
	*  set variable wvExtrOperator
	*  Corresponding COBOL Variable is WV-EXTR-OPERATOR
	*  @param value
	**/
   public void setWvExtrOperator(char[] value) {
      wvExtrOperator = checkWvExtrOperatorConstraints(value);
      serializeWvExtrOperator(wvExtrOperator);
   } 

     /**
	 * 	Update WvExtrOperator 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrOperator(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrOperator,wvExtrOperator.length);
   	
   }
   
   public void setWvExtrOperator(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOperator,wvExtrOperator.length);
   	
   }
   
     /**
	 * 	Update WvExtrOperator 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOperator(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOperator+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrOperator with another Field
	 *	@param value
	 */
   public void setWvExtrOperator(Field source) {
       replace(source,0,source.length(),beginWvExtrOperator,WV_EXTR_OPERATOR_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrOperator 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrOperator(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrOperator,WV_EXTR_OPERATOR_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrOperator 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrOperator(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrOperator+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrQuantityX
	 *	@return wvExtrQuantityX
	 */   
	 public WvExtrQuantityX getWvExtrQuantityX() {
   	return wvExtrQuantityX;
   }
   /**
	* 	Update WvExtrQuantityX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-QUANTITY-X
	*	@param value
	*/
   public void setWvExtrQuantityX(char[] value) {
      wvExtrQuantityX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrQuantityX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrQuantityX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrQuantityX.begin,wvExtrQuantityX.length());
   }
   
     /**
	 * 	Update WvExtrQuantityX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrQuantityX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrQuantityX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrQuantityX with another Field
	 *	@param value
	 */
   public void setWvExtrQuantityX(Field source) {
   	replace(source,0,source.length(),wvExtrQuantityX.begin,wvExtrQuantityX.length());
   }  
   
     /**
	 * 	Update WvExtrQuantityX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrQuantityX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrQuantityX.begin,wvExtrQuantityX.length());
   }
   
     /**
	 * 	Update WvExtrQuantityX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrQuantityX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrQuantityX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrUnitCode
	 *	@return wvExtrUnitCode
	 */
   public char[] getWvExtrUnitCode() throws CFException{
     if (isWvExtrUnitCodeModified()) { 
        wvExtrUnitCode = refreshWvExtrUnitCode();
     }
   		return wvExtrUnitCode;
   }

  
	/**
	*  set variable wvExtrUnitCode
	*  Corresponding COBOL Variable is WV-EXTR-UNIT-CODE
	*  @param value
	**/
   public void setWvExtrUnitCode(char[] value) {
      wvExtrUnitCode = checkWvExtrUnitCodeConstraints(value);
      serializeWvExtrUnitCode(wvExtrUnitCode);
   } 

     /**
	 * 	Update WvExtrUnitCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrUnitCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrUnitCode,wvExtrUnitCode.length);
   	
   }
   
   public void setWvExtrUnitCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrUnitCode,wvExtrUnitCode.length);
   	
   }
   
     /**
	 * 	Update WvExtrUnitCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrUnitCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrUnitCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrUnitCode with another Field
	 *	@param value
	 */
   public void setWvExtrUnitCode(Field source) {
       replace(source,0,source.length(),beginWvExtrUnitCode,WV_EXTR_UNIT_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrUnitCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrUnitCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrUnitCode,WV_EXTR_UNIT_CODE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrUnitCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrUnitCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrUnitCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLdgBblX
	 *	@return wvExtrLdgBblX
	 */   
	 public WvExtrLdgBblX getWvExtrLdgBblX() {
   	return wvExtrLdgBblX;
   }
   /**
	* 	Update WvExtrLdgBblX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-BBL-X
	*	@param value
	*/
   public void setWvExtrLdgBblX(char[] value) {
      wvExtrLdgBblX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgBblX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgBblX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgBblX.begin,wvExtrLdgBblX.length());
   }
   
     /**
	 * 	Update WvExtrLdgBblX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgBblX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgBblX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgBblX with another Field
	 *	@param value
	 */
   public void setWvExtrLdgBblX(Field source) {
   	replace(source,0,source.length(),wvExtrLdgBblX.begin,wvExtrLdgBblX.length());
   }  
   
     /**
	 * 	Update WvExtrLdgBblX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgBblX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgBblX.begin,wvExtrLdgBblX.length());
   }
   
     /**
	 * 	Update WvExtrLdgBblX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgBblX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgBblX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrLdgMtX
	 *	@return wvExtrLdgMtX
	 */   
	 public WvExtrLdgMtX getWvExtrLdgMtX() {
   	return wvExtrLdgMtX;
   }
   /**
	* 	Update WvExtrLdgMtX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-MT-X
	*	@param value
	*/
   public void setWvExtrLdgMtX(char[] value) {
      wvExtrLdgMtX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgMtX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgMtX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgMtX.begin,wvExtrLdgMtX.length());
   }
   
     /**
	 * 	Update WvExtrLdgMtX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgMtX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgMtX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgMtX with another Field
	 *	@param value
	 */
   public void setWvExtrLdgMtX(Field source) {
   	replace(source,0,source.length(),wvExtrLdgMtX.begin,wvExtrLdgMtX.length());
   }  
   
     /**
	 * 	Update WvExtrLdgMtX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgMtX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgMtX.begin,wvExtrLdgMtX.length());
   }
   
     /**
	 * 	Update WvExtrLdgMtX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgMtX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgMtX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchBblX
	 *	@return wvExtrDchBblX
	 */   
	 public WvExtrDchBblX getWvExtrDchBblX() {
   	return wvExtrDchBblX;
   }
   /**
	* 	Update WvExtrDchBblX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-BBL-X
	*	@param value
	*/
   public void setWvExtrDchBblX(char[] value) {
      wvExtrDchBblX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchBblX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchBblX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchBblX.begin,wvExtrDchBblX.length());
   }
   
     /**
	 * 	Update WvExtrDchBblX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchBblX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchBblX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchBblX with another Field
	 *	@param value
	 */
   public void setWvExtrDchBblX(Field source) {
   	replace(source,0,source.length(),wvExtrDchBblX.begin,wvExtrDchBblX.length());
   }  
   
     /**
	 * 	Update WvExtrDchBblX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchBblX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchBblX.begin,wvExtrDchBblX.length());
   }
   
     /**
	 * 	Update WvExtrDchBblX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchBblX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchBblX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchMtX
	 *	@return wvExtrDchMtX
	 */   
	 public WvExtrDchMtX getWvExtrDchMtX() {
   	return wvExtrDchMtX;
   }
   /**
	* 	Update WvExtrDchMtX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-MT-X
	*	@param value
	*/
   public void setWvExtrDchMtX(char[] value) {
      wvExtrDchMtX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchMtX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchMtX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchMtX.begin,wvExtrDchMtX.length());
   }
   
     /**
	 * 	Update WvExtrDchMtX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchMtX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchMtX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchMtX with another Field
	 *	@param value
	 */
   public void setWvExtrDchMtX(Field source) {
   	replace(source,0,source.length(),wvExtrDchMtX.begin,wvExtrDchMtX.length());
   }  
   
     /**
	 * 	Update WvExtrDchMtX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchMtX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchMtX.begin,wvExtrDchMtX.length());
   }
   
     /**
	 * 	Update WvExtrDchMtX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchMtX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchMtX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrSettleTerms1
	 *	@return wvExtrSettleTerms1
	 */
   public char[] getWvExtrSettleTerms1() throws CFException{
     if (isWvExtrSettleTerms1Modified()) { 
        wvExtrSettleTerms1 = refreshWvExtrSettleTerms1();
     }
   		return wvExtrSettleTerms1;
   }

  
	/**
	*  set variable wvExtrSettleTerms1
	*  Corresponding COBOL Variable is WV-EXTR-SETTLE-TERMS-1
	*  @param value
	**/
   public void setWvExtrSettleTerms1(char[] value) {
      wvExtrSettleTerms1 = checkWvExtrSettleTerms1Constraints(value);
      serializeWvExtrSettleTerms1(wvExtrSettleTerms1);
   } 

     /**
	 * 	Update WvExtrSettleTerms1 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSettleTerms1(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSettleTerms1,wvExtrSettleTerms1.length);
   	
   }
   
   public void setWvExtrSettleTerms1(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms1,wvExtrSettleTerms1.length);
   	
   }
   
     /**
	 * 	Update WvExtrSettleTerms1 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettleTerms1(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms1+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSettleTerms1 with another Field
	 *	@param value
	 */
   public void setWvExtrSettleTerms1(Field source) {
       replace(source,0,source.length(),beginWvExtrSettleTerms1,WV_EXTR_SETTLE_TERMS_1_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSettleTerms1 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSettleTerms1(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms1,WV_EXTR_SETTLE_TERMS_1_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSettleTerms1 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettleTerms1(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms1+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSettleTerms2
	 *	@return wvExtrSettleTerms2
	 */
   public char[] getWvExtrSettleTerms2() throws CFException{
     if (isWvExtrSettleTerms2Modified()) { 
        wvExtrSettleTerms2 = refreshWvExtrSettleTerms2();
     }
   		return wvExtrSettleTerms2;
   }

  
	/**
	*  set variable wvExtrSettleTerms2
	*  Corresponding COBOL Variable is WV-EXTR-SETTLE-TERMS-2
	*  @param value
	**/
   public void setWvExtrSettleTerms2(char[] value) {
      wvExtrSettleTerms2 = checkWvExtrSettleTerms2Constraints(value);
      serializeWvExtrSettleTerms2(wvExtrSettleTerms2);
   } 

     /**
	 * 	Update WvExtrSettleTerms2 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSettleTerms2(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSettleTerms2,wvExtrSettleTerms2.length);
   	
   }
   
   public void setWvExtrSettleTerms2(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms2,wvExtrSettleTerms2.length);
   	
   }
   
     /**
	 * 	Update WvExtrSettleTerms2 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettleTerms2(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms2+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSettleTerms2 with another Field
	 *	@param value
	 */
   public void setWvExtrSettleTerms2(Field source) {
       replace(source,0,source.length(),beginWvExtrSettleTerms2,WV_EXTR_SETTLE_TERMS_2_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSettleTerms2 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSettleTerms2(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms2,WV_EXTR_SETTLE_TERMS_2_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSettleTerms2 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSettleTerms2(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSettleTerms2+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrEarlyLate
	 *	@return wvExtrEarlyLate
	 */
   public char[] getWvExtrEarlyLate() throws CFException{
     if (isWvExtrEarlyLateModified()) { 
        wvExtrEarlyLate = refreshWvExtrEarlyLate();
     }
   		return wvExtrEarlyLate;
   }

  
	/**
	*  set variable wvExtrEarlyLate
	*  Corresponding COBOL Variable is WV-EXTR-EARLY-LATE
	*  @param value
	**/
   public void setWvExtrEarlyLate(char[] value) {
      wvExtrEarlyLate = checkWvExtrEarlyLateConstraints(value);
      serializeWvExtrEarlyLate(wvExtrEarlyLate);
   } 

     /**
	 * 	Update WvExtrEarlyLate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrEarlyLate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrEarlyLate,wvExtrEarlyLate.length);
   	
   }
   
   public void setWvExtrEarlyLate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrEarlyLate,wvExtrEarlyLate.length);
   	
   }
   
     /**
	 * 	Update WvExtrEarlyLate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrEarlyLate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrEarlyLate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrEarlyLate with another Field
	 *	@param value
	 */
   public void setWvExtrEarlyLate(Field source) {
       replace(source,0,source.length(),beginWvExtrEarlyLate,WV_EXTR_EARLY_LATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrEarlyLate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrEarlyLate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrEarlyLate,WV_EXTR_EARLY_LATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrEarlyLate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrEarlyLate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrEarlyLate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrInvoiced
	 *	@return wvExtrInvoiced
	 */
   public char[] getWvExtrInvoiced() throws CFException{
     if (isWvExtrInvoicedModified()) { 
        wvExtrInvoiced = refreshWvExtrInvoiced();
     }
   		return wvExtrInvoiced;
   }

  
	/**
	*  set variable wvExtrInvoiced
	*  Corresponding COBOL Variable is WV-EXTR-INVOICED
	*  @param value
	**/
   public void setWvExtrInvoiced(char[] value) {
      wvExtrInvoiced = checkWvExtrInvoicedConstraints(value);
      serializeWvExtrInvoiced(wvExtrInvoiced);
   } 

     /**
	 * 	Update WvExtrInvoiced 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrInvoiced(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrInvoiced,wvExtrInvoiced.length);
   	
   }
   
   public void setWvExtrInvoiced(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiced,wvExtrInvoiced.length);
   	
   }
   
     /**
	 * 	Update WvExtrInvoiced 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrInvoiced(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiced+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrInvoiced with another Field
	 *	@param value
	 */
   public void setWvExtrInvoiced(Field source) {
       replace(source,0,source.length(),beginWvExtrInvoiced,WV_EXTR_INVOICED_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrInvoiced 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrInvoiced(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrInvoiced,WV_EXTR_INVOICED_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrInvoiced 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrInvoiced(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiced+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrBuySell
	 *	@return wvExtrBuySell
	 */
   public char[] getWvExtrBuySell() throws CFException{
     if (isWvExtrBuySellModified()) { 
        wvExtrBuySell = refreshWvExtrBuySell();
     }
   		return wvExtrBuySell;
   }

  
	/**
	*  set variable wvExtrBuySell
	*  Corresponding COBOL Variable is WV-EXTR-BUY-SELL
	*  @param value
	**/
   public void setWvExtrBuySell(char[] value) {
      wvExtrBuySell = checkWvExtrBuySellConstraints(value);
      serializeWvExtrBuySell(wvExtrBuySell);
   } 

     /**
	 * 	Update WvExtrBuySell 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrBuySell(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrBuySell,wvExtrBuySell.length);
   	
   }
   
   public void setWvExtrBuySell(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBuySell,wvExtrBuySell.length);
   	
   }
   
     /**
	 * 	Update WvExtrBuySell 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBuySell(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBuySell+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrBuySell with another Field
	 *	@param value
	 */
   public void setWvExtrBuySell(Field source) {
       replace(source,0,source.length(),beginWvExtrBuySell,WV_EXTR_BUY_SELL_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrBuySell 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrBuySell(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrBuySell,WV_EXTR_BUY_SELL_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrBuySell 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrBuySell(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrBuySell+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrGrade
	 *	@return wvExtrGrade
	 */
   public char[] getWvExtrGrade() throws CFException{
     if (isWvExtrGradeModified()) { 
        wvExtrGrade = refreshWvExtrGrade();
     }
   		return wvExtrGrade;
   }

  
	/**
	*  set variable wvExtrGrade
	*  Corresponding COBOL Variable is WV-EXTR-GRADE
	*  @param value
	**/
   public void setWvExtrGrade(char[] value) {
      wvExtrGrade = checkWvExtrGradeConstraints(value);
      serializeWvExtrGrade(wvExtrGrade);
   } 

     /**
	 * 	Update WvExtrGrade 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrGrade(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrGrade,wvExtrGrade.length);
   	
   }
   
   public void setWvExtrGrade(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrGrade,wvExtrGrade.length);
   	
   }
   
     /**
	 * 	Update WvExtrGrade 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrGrade(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrGrade+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrGrade with another Field
	 *	@param value
	 */
   public void setWvExtrGrade(Field source) {
       replace(source,0,source.length(),beginWvExtrGrade,WV_EXTR_GRADE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrGrade 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrGrade(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrGrade,WV_EXTR_GRADE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrGrade 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrGrade(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrGrade+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrTerms
	 *	@return wvExtrTerms
	 */
   public char[] getWvExtrTerms() throws CFException{
     if (isWvExtrTermsModified()) { 
        wvExtrTerms = refreshWvExtrTerms();
     }
   		return wvExtrTerms;
   }

  
	/**
	*  set variable wvExtrTerms
	*  Corresponding COBOL Variable is WV-EXTR-TERMS
	*  @param value
	**/
   public void setWvExtrTerms(char[] value) {
      wvExtrTerms = checkWvExtrTermsConstraints(value);
      serializeWvExtrTerms(wvExtrTerms);
   } 

     /**
	 * 	Update WvExtrTerms 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrTerms(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrTerms,wvExtrTerms.length);
   	
   }
   
   public void setWvExtrTerms(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrTerms,wvExtrTerms.length);
   	
   }
   
     /**
	 * 	Update WvExtrTerms 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrTerms(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrTerms+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrTerms with another Field
	 *	@param value
	 */
   public void setWvExtrTerms(Field source) {
       replace(source,0,source.length(),beginWvExtrTerms,WV_EXTR_TERMS_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrTerms 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrTerms(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrTerms,WV_EXTR_TERMS_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrTerms 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrTerms(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrTerms+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrVessel
	 *	@return wvExtrVessel
	 */
   public char[] getWvExtrVessel() throws CFException{
     if (isWvExtrVesselModified()) { 
        wvExtrVessel = refreshWvExtrVessel();
     }
   		return wvExtrVessel;
   }

  
	/**
	*  set variable wvExtrVessel
	*  Corresponding COBOL Variable is WV-EXTR-VESSEL
	*  @param value
	**/
   public void setWvExtrVessel(char[] value) {
      wvExtrVessel = checkWvExtrVesselConstraints(value);
      serializeWvExtrVessel(wvExtrVessel);
   } 

     /**
	 * 	Update WvExtrVessel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrVessel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrVessel,wvExtrVessel.length);
   	
   }
   
   public void setWvExtrVessel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrVessel,wvExtrVessel.length);
   	
   }
   
     /**
	 * 	Update WvExtrVessel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrVessel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrVessel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrVessel with another Field
	 *	@param value
	 */
   public void setWvExtrVessel(Field source) {
       replace(source,0,source.length(),beginWvExtrVessel,WV_EXTR_VESSEL_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrVessel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrVessel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrVessel,WV_EXTR_VESSEL_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrVessel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrVessel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrVessel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLdgNorDate
	 *	@return wvExtrLdgNorDate
	 */
   public char[] getWvExtrLdgNorDate() throws CFException{
     if (isWvExtrLdgNorDateModified()) { 
        wvExtrLdgNorDate = refreshWvExtrLdgNorDate();
     }
   		return wvExtrLdgNorDate;
   }

  
	/**
	*  set variable wvExtrLdgNorDate
	*  Corresponding COBOL Variable is WV-EXTR-LDG-NOR-DATE
	*  @param value
	**/
   public void setWvExtrLdgNorDate(char[] value) {
      wvExtrLdgNorDate = checkWvExtrLdgNorDateConstraints(value);
      serializeWvExtrLdgNorDate(wvExtrLdgNorDate);
   } 

     /**
	 * 	Update WvExtrLdgNorDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgNorDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgNorDate,wvExtrLdgNorDate.length);
   	
   }
   
   public void setWvExtrLdgNorDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorDate,wvExtrLdgNorDate.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgNorDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgNorDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgNorDate with another Field
	 *	@param value
	 */
   public void setWvExtrLdgNorDate(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgNorDate,WV_EXTR_LDG_NOR_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgNorDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgNorDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorDate,WV_EXTR_LDG_NOR_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgNorDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgNorDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLdgNorTime
	 *	@return wvExtrLdgNorTime
	 */
   public char[] getWvExtrLdgNorTime() throws CFException{
     if (isWvExtrLdgNorTimeModified()) { 
        wvExtrLdgNorTime = refreshWvExtrLdgNorTime();
     }
   		return wvExtrLdgNorTime;
   }

  
	/**
	*  set variable wvExtrLdgNorTime
	*  Corresponding COBOL Variable is WV-EXTR-LDG-NOR-TIME
	*  @param value
	**/
   public void setWvExtrLdgNorTime(char[] value) {
      wvExtrLdgNorTime = checkWvExtrLdgNorTimeConstraints(value);
      serializeWvExtrLdgNorTime(wvExtrLdgNorTime);
   } 

     /**
	 * 	Update WvExtrLdgNorTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgNorTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLdgNorTime,wvExtrLdgNorTime.length);
   	
   }
   
   public void setWvExtrLdgNorTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorTime,wvExtrLdgNorTime.length);
   	
   }
   
     /**
	 * 	Update WvExtrLdgNorTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgNorTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLdgNorTime with another Field
	 *	@param value
	 */
   public void setWvExtrLdgNorTime(Field source) {
       replace(source,0,source.length(),beginWvExtrLdgNorTime,WV_EXTR_LDG_NOR_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLdgNorTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLdgNorTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorTime,WV_EXTR_LDG_NOR_TIME_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLdgNorTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgNorTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLdgNorTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrDchNorDate
	 *	@return wvExtrDchNorDate
	 */
   public char[] getWvExtrDchNorDate() throws CFException{
     if (isWvExtrDchNorDateModified()) { 
        wvExtrDchNorDate = refreshWvExtrDchNorDate();
     }
   		return wvExtrDchNorDate;
   }

  
	/**
	*  set variable wvExtrDchNorDate
	*  Corresponding COBOL Variable is WV-EXTR-DCH-NOR-DATE
	*  @param value
	**/
   public void setWvExtrDchNorDate(char[] value) {
      wvExtrDchNorDate = checkWvExtrDchNorDateConstraints(value);
      serializeWvExtrDchNorDate(wvExtrDchNorDate);
   } 

     /**
	 * 	Update WvExtrDchNorDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchNorDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchNorDate,wvExtrDchNorDate.length);
   	
   }
   
   public void setWvExtrDchNorDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchNorDate,wvExtrDchNorDate.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchNorDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchNorDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchNorDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchNorDate with another Field
	 *	@param value
	 */
   public void setWvExtrDchNorDate(Field source) {
       replace(source,0,source.length(),beginWvExtrDchNorDate,WV_EXTR_DCH_NOR_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchNorDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchNorDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchNorDate,WV_EXTR_DCH_NOR_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchNorDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchNorDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchNorDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrDchNorTime
	 *	@return wvExtrDchNorTime
	 */
   public char[] getWvExtrDchNorTime() throws CFException{
     if (isWvExtrDchNorTimeModified()) { 
        wvExtrDchNorTime = refreshWvExtrDchNorTime();
     }
   		return wvExtrDchNorTime;
   }

  
	/**
	*  set variable wvExtrDchNorTime
	*  Corresponding COBOL Variable is WV-EXTR-DCH-NOR-TIME
	*  @param value
	**/
   public void setWvExtrDchNorTime(char[] value) {
      wvExtrDchNorTime = checkWvExtrDchNorTimeConstraints(value);
      serializeWvExtrDchNorTime(wvExtrDchNorTime);
   } 

     /**
	 * 	Update WvExtrDchNorTime 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchNorTime(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDchNorTime,wvExtrDchNorTime.length);
   	
   }
   
   public void setWvExtrDchNorTime(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchNorTime,wvExtrDchNorTime.length);
   	
   }
   
     /**
	 * 	Update WvExtrDchNorTime 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchNorTime(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchNorTime+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDchNorTime with another Field
	 *	@param value
	 */
   public void setWvExtrDchNorTime(Field source) {
       replace(source,0,source.length(),beginWvExtrDchNorTime,WV_EXTR_DCH_NOR_TIME_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDchNorTime 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDchNorTime(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDchNorTime,WV_EXTR_DCH_NOR_TIME_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDchNorTime 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchNorTime(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDchNorTime+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSapDocCode
	 *	@return wvExtrSapDocCode
	 */
   public char[] getWvExtrSapDocCode() throws CFException{
     if (isWvExtrSapDocCodeModified()) { 
        wvExtrSapDocCode = refreshWvExtrSapDocCode();
     }
   		return wvExtrSapDocCode;
   }

  
	/**
	*  set variable wvExtrSapDocCode
	*  Corresponding COBOL Variable is WV-EXTR-SAP-DOC-CODE
	*  @param value
	**/
   public void setWvExtrSapDocCode(char[] value) {
      wvExtrSapDocCode = checkWvExtrSapDocCodeConstraints(value);
      serializeWvExtrSapDocCode(wvExtrSapDocCode);
   } 

     /**
	 * 	Update WvExtrSapDocCode 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSapDocCode(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSapDocCode,wvExtrSapDocCode.length);
   	
   }
   
   public void setWvExtrSapDocCode(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSapDocCode,wvExtrSapDocCode.length);
   	
   }
   
     /**
	 * 	Update WvExtrSapDocCode 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSapDocCode(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSapDocCode+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSapDocCode with another Field
	 *	@param value
	 */
   public void setWvExtrSapDocCode(Field source) {
       replace(source,0,source.length(),beginWvExtrSapDocCode,WV_EXTR_SAP_DOC_CODE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSapDocCode 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSapDocCode(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSapDocCode,WV_EXTR_SAP_DOC_CODE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSapDocCode 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSapDocCode(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSapDocCode+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSetlCurr
	 *	@return wvExtrSetlCurr
	 */
   public char[] getWvExtrSetlCurr() throws CFException{
     if (isWvExtrSetlCurrModified()) { 
        wvExtrSetlCurr = refreshWvExtrSetlCurr();
     }
   		return wvExtrSetlCurr;
   }

  
	/**
	*  set variable wvExtrSetlCurr
	*  Corresponding COBOL Variable is WV-EXTR-SETL-CURR
	*  @param value
	**/
   public void setWvExtrSetlCurr(char[] value) {
      wvExtrSetlCurr = checkWvExtrSetlCurrConstraints(value);
      serializeWvExtrSetlCurr(wvExtrSetlCurr);
   } 

     /**
	 * 	Update WvExtrSetlCurr 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSetlCurr(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSetlCurr,wvExtrSetlCurr.length);
   	
   }
   
   public void setWvExtrSetlCurr(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSetlCurr,wvExtrSetlCurr.length);
   	
   }
   
     /**
	 * 	Update WvExtrSetlCurr 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSetlCurr(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSetlCurr+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSetlCurr with another Field
	 *	@param value
	 */
   public void setWvExtrSetlCurr(Field source) {
       replace(source,0,source.length(),beginWvExtrSetlCurr,WV_EXTR_SETL_CURR_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSetlCurr 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSetlCurr(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSetlCurr,WV_EXTR_SETL_CURR_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSetlCurr 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSetlCurr(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSetlCurr+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLcStatus
	 *	@return wvExtrLcStatus
	 */
   public char[] getWvExtrLcStatus() throws CFException{
     if (isWvExtrLcStatusModified()) { 
        wvExtrLcStatus = refreshWvExtrLcStatus();
     }
   		return wvExtrLcStatus;
   }

  
	/**
	*  set variable wvExtrLcStatus
	*  Corresponding COBOL Variable is WV-EXTR-LC-STATUS
	*  @param value
	**/
   public void setWvExtrLcStatus(char[] value) {
      wvExtrLcStatus = checkWvExtrLcStatusConstraints(value);
      serializeWvExtrLcStatus(wvExtrLcStatus);
   } 

     /**
	 * 	Update WvExtrLcStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLcStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLcStatus,wvExtrLcStatus.length);
   	
   }
   
   public void setWvExtrLcStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLcStatus,wvExtrLcStatus.length);
   	
   }
   
     /**
	 * 	Update WvExtrLcStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLcStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLcStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLcStatus with another Field
	 *	@param value
	 */
   public void setWvExtrLcStatus(Field source) {
       replace(source,0,source.length(),beginWvExtrLcStatus,WV_EXTR_LC_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLcStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLcStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLcStatus,WV_EXTR_LC_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLcStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLcStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLcStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSancStatus
	 *	@return wvExtrSancStatus
	 */
   public char[] getWvExtrSancStatus() throws CFException{
     if (isWvExtrSancStatusModified()) { 
        wvExtrSancStatus = refreshWvExtrSancStatus();
     }
   		return wvExtrSancStatus;
   }

  
	/**
	*  set variable wvExtrSancStatus
	*  Corresponding COBOL Variable is WV-EXTR-SANC-STATUS
	*  @param value
	**/
   public void setWvExtrSancStatus(char[] value) {
      wvExtrSancStatus = checkWvExtrSancStatusConstraints(value);
      serializeWvExtrSancStatus(wvExtrSancStatus);
   } 

     /**
	 * 	Update WvExtrSancStatus 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSancStatus(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSancStatus,wvExtrSancStatus.length);
   	
   }
   
   public void setWvExtrSancStatus(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSancStatus,wvExtrSancStatus.length);
   	
   }
   
     /**
	 * 	Update WvExtrSancStatus 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSancStatus(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSancStatus+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSancStatus with another Field
	 *	@param value
	 */
   public void setWvExtrSancStatus(Field source) {
       replace(source,0,source.length(),beginWvExtrSancStatus,WV_EXTR_SANC_STATUS_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSancStatus 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSancStatus(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSancStatus,WV_EXTR_SANC_STATUS_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSancStatus 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSancStatus(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSancStatus+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrCalcWork
	 *	@return wvExtrCalcWork
	 */
   public char[] getWvExtrCalcWork() throws CFException{
     if (isWvExtrCalcWorkModified()) { 
        wvExtrCalcWork = refreshWvExtrCalcWork();
     }
   		return wvExtrCalcWork;
   }

  
	/**
	*  set variable wvExtrCalcWork
	*  Corresponding COBOL Variable is WV-EXTR-CALC-WORK
	*  @param value
	**/
   public void setWvExtrCalcWork(char[] value) {
      wvExtrCalcWork = checkWvExtrCalcWorkConstraints(value);
      serializeWvExtrCalcWork(wvExtrCalcWork);
   } 

     /**
	 * 	Update WvExtrCalcWork 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrCalcWork(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrCalcWork,wvExtrCalcWork.length);
   	
   }
   
   public void setWvExtrCalcWork(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrCalcWork,wvExtrCalcWork.length);
   	
   }
   
     /**
	 * 	Update WvExtrCalcWork 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrCalcWork(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrCalcWork+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrCalcWork with another Field
	 *	@param value
	 */
   public void setWvExtrCalcWork(Field source) {
       replace(source,0,source.length(),beginWvExtrCalcWork,WV_EXTR_CALC_WORK_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrCalcWork 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrCalcWork(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrCalcWork,WV_EXTR_CALC_WORK_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrCalcWork 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrCalcWork(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrCalcWork+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrRefDensityX
	 *	@return wvExtrRefDensityX
	 */   
	 public WvExtrRefDensityX getWvExtrRefDensityX() {
   	return wvExtrRefDensityX;
   }
   /**
	* 	Update WvExtrRefDensityX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-REF-DENSITY-X
	*	@param value
	*/
   public void setWvExtrRefDensityX(char[] value) {
      wvExtrRefDensityX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrRefDensityX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrRefDensityX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrRefDensityX.begin,wvExtrRefDensityX.length());
   }
   
     /**
	 * 	Update WvExtrRefDensityX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrRefDensityX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrRefDensityX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrRefDensityX with another Field
	 *	@param value
	 */
   public void setWvExtrRefDensityX(Field source) {
   	replace(source,0,source.length(),wvExtrRefDensityX.begin,wvExtrRefDensityX.length());
   }  
   
     /**
	 * 	Update WvExtrRefDensityX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrRefDensityX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrRefDensityX.begin,wvExtrRefDensityX.length());
   }
   
     /**
	 * 	Update WvExtrRefDensityX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrRefDensityX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrRefDensityX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrActDensityX
	 *	@return wvExtrActDensityX
	 */   
	 public WvExtrActDensityX getWvExtrActDensityX() {
   	return wvExtrActDensityX;
   }
   /**
	* 	Update WvExtrActDensityX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-ACT-DENSITY-X
	*	@param value
	*/
   public void setWvExtrActDensityX(char[] value) {
      wvExtrActDensityX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrActDensityX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrActDensityX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrActDensityX.begin,wvExtrActDensityX.length());
   }
   
     /**
	 * 	Update WvExtrActDensityX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrActDensityX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrActDensityX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrActDensityX with another Field
	 *	@param value
	 */
   public void setWvExtrActDensityX(Field source) {
   	replace(source,0,source.length(),wvExtrActDensityX.begin,wvExtrActDensityX.length());
   }  
   
     /**
	 * 	Update WvExtrActDensityX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrActDensityX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrActDensityX.begin,wvExtrActDensityX.length());
   }
   
     /**
	 * 	Update WvExtrActDensityX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrActDensityX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrActDensityX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrStiFlag
	 *	@return wvExtrStiFlag
	 */
   public char[] getWvExtrStiFlag() throws CFException{
     if (isWvExtrStiFlagModified()) { 
        wvExtrStiFlag = refreshWvExtrStiFlag();
     }
   		return wvExtrStiFlag;
   }

  
	/**
	*  set variable wvExtrStiFlag
	*  Corresponding COBOL Variable is WV-EXTR-STI-FLAG
	*  @param value
	**/
   public void setWvExtrStiFlag(char[] value) {
      wvExtrStiFlag = checkWvExtrStiFlagConstraints(value);
      serializeWvExtrStiFlag(wvExtrStiFlag);
   } 

     /**
	 * 	Update WvExtrStiFlag 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrStiFlag(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrStiFlag,wvExtrStiFlag.length);
   	
   }
   
   public void setWvExtrStiFlag(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrStiFlag,wvExtrStiFlag.length);
   	
   }
   
     /**
	 * 	Update WvExtrStiFlag 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrStiFlag(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrStiFlag+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrStiFlag with another Field
	 *	@param value
	 */
   public void setWvExtrStiFlag(Field source) {
       replace(source,0,source.length(),beginWvExtrStiFlag,WV_EXTR_STI_FLAG_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrStiFlag 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrStiFlag(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrStiFlag,WV_EXTR_STI_FLAG_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrStiFlag 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrStiFlag(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrStiFlag+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrMethod
	 *	@return wvExtrMethod
	 */
   public char[] getWvExtrMethod() throws CFException{
     if (isWvExtrMethodModified()) { 
        wvExtrMethod = refreshWvExtrMethod();
     }
   		return wvExtrMethod;
   }

  
	/**
	*  set variable wvExtrMethod
	*  Corresponding COBOL Variable is WV-EXTR-METHOD
	*  @param value
	**/
   public void setWvExtrMethod(char[] value) {
      wvExtrMethod = checkWvExtrMethodConstraints(value);
      serializeWvExtrMethod(wvExtrMethod);
   } 

     /**
	 * 	Update WvExtrMethod 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrMethod(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrMethod,wvExtrMethod.length);
   	
   }
   
   public void setWvExtrMethod(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrMethod,wvExtrMethod.length);
   	
   }
   
     /**
	 * 	Update WvExtrMethod 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrMethod(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrMethod+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrMethod with another Field
	 *	@param value
	 */
   public void setWvExtrMethod(Field source) {
       replace(source,0,source.length(),beginWvExtrMethod,WV_EXTR_METHOD_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrMethod 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrMethod(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrMethod,WV_EXTR_METHOD_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrMethod 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrMethod(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrMethod+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrPrclNote
	 *	@return wvExtrPrclNote
	 */
   public char[] getWvExtrPrclNote() throws CFException{
     if (isWvExtrPrclNoteModified()) { 
        wvExtrPrclNote = refreshWvExtrPrclNote();
     }
   		return wvExtrPrclNote;
   }

  
	/**
	*  set variable wvExtrPrclNote
	*  Corresponding COBOL Variable is WV-EXTR-PRCL-NOTE
	*  @param value
	**/
   public void setWvExtrPrclNote(char[] value) {
      wvExtrPrclNote = checkWvExtrPrclNoteConstraints(value);
      serializeWvExtrPrclNote(wvExtrPrclNote);
   } 

     /**
	 * 	Update WvExtrPrclNote 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrPrclNote(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrPrclNote,wvExtrPrclNote.length);
   	
   }
   
   public void setWvExtrPrclNote(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrPrclNote,wvExtrPrclNote.length);
   	
   }
   
     /**
	 * 	Update WvExtrPrclNote 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrPrclNote(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrPrclNote+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrPrclNote with another Field
	 *	@param value
	 */
   public void setWvExtrPrclNote(Field source) {
       replace(source,0,source.length(),beginWvExtrPrclNote,WV_EXTR_PRCL_NOTE_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrPrclNote 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrPrclNote(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrPrclNote,WV_EXTR_PRCL_NOTE_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrPrclNote 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrPrclNote(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrPrclNote+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSendToGsap
	 *	@return wvExtrSendToGsap
	 */
   public char[] getWvExtrSendToGsap() throws CFException{
     if (isWvExtrSendToGsapModified()) { 
        wvExtrSendToGsap = refreshWvExtrSendToGsap();
     }
   		return wvExtrSendToGsap;
   }

  
	/**
	*  set variable wvExtrSendToGsap
	*  Corresponding COBOL Variable is WV-EXTR-SEND-TO-GSAP
	*  @param value
	**/
   public void setWvExtrSendToGsap(char[] value) {
      wvExtrSendToGsap = checkWvExtrSendToGsapConstraints(value);
      serializeWvExtrSendToGsap(wvExtrSendToGsap);
   } 

     /**
	 * 	Update WvExtrSendToGsap 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSendToGsap(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSendToGsap,wvExtrSendToGsap.length);
   	
   }
   
   public void setWvExtrSendToGsap(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSendToGsap,wvExtrSendToGsap.length);
   	
   }
   
     /**
	 * 	Update WvExtrSendToGsap 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSendToGsap(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSendToGsap+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSendToGsap with another Field
	 *	@param value
	 */
   public void setWvExtrSendToGsap(Field source) {
       replace(source,0,source.length(),beginWvExtrSendToGsap,WV_EXTR_SEND_TO_GSAP_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSendToGsap 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSendToGsap(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSendToGsap,WV_EXTR_SEND_TO_GSAP_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSendToGsap 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSendToGsap(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSendToGsap+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLinkedFrom
	 *	@return wvExtrLinkedFrom
	 */
   public char[] getWvExtrLinkedFrom() throws CFException{
     if (isWvExtrLinkedFromModified()) { 
        wvExtrLinkedFrom = refreshWvExtrLinkedFrom();
     }
   		return wvExtrLinkedFrom;
   }

  
	/**
	*  set variable wvExtrLinkedFrom
	*  Corresponding COBOL Variable is WV-EXTR-LINKED-FROM
	*  @param value
	**/
   public void setWvExtrLinkedFrom(char[] value) {
      wvExtrLinkedFrom = checkWvExtrLinkedFromConstraints(value);
      serializeWvExtrLinkedFrom(wvExtrLinkedFrom);
   } 

     /**
	 * 	Update WvExtrLinkedFrom 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLinkedFrom(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLinkedFrom,wvExtrLinkedFrom.length);
   	
   }
   
   public void setWvExtrLinkedFrom(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLinkedFrom,wvExtrLinkedFrom.length);
   	
   }
   
     /**
	 * 	Update WvExtrLinkedFrom 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLinkedFrom(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLinkedFrom+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLinkedFrom with another Field
	 *	@param value
	 */
   public void setWvExtrLinkedFrom(Field source) {
       replace(source,0,source.length(),beginWvExtrLinkedFrom,WV_EXTR_LINKED_FROM_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLinkedFrom 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLinkedFrom(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLinkedFrom,WV_EXTR_LINKED_FROM_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLinkedFrom 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLinkedFrom(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLinkedFrom+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrSecToShell
	 *	@return wvExtrSecToShell
	 */
   public char[] getWvExtrSecToShell() throws CFException{
     if (isWvExtrSecToShellModified()) { 
        wvExtrSecToShell = refreshWvExtrSecToShell();
     }
   		return wvExtrSecToShell;
   }

  
	/**
	*  set variable wvExtrSecToShell
	*  Corresponding COBOL Variable is WV-EXTR-SEC-TO-SHELL
	*  @param value
	**/
   public void setWvExtrSecToShell(char[] value) {
      wvExtrSecToShell = checkWvExtrSecToShellConstraints(value);
      serializeWvExtrSecToShell(wvExtrSecToShell);
   } 

     /**
	 * 	Update WvExtrSecToShell 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrSecToShell(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrSecToShell,wvExtrSecToShell.length);
   	
   }
   
   public void setWvExtrSecToShell(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSecToShell,wvExtrSecToShell.length);
   	
   }
   
     /**
	 * 	Update WvExtrSecToShell 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSecToShell(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSecToShell+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrSecToShell with another Field
	 *	@param value
	 */
   public void setWvExtrSecToShell(Field source) {
       replace(source,0,source.length(),beginWvExtrSecToShell,WV_EXTR_SEC_TO_SHELL_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrSecToShell 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrSecToShell(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrSecToShell,WV_EXTR_SEC_TO_SHELL_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrSecToShell 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrSecToShell(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrSecToShell+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrInvoiceQty
	 *	@return wvExtrInvoiceQty
	 */
   public char[] getWvExtrInvoiceQty() throws CFException{
     if (isWvExtrInvoiceQtyModified()) { 
        wvExtrInvoiceQty = refreshWvExtrInvoiceQty();
     }
   		return wvExtrInvoiceQty;
   }

  
	/**
	*  set variable wvExtrInvoiceQty
	*  Corresponding COBOL Variable is WV-EXTR-INVOICE-QTY
	*  @param value
	**/
   public void setWvExtrInvoiceQty(char[] value) {
      wvExtrInvoiceQty = checkWvExtrInvoiceQtyConstraints(value);
      serializeWvExtrInvoiceQty(wvExtrInvoiceQty);
   } 

     /**
	 * 	Update WvExtrInvoiceQty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrInvoiceQty(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrInvoiceQty,wvExtrInvoiceQty.length);
   	
   }
   
   public void setWvExtrInvoiceQty(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceQty,wvExtrInvoiceQty.length);
   	
   }
   
     /**
	 * 	Update WvExtrInvoiceQty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrInvoiceQty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceQty+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrInvoiceQty with another Field
	 *	@param value
	 */
   public void setWvExtrInvoiceQty(Field source) {
       replace(source,0,source.length(),beginWvExtrInvoiceQty,WV_EXTR_INVOICE_QTY_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrInvoiceQty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrInvoiceQty(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceQty,WV_EXTR_INVOICE_QTY_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrInvoiceQty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrInvoiceQty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceQty+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrInvoiceUnit
	 *	@return wvExtrInvoiceUnit
	 */
   public char[] getWvExtrInvoiceUnit() throws CFException{
     if (isWvExtrInvoiceUnitModified()) { 
        wvExtrInvoiceUnit = refreshWvExtrInvoiceUnit();
     }
   		return wvExtrInvoiceUnit;
   }

  
	/**
	*  set variable wvExtrInvoiceUnit
	*  Corresponding COBOL Variable is WV-EXTR-INVOICE-UNIT
	*  @param value
	**/
   public void setWvExtrInvoiceUnit(char[] value) {
      wvExtrInvoiceUnit = checkWvExtrInvoiceUnitConstraints(value);
      serializeWvExtrInvoiceUnit(wvExtrInvoiceUnit);
   } 

     /**
	 * 	Update WvExtrInvoiceUnit 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrInvoiceUnit(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrInvoiceUnit,wvExtrInvoiceUnit.length);
   	
   }
   
   public void setWvExtrInvoiceUnit(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceUnit,wvExtrInvoiceUnit.length);
   	
   }
   
     /**
	 * 	Update WvExtrInvoiceUnit 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrInvoiceUnit(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceUnit+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrInvoiceUnit with another Field
	 *	@param value
	 */
   public void setWvExtrInvoiceUnit(Field source) {
       replace(source,0,source.length(),beginWvExtrInvoiceUnit,WV_EXTR_INVOICE_UNIT_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrInvoiceUnit 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrInvoiceUnit(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceUnit,WV_EXTR_INVOICE_UNIT_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrInvoiceUnit 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrInvoiceUnit(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrInvoiceUnit+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLloydsNum
	 *	@return wvExtrLloydsNum
	 */
   public char[] getWvExtrLloydsNum() throws CFException{
     if (isWvExtrLloydsNumModified()) { 
        wvExtrLloydsNum = refreshWvExtrLloydsNum();
     }
   		return wvExtrLloydsNum;
   }

  
	/**
	*  set variable wvExtrLloydsNum
	*  Corresponding COBOL Variable is WV-EXTR-LLOYDS-NUM
	*  @param value
	**/
   public void setWvExtrLloydsNum(char[] value) {
      wvExtrLloydsNum = checkWvExtrLloydsNumConstraints(value);
      serializeWvExtrLloydsNum(wvExtrLloydsNum);
   } 

     /**
	 * 	Update WvExtrLloydsNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLloydsNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLloydsNum,wvExtrLloydsNum.length);
   	
   }
   
   public void setWvExtrLloydsNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLloydsNum,wvExtrLloydsNum.length);
   	
   }
   
     /**
	 * 	Update WvExtrLloydsNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLloydsNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLloydsNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLloydsNum with another Field
	 *	@param value
	 */
   public void setWvExtrLloydsNum(Field source) {
       replace(source,0,source.length(),beginWvExtrLloydsNum,WV_EXTR_LLOYDS_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLloydsNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLloydsNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLloydsNum,WV_EXTR_LLOYDS_NUM_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLloydsNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLloydsNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLloydsNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLdgUsgX
	 *	@return wvExtrLdgUsgX
	 */   
	 public WvExtrLdgUsgX getWvExtrLdgUsgX() {
   	return wvExtrLdgUsgX;
   }
   /**
	* 	Update WvExtrLdgUsgX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-USG-X
	*	@param value
	*/
   public void setWvExtrLdgUsgX(char[] value) {
      wvExtrLdgUsgX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgUsgX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgUsgX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgUsgX.begin,wvExtrLdgUsgX.length());
   }
   
     /**
	 * 	Update WvExtrLdgUsgX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgUsgX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgUsgX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgUsgX with another Field
	 *	@param value
	 */
   public void setWvExtrLdgUsgX(Field source) {
   	replace(source,0,source.length(),wvExtrLdgUsgX.begin,wvExtrLdgUsgX.length());
   }  
   
     /**
	 * 	Update WvExtrLdgUsgX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgUsgX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgUsgX.begin,wvExtrLdgUsgX.length());
   }
   
     /**
	 * 	Update WvExtrLdgUsgX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgUsgX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgUsgX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrLdgM315X
	 *	@return wvExtrLdgM315X
	 */   
	 public WvExtrLdgM315X getWvExtrLdgM315X() {
   	return wvExtrLdgM315X;
   }
   /**
	* 	Update WvExtrLdgM315X with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-M3-15-X
	*	@param value
	*/
   public void setWvExtrLdgM315X(char[] value) {
      wvExtrLdgM315X.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgM315X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM315X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM315X.begin,wvExtrLdgM315X.length());
   }
   
     /**
	 * 	Update WvExtrLdgM315X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM315X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM315X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgM315X with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM315X(Field source) {
   	replace(source,0,source.length(),wvExtrLdgM315X.begin,wvExtrLdgM315X.length());
   }  
   
     /**
	 * 	Update WvExtrLdgM315X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM315X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM315X.begin,wvExtrLdgM315X.length());
   }
   
     /**
	 * 	Update WvExtrLdgM315X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM315X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM315X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrLdgM320X
	 *	@return wvExtrLdgM320X
	 */   
	 public WvExtrLdgM320X getWvExtrLdgM320X() {
   	return wvExtrLdgM320X;
   }
   /**
	* 	Update WvExtrLdgM320X with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-M3-20-X
	*	@param value
	*/
   public void setWvExtrLdgM320X(char[] value) {
      wvExtrLdgM320X.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgM320X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM320X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM320X.begin,wvExtrLdgM320X.length());
   }
   
     /**
	 * 	Update WvExtrLdgM320X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM320X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM320X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgM320X with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM320X(Field source) {
   	replace(source,0,source.length(),wvExtrLdgM320X.begin,wvExtrLdgM320X.length());
   }  
   
     /**
	 * 	Update WvExtrLdgM320X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM320X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM320X.begin,wvExtrLdgM320X.length());
   }
   
     /**
	 * 	Update WvExtrLdgM320X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM320X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM320X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrLdgM330X
	 *	@return wvExtrLdgM330X
	 */   
	 public WvExtrLdgM330X getWvExtrLdgM330X() {
   	return wvExtrLdgM330X;
   }
   /**
	* 	Update WvExtrLdgM330X with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-M3-30-X
	*	@param value
	*/
   public void setWvExtrLdgM330X(char[] value) {
      wvExtrLdgM330X.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgM330X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM330X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM330X.begin,wvExtrLdgM330X.length());
   }
   
     /**
	 * 	Update WvExtrLdgM330X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM330X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM330X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgM330X with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM330X(Field source) {
   	replace(source,0,source.length(),wvExtrLdgM330X.begin,wvExtrLdgM330X.length());
   }  
   
     /**
	 * 	Update WvExtrLdgM330X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM330X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM330X.begin,wvExtrLdgM330X.length());
   }
   
     /**
	 * 	Update WvExtrLdgM330X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM330X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM330X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrLdgM3AmbX
	 *	@return wvExtrLdgM3AmbX
	 */   
	 public WvExtrLdgM3AmbX getWvExtrLdgM3AmbX() {
   	return wvExtrLdgM3AmbX;
   }
   /**
	* 	Update WvExtrLdgM3AmbX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-LDG-M3-AMB-X
	*	@param value
	*/
   public void setWvExtrLdgM3AmbX(char[] value) {
      wvExtrLdgM3AmbX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrLdgM3AmbX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM3AmbX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM3AmbX.begin,wvExtrLdgM3AmbX.length());
   }
   
     /**
	 * 	Update WvExtrLdgM3AmbX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM3AmbX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM3AmbX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrLdgM3AmbX with another Field
	 *	@param value
	 */
   public void setWvExtrLdgM3AmbX(Field source) {
   	replace(source,0,source.length(),wvExtrLdgM3AmbX.begin,wvExtrLdgM3AmbX.length());
   }  
   
     /**
	 * 	Update WvExtrLdgM3AmbX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLdgM3AmbX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM3AmbX.begin,wvExtrLdgM3AmbX.length());
   }
   
     /**
	 * 	Update WvExtrLdgM3AmbX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLdgM3AmbX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrLdgM3AmbX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchUsgX
	 *	@return wvExtrDchUsgX
	 */   
	 public WvExtrDchUsgX getWvExtrDchUsgX() {
   	return wvExtrDchUsgX;
   }
   /**
	* 	Update WvExtrDchUsgX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-USG-X
	*	@param value
	*/
   public void setWvExtrDchUsgX(char[] value) {
      wvExtrDchUsgX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchUsgX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchUsgX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchUsgX.begin,wvExtrDchUsgX.length());
   }
   
     /**
	 * 	Update WvExtrDchUsgX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchUsgX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchUsgX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchUsgX with another Field
	 *	@param value
	 */
   public void setWvExtrDchUsgX(Field source) {
   	replace(source,0,source.length(),wvExtrDchUsgX.begin,wvExtrDchUsgX.length());
   }  
   
     /**
	 * 	Update WvExtrDchUsgX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchUsgX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchUsgX.begin,wvExtrDchUsgX.length());
   }
   
     /**
	 * 	Update WvExtrDchUsgX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchUsgX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchUsgX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchM315X
	 *	@return wvExtrDchM315X
	 */   
	 public WvExtrDchM315X getWvExtrDchM315X() {
   	return wvExtrDchM315X;
   }
   /**
	* 	Update WvExtrDchM315X with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-M3-15-X
	*	@param value
	*/
   public void setWvExtrDchM315X(char[] value) {
      wvExtrDchM315X.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchM315X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM315X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM315X.begin,wvExtrDchM315X.length());
   }
   
     /**
	 * 	Update WvExtrDchM315X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM315X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM315X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchM315X with another Field
	 *	@param value
	 */
   public void setWvExtrDchM315X(Field source) {
   	replace(source,0,source.length(),wvExtrDchM315X.begin,wvExtrDchM315X.length());
   }  
   
     /**
	 * 	Update WvExtrDchM315X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM315X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM315X.begin,wvExtrDchM315X.length());
   }
   
     /**
	 * 	Update WvExtrDchM315X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM315X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM315X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchM320X
	 *	@return wvExtrDchM320X
	 */   
	 public WvExtrDchM320X getWvExtrDchM320X() {
   	return wvExtrDchM320X;
   }
   /**
	* 	Update WvExtrDchM320X with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-M3-20-X
	*	@param value
	*/
   public void setWvExtrDchM320X(char[] value) {
      wvExtrDchM320X.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchM320X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM320X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM320X.begin,wvExtrDchM320X.length());
   }
   
     /**
	 * 	Update WvExtrDchM320X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM320X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM320X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchM320X with another Field
	 *	@param value
	 */
   public void setWvExtrDchM320X(Field source) {
   	replace(source,0,source.length(),wvExtrDchM320X.begin,wvExtrDchM320X.length());
   }  
   
     /**
	 * 	Update WvExtrDchM320X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM320X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM320X.begin,wvExtrDchM320X.length());
   }
   
     /**
	 * 	Update WvExtrDchM320X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM320X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM320X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchM330X
	 *	@return wvExtrDchM330X
	 */   
	 public WvExtrDchM330X getWvExtrDchM330X() {
   	return wvExtrDchM330X;
   }
   /**
	* 	Update WvExtrDchM330X with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-M3-30-X
	*	@param value
	*/
   public void setWvExtrDchM330X(char[] value) {
      wvExtrDchM330X.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchM330X 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM330X(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM330X.begin,wvExtrDchM330X.length());
   }
   
     /**
	 * 	Update WvExtrDchM330X 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM330X(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM330X.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchM330X with another Field
	 *	@param value
	 */
   public void setWvExtrDchM330X(Field source) {
   	replace(source,0,source.length(),wvExtrDchM330X.begin,wvExtrDchM330X.length());
   }  
   
     /**
	 * 	Update WvExtrDchM330X 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM330X(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM330X.begin,wvExtrDchM330X.length());
   }
   
     /**
	 * 	Update WvExtrDchM330X 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM330X(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM330X.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrDchM3AmbX
	 *	@return wvExtrDchM3AmbX
	 */   
	 public WvExtrDchM3AmbX getWvExtrDchM3AmbX() {
   	return wvExtrDchM3AmbX;
   }
   /**
	* 	Update WvExtrDchM3AmbX with the passed value
	*   Corresponding COBOL Variable is WV-EXTR-DCH-M3-AMB-X
	*	@param value
	*/
   public void setWvExtrDchM3AmbX(char[] value) {
      wvExtrDchM3AmbX.setString(value); 
   }   
    
     /**
	 * 	Update WvExtrDchM3AmbX 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM3AmbX(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM3AmbX.begin,wvExtrDchM3AmbX.length());
   }
   
     /**
	 * 	Update WvExtrDchM3AmbX 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM3AmbX(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM3AmbX.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update WvExtrDchM3AmbX with another Field
	 *	@param value
	 */
   public void setWvExtrDchM3AmbX(Field source) {
   	replace(source,0,source.length(),wvExtrDchM3AmbX.begin,wvExtrDchM3AmbX.length());
   }  
   
     /**
	 * 	Update WvExtrDchM3AmbX 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDchM3AmbX(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM3AmbX.begin,wvExtrDchM3AmbX.length());
   }
   
     /**
	 * 	Update WvExtrDchM3AmbX 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDchM3AmbX(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,wvExtrDchM3AmbX.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of wvExtrFrmlName
	 *	@return wvExtrFrmlName
	 */
   public char[] getWvExtrFrmlName() throws CFException{
     if (isWvExtrFrmlNameModified()) { 
        wvExtrFrmlName = refreshWvExtrFrmlName();
     }
   		return wvExtrFrmlName;
   }

  
	/**
	*  set variable wvExtrFrmlName
	*  Corresponding COBOL Variable is WV-EXTR-FRML-NAME
	*  @param value
	**/
   public void setWvExtrFrmlName(char[] value) {
      wvExtrFrmlName = checkWvExtrFrmlNameConstraints(value);
      serializeWvExtrFrmlName(wvExtrFrmlName);
   } 

     /**
	 * 	Update WvExtrFrmlName 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrFrmlName(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrFrmlName,wvExtrFrmlName.length);
   	
   }
   
   public void setWvExtrFrmlName(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrFrmlName,wvExtrFrmlName.length);
   	
   }
   
     /**
	 * 	Update WvExtrFrmlName 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrFrmlName(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrFrmlName+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrFrmlName with another Field
	 *	@param value
	 */
   public void setWvExtrFrmlName(Field source) {
       replace(source,0,source.length(),beginWvExtrFrmlName,WV_EXTR_FRML_NAME_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrFrmlName 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrFrmlName(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrFrmlName,WV_EXTR_FRML_NAME_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrFrmlName 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrFrmlName(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrFrmlName+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrFrmlVers
	 *	@return wvExtrFrmlVers
	 */
   public char[] getWvExtrFrmlVers() throws CFException{
     if (isWvExtrFrmlVersModified()) { 
        wvExtrFrmlVers = refreshWvExtrFrmlVers();
     }
   		return wvExtrFrmlVers;
   }

  
	/**
	*  set variable wvExtrFrmlVers
	*  Corresponding COBOL Variable is WV-EXTR-FRML-VERS
	*  @param value
	**/
   public void setWvExtrFrmlVers(char[] value) {
      wvExtrFrmlVers = checkWvExtrFrmlVersConstraints(value);
      serializeWvExtrFrmlVers(wvExtrFrmlVers);
   } 

     /**
	 * 	Update WvExtrFrmlVers 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrFrmlVers(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrFrmlVers,wvExtrFrmlVers.length);
   	
   }
   
   public void setWvExtrFrmlVers(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrFrmlVers,wvExtrFrmlVers.length);
   	
   }
   
     /**
	 * 	Update WvExtrFrmlVers 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrFrmlVers(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrFrmlVers+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrFrmlVers with another Field
	 *	@param value
	 */
   public void setWvExtrFrmlVers(Field source) {
       replace(source,0,source.length(),beginWvExtrFrmlVers,WV_EXTR_FRML_VERS_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrFrmlVers 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrFrmlVers(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrFrmlVers,WV_EXTR_FRML_VERS_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrFrmlVers 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrFrmlVers(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrFrmlVers+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrLoadPort
	 *	@return wvExtrLoadPort
	 */
   public char[] getWvExtrLoadPort() throws CFException{
     if (isWvExtrLoadPortModified()) { 
        wvExtrLoadPort = refreshWvExtrLoadPort();
     }
   		return wvExtrLoadPort;
   }

  
	/**
	*  set variable wvExtrLoadPort
	*  Corresponding COBOL Variable is WV-EXTR-LOAD-PORT
	*  @param value
	**/
   public void setWvExtrLoadPort(char[] value) {
      wvExtrLoadPort = checkWvExtrLoadPortConstraints(value);
      serializeWvExtrLoadPort(wvExtrLoadPort);
   } 

     /**
	 * 	Update WvExtrLoadPort 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrLoadPort(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrLoadPort,wvExtrLoadPort.length);
   	
   }
   
   public void setWvExtrLoadPort(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadPort,wvExtrLoadPort.length);
   	
   }
   
     /**
	 * 	Update WvExtrLoadPort 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLoadPort(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadPort+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrLoadPort with another Field
	 *	@param value
	 */
   public void setWvExtrLoadPort(Field source) {
       replace(source,0,source.length(),beginWvExtrLoadPort,WV_EXTR_LOAD_PORT_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrLoadPort 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrLoadPort(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrLoadPort,WV_EXTR_LOAD_PORT_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrLoadPort 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrLoadPort(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrLoadPort+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wvExtrDiscPort
	 *	@return wvExtrDiscPort
	 */
   public char[] getWvExtrDiscPort() throws CFException{
     if (isWvExtrDiscPortModified()) { 
        wvExtrDiscPort = refreshWvExtrDiscPort();
     }
   		return wvExtrDiscPort;
   }

  
	/**
	*  set variable wvExtrDiscPort
	*  Corresponding COBOL Variable is WV-EXTR-DISC-PORT
	*  @param value
	**/
   public void setWvExtrDiscPort(char[] value) {
      wvExtrDiscPort = checkWvExtrDiscPortConstraints(value);
      serializeWvExtrDiscPort(wvExtrDiscPort);
   } 

     /**
	 * 	Update WvExtrDiscPort 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWvExtrDiscPort(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWvExtrDiscPort,wvExtrDiscPort.length);
   	
   }
   
   public void setWvExtrDiscPort(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscPort,wvExtrDiscPort.length);
   	
   }
   
     /**
	 * 	Update WvExtrDiscPort 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDiscPort(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscPort+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WvExtrDiscPort with another Field
	 *	@param value
	 */
   public void setWvExtrDiscPort(Field source) {
       replace(source,0,source.length(),beginWvExtrDiscPort,WV_EXTR_DISC_PORT_LEN);
   	
   }  
   
     /**
	 * 	Update WvExtrDiscPort 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWvExtrDiscPort(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWvExtrDiscPort,WV_EXTR_DISC_PORT_LEN);
   	
   }
   
     /**
	 * 	Update WvExtrDiscPort 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWvExtrDiscPort(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWvExtrDiscPort+targetIndex,targetLen);
    
   }

	
	
	
	/**
	 * 	initializes WvExtrDetails
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setWvExtrParcel(CONSTANTS.SPACE_8);
         setWvExtrCounterparty(CONSTANTS.SPACE_9);
         setWvExtrOwner(CONSTANTS.SPACE_9);
         setWvExtrLoadDateFrom(CONSTANTS.SPACE_10);
         setWvExtrLoadDateTo(CONSTANTS.SPACE_10);
         setWvExtrDiscDateFrom(CONSTANTS.SPACE_10);
         setWvExtrDiscDateTo(CONSTANTS.SPACE_10);
         setWvExtrSettlementDate(CONSTANTS.SPACE_10);
         setWvExtrSettlementOride(CONSTANTS.SPACE);
          wvExtrValueX.initialize();
     
         setWvExtrBlDate(CONSTANTS.SPACE_10);
         setWvExtrDcDate(CONSTANTS.SPACE_10);
         setWvExtrLatestPriceDate(CONSTANTS.SPACE_10);
         setWvExtrOperator(CONSTANTS.SPACE_9);
          wvExtrQuantityX.initialize();
     
         setWvExtrUnitCode(CONSTANTS.SPACE_3);
          wvExtrLdgBblX.initialize();
     
          wvExtrLdgMtX.initialize();
     
          wvExtrDchBblX.initialize();
     
          wvExtrDchMtX.initialize();
     
         setWvExtrSettleTerms1(CONSTANTS.SPACE_6);
         setWvExtrSettleTerms2(CONSTANTS.SPACE_6);
         setWvExtrEarlyLate(CONSTANTS.SPACE);
         setWvExtrInvoiced(CONSTANTS.SPACE);
         setWvExtrBuySell(CONSTANTS.SPACE);
         setWvExtrGrade(CONSTANTS.SPACE_5);
         setWvExtrTerms(CONSTANTS.SPACE_5);
         setWvExtrVessel(CONSTANTS.SPACE_75);
         setWvExtrLdgNorDate(CONSTANTS.SPACE_10);
         setWvExtrLdgNorTime(CONSTANTS.SPACE_5);
         setWvExtrDchNorDate(CONSTANTS.SPACE_10);
         setWvExtrDchNorTime(CONSTANTS.SPACE_5);
         setWvExtrSapDocCode(CONSTANTS.SPACE_10);
         setWvExtrSetlCurr(CONSTANTS.SPACE_3);
         setWvExtrLcStatus(CONSTANTS.SPACE);
         setWvExtrSancStatus(CONSTANTS.SPACE_3);
         setWvExtrCalcWork(CONSTANTS.SPACE);
          wvExtrRefDensityX.initialize();
     
          wvExtrActDensityX.initialize();
     
         setWvExtrStiFlag(CONSTANTS.SPACE);
         setWvExtrMethod(CONSTANTS.SPACE_2);
         setWvExtrPrclNote(CONSTANTS.SPACE);
         setWvExtrSendToGsap(CONSTANTS.SPACE);
         setWvExtrLinkedFrom(CONSTANTS.SPACE_10);
         setWvExtrSecToShell(CONSTANTS.SPACE_5);
                    setWvExtrInvoiceQty(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
         setWvExtrInvoiceUnit(CONSTANTS.SPACE_3);
         setWvExtrLloydsNum(CONSTANTS.SPACE_7);
          wvExtrLdgUsgX.initialize();
     
          wvExtrLdgM315X.initialize();
     
          wvExtrLdgM320X.initialize();
     
          wvExtrLdgM330X.initialize();
     
          wvExtrLdgM3AmbX.initialize();
     
          wvExtrDchUsgX.initialize();
     
          wvExtrDchM315X.initialize();
     
          wvExtrDchM320X.initialize();
     
          wvExtrDchM330X.initialize();
     
          wvExtrDchM3AmbX.initialize();
     
         setWvExtrFrmlName(CONSTANTS.SPACE_15);
                    setWvExtrFrmlVers(CONSTANTS.SPACE_2);
         setWvExtrLoadPort(CONSTANTS.SPACE_10);
         setWvExtrDiscPort(CONSTANTS.SPACE_10);
   }

		public static int getWvExtrDetailsFieldLength() {
			return WV_EXTR_DETAILS_LENGTH;
		}

}
  
