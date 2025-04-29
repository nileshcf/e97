package com.cloudframe.app.sf320010.dto;

/**
*  The class Sf503MpMipProfileLog is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:43. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;


@Data
public class Sf503MpMipProfileLog extends Sf503MpMipProfileLogSerialized { 
   

						@Getter @Setter private char[] sf503MpLogTime = Field.fillLowValue(6);

						@Getter @Setter private char[] sf503MpLogDate = Field.fillLowValue(6);
				@Getter @Setter private Sf503MpMipId sf503MpMipId = new Sf503MpMipId();

								@Getter @Setter private int sf503MpIssFloorLim2Retail;

								@Getter @Setter private int sf503MpIssFloorLim2Travel;

								@Getter @Setter private int sf503MpIssFloorLim2Cash;

								@Getter @Setter private int sf503MpPosRetailLimit;

								@Getter @Setter private int sf503MpPosTravelLimit;

								@Getter @Setter private int sf503MpPosCashLimit;

								@Getter @Setter private int sf503MpXCodeLimit;

						@Getter @Setter private char[] sf503MpRclFileInd = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503MpNegFileAvailInd = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503MpMbrDelayFileInd = Field.fillLowValue(1);

						@Getter @Setter private char[] sf503MpLocalNegFileInd = Field.fillLowValue(1);
      private List<Integer> sf503MpIpqTimes; 

	
	/**
	* Constructor for Sf503MpMipProfileLog
	**/
    public Sf503MpMipProfileLog() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Sf503MpMipProfileLog. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503MpMipProfileLog(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getSf503MpMipId().setParent(this,getStartOffset() + 14);
    } 



}
  
