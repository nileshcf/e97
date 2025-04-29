package com.cloudframe.app.init1.dto;

/**
*  The class WvExtrDetails is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;
import com.cloudframe.app.utility.CFUtil;


@Data
public class WvExtrDetails extends WvExtrDetailsSerialized { 
   

						@Getter @Setter private char[] wvExtrParcel = Field.fillLowValue(8);


						@Getter @Setter private char[] wvExtrCounterparty = Field.fillLowValue(9);


						@Getter @Setter private char[] wvExtrOwner = Field.fillLowValue(9);


						@Getter @Setter private char[] wvExtrLoadDateFrom = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrLoadDateTo = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrDiscDateFrom = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrDiscDateTo = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrSettlementDate = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrSettlementOride = Field.fillLowValue(1);

				@Getter @Setter private WvExtrValueX wvExtrValueX = new WvExtrValueX();


						@Getter @Setter private char[] wvExtrBlDate = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrDcDate = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrLatestPriceDate = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrOperator = Field.fillLowValue(9);

				@Getter @Setter private WvExtrQuantityX wvExtrQuantityX = new WvExtrQuantityX();


						@Getter @Setter private char[] wvExtrUnitCode = Field.fillLowValue(3);

				@Getter @Setter private WvExtrLdgBblX wvExtrLdgBblX = new WvExtrLdgBblX();

				@Getter @Setter private WvExtrLdgMtX wvExtrLdgMtX = new WvExtrLdgMtX();

				@Getter @Setter private WvExtrDchBblX wvExtrDchBblX = new WvExtrDchBblX();

				@Getter @Setter private WvExtrDchMtX wvExtrDchMtX = new WvExtrDchMtX();


						@Getter @Setter private char[] wvExtrSettleTerms1 = Field.fillLowValue(6);


						@Getter @Setter private char[] wvExtrSettleTerms2 = Field.fillLowValue(6);


						@Getter @Setter private char[] wvExtrEarlyLate = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrInvoiced = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrBuySell = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrGrade = Field.fillLowValue(5);


						@Getter @Setter private char[] wvExtrTerms = Field.fillLowValue(5);


						@Getter @Setter private char[] wvExtrVessel = Field.fillLowValue(75);


						@Getter @Setter private char[] wvExtrLdgNorDate = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrLdgNorTime = Field.fillLowValue(5);


						@Getter @Setter private char[] wvExtrDchNorDate = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrDchNorTime = Field.fillLowValue(5);


						@Getter @Setter private char[] wvExtrSapDocCode = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrSetlCurr = Field.fillLowValue(3);


						@Getter @Setter private char[] wvExtrLcStatus = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrSancStatus = Field.fillLowValue(3);


						@Getter @Setter private char[] wvExtrCalcWork = Field.fillLowValue(1);

				@Getter @Setter private WvExtrRefDensityX wvExtrRefDensityX = new WvExtrRefDensityX();

				@Getter @Setter private WvExtrActDensityX wvExtrActDensityX = new WvExtrActDensityX();


						@Getter @Setter private char[] wvExtrStiFlag = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrMethod = Field.fillLowValue(2);


						@Getter @Setter private char[] wvExtrPrclNote = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrSendToGsap = Field.fillLowValue(1);


						@Getter @Setter private char[] wvExtrLinkedFrom = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrSecToShell = Field.fillLowValue(5);


								@Getter @Setter private char[] wvExtrInvoiceQty = Field.fillLowValue(12);


						@Getter @Setter private char[] wvExtrInvoiceUnit = Field.fillLowValue(3);


						@Getter @Setter private char[] wvExtrLloydsNum = Field.fillLowValue(7);

				@Getter @Setter private WvExtrLdgUsgX wvExtrLdgUsgX = new WvExtrLdgUsgX();

				@Getter @Setter private WvExtrLdgM315X wvExtrLdgM315X = new WvExtrLdgM315X();

				@Getter @Setter private WvExtrLdgM320X wvExtrLdgM320X = new WvExtrLdgM320X();

				@Getter @Setter private WvExtrLdgM330X wvExtrLdgM330X = new WvExtrLdgM330X();

				@Getter @Setter private WvExtrLdgM3AmbX wvExtrLdgM3AmbX = new WvExtrLdgM3AmbX();

				@Getter @Setter private WvExtrDchUsgX wvExtrDchUsgX = new WvExtrDchUsgX();

				@Getter @Setter private WvExtrDchM315X wvExtrDchM315X = new WvExtrDchM315X();

				@Getter @Setter private WvExtrDchM320X wvExtrDchM320X = new WvExtrDchM320X();

				@Getter @Setter private WvExtrDchM330X wvExtrDchM330X = new WvExtrDchM330X();

				@Getter @Setter private WvExtrDchM3AmbX wvExtrDchM3AmbX = new WvExtrDchM3AmbX();


						@Getter @Setter private char[] wvExtrFrmlName = Field.fillLowValue(15);


								@Getter @Setter private char[] wvExtrFrmlVers = Field.fillLowValue(2);


						@Getter @Setter private char[] wvExtrLoadPort = Field.fillLowValue(10);


						@Getter @Setter private char[] wvExtrDiscPort = Field.fillLowValue(10);
	
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
					getWvExtrValueX().setParent(this,getStartOffset() + 86);
					getWvExtrQuantityX().setParent(this,getStartOffset() + 142);
					getWvExtrLdgBblX().setParent(this,getStartOffset() + 156);
					getWvExtrLdgMtX().setParent(this,getStartOffset() + 170);
					getWvExtrDchBblX().setParent(this,getStartOffset() + 184);
					getWvExtrDchMtX().setParent(this,getStartOffset() + 198);
					getWvExtrRefDensityX().setParent(this,getStartOffset() + 377);
					getWvExtrActDensityX().setParent(this,getStartOffset() + 390);
					getWvExtrLdgUsgX().setParent(this,getStartOffset() + 454);
					getWvExtrLdgM315X().setParent(this,getStartOffset() + 467);
					getWvExtrLdgM320X().setParent(this,getStartOffset() + 480);
					getWvExtrLdgM330X().setParent(this,getStartOffset() + 493);
					getWvExtrLdgM3AmbX().setParent(this,getStartOffset() + 506);
					getWvExtrDchUsgX().setParent(this,getStartOffset() + 519);
					getWvExtrDchM315X().setParent(this,getStartOffset() + 532);
					getWvExtrDchM320X().setParent(this,getStartOffset() + 545);
					getWvExtrDchM330X().setParent(this,getStartOffset() + 558);
					getWvExtrDchM3AmbX().setParent(this,getStartOffset() + 571);
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
          getWvExtrValueX().initialize();
     
         setWvExtrBlDate(CONSTANTS.SPACE_10);
         setWvExtrDcDate(CONSTANTS.SPACE_10);
         setWvExtrLatestPriceDate(CONSTANTS.SPACE_10);
         setWvExtrOperator(CONSTANTS.SPACE_9);
          getWvExtrQuantityX().initialize();
     
         setWvExtrUnitCode(CONSTANTS.SPACE_3);
          getWvExtrLdgBblX().initialize();
     
          getWvExtrLdgMtX().initialize();
     
          getWvExtrDchBblX().initialize();
     
          getWvExtrDchMtX().initialize();
     
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
          getWvExtrRefDensityX().initialize();
     
          getWvExtrActDensityX().initialize();
     
         setWvExtrStiFlag(CONSTANTS.SPACE);
         setWvExtrMethod(CONSTANTS.SPACE_2);
         setWvExtrPrclNote(CONSTANTS.SPACE);
         setWvExtrSendToGsap(CONSTANTS.SPACE);
         setWvExtrLinkedFrom(CONSTANTS.SPACE_10);
         setWvExtrSecToShell(CONSTANTS.SPACE_5);
                    setWvExtrInvoiceQty(CFUtil.cobolNumberFormatter(CONSTANTS.FORMAT_1782754550,"0".toCharArray()));
         setWvExtrInvoiceUnit(CONSTANTS.SPACE_3);
         setWvExtrLloydsNum(CONSTANTS.SPACE_7);
          getWvExtrLdgUsgX().initialize();
     
          getWvExtrLdgM315X().initialize();
     
          getWvExtrLdgM320X().initialize();
     
          getWvExtrLdgM330X().initialize();
     
          getWvExtrLdgM3AmbX().initialize();
     
          getWvExtrDchUsgX().initialize();
     
          getWvExtrDchM315X().initialize();
     
          getWvExtrDchM320X().initialize();
     
          getWvExtrDchM330X().initialize();
     
          getWvExtrDchM3AmbX().initialize();
     
         setWvExtrFrmlName(CONSTANTS.SPACE_15);
                    setWvExtrFrmlVers(CONSTANTS.SPACE_2);
         setWvExtrLoadPort(CONSTANTS.SPACE_10);
         setWvExtrDiscPort(CONSTANTS.SPACE_10);
   }


}
  
