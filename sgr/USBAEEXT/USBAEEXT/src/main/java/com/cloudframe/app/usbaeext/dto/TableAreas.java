package com.cloudframe.app.usbaeext.dto;

/**
*  The class TableAreas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class TableAreas extends TableAreasSerialized {
   

								@Getter @Setter private int taAdjIndexMax;

						@Getter @Setter private char[] taAdjTable = Field.fillLowValue(4100);
			@Getter @Setter private List<TaAdjTableRedefined> taAdjTableRedefined = new ArrayList<>();
    	

						@Getter @Setter private char[] taMonthTable = new char[36];
			@Getter @Setter private List<TaMonthTableRedefined> taMonthTableRedefined = new ArrayList<>();
    	

								@Getter @Setter private int taMonthIndex;
	
	/**
	* Constructor for TableAreas
	**/
    public TableAreas() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TA_ADJ_TABLE_REDEFINED_SIZE;arrayIndex++) {
						getTaAdjTableRedefined().add(new TaAdjTableRedefined(this, beginTaAdjTableRedefined + 
						arrayIndex * TaAdjTableRedefined.getTaAdjTableRedefinedFieldLength()));
				}
				for (int arrayIndex = 0; arrayIndex < TA_MONTH_TABLE_REDEFINED_SIZE;arrayIndex++) {
						getTaMonthTableRedefined().add(new TaMonthTableRedefined(this, beginTaMonthTableRedefined + 
						arrayIndex * TaMonthTableRedefined.getTaMonthTableRedefinedFieldLength()));
				}
	   	/*  end of offset */
								setTaAdjIndexMax(1);
								setTaMonthTable(("JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC").toCharArray());
								setTaMonthIndex(0);
    }





}
  
