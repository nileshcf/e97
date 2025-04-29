package com.cloudframe.app.ms00d363.dto;

/**
*  The class X360DataRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class X360DataRecord extends X360DataRecordSerialized { 
   
				@Getter @Setter private X360SrtKey x360SrtKey = new X360SrtKey();
				@Getter @Setter private X360OtherDataFields x360OtherDataFields = new X360OtherDataFields();
				@Getter @Setter private X360Financials x360Financials = new X360Financials();
				@Getter @Setter private X360Adjustments x360Adjustments = new X360Adjustments();
				@Getter @Setter private X360MbrRptKey x360MbrRptKey = new X360MbrRptKey();
				@Getter @Setter private X360AAcqA09DeniedCnt x360AAcqA09DeniedCnt = new X360AAcqA09DeniedCnt();
				@Getter @Setter private X360AIssA09DeniedCnt x360AIssA09DeniedCnt = new X360AIssA09DeniedCnt();
				@Getter @Setter private X360ExtPrecisionInfo x360ExtPrecisionInfo = new X360ExtPrecisionInfo();
				@Getter @Setter private X360FAcqSurchrgPos x360FAcqSurchrgPos = new X360FAcqSurchrgPos();
				@Getter @Setter private X360FIssSurchrgPos x360FIssSurchrgPos = new X360FIssSurchrgPos();
				@Getter @Setter private X360AAcqA15ApprovedCnt x360AAcqA15ApprovedCnt = new X360AAcqA15ApprovedCnt();
				@Getter @Setter private X360AIssA15ApprovedCnt x360AIssA15ApprovedCnt = new X360AIssA15ApprovedCnt();
				@Getter @Setter private X360FAcqSurchrgRvPos x360FAcqSurchrgRvPos = new X360FAcqSurchrgRvPos();
				@Getter @Setter private X360FIssSurchrgRvPos x360FIssSurchrgRvPos = new X360FIssSurchrgRvPos();
				@Getter @Setter private X360FAcqSurchrgRvAtm x360FAcqSurchrgRvAtm = new X360FAcqSurchrgRvAtm();
				@Getter @Setter private X360FIssSurchrgRvAtm x360FIssSurchrgRvAtm = new X360FIssSurchrgRvAtm();

						@Getter @Setter private char[] x360FBatchIchngSw = Field.fillLowValue(1);
				@Getter @Setter private X360FAcqIfeeAmt x360FAcqIfeeAmt = new X360FAcqIfeeAmt();
				@Getter @Setter private X360FIssIfeeAmt x360FIssIfeeAmt = new X360FIssIfeeAmt();

	
	/**
	* Constructor for X360DataRecord
	**/
    public X360DataRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for X360DataRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360DataRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getX360SrtKey().setParent(this,getStartOffset() + 0);
					getX360OtherDataFields().setParent(this,getStartOffset() + 94);
					getX360Financials().setParent(this,getStartOffset() + 218);
					getX360Adjustments().setParent(this,getStartOffset() + 582);
					getX360MbrRptKey().setParent(this,getStartOffset() + 999);
					getX360AAcqA09DeniedCnt().setParent(this,getStartOffset() + 1071);
					getX360AIssA09DeniedCnt().setParent(this,getStartOffset() + 1071);
					getX360ExtPrecisionInfo().setParent(this,getStartOffset() + 1081);
					getX360FAcqSurchrgPos().setParent(this,getStartOffset() + 1143);
					getX360FIssSurchrgPos().setParent(this,getStartOffset() + 1143);
					getX360AAcqA15ApprovedCnt().setParent(this,getStartOffset() + 1169);
					getX360AIssA15ApprovedCnt().setParent(this,getStartOffset() + 1169);
					getX360FAcqSurchrgRvPos().setParent(this,getStartOffset() + 1179);
					getX360FIssSurchrgRvPos().setParent(this,getStartOffset() + 1179);
					getX360FAcqSurchrgRvAtm().setParent(this,getStartOffset() + 1205);
					getX360FIssSurchrgRvAtm().setParent(this,getStartOffset() + 1205);
					getX360FAcqIfeeAmt().setParent(this,getStartOffset() + 1232);
					getX360FIssIfeeAmt().setParent(this,getStartOffset() + 1232);
    } 



}
  
