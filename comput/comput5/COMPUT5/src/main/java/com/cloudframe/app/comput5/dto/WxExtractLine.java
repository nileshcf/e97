package com.cloudframe.app.comput5.dto;

/**
*  The class WxExtractLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:34. using version 5.0.0.254
**/


import com.cloudframe.app.comput5.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class WxExtractLine extends WxExtractLineSerialized {
   


						private char[] wxTradingAcct = Field.fillLowValue(9);




						private char[] wxProfitGroup = Field.fillLowValue(5);


						private char[] wxProfitGroupDesc = Field.fillLowValue(20);




						private char[] wxDealGroup = Field.fillLowValue(2);


						private char[] wxDealGroupDesc = Field.fillLowValue(10);




						private char[] wxBuySellInd = Field.fillLowValue(1);




						private char[] wxParcelKey = Field.fillLowValue(10);




						private char[] wxGrade = Field.fillLowValue(5);




						private char[] wxClass = Field.fillLowValue(3);




						private char[] wxBlDate = Field.fillLowValue(8);




						private char[] wxClient = Field.fillLowValue(9);



								private char[] wxPrclPrice = Field.fillLowValue(11);


								private char[] wxBblVol = Field.fillLowValue(16);


								private char[] wxMtAmt = Field.fillLowValue(16);


								private char[] wxPrclQty = Field.fillLowValue(16);





								private char[] wxFormulaVersNum = Field.fillLowValue(4);


								private char[] wxPremium = Field.fillLowValue(14);



						private char[] wxPeriodDash = new char[1];









								private char[] wxQtyPriced = Field.fillLowValue(15);


								private char[] wxPricedPrice = Field.fillLowValue(10);


								private char[] wxAmount = Field.fillLowValue(19);


								private char[] wxM2mPrice = Field.fillLowValue(15);


	
	/**
	* Constructor for WxExtractLine
	**/
    public WxExtractLine() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 0
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 10
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 11
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 12
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 18
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 39
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 40
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 41
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 44
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 55
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 56
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 57
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 59
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 60
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 61
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 72
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 73
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 74
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 80
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 81
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 82
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 86
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 87
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 88
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 97
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 98
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 99
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 109
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 110
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 122
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 139
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 156
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 173
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 174
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 190
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 191
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 196
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 211
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 212
             ,1
             );
								setWxPeriodDash(("-").toCharArray());
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 230
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 231
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 232
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 236
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 237
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 238
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 240
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 241
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 257
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 268
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 288
             ,1
             );
       replaceValue( // serialize and save the value
             (",").toCharArray()
             , getStartOffset() + 304
             ,1
             );
       replaceValue( // serialize and save the value
             getString(new byte[] {(byte)0x7F}).toCharArray()
             , getStartOffset() + 305
             ,1
             );
    }


 

	/**
	 *	Returns the value of wxTradingAcct
	 *	@return wxTradingAcct
	 */
   public char[] getWxTradingAcct() throws CFException{
     if (isWxTradingAcctModified()) { 
        wxTradingAcct = refreshWxTradingAcct();
     }
   		return wxTradingAcct;
   }

  
	/**
	*  set variable wxTradingAcct
	*  Corresponding COBOL Variable is WX-TRADING-ACCT
	*  @param value
	**/
   public void setWxTradingAcct(char[] value) {
      wxTradingAcct = checkWxTradingAcctConstraints(value);
      serializeWxTradingAcct(wxTradingAcct);
   } 

     /**
	 * 	Update WxTradingAcct 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxTradingAcct(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxTradingAcct,wxTradingAcct.length);
   	
   }
   
   public void setWxTradingAcct(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxTradingAcct,wxTradingAcct.length);
   	
   }
   
     /**
	 * 	Update WxTradingAcct 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxTradingAcct(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxTradingAcct+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxTradingAcct with another Field
	 *	@param value
	 */
   public void setWxTradingAcct(Field source) {
       replace(source,0,source.length(),beginWxTradingAcct,WX_TRADING_ACCT_LEN);
   	
   }  
   
     /**
	 * 	Update WxTradingAcct 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxTradingAcct(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxTradingAcct,WX_TRADING_ACCT_LEN);
   	
   }
   
     /**
	 * 	Update WxTradingAcct 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxTradingAcct(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxTradingAcct+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxProfitGroup
	 *	@return wxProfitGroup
	 */
   public char[] getWxProfitGroup() throws CFException{
     if (isWxProfitGroupModified()) { 
        wxProfitGroup = refreshWxProfitGroup();
     }
   		return wxProfitGroup;
   }

  
	/**
	*  set variable wxProfitGroup
	*  Corresponding COBOL Variable is WX-PROFIT-GROUP
	*  @param value
	**/
   public void setWxProfitGroup(char[] value) {
      wxProfitGroup = checkWxProfitGroupConstraints(value);
      serializeWxProfitGroup(wxProfitGroup);
   } 

     /**
	 * 	Update WxProfitGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxProfitGroup(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxProfitGroup,wxProfitGroup.length);
   	
   }
   
   public void setWxProfitGroup(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxProfitGroup,wxProfitGroup.length);
   	
   }
   
     /**
	 * 	Update WxProfitGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxProfitGroup+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxProfitGroup with another Field
	 *	@param value
	 */
   public void setWxProfitGroup(Field source) {
       replace(source,0,source.length(),beginWxProfitGroup,WX_PROFIT_GROUP_LEN);
   	
   }  
   
     /**
	 * 	Update WxProfitGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxProfitGroup(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxProfitGroup,WX_PROFIT_GROUP_LEN);
   	
   }
   
     /**
	 * 	Update WxProfitGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxProfitGroup+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxProfitGroupDesc
	 *	@return wxProfitGroupDesc
	 */
   public char[] getWxProfitGroupDesc() throws CFException{
     if (isWxProfitGroupDescModified()) { 
        wxProfitGroupDesc = refreshWxProfitGroupDesc();
     }
   		return wxProfitGroupDesc;
   }

  
	/**
	*  set variable wxProfitGroupDesc
	*  Corresponding COBOL Variable is WX-PROFIT-GROUP-DESC
	*  @param value
	**/
   public void setWxProfitGroupDesc(char[] value) {
      wxProfitGroupDesc = checkWxProfitGroupDescConstraints(value);
      serializeWxProfitGroupDesc(wxProfitGroupDesc);
   } 

     /**
	 * 	Update WxProfitGroupDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxProfitGroupDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxProfitGroupDesc,wxProfitGroupDesc.length);
   	
   }
   
   public void setWxProfitGroupDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxProfitGroupDesc,wxProfitGroupDesc.length);
   	
   }
   
     /**
	 * 	Update WxProfitGroupDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroupDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxProfitGroupDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxProfitGroupDesc with another Field
	 *	@param value
	 */
   public void setWxProfitGroupDesc(Field source) {
       replace(source,0,source.length(),beginWxProfitGroupDesc,WX_PROFIT_GROUP_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update WxProfitGroupDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxProfitGroupDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxProfitGroupDesc,WX_PROFIT_GROUP_DESC_LEN);
   	
   }
   
     /**
	 * 	Update WxProfitGroupDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxProfitGroupDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxProfitGroupDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxDealGroup
	 *	@return wxDealGroup
	 */
   public char[] getWxDealGroup() throws CFException{
     if (isWxDealGroupModified()) { 
        wxDealGroup = refreshWxDealGroup();
     }
   		return wxDealGroup;
   }

  
	/**
	*  set variable wxDealGroup
	*  Corresponding COBOL Variable is WX-DEAL-GROUP
	*  @param value
	**/
   public void setWxDealGroup(char[] value) {
      wxDealGroup = checkWxDealGroupConstraints(value);
      serializeWxDealGroup(wxDealGroup);
   } 

     /**
	 * 	Update WxDealGroup 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxDealGroup(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxDealGroup,wxDealGroup.length);
   	
   }
   
   public void setWxDealGroup(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxDealGroup,wxDealGroup.length);
   	
   }
   
     /**
	 * 	Update WxDealGroup 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroup(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxDealGroup+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxDealGroup with another Field
	 *	@param value
	 */
   public void setWxDealGroup(Field source) {
       replace(source,0,source.length(),beginWxDealGroup,WX_DEAL_GROUP_LEN);
   	
   }  
   
     /**
	 * 	Update WxDealGroup 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxDealGroup(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxDealGroup,WX_DEAL_GROUP_LEN);
   	
   }
   
     /**
	 * 	Update WxDealGroup 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroup(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxDealGroup+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxDealGroupDesc
	 *	@return wxDealGroupDesc
	 */
   public char[] getWxDealGroupDesc() throws CFException{
     if (isWxDealGroupDescModified()) { 
        wxDealGroupDesc = refreshWxDealGroupDesc();
     }
   		return wxDealGroupDesc;
   }

  
	/**
	*  set variable wxDealGroupDesc
	*  Corresponding COBOL Variable is WX-DEAL-GROUP-DESC
	*  @param value
	**/
   public void setWxDealGroupDesc(char[] value) {
      wxDealGroupDesc = checkWxDealGroupDescConstraints(value);
      serializeWxDealGroupDesc(wxDealGroupDesc);
   } 

     /**
	 * 	Update WxDealGroupDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxDealGroupDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxDealGroupDesc,wxDealGroupDesc.length);
   	
   }
   
   public void setWxDealGroupDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxDealGroupDesc,wxDealGroupDesc.length);
   	
   }
   
     /**
	 * 	Update WxDealGroupDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroupDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxDealGroupDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxDealGroupDesc with another Field
	 *	@param value
	 */
   public void setWxDealGroupDesc(Field source) {
       replace(source,0,source.length(),beginWxDealGroupDesc,WX_DEAL_GROUP_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update WxDealGroupDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxDealGroupDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxDealGroupDesc,WX_DEAL_GROUP_DESC_LEN);
   	
   }
   
     /**
	 * 	Update WxDealGroupDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxDealGroupDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxDealGroupDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxBuySellInd
	 *	@return wxBuySellInd
	 */
   public char[] getWxBuySellInd() throws CFException{
     if (isWxBuySellIndModified()) { 
        wxBuySellInd = refreshWxBuySellInd();
     }
   		return wxBuySellInd;
   }

  
	/**
	*  set variable wxBuySellInd
	*  Corresponding COBOL Variable is WX-BUY-SELL-IND
	*  @param value
	**/
   public void setWxBuySellInd(char[] value) {
      wxBuySellInd = checkWxBuySellIndConstraints(value);
      serializeWxBuySellInd(wxBuySellInd);
   } 

     /**
	 * 	Update WxBuySellInd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxBuySellInd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxBuySellInd,wxBuySellInd.length);
   	
   }
   
   public void setWxBuySellInd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxBuySellInd,wxBuySellInd.length);
   	
   }
   
     /**
	 * 	Update WxBuySellInd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxBuySellInd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxBuySellInd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxBuySellInd with another Field
	 *	@param value
	 */
   public void setWxBuySellInd(Field source) {
       replace(source,0,source.length(),beginWxBuySellInd,WX_BUY_SELL_IND_LEN);
   	
   }  
   
     /**
	 * 	Update WxBuySellInd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxBuySellInd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxBuySellInd,WX_BUY_SELL_IND_LEN);
   	
   }
   
     /**
	 * 	Update WxBuySellInd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxBuySellInd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxBuySellInd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxParcelKey
	 *	@return wxParcelKey
	 */
   public char[] getWxParcelKey() throws CFException{
     if (isWxParcelKeyModified()) { 
        wxParcelKey = refreshWxParcelKey();
     }
   		return wxParcelKey;
   }

  
	/**
	*  set variable wxParcelKey
	*  Corresponding COBOL Variable is WX-PARCEL-KEY
	*  @param value
	**/
   public void setWxParcelKey(char[] value) {
      wxParcelKey = checkWxParcelKeyConstraints(value);
      serializeWxParcelKey(wxParcelKey);
   } 

     /**
	 * 	Update WxParcelKey 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxParcelKey(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxParcelKey,wxParcelKey.length);
   	
   }
   
   public void setWxParcelKey(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxParcelKey,wxParcelKey.length);
   	
   }
   
     /**
	 * 	Update WxParcelKey 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxParcelKey(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxParcelKey+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxParcelKey with another Field
	 *	@param value
	 */
   public void setWxParcelKey(Field source) {
       replace(source,0,source.length(),beginWxParcelKey,WX_PARCEL_KEY_LEN);
   	
   }  
   
     /**
	 * 	Update WxParcelKey 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxParcelKey(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxParcelKey,WX_PARCEL_KEY_LEN);
   	
   }
   
     /**
	 * 	Update WxParcelKey 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxParcelKey(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxParcelKey+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxGrade
	 *	@return wxGrade
	 */
   public char[] getWxGrade() throws CFException{
     if (isWxGradeModified()) { 
        wxGrade = refreshWxGrade();
     }
   		return wxGrade;
   }

  
	/**
	*  set variable wxGrade
	*  Corresponding COBOL Variable is WX-GRADE
	*  @param value
	**/
   public void setWxGrade(char[] value) {
      wxGrade = checkWxGradeConstraints(value);
      serializeWxGrade(wxGrade);
   } 

     /**
	 * 	Update WxGrade 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxGrade(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxGrade,wxGrade.length);
   	
   }
   
   public void setWxGrade(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxGrade,wxGrade.length);
   	
   }
   
     /**
	 * 	Update WxGrade 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxGrade(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxGrade+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxGrade with another Field
	 *	@param value
	 */
   public void setWxGrade(Field source) {
       replace(source,0,source.length(),beginWxGrade,WX_GRADE_LEN);
   	
   }  
   
     /**
	 * 	Update WxGrade 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxGrade(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxGrade,WX_GRADE_LEN);
   	
   }
   
     /**
	 * 	Update WxGrade 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxGrade(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxGrade+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxClass
	 *	@return wxClass
	 */
   public char[] getWxClass() throws CFException{
     if (isWxClassModified()) { 
        wxClass = refreshWxClass();
     }
   		return wxClass;
   }

  
	/**
	*  set variable wxClass
	*  Corresponding COBOL Variable is WX-CLASS
	*  @param value
	**/
   public void setWxClass(char[] value) {
      wxClass = checkWxClassConstraints(value);
      serializeWxClass(wxClass);
   } 

     /**
	 * 	Update WxClass 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxClass(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxClass,wxClass.length);
   	
   }
   
   public void setWxClass(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxClass,wxClass.length);
   	
   }
   
     /**
	 * 	Update WxClass 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxClass(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxClass+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxClass with another Field
	 *	@param value
	 */
   public void setWxClass(Field source) {
       replace(source,0,source.length(),beginWxClass,WX_CLASS_LEN);
   	
   }  
   
     /**
	 * 	Update WxClass 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxClass(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxClass,WX_CLASS_LEN);
   	
   }
   
     /**
	 * 	Update WxClass 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxClass(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxClass+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxBlDate
	 *	@return wxBlDate
	 */
   public char[] getWxBlDate() throws CFException{
     if (isWxBlDateModified()) { 
        wxBlDate = refreshWxBlDate();
     }
   		return wxBlDate;
   }

  
	/**
	*  set variable wxBlDate
	*  Corresponding COBOL Variable is WX-BL-DATE
	*  @param value
	**/
   public void setWxBlDate(char[] value) {
      wxBlDate = checkWxBlDateConstraints(value);
      serializeWxBlDate(wxBlDate);
   } 

     /**
	 * 	Update WxBlDate 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxBlDate(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxBlDate,wxBlDate.length);
   	
   }
   
   public void setWxBlDate(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxBlDate,wxBlDate.length);
   	
   }
   
     /**
	 * 	Update WxBlDate 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxBlDate(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxBlDate+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxBlDate with another Field
	 *	@param value
	 */
   public void setWxBlDate(Field source) {
       replace(source,0,source.length(),beginWxBlDate,WX_BL_DATE_LEN);
   	
   }  
   
     /**
	 * 	Update WxBlDate 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxBlDate(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxBlDate,WX_BL_DATE_LEN);
   	
   }
   
     /**
	 * 	Update WxBlDate 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxBlDate(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxBlDate+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxClient
	 *	@return wxClient
	 */
   public char[] getWxClient() throws CFException{
     if (isWxClientModified()) { 
        wxClient = refreshWxClient();
     }
   		return wxClient;
   }

  
	/**
	*  set variable wxClient
	*  Corresponding COBOL Variable is WX-CLIENT
	*  @param value
	**/
   public void setWxClient(char[] value) {
      wxClient = checkWxClientConstraints(value);
      serializeWxClient(wxClient);
   } 

     /**
	 * 	Update WxClient 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxClient(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxClient,wxClient.length);
   	
   }
   
   public void setWxClient(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxClient,wxClient.length);
   	
   }
   
     /**
	 * 	Update WxClient 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxClient(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxClient+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxClient with another Field
	 *	@param value
	 */
   public void setWxClient(Field source) {
       replace(source,0,source.length(),beginWxClient,WX_CLIENT_LEN);
   	
   }  
   
     /**
	 * 	Update WxClient 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxClient(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxClient,WX_CLIENT_LEN);
   	
   }
   
     /**
	 * 	Update WxClient 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxClient(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxClient+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxPrclPrice
	 *	@return wxPrclPrice
	 */
   public char[] getWxPrclPrice() throws CFException{
     if (isWxPrclPriceModified()) { 
        wxPrclPrice = refreshWxPrclPrice();
     }
   		return wxPrclPrice;
   }

  
	/**
	*  set variable wxPrclPrice
	*  Corresponding COBOL Variable is WX-PRCL-PRICE
	*  @param value
	**/
   public void setWxPrclPrice(char[] value) {
      wxPrclPrice = checkWxPrclPriceConstraints(value);
      serializeWxPrclPrice(wxPrclPrice);
   } 

     /**
	 * 	Update WxPrclPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPrclPrice(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxPrclPrice,wxPrclPrice.length);
   	
   }
   
   public void setWxPrclPrice(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxPrclPrice,wxPrclPrice.length);
   	
   }
   
     /**
	 * 	Update WxPrclPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPrclPrice+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxPrclPrice with another Field
	 *	@param value
	 */
   public void setWxPrclPrice(Field source) {
       replace(source,0,source.length(),beginWxPrclPrice,WX_PRCL_PRICE_LEN);
   	
   }  
   
     /**
	 * 	Update WxPrclPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPrclPrice(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxPrclPrice,WX_PRCL_PRICE_LEN);
   	
   }
   
     /**
	 * 	Update WxPrclPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPrclPrice+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxBblVol
	 *	@return wxBblVol
	 */
   public char[] getWxBblVol() throws CFException{
     if (isWxBblVolModified()) { 
        wxBblVol = refreshWxBblVol();
     }
   		return wxBblVol;
   }

  
	/**
	*  set variable wxBblVol
	*  Corresponding COBOL Variable is WX-BBL-VOL
	*  @param value
	**/
   public void setWxBblVol(char[] value) {
      wxBblVol = checkWxBblVolConstraints(value);
      serializeWxBblVol(wxBblVol);
   } 

     /**
	 * 	Update WxBblVol 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxBblVol(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxBblVol,wxBblVol.length);
   	
   }
   
   public void setWxBblVol(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxBblVol,wxBblVol.length);
   	
   }
   
     /**
	 * 	Update WxBblVol 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxBblVol(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxBblVol+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxBblVol with another Field
	 *	@param value
	 */
   public void setWxBblVol(Field source) {
       replace(source,0,source.length(),beginWxBblVol,WX_BBL_VOL_LEN);
   	
   }  
   
     /**
	 * 	Update WxBblVol 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxBblVol(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxBblVol,WX_BBL_VOL_LEN);
   	
   }
   
     /**
	 * 	Update WxBblVol 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxBblVol(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxBblVol+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxMtAmt
	 *	@return wxMtAmt
	 */
   public char[] getWxMtAmt() throws CFException{
     if (isWxMtAmtModified()) { 
        wxMtAmt = refreshWxMtAmt();
     }
   		return wxMtAmt;
   }

  
	/**
	*  set variable wxMtAmt
	*  Corresponding COBOL Variable is WX-MT-AMT
	*  @param value
	**/
   public void setWxMtAmt(char[] value) {
      wxMtAmt = checkWxMtAmtConstraints(value);
      serializeWxMtAmt(wxMtAmt);
   } 

     /**
	 * 	Update WxMtAmt 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxMtAmt(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxMtAmt,wxMtAmt.length);
   	
   }
   
   public void setWxMtAmt(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxMtAmt,wxMtAmt.length);
   	
   }
   
     /**
	 * 	Update WxMtAmt 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxMtAmt(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxMtAmt+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxMtAmt with another Field
	 *	@param value
	 */
   public void setWxMtAmt(Field source) {
       replace(source,0,source.length(),beginWxMtAmt,WX_MT_AMT_LEN);
   	
   }  
   
     /**
	 * 	Update WxMtAmt 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxMtAmt(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxMtAmt,WX_MT_AMT_LEN);
   	
   }
   
     /**
	 * 	Update WxMtAmt 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxMtAmt(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxMtAmt+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxPrclQty
	 *	@return wxPrclQty
	 */
   public char[] getWxPrclQty() throws CFException{
     if (isWxPrclQtyModified()) { 
        wxPrclQty = refreshWxPrclQty();
     }
   		return wxPrclQty;
   }

  
	/**
	*  set variable wxPrclQty
	*  Corresponding COBOL Variable is WX-PRCL-QTY
	*  @param value
	**/
   public void setWxPrclQty(char[] value) {
      wxPrclQty = checkWxPrclQtyConstraints(value);
      serializeWxPrclQty(wxPrclQty);
   } 

     /**
	 * 	Update WxPrclQty 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPrclQty(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxPrclQty,wxPrclQty.length);
   	
   }
   
   public void setWxPrclQty(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxPrclQty,wxPrclQty.length);
   	
   }
   
     /**
	 * 	Update WxPrclQty 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclQty(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPrclQty+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxPrclQty with another Field
	 *	@param value
	 */
   public void setWxPrclQty(Field source) {
       replace(source,0,source.length(),beginWxPrclQty,WX_PRCL_QTY_LEN);
   	
   }  
   
     /**
	 * 	Update WxPrclQty 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPrclQty(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxPrclQty,WX_PRCL_QTY_LEN);
   	
   }
   
     /**
	 * 	Update WxPrclQty 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPrclQty(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPrclQty+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxFormulaVersNum
	 *	@return wxFormulaVersNum
	 */
   public char[] getWxFormulaVersNum() throws CFException{
     if (isWxFormulaVersNumModified()) { 
        wxFormulaVersNum = refreshWxFormulaVersNum();
     }
   		return wxFormulaVersNum;
   }

  
	/**
	*  set variable wxFormulaVersNum
	*  Corresponding COBOL Variable is WX-FORMULA-VERS-NUM
	*  @param value
	**/
   public void setWxFormulaVersNum(char[] value) {
      wxFormulaVersNum = checkWxFormulaVersNumConstraints(value);
      serializeWxFormulaVersNum(wxFormulaVersNum);
   } 

     /**
	 * 	Update WxFormulaVersNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxFormulaVersNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxFormulaVersNum,wxFormulaVersNum.length);
   	
   }
   
   public void setWxFormulaVersNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxFormulaVersNum,wxFormulaVersNum.length);
   	
   }
   
     /**
	 * 	Update WxFormulaVersNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxFormulaVersNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxFormulaVersNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxFormulaVersNum with another Field
	 *	@param value
	 */
   public void setWxFormulaVersNum(Field source) {
       replace(source,0,source.length(),beginWxFormulaVersNum,WX_FORMULA_VERS_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update WxFormulaVersNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxFormulaVersNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxFormulaVersNum,WX_FORMULA_VERS_NUM_LEN);
   	
   }
   
     /**
	 * 	Update WxFormulaVersNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxFormulaVersNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxFormulaVersNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxPremium
	 *	@return wxPremium
	 */
   public char[] getWxPremium() throws CFException{
     if (isWxPremiumModified()) { 
        wxPremium = refreshWxPremium();
     }
   		return wxPremium;
   }

  
	/**
	*  set variable wxPremium
	*  Corresponding COBOL Variable is WX-PREMIUM
	*  @param value
	**/
   public void setWxPremium(char[] value) {
      wxPremium = checkWxPremiumConstraints(value);
      serializeWxPremium(wxPremium);
   } 

     /**
	 * 	Update WxPremium 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPremium(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxPremium,wxPremium.length);
   	
   }
   
   public void setWxPremium(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxPremium,wxPremium.length);
   	
   }
   
     /**
	 * 	Update WxPremium 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPremium(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPremium+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxPremium with another Field
	 *	@param value
	 */
   public void setWxPremium(Field source) {
       replace(source,0,source.length(),beginWxPremium,WX_PREMIUM_LEN);
   	
   }  
   
     /**
	 * 	Update WxPremium 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPremium(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxPremium,WX_PREMIUM_LEN);
   	
   }
   
     /**
	 * 	Update WxPremium 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPremium(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPremium+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxPeriodDash
	 *	@return wxPeriodDash
	 */
   public char[] getWxPeriodDash() throws CFException{
     if (isWxPeriodDashModified()) { 
        wxPeriodDash = refreshWxPeriodDash();
     }
   		return wxPeriodDash;
   }

  
	/**
	*  set variable wxPeriodDash
	*  Corresponding COBOL Variable is WX-PERIOD-DASH
	*  @param value
	**/
   public void setWxPeriodDash(char[] value) {
      wxPeriodDash = checkWxPeriodDashConstraints(value);
      serializeWxPeriodDash(wxPeriodDash);
   } 

     /**
	 * 	Update WxPeriodDash 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPeriodDash(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxPeriodDash,wxPeriodDash.length);
   	
   }
   
   public void setWxPeriodDash(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxPeriodDash,wxPeriodDash.length);
   	
   }
   
     /**
	 * 	Update WxPeriodDash 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPeriodDash(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPeriodDash+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxPeriodDash with another Field
	 *	@param value
	 */
   public void setWxPeriodDash(Field source) {
       replace(source,0,source.length(),beginWxPeriodDash,WX_PERIOD_DASH_LEN);
   	
   }  
   
     /**
	 * 	Update WxPeriodDash 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPeriodDash(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxPeriodDash,WX_PERIOD_DASH_LEN);
   	
   }
   
     /**
	 * 	Update WxPeriodDash 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPeriodDash(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPeriodDash+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxQtyPriced
	 *	@return wxQtyPriced
	 */
   public char[] getWxQtyPriced() throws CFException{
     if (isWxQtyPricedModified()) { 
        wxQtyPriced = refreshWxQtyPriced();
     }
   		return wxQtyPriced;
   }

  
	/**
	*  set variable wxQtyPriced
	*  Corresponding COBOL Variable is WX-QTY-PRICED
	*  @param value
	**/
   public void setWxQtyPriced(char[] value) {
      wxQtyPriced = checkWxQtyPricedConstraints(value);
      serializeWxQtyPriced(wxQtyPriced);
   } 

     /**
	 * 	Update WxQtyPriced 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxQtyPriced(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxQtyPriced,wxQtyPriced.length);
   	
   }
   
   public void setWxQtyPriced(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxQtyPriced,wxQtyPriced.length);
   	
   }
   
     /**
	 * 	Update WxQtyPriced 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxQtyPriced(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxQtyPriced+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxQtyPriced with another Field
	 *	@param value
	 */
   public void setWxQtyPriced(Field source) {
       replace(source,0,source.length(),beginWxQtyPriced,WX_QTY_PRICED_LEN);
   	
   }  
   
     /**
	 * 	Update WxQtyPriced 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxQtyPriced(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxQtyPriced,WX_QTY_PRICED_LEN);
   	
   }
   
     /**
	 * 	Update WxQtyPriced 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxQtyPriced(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxQtyPriced+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxPricedPrice
	 *	@return wxPricedPrice
	 */
   public char[] getWxPricedPrice() throws CFException{
     if (isWxPricedPriceModified()) { 
        wxPricedPrice = refreshWxPricedPrice();
     }
   		return wxPricedPrice;
   }

  
	/**
	*  set variable wxPricedPrice
	*  Corresponding COBOL Variable is WX-PRICED-PRICE
	*  @param value
	**/
   public void setWxPricedPrice(char[] value) {
      wxPricedPrice = checkWxPricedPriceConstraints(value);
      serializeWxPricedPrice(wxPricedPrice);
   } 

     /**
	 * 	Update WxPricedPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxPricedPrice(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxPricedPrice,wxPricedPrice.length);
   	
   }
   
   public void setWxPricedPrice(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxPricedPrice,wxPricedPrice.length);
   	
   }
   
     /**
	 * 	Update WxPricedPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxPricedPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPricedPrice+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxPricedPrice with another Field
	 *	@param value
	 */
   public void setWxPricedPrice(Field source) {
       replace(source,0,source.length(),beginWxPricedPrice,WX_PRICED_PRICE_LEN);
   	
   }  
   
     /**
	 * 	Update WxPricedPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxPricedPrice(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxPricedPrice,WX_PRICED_PRICE_LEN);
   	
   }
   
     /**
	 * 	Update WxPricedPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxPricedPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxPricedPrice+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxAmount
	 *	@return wxAmount
	 */
   public char[] getWxAmount() throws CFException{
     if (isWxAmountModified()) { 
        wxAmount = refreshWxAmount();
     }
   		return wxAmount;
   }

  
	/**
	*  set variable wxAmount
	*  Corresponding COBOL Variable is WX-AMOUNT
	*  @param value
	**/
   public void setWxAmount(char[] value) {
      wxAmount = checkWxAmountConstraints(value);
      serializeWxAmount(wxAmount);
   } 

     /**
	 * 	Update WxAmount 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxAmount(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxAmount,wxAmount.length);
   	
   }
   
   public void setWxAmount(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxAmount,wxAmount.length);
   	
   }
   
     /**
	 * 	Update WxAmount 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxAmount(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxAmount+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxAmount with another Field
	 *	@param value
	 */
   public void setWxAmount(Field source) {
       replace(source,0,source.length(),beginWxAmount,WX_AMOUNT_LEN);
   	
   }  
   
     /**
	 * 	Update WxAmount 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxAmount(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxAmount,WX_AMOUNT_LEN);
   	
   }
   
     /**
	 * 	Update WxAmount 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxAmount(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxAmount+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of wxM2mPrice
	 *	@return wxM2mPrice
	 */
   public char[] getWxM2mPrice() throws CFException{
     if (isWxM2mPriceModified()) { 
        wxM2mPrice = refreshWxM2mPrice();
     }
   		return wxM2mPrice;
   }

  
	/**
	*  set variable wxM2mPrice
	*  Corresponding COBOL Variable is WX-M2M-PRICE
	*  @param value
	**/
   public void setWxM2mPrice(char[] value) {
      wxM2mPrice = checkWxM2mPriceConstraints(value);
      serializeWxM2mPrice(wxM2mPrice);
   } 

     /**
	 * 	Update WxM2mPrice 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWxM2mPrice(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWxM2mPrice,wxM2mPrice.length);
   	
   }
   
   public void setWxM2mPrice(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWxM2mPrice,wxM2mPrice.length);
   	
   }
   
     /**
	 * 	Update WxM2mPrice 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWxM2mPrice(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxM2mPrice+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WxM2mPrice with another Field
	 *	@param value
	 */
   public void setWxM2mPrice(Field source) {
       replace(source,0,source.length(),beginWxM2mPrice,WX_M_2M_PRICE_LEN);
   	
   }  
   
     /**
	 * 	Update WxM2mPrice 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWxM2mPrice(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWxM2mPrice,WX_M_2M_PRICE_LEN);
   	
   }
   
     /**
	 * 	Update WxM2mPrice 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWxM2mPrice(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWxM2mPrice+targetIndex,targetLen);
    
   }

	
	
	

		public static int getWxExtractLineFieldLength() {
			return WX_EXTRACT_LINE_LENGTH;
		}

}
  
