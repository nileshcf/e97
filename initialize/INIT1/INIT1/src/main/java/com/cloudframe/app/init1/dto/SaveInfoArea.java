package com.cloudframe.app.init1.dto;

/**
*  The class SaveInfoArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class SaveInfoArea extends SaveInfoAreaSerialized {
   
				@Getter @Setter private KeyInvCustAcct keyInvCustAcct = new KeyInvCustAcct();
				@Getter @Setter private KeyCpduCustAcct keyCpduCustAcct = new KeyCpduCustAcct();
				@Getter @Setter private KeyLsbcaCustAcct keyLsbcaCustAcct = new KeyLsbcaCustAcct();
				@Getter @Setter private KeyLsgremCustAcct keyLsgremCustAcct = new KeyLsgremCustAcct();
				@Getter @Setter private KeyAtdsumCustAcct keyAtdsumCustAcct = new KeyAtdsumCustAcct();
				@Getter @Setter private KeyCpduMtn keyCpduMtn = new KeyCpduMtn();
				@Getter @Setter private KeyCpduPrev keyCpduPrev = new KeyCpduPrev();
				@Getter @Setter private KeyLsbcaMtn keyLsbcaMtn = new KeyLsbcaMtn();
				@Getter @Setter private KeyLsbcaPrev keyLsbcaPrev = new KeyLsbcaPrev();

								@Getter @Setter private int hldIldclLnShrGrpNo;

								@Getter @Setter private int hldIldcrLnShrGrpNo;

						@Getter @Setter private char[] cpduOffrTypCd = new char[2];
				@Getter @Setter private KeyUsgCustAcct keyUsgCustAcct = new KeyUsgCustAcct();
				@Getter @Setter private KeyUsgMtn keyUsgMtn = new KeyUsgMtn();
				@Getter @Setter private KeyUsgPrev keyUsgPrev = new KeyUsgPrev();
				@Getter @Setter private KeyLsgPrev keyLsgPrev = new KeyLsgPrev();

						@Getter @Setter private char[] usgOffrTypCd = new char[2];

								@Getter @Setter private long usgBeginDtIso;

								@Getter @Setter private long lsgBlPerFromDtIso;

								@Getter @Setter private long lsgBlPerToDtIso;
				@Getter @Setter private KeyMtnFile keyMtnFile = new KeyMtnFile();

						@Getter @Setter private char[] custMtnStatCd = new char[1];
				@Getter @Setter private KeyGlbCustAcct keyGlbCustAcct = new KeyGlbCustAcct();
				@Getter @Setter private KeyM2mPromo keyM2mPromo = new KeyM2mPromo();
				@Getter @Setter private ErrAcctRecord errAcctRecord = new ErrAcctRecord();
				@Getter @Setter private ErrAcctRecordSave errAcctRecordSave = new ErrAcctRecordSave();

								@Getter @Setter private long invJitrEligDtIso;

								@Getter @Setter private long invCycEffDtIso;

						@Getter @Setter private char[] invPrevBlCycNo = new char[2];

						@Getter @Setter private char[] delayedCycNo = new char[2];

								@Getter @Setter private long invInvoiceNo;

						@Getter @Setter private char[] tooLateFlagSw = new char[1];
				@Getter @Setter private Parm parm = new Parm();

								@Getter @Setter private int rl001DtlBlSegregateNo;
				@Getter @Setter private FgvUsgRecord fgvUsgRecord = new FgvUsgRecord();
	
	/**
	* Constructor for SaveInfoArea
	**/
    public SaveInfoArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getKeyInvCustAcct().setParent(this,getStartOffset() + 0);
					getKeyCpduCustAcct().setParent(this,getStartOffset() + 8);
					getKeyLsbcaCustAcct().setParent(this,getStartOffset() + 16);
					getKeyLsgremCustAcct().setParent(this,getStartOffset() + 24);
					getKeyAtdsumCustAcct().setParent(this,getStartOffset() + 32);
					getKeyCpduMtn().setParent(this,getStartOffset() + 40);
					getKeyCpduPrev().setParent(this,getStartOffset() + 50);
					getKeyLsbcaMtn().setParent(this,getStartOffset() + 138);
					getKeyLsbcaPrev().setParent(this,getStartOffset() + 148);
					getKeyUsgCustAcct().setParent(this,getStartOffset() + 220);
					getKeyUsgMtn().setParent(this,getStartOffset() + 228);
					getKeyUsgPrev().setParent(this,getStartOffset() + 238);
					getKeyLsgPrev().setParent(this,getStartOffset() + 328);
					getKeyMtnFile().setParent(this,getStartOffset() + 387);
					getKeyGlbCustAcct().setParent(this,getStartOffset() + 406);
					getKeyM2mPromo().setParent(this,getStartOffset() + 414);
					getErrAcctRecord().setParent(this,getStartOffset() + 432);
					getErrAcctRecordSave().setParent(this,getStartOffset() + 498);
					getParm().setParent(this,getStartOffset() + 594);
					getFgvUsgRecord().setParent(this,getStartOffset() + 611);
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
	 * 	initializes SaveInfoArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getKeyInvCustAcct().initialize();
     
          getKeyCpduCustAcct().initialize();
     
          getKeyLsbcaCustAcct().initialize();
     
          getKeyLsgremCustAcct().initialize();
     
          getKeyAtdsumCustAcct().initialize();
     
          getKeyCpduMtn().initialize();
     
          getKeyCpduPrev().initialize();
     
          getKeyLsbcaMtn().initialize();
     
          getKeyLsbcaPrev().initialize();
     
                     setHldIldclLnShrGrpNo(0);
                     setHldIldcrLnShrGrpNo(0);
         setCpduOffrTypCd(CONSTANTS.SPACE_2);
          getKeyUsgCustAcct().initialize();
     
          getKeyUsgMtn().initialize();
     
          getKeyUsgPrev().initialize();
     
          getKeyLsgPrev().initialize();
     
         setUsgOffrTypCd(CONSTANTS.SPACE_2);
                     setUsgBeginDtIso(0);
                     setLsgBlPerFromDtIso(0);
                     setLsgBlPerToDtIso(0);
          getKeyMtnFile().initialize();
     
         setCustMtnStatCd(CONSTANTS.SPACE);
          getKeyGlbCustAcct().initialize();
     
          getKeyM2mPromo().initialize();
     
          getErrAcctRecord().initialize();
     
          getErrAcctRecordSave().initialize();
     
                     setInvJitrEligDtIso(0);
                     setInvCycEffDtIso(0);
         setInvPrevBlCycNo(CONSTANTS.SPACE_2);
         setDelayedCycNo(CONSTANTS.SPACE_2);
                     setInvInvoiceNo(0);
         setTooLateFlagSw(CONSTANTS.SPACE);
          getParm().initialize();
     
                     setRl001DtlBlSegregateNo(0);
          getFgvUsgRecord().initialize();
     
   }


}
  
