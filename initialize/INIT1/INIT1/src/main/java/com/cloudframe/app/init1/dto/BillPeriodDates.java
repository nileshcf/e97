package com.cloudframe.app.init1.dto;

/**
*  The class BillPeriodDates is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class BillPeriodDates extends BillPeriodDatesSerialized { 
   

						@Getter @Setter private char[] dateBlCycNo = Field.fillLowValue(2);

						@Getter @Setter private char[] dateCycMthYr = Field.fillLowValue(6);

						@Getter @Setter private char[] nextCycStartDt = Field.fillLowValue(10);
			@Getter @Setter private List<BpDates> bpDates = new ArrayList<>();
    	
	
	/**
	* Constructor for BillPeriodDates
	**/
    public BillPeriodDates() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for BillPeriodDates. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BillPeriodDates(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes BillPeriodDates
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDateBlCycNo(CONSTANTS.SPACE_2);
         setDateCycMthYr(CONSTANTS.SPACE_6);
         setNextCycStartDt(CONSTANTS.SPACE_10);
     if (bpDates.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BP_DATES_SIZE;index++) {
              BpDates  newElement = new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength());
              newElement.initialize();
              getBpDates().add(newElement);
          }
     } else {
        if (bpDates.size() < BP_DATES_SIZE) {
          // prefill it first
          for (int index = bpDates.size();index <  BP_DATES_SIZE;index++) {
              BpDates  newElement = new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength());
              getBpDates().add(newElement);
          }
        }
        
     	for (int index = 0;index <  BP_DATES_SIZE;index++) {
     		BpDates bpDatesVar = bpDates.get(index);
 			if (bpDatesVar == null) {
                bpDatesVar = new BpDates(this,beginBpDates + index * BpDates.getBpDatesFieldLength());
                  getBpDates().set(index, bpDatesVar);
			} 
			bpDatesVar.initialize();
		}
     }
   }


}
  
