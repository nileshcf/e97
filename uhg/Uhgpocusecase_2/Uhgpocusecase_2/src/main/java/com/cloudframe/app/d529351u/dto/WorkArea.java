package com.cloudframe.app.d529351u.dto;

/**
*  The class WorkArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class WorkArea extends WorkAreaSerialized {
   

						@Getter @Setter private char[] dsmPgmName = new char[8];

								@Getter @Setter private short nullSpiVerNbr;

						@Getter @Setter private char[] commonRulesSpi = new char[7];

						@Getter @Setter private char[] db2ReqDosDate = Field.fillLowValue(10);
				@Getter @Setter private Db2ReqDosDateRedefined db2ReqDosDateRedefined = new Db2ReqDosDateRedefined();
	
	/**
	* Constructor for WorkArea
	**/
    public WorkArea() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getDb2ReqDosDateRedefined().setParent(this,getStartOffset() + 17);
	   	/*  end of offset */
								setDsmPgmName(("D529351U").toCharArray());
								setNullSpiVerNbr((short)0);
								setCommonRulesSpi(fillSpace(7));
    }





}
  
