package com.cloudframe.app.cfif01.dto;

/**
*  The class DataTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:04. using version 5.0.0.254
**/


import com.cloudframe.app.cfif01.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class DataTable extends DataTableSerialized {
   
			private List<DataTableArray> dataTableArray = new ArrayList<>();
    	
	
	/**
	* Constructor for DataTable
	**/
    public DataTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DATA_TABLE_ARRAY_SIZE;arrayIndex++) {
						dataTableArray.add(new DataTableArray(this, beginDataTableArray + 
						arrayIndex * DataTableArray.getDataTableArrayFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of dataTableArray
	 *  Corresponding COBOL Variable is DATA-TABLE-ARRAY
	 *	@return dataTableArray
	 */
   public List<DataTableArray> getDataTableArray() {
       return dataTableArray;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return dataTableArray
	 */
	public DataTableArray getDataTableArray(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDataTableArray(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DATA_TABLE_ARRAY_SIZE) {
             	index = DATA_TABLE_ARRAY_SIZE -1; // can't exceed max array size
             	logger.trace("dataTableArray - Array index exceeded max Size {}, resetting it to max allowed",DATA_TABLE_ARRAY_SIZE); 
	    }
		if (index >= dataTableArray.size()) {
       		for (int fillIndex =  dataTableArray.size() -1; fillIndex < index;fillIndex++) {
		       dataTableArray.add(null);
		    }
			dataTableArray.set(index,
			   	   	new DataTableArray(this,beginDataTableArray + index * DataTableArray.getDataTableArrayFieldLength()) 
				                        ); 	
		} 
   	   DataTableArray value = dataTableArray.get(index);
   	   if (value == null) {
   	      dataTableArray.set(index,
			   	   	new DataTableArray(this,beginDataTableArray + index * DataTableArray.getDataTableArrayFieldLength()) 
				                        ); 
		  value = dataTableArray.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update DataTableArray at index with the passed value
	 *  Corresponding COBOL Variable is DATA-TABLE-ARRAY
	 *  @param index
	 *	@param value
	 */
  public void setDataTableArray(int index,char[] value) {
   	getDataTableArray(index).setString(value);
   }
   
	

	
	
	

		public static int getDataTableFieldLength() {
			return DATA_TABLE_LENGTH;
		}

}
  
