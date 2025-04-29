package com.cloudframe.app.divide0.dto;

/**
*  The class DaReportTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import java.math.BigDecimal;


@Data
public class DaReportTable extends DaReportTableSerialized {
   

						@Getter @Setter private char[] daFileArea = new char[10];

								@Getter @Setter private int daSub;

								@Getter @Setter private int daSubPfx;

								@Getter @Setter private int daIx;

								@Getter @Setter private int daSubSave;

								@Getter @Setter private int daColMax;

								@Getter @Setter private int daTblMax;

								@Getter @Setter private int daHoldMax;
			@Getter @Setter private List<DaTblEntries> daTblEntries = new ArrayList<>();
    	

								@Getter @Setter private BigDecimal daPcntHold = BigDecimal.ZERO;
	
	/**
	* Constructor for DaReportTable
	**/
    public DaReportTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DA_TBL_ENTRIES_SIZE;arrayIndex++) {
						getDaTblEntries().add(new DaTblEntries(this, beginDaTblEntries + 
						arrayIndex * DaTblEntries.getDaTblEntriesFieldLength()));
				}
	   	/*  end of offset */
								setDaFileArea(("DA-AREA-->").toCharArray());
								setDaSub(0);
								setDaSubPfx(0);
								setDaIx(0);
								setDaSubSave(0);
								setDaColMax(50);
								setDaTblMax(150);
								setDaHoldMax(0);
    }





}
  
