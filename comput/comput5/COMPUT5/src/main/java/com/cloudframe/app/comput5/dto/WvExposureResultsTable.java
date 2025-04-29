package com.cloudframe.app.comput5.dto;

/**
*  The class WvExposureResultsTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:39. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class WvExposureResultsTable extends WvExposureResultsTableSerialized {
   
			@Getter @Setter private List<WvAccounts> wvAccounts = new ArrayList<>();
    	

								@Getter @Setter private short wvAcctIndex;

								@Getter @Setter private int wvWeightIndex;

								@Getter @Setter private short wvMonthIndex;
	
	/**
	* Constructor for WvExposureResultsTable
	**/
    public WvExposureResultsTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < WV_ACCOUNTS_SIZE;arrayIndex++) {
						getWvAccounts().add(new WvAccounts(this, beginWvAccounts + 
						arrayIndex * WvAccounts.getWvAccountsFieldLength()));
				}
	   	/*  end of offset */
    }





}
  
