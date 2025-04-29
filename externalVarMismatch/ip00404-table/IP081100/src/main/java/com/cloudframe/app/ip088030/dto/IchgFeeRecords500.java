package com.cloudframe.app.ip088030.dto;

/**
*  The class IchgFeeRecords500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class IchgFeeRecords500 extends IchgFeeRecords500Serialized {
   

								@Getter @Setter private short ichgEntriesMax500;

								@Getter @Setter private short ichgEntriesCnt500;
			@Getter @Setter private List<IchgEntry500> ichgEntry500 = new ArrayList<>();
    	
	
	/**
	* Constructor for IchgFeeRecords500
	**/
    public IchgFeeRecords500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < ICHG_ENTRY_500_SIZE;arrayIndex++) {
						getIchgEntry500().add(new IchgEntry500(this, beginIchgEntry500 + 
						arrayIndex * IchgEntry500.getIchgEntry500FieldLength()));
				}
	   	/*  end of offset */
								setIchgEntriesMax500((short)9999);
    }





}
  
