package com.cloudframe.app.init4.dto;

/**
*  The class DataTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:54. using version 5.0.0.256
**/


import com.cloudframe.app.init4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class DataTable extends DataTableSerialized {
   
			private List<DataTableArray1> dataTableArray1 = new ArrayList<>();
    	
	
	/**
	* Constructor for DataTable
	**/
    public DataTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DATA_TABLE_ARRAY_1_SIZE;arrayIndex++) {
						dataTableArray1.add(new DataTableArray1(this, beginDataTableArray1 + 
						arrayIndex * DataTableArray1.getDataTableArray1FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of dataTableArray1
	 *  Corresponding COBOL Variable is FILLER
	 *	@return dataTableArray1
	 */
   public List<DataTableArray1> getDataTableArray1() {
       return dataTableArray1;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return dataTableArray1
	 */
	public DataTableArray1 getDataTableArray1(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDataTableArray1(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DATA_TABLE_ARRAY_1_SIZE) {
             	index = DATA_TABLE_ARRAY_1_SIZE -1; // can't exceed max array size
             	logger.trace("dataTableArray1 - Array index exceeded max Size {}, resetting it to max allowed",DATA_TABLE_ARRAY_1_SIZE); 
	    }
		if (index >= dataTableArray1.size()) {
       		for (int fillIndex =  dataTableArray1.size() -1; fillIndex < index;fillIndex++) {
		       dataTableArray1.add(null);
		    }
			dataTableArray1.set(index,
			   	   	new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength()) 
				                        ); 	
		} 
   	   DataTableArray1 value = dataTableArray1.get(index);
   	   if (value == null) {
   	      dataTableArray1.set(index,
			   	   	new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength()) 
				                        ); 
		  value = dataTableArray1.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update DataTableArray1 at index with the passed value
	 *  Corresponding COBOL Variable is FILLER
	 *  @param index
	 *	@param value
	 */
  public void setDataTableArray1(int index,char[] value) {
   	getDataTableArray1(index).setString(value);
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
               dataTableArray1.add(newElement);
          }
     } else {
        if (dataTableArray1.size() < DATA_TABLE_ARRAY_1_SIZE) {
          // prefill it first
          for (int index = dataTableArray1.size();index <  DATA_TABLE_ARRAY_1_SIZE;index++) {
              DataTableArray1  newElement = new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength());
               dataTableArray1.add(newElement);
          }
        }
        
     	for (int index = 0;index <  DATA_TABLE_ARRAY_1_SIZE;index++) {
     		DataTableArray1 dataTableArray1Var = dataTableArray1.get(index);
 			if (dataTableArray1Var == null) {
                dataTableArray1Var = new DataTableArray1(this,beginDataTableArray1 + index * DataTableArray1.getDataTableArray1FieldLength());
                  dataTableArray1.set(index, dataTableArray1Var);
			} 
			dataTableArray1Var.initialize();
		}
     }
   }

		public static int getDataTableFieldLength() {
			return DATA_TABLE_LENGTH;
		}

}
  
