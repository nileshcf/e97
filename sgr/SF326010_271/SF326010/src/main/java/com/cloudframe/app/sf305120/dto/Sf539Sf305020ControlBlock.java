package com.cloudframe.app.sf305120.dto;

/**
*  The class Sf539Sf305020ControlBlock is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class Sf539Sf305020ControlBlock extends Sf539Sf305020ControlBlockSerialized {
   

						@Getter @Setter private char[] sf539SubprogamId = Field.fillLowValue(8);

						@Getter @Setter private char[] sf539CallingProgram = Field.fillLowValue(8);

								@Getter @Setter private int sf539ZlogRecordPtr;

								@Getter @Setter private int sf539ZlogRecordAddr;

								@Getter @Setter private int sf539ZlogRecordLnth;

								@Getter @Setter private int sf539ZlogElapsedTime;

								@Getter @Setter private short sf539Sr1Length;

								@Getter @Setter private short sf539Sr2Length;
			@Getter @Setter private List<Sf539ServiceTable> sf539ServiceTable = new ArrayList<>();
    	

						@Getter @Setter private char[] sf539HeaderSpec = Field.fillLowValue(16);

								@Getter @Setter private short sf539IsoMsgOffset;

								@Getter @Setter private short sf539IsoMsgLnth;

								@Getter @Setter private short sf539Trailer1Offset;

								@Getter @Setter private short sf539Trailer1Lnth;

								@Getter @Setter private short sf539IsoMsg2Offset;

								@Getter @Setter private short sf539IsoMsg2Lnth;

								@Getter @Setter private short sf539Trailer2Offset;

								@Getter @Setter private short sf539Trailer2Lnth;

								@Getter @Setter private short sf539IsoMsg3Offset;

								@Getter @Setter private short sf539IsoMsg3Lnth;

						@Getter @Setter private char[] sf539FillerExpansion = Field.fillLowValue(60);
	
	/**
	* Constructor for Sf539Sf305020ControlBlock
	**/
    public Sf539Sf305020ControlBlock() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SF_539_SERVICE_TABLE_SIZE;arrayIndex++) {
						getSf539ServiceTable().add(new Sf539ServiceTable(this, beginSf539ServiceTable + 
						arrayIndex * Sf539ServiceTable.getSf539ServiceTableFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
