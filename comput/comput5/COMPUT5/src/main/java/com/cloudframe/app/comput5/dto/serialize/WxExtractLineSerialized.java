package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WxExtractLineSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WxExtractLineSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WxExtractLineSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WX_EXTRACT_LINE_LENGTH = 306;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWxTradingAcct;
            protected  int beginWxProfitGroup;
            protected  int beginWxProfitGroupDesc;
            protected  int beginWxDealGroup;
            protected  int beginWxDealGroupDesc;
            protected  int beginWxBuySellInd;
            protected  int beginWxParcelKey;
            protected  int beginWxGrade;
            protected  int beginWxClass;
            protected  int beginWxBlDate;
            protected  int beginWxClient;
            protected  int beginWxPrclPrice;
            protected  int beginWxBblVol;
            protected  int beginWxMtAmt;
            protected  int beginWxPrclQty;
            protected  int beginWxFormulaVersNum;
            protected  int beginWxPremium;
            protected  int beginWxPeriodDash;
            protected  int beginWxQtyPriced;
            protected  int beginWxPricedPrice;
            protected  int beginWxAmount;
            protected  int beginWxM2mPrice;
	
	/**
	* Constructor for WxExtractLineSerialized
	**/
    public WxExtractLineSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WxExtractLineSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WX_EXTRACT_LINE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginWxTradingAcct = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
             beginWxProfitGroup = getStartOffset() + 13;	// set offset for serialization
  
  
             beginWxProfitGroupDesc = getStartOffset() + 19;	// set offset for serialization
  
  
  
  
             beginWxDealGroup = getStartOffset() + 42;	// set offset for serialization
  
  
             beginWxDealGroupDesc = getStartOffset() + 45;	// set offset for serialization
  
  
  
  
             beginWxBuySellInd = getStartOffset() + 58;	// set offset for serialization
  
  
  
  
             beginWxParcelKey = getStartOffset() + 62;	// set offset for serialization
  
  
  
  
             beginWxGrade = getStartOffset() + 75;	// set offset for serialization
  
  
  
  
             beginWxClass = getStartOffset() + 83;	// set offset for serialization
  
  
  
  
             beginWxBlDate = getStartOffset() + 89;	// set offset for serialization
  
  
  
  
             beginWxClient = getStartOffset() + 100;	// set offset for serialization
  
  
  
             beginWxPrclPrice = getStartOffset() + 111;	// set offset for serialization
  
  
             beginWxBblVol = getStartOffset() + 123;	// set offset for serialization
  
  
             beginWxMtAmt = getStartOffset() + 140;	// set offset for serialization
  
  
             beginWxPrclQty = getStartOffset() + 157;	// set offset for serialization
  
  
  
  
  
             beginWxFormulaVersNum = getStartOffset() + 192;	// set offset for serialization
  
  
             beginWxPremium = getStartOffset() + 197;	// set offset for serialization
  
  
  
             beginWxPeriodDash = getStartOffset() + 221;	// set offset for serialization
  
  
  
  
  
  
  
  
  
             beginWxQtyPriced = getStartOffset() + 242;	// set offset for serialization
  
  
             beginWxPricedPrice = getStartOffset() + 258;	// set offset for serialization
  
  
             beginWxAmount = getStartOffset() + 269;	// set offset for serialization
  
  
             beginWxM2mPrice = getStartOffset() + 289;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localWxTradingAcctCounter = -1;
     public boolean isWxTradingAcctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxTradingAcctCounter != sharedCounter;
         localWxTradingAcctCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_TRADING_ACCT_LEN = 9;
	/**
	 * 	serialize this WxTradingAcct
	 */
   protected void serializeWxTradingAcct(char[] wxTradingAcct) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxTradingAcct,0,getStringValue(),beginWxTradingAcct,WX_TRADING_ACCT_LEN);
       localWxTradingAcctCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxTradingAcctConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWxTradingAcct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxTradingAcct() {	 
   		return (substring(getStringValue(),beginWxTradingAcct,beginWxTradingAcct + WX_TRADING_ACCT_LEN));
   	}
     int localWxProfitGroupCounter = -1;
     public boolean isWxProfitGroupModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxProfitGroupCounter != sharedCounter;
         localWxProfitGroupCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PROFIT_GROUP_LEN = 5;
	/**
	 * 	serialize this WxProfitGroup
	 */
   protected void serializeWxProfitGroup(char[] wxProfitGroup) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxProfitGroup,0,getStringValue(),beginWxProfitGroup,WX_PROFIT_GROUP_LEN);
       localWxProfitGroupCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxProfitGroupConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWxProfitGroup is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxProfitGroup() {	 
   		return (substring(getStringValue(),beginWxProfitGroup,beginWxProfitGroup + WX_PROFIT_GROUP_LEN));
   	}
     int localWxProfitGroupDescCounter = -1;
     public boolean isWxProfitGroupDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxProfitGroupDescCounter != sharedCounter;
         localWxProfitGroupDescCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PROFIT_GROUP_DESC_LEN = 20;
	/**
	 * 	serialize this WxProfitGroupDesc
	 */
   protected void serializeWxProfitGroupDesc(char[] wxProfitGroupDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxProfitGroupDesc,0,getStringValue(),beginWxProfitGroupDesc,WX_PROFIT_GROUP_DESC_LEN);
       localWxProfitGroupDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxProfitGroupDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWxProfitGroupDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxProfitGroupDesc() {	 
   		return (substring(getStringValue(),beginWxProfitGroupDesc,beginWxProfitGroupDesc + WX_PROFIT_GROUP_DESC_LEN));
   	}
     int localWxDealGroupCounter = -1;
     public boolean isWxDealGroupModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxDealGroupCounter != sharedCounter;
         localWxDealGroupCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_DEAL_GROUP_LEN = 2;
	/**
	 * 	serialize this WxDealGroup
	 */
   protected void serializeWxDealGroup(char[] wxDealGroup) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxDealGroup,0,getStringValue(),beginWxDealGroup,WX_DEAL_GROUP_LEN);
       localWxDealGroupCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxDealGroupConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshWxDealGroup is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxDealGroup() {	 
   		return (substring(getStringValue(),beginWxDealGroup,beginWxDealGroup + WX_DEAL_GROUP_LEN));
   	}
     int localWxDealGroupDescCounter = -1;
     public boolean isWxDealGroupDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxDealGroupDescCounter != sharedCounter;
         localWxDealGroupDescCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_DEAL_GROUP_DESC_LEN = 10;
	/**
	 * 	serialize this WxDealGroupDesc
	 */
   protected void serializeWxDealGroupDesc(char[] wxDealGroupDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxDealGroupDesc,0,getStringValue(),beginWxDealGroupDesc,WX_DEAL_GROUP_DESC_LEN);
       localWxDealGroupDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxDealGroupDescConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWxDealGroupDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxDealGroupDesc() {	 
   		return (substring(getStringValue(),beginWxDealGroupDesc,beginWxDealGroupDesc + WX_DEAL_GROUP_DESC_LEN));
   	}
     int localWxBuySellIndCounter = -1;
     public boolean isWxBuySellIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxBuySellIndCounter != sharedCounter;
         localWxBuySellIndCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_BUY_SELL_IND_LEN = 1;
	/**
	 * 	serialize this WxBuySellInd
	 */
   protected void serializeWxBuySellInd(char[] wxBuySellInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxBuySellInd,0,getStringValue(),beginWxBuySellInd,WX_BUY_SELL_IND_LEN);
       localWxBuySellIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxBuySellIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWxBuySellInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxBuySellInd() {	 
   		return (substring(getStringValue(),beginWxBuySellInd,beginWxBuySellInd + WX_BUY_SELL_IND_LEN));
   	}
     int localWxParcelKeyCounter = -1;
     public boolean isWxParcelKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxParcelKeyCounter != sharedCounter;
         localWxParcelKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PARCEL_KEY_LEN = 10;
	/**
	 * 	serialize this WxParcelKey
	 */
   protected void serializeWxParcelKey(char[] wxParcelKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxParcelKey,0,getStringValue(),beginWxParcelKey,WX_PARCEL_KEY_LEN);
       localWxParcelKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxParcelKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWxParcelKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxParcelKey() {	 
   		return (substring(getStringValue(),beginWxParcelKey,beginWxParcelKey + WX_PARCEL_KEY_LEN));
   	}
     int localWxGradeCounter = -1;
     public boolean isWxGradeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxGradeCounter != sharedCounter;
         localWxGradeCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_GRADE_LEN = 5;
	/**
	 * 	serialize this WxGrade
	 */
   protected void serializeWxGrade(char[] wxGrade) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxGrade,0,getStringValue(),beginWxGrade,WX_GRADE_LEN);
       localWxGradeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxGradeConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshWxGrade is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxGrade() {	 
   		return (substring(getStringValue(),beginWxGrade,beginWxGrade + WX_GRADE_LEN));
   	}
     int localWxClassCounter = -1;
     public boolean isWxClassModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxClassCounter != sharedCounter;
         localWxClassCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_CLASS_LEN = 3;
	/**
	 * 	serialize this WxClass
	 */
   protected void serializeWxClass(char[] wxClass) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxClass,0,getStringValue(),beginWxClass,WX_CLASS_LEN);
       localWxClassCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxClassConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshWxClass is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxClass() {	 
   		return (substring(getStringValue(),beginWxClass,beginWxClass + WX_CLASS_LEN));
   	}
     int localWxBlDateCounter = -1;
     public boolean isWxBlDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxBlDateCounter != sharedCounter;
         localWxBlDateCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_BL_DATE_LEN = 8;
	/**
	 * 	serialize this WxBlDate
	 */
   protected void serializeWxBlDate(char[] wxBlDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxBlDate,0,getStringValue(),beginWxBlDate,WX_BL_DATE_LEN);
       localWxBlDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxBlDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWxBlDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxBlDate() {	 
   		return (substring(getStringValue(),beginWxBlDate,beginWxBlDate + WX_BL_DATE_LEN));
   	}
     int localWxClientCounter = -1;
     public boolean isWxClientModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxClientCounter != sharedCounter;
         localWxClientCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_CLIENT_LEN = 9;
	/**
	 * 	serialize this WxClient
	 */
   protected void serializeWxClient(char[] wxClient) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxClient,0,getStringValue(),beginWxClient,WX_CLIENT_LEN);
       localWxClientCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxClientConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshWxClient is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxClient() {	 
   		return (substring(getStringValue(),beginWxClient,beginWxClient + WX_CLIENT_LEN));
   	}
     int localWxPrclPriceCounter = -1;
     public boolean isWxPrclPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxPrclPriceCounter != sharedCounter;
         localWxPrclPriceCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PRCL_PRICE_LEN = 11;
	/**
	 * 	serialize this WxPrclPrice
	 */
   protected void serializeWxPrclPrice(char[] wxPrclPrice) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxPrclPrice,0,getStringValue(),beginWxPrclPrice,WX_PRCL_PRICE_LEN);
       localWxPrclPriceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxPrclPriceConstraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, true);
   }
    /**
	 *	refreshWxPrclPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxPrclPrice() {	 
   		return (substring(getStringValue(),beginWxPrclPrice,beginWxPrclPrice + WX_PRCL_PRICE_LEN));
   	}
     int localWxBblVolCounter = -1;
     public boolean isWxBblVolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxBblVolCounter != sharedCounter;
         localWxBblVolCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_BBL_VOL_LEN = 16;
	/**
	 * 	serialize this WxBblVol
	 */
   protected void serializeWxBblVol(char[] wxBblVol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxBblVol,0,getStringValue(),beginWxBblVol,WX_BBL_VOL_LEN);
       localWxBblVolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxBblVolConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshWxBblVol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxBblVol() {	 
   		return (substring(getStringValue(),beginWxBblVol,beginWxBblVol + WX_BBL_VOL_LEN));
   	}
     int localWxMtAmtCounter = -1;
     public boolean isWxMtAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxMtAmtCounter != sharedCounter;
         localWxMtAmtCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_MT_AMT_LEN = 16;
	/**
	 * 	serialize this WxMtAmt
	 */
   protected void serializeWxMtAmt(char[] wxMtAmt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxMtAmt,0,getStringValue(),beginWxMtAmt,WX_MT_AMT_LEN);
       localWxMtAmtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxMtAmtConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshWxMtAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxMtAmt() {	 
   		return (substring(getStringValue(),beginWxMtAmt,beginWxMtAmt + WX_MT_AMT_LEN));
   	}
     int localWxPrclQtyCounter = -1;
     public boolean isWxPrclQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxPrclQtyCounter != sharedCounter;
         localWxPrclQtyCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PRCL_QTY_LEN = 16;
	/**
	 * 	serialize this WxPrclQty
	 */
   protected void serializeWxPrclQty(char[] wxPrclQty) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxPrclQty,0,getStringValue(),beginWxPrclQty,WX_PRCL_QTY_LEN);
       localWxPrclQtyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxPrclQtyConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshWxPrclQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxPrclQty() {	 
   		return (substring(getStringValue(),beginWxPrclQty,beginWxPrclQty + WX_PRCL_QTY_LEN));
   	}
     int localWxFormulaVersNumCounter = -1;
     public boolean isWxFormulaVersNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxFormulaVersNumCounter != sharedCounter;
         localWxFormulaVersNumCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_FORMULA_VERS_NUM_LEN = 4;
	/**
	 * 	serialize this WxFormulaVersNum
	 */
   protected void serializeWxFormulaVersNum(char[] wxFormulaVersNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxFormulaVersNum,0,getStringValue(),beginWxFormulaVersNum,WX_FORMULA_VERS_NUM_LEN);
       localWxFormulaVersNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxFormulaVersNumConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, true);
   }
    /**
	 *	refreshWxFormulaVersNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxFormulaVersNum() {	 
   		return (substring(getStringValue(),beginWxFormulaVersNum,beginWxFormulaVersNum + WX_FORMULA_VERS_NUM_LEN));
   	}
     int localWxPremiumCounter = -1;
     public boolean isWxPremiumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxPremiumCounter != sharedCounter;
         localWxPremiumCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PREMIUM_LEN = 14;
	/**
	 * 	serialize this WxPremium
	 */
   protected void serializeWxPremium(char[] wxPremium) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxPremium,0,getStringValue(),beginWxPremium,WX_PREMIUM_LEN);
       localWxPremiumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxPremiumConstraints(char[] value) {
   			return super.checkConstraints(value , 14 ,false, true);
   }
    /**
	 *	refreshWxPremium is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxPremium() {	 
   		return (substring(getStringValue(),beginWxPremium,beginWxPremium + WX_PREMIUM_LEN));
   	}
     int localWxPeriodDashCounter = -1;
     public boolean isWxPeriodDashModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxPeriodDashCounter != sharedCounter;
         localWxPeriodDashCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PERIOD_DASH_LEN = 1;
	/**
	 * 	serialize this WxPeriodDash
	 */
   protected void serializeWxPeriodDash(char[] wxPeriodDash) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxPeriodDash,0,getStringValue(),beginWxPeriodDash,WX_PERIOD_DASH_LEN);
       localWxPeriodDashCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxPeriodDashConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWxPeriodDash is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxPeriodDash() {	 
   		return (substring(getStringValue(),beginWxPeriodDash,beginWxPeriodDash + WX_PERIOD_DASH_LEN));
   	}
     int localWxQtyPricedCounter = -1;
     public boolean isWxQtyPricedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxQtyPricedCounter != sharedCounter;
         localWxQtyPricedCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_QTY_PRICED_LEN = 15;
	/**
	 * 	serialize this WxQtyPriced
	 */
   protected void serializeWxQtyPriced(char[] wxQtyPriced) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxQtyPriced,0,getStringValue(),beginWxQtyPriced,WX_QTY_PRICED_LEN);
       localWxQtyPricedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxQtyPricedConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, true);
   }
    /**
	 *	refreshWxQtyPriced is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxQtyPriced() {	 
   		return (substring(getStringValue(),beginWxQtyPriced,beginWxQtyPriced + WX_QTY_PRICED_LEN));
   	}
     int localWxPricedPriceCounter = -1;
     public boolean isWxPricedPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxPricedPriceCounter != sharedCounter;
         localWxPricedPriceCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_PRICED_PRICE_LEN = 10;
	/**
	 * 	serialize this WxPricedPrice
	 */
   protected void serializeWxPricedPrice(char[] wxPricedPrice) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxPricedPrice,0,getStringValue(),beginWxPricedPrice,WX_PRICED_PRICE_LEN);
       localWxPricedPriceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxPricedPriceConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, true);
   }
    /**
	 *	refreshWxPricedPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxPricedPrice() {	 
   		return (substring(getStringValue(),beginWxPricedPrice,beginWxPricedPrice + WX_PRICED_PRICE_LEN));
   	}
     int localWxAmountCounter = -1;
     public boolean isWxAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxAmountCounter != sharedCounter;
         localWxAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_AMOUNT_LEN = 19;
	/**
	 * 	serialize this WxAmount
	 */
   protected void serializeWxAmount(char[] wxAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxAmount,0,getStringValue(),beginWxAmount,WX_AMOUNT_LEN);
       localWxAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, true);
   }
    /**
	 *	refreshWxAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxAmount() {	 
   		return (substring(getStringValue(),beginWxAmount,beginWxAmount + WX_AMOUNT_LEN));
   	}
     int localWxM2mPriceCounter = -1;
     public boolean isWxM2mPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWxM2mPriceCounter != sharedCounter;
         localWxM2mPriceCounter = sharedCounter; return hasModified;
     }
	protected static final int WX_M_2M_PRICE_LEN = 15;
	/**
	 * 	serialize this WxM2mPrice
	 */
   protected void serializeWxM2mPrice(char[] wxM2mPrice) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wxM2mPrice,0,getStringValue(),beginWxM2mPrice,WX_M_2M_PRICE_LEN);
       localWxM2mPriceCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWxM2mPriceConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, true);
   }
    /**
	 *	refreshWxM2mPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWxM2mPrice() {	 
   		return (substring(getStringValue(),beginWxM2mPrice,beginWxM2mPrice + WX_M_2M_PRICE_LEN));
   	}




}
  
