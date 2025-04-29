package com.cloudframe.app.init1.dto;

/**
*  The class WcdloDateTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


@Data
public class WcdloDateTable extends WcdloDateTableSerialized { 
   
			@Getter @Setter private List<WcdloDateTbl> wcdloDateTbl = new ArrayList<>();
    	
	
	/**
	* Constructor for WcdloDateTable
	**/
    public WcdloDateTable() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for WcdloDateTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcdloDateTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes WcdloDateTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (wcdloDateTbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  WCDLO_DATE_TBL_SIZE;index++) {
              WcdloDateTbl  newElement = new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength());
              newElement.initialize();
              getWcdloDateTbl().add(newElement);
          }
     } else {
        if (wcdloDateTbl.size() < WCDLO_DATE_TBL_SIZE) {
          // prefill it first
          for (int index = wcdloDateTbl.size();index <  WCDLO_DATE_TBL_SIZE;index++) {
              WcdloDateTbl  newElement = new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength());
              getWcdloDateTbl().add(newElement);
          }
        }
        
     	for (int index = 0;index <  WCDLO_DATE_TBL_SIZE;index++) {
     		WcdloDateTbl wcdloDateTblVar = wcdloDateTbl.get(index);
 			if (wcdloDateTblVar == null) {
                wcdloDateTblVar = new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength());
                  getWcdloDateTbl().set(index, wcdloDateTblVar);
			} 
			wcdloDateTblVar.initialize();
		}
     }
   }


}
  
