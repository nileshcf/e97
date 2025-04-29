package com.cloudframe.app.ms00d363.dto;

/**
*  The class Ms10frptMbrDetailRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ms10frptMbrDetailRec extends Ms10frptMbrDetailRecSerialized {
   
				@Getter @Setter private Ms10frptDetDelvData ms10frptDetDelvData = new Ms10frptDetDelvData();

						@Getter @Setter private char[] ms10frptDetEsrvSarData = Field.fillLowValue(74);

						@Getter @Setter private char[] ms10frptFill4 = Field.fillLowValue(19);

								@Getter @Setter private long ms10frptDetSysDte;

								@Getter @Setter private long ms10frptDetSysTime;

						@Getter @Setter private char[] ms10frptFill5 = Field.fillLowValue(14);

								@Getter @Setter private long ms10frptDetMemberIca;

						@Getter @Setter private char[] ms10frptDetEservFlag = Field.fillLowValue(1);

						@Getter @Setter private char[] ms10frptFill6 = Field.fillLowValue(10);

						@Getter @Setter private char[] ms10frptDetEarlyDlvry = Field.fillLowValue(1);

						@Getter @Setter private char[] ms10frptRptDetail = Field.fillLowValue(133);
	
	/**
	* Constructor for Ms10frptMbrDetailRec
	**/
    public Ms10frptMbrDetailRec() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getMs10frptDetDelvData().setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }





}
  
