package com.cloudframe.app.comput5.dto;

/**
*  The class WxExtractLine is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WxExtractLine extends WxExtractLineSerialized {
   


						@Getter @Setter private char[] wxTradingAcct = Field.fillLowValue(9);




						@Getter @Setter private char[] wxProfitGroup = Field.fillLowValue(5);


						@Getter @Setter private char[] wxProfitGroupDesc = Field.fillLowValue(20);




						@Getter @Setter private char[] wxDealGroup = Field.fillLowValue(2);


						@Getter @Setter private char[] wxDealGroupDesc = Field.fillLowValue(10);




						@Getter @Setter private char[] wxBuySellInd = Field.fillLowValue(1);




						@Getter @Setter private char[] wxParcelKey = Field.fillLowValue(10);




						@Getter @Setter private char[] wxGrade = Field.fillLowValue(5);




						@Getter @Setter private char[] wxClass = Field.fillLowValue(3);




						@Getter @Setter private char[] wxBlDate = Field.fillLowValue(8);




						@Getter @Setter private char[] wxClient = Field.fillLowValue(9);



								@Getter @Setter private char[] wxPrclPrice = Field.fillLowValue(11);


								@Getter @Setter private char[] wxBblVol = Field.fillLowValue(16);


								@Getter @Setter private char[] wxMtAmt = Field.fillLowValue(16);


								@Getter @Setter private char[] wxPrclQty = Field.fillLowValue(16);





								@Getter @Setter private char[] wxFormulaVersNum = Field.fillLowValue(4);


								@Getter @Setter private char[] wxPremium = Field.fillLowValue(14);



						@Getter @Setter private char[] wxPeriodDash = new char[1];









								@Getter @Setter private char[] wxQtyPriced = Field.fillLowValue(15);


								@Getter @Setter private char[] wxPricedPrice = Field.fillLowValue(10);


								@Getter @Setter private char[] wxAmount = Field.fillLowValue(19);


								@Getter @Setter private char[] wxM2mPrice = Field.fillLowValue(15);


	
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





}
  
