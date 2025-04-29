package com.cloudframe.app.init4.dto;

/**
*  The class DataTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


@Data
public class DataTable extends DataTableSerialized {
   
			@Getter @Setter private List<DataTableArray1> dataTableArray1 = new ArrayList<>();
    	
	
	/**
	* Constructor for DataTable
	**/
    public DataTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DATA_TABLE_ARRAY_1_SIZE;arrayIndex++) {
						getDataTableArray1().add(new DataTableArray1(this, beginDataTableArray1 + 
						arrayIndex * DataTableArray1.getDataTableArray1FieldLength()));
				}
	   	/*  end of offset */
    }



	/**
	 * 	initializes DataTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (dataTableArray1.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  DATA_TABLE_ARRAY_1_SIZE;index++) {
              DataTableArray1  newElement = new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength());
              newElement.initialize();
              getDataTableArray1().add(newElement);
          }
     } else {
        if (dataTableArray1.size() < DATA_TABLE_ARRAY_1_SIZE) {
          // prefill it first
          for (int index = dataTableArray1.size();index <  DATA_TABLE_ARRAY_1_SIZE;index++) {
              DataTableArray1  newElement = new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength());
              getDataTableArray1().add(newElement);
          }
        }
        
     	for (int index = 0;index <  DATA_TABLE_ARRAY_1_SIZE;index++) {
     		DataTableArray1 dataTableArray1Var = dataTableArray1.get(index);
 			if (dataTableArray1Var == null) {
                dataTableArray1Var = new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength());
                  getDataTableArray1().set(index, dataTableArray1Var);
			} 
			dataTableArray1Var.initialize();
		}
     }
   }


}
  
