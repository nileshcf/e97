package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf50301 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Sf50301 extends Sf50301Serialized {
   
				@Getter @Setter private Sf503SortFields sf503SortFields = new Sf503SortFields();

						@Getter @Setter private char[] sf503LogRecord = Field.fillLowValue(32737);
				@Getter @Setter private Sf503SeStatAndErrorLog sf503SeStatAndErrorLog = new Sf503SeStatAndErrorLog();
				@Getter @Setter private Sf503BdBulkDataTranLog sf503BdBulkDataTranLog = new Sf503BdBulkDataTranLog();
				@Getter @Setter private Sf503Bd32BulkDataTranLog sf503Bd32BulkDataTranLog = new Sf503Bd32BulkDataTranLog();
				@Getter @Setter private Sf503ImImageLogRecord sf503ImImageLogRecord = new Sf503ImImageLogRecord();
				@Getter @Setter private Sf503OpOperatorTranLog sf503OpOperatorTranLog = new Sf503OpOperatorTranLog();
				@Getter @Setter private Sf503BanknetReconTranLog sf503BanknetReconTranLog = new Sf503BanknetReconTranLog();
				@Getter @Setter private Sf503MpMipProfileLog sf503MpMipProfileLog = new Sf503MpMipProfileLog();
				@Getter @Setter private Sf503PsPosTranLog sf503PsPosTranLog = new Sf503PsPosTranLog();
				@Getter @Setter private Sf503TypeIiTranLog sf503TypeIiTranLog = new Sf503TypeIiTranLog();
				@Getter @Setter private Sf503RemoteConsoleLog sf503RemoteConsoleLog = new Sf503RemoteConsoleLog();
				@Getter @Setter private Sf503X92ActivityLog sf503X92ActivityLog = new Sf503X92ActivityLog();
				@Getter @Setter private Sf503EdcLogArea sf503EdcLogArea = new Sf503EdcLogArea();
				@Getter @Setter private Sf503ChkLogArea sf503ChkLogArea = new Sf503ChkLogArea();
				@Getter @Setter private Sf503AvsLogArea sf503AvsLogArea = new Sf503AvsLogArea();
				@Getter @Setter private Sf503IsoRecord sf503IsoRecord = new Sf503IsoRecord();
				@Getter @Setter private Sf503IsoJRecord sf503IsoJRecord = new Sf503IsoJRecord();
	
	/**
	* Constructor for Sf50301
	**/
    public Sf50301() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getSf503SortFields().setParent(this,getStartOffset() + 0);
					getSf503SeStatAndErrorLog().setParent(this,getStartOffset() + 15);
					getSf503BdBulkDataTranLog().setParent(this,getStartOffset() + 15);
					getSf503Bd32BulkDataTranLog().setParent(this,getStartOffset() + 15);
					getSf503ImImageLogRecord().setParent(this,getStartOffset() + 15);
					getSf503OpOperatorTranLog().setParent(this,getStartOffset() + 15);
					getSf503BanknetReconTranLog().setParent(this,getStartOffset() + 15);
					getSf503MpMipProfileLog().setParent(this,getStartOffset() + 15);
					getSf503PsPosTranLog().setParent(this,getStartOffset() + 15);
					getSf503TypeIiTranLog().setParent(this,getStartOffset() + 15);
					getSf503RemoteConsoleLog().setParent(this,getStartOffset() + 15);
					getSf503X92ActivityLog().setParent(this,getStartOffset() + 15);
					getSf503EdcLogArea().setParent(this,getStartOffset() + 15);
					getSf503ChkLogArea().setParent(this,getStartOffset() + 15);
					getSf503AvsLogArea().setParent(this,getStartOffset() + 15);
					getSf503IsoRecord().setParent(this,getStartOffset() + 15);
					getSf503IsoJRecord().setParent(this,getStartOffset() + 15);
	   	/*  end of offset */
    }





}
  
