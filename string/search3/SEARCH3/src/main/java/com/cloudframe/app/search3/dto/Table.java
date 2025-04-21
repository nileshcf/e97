package com.cloudframe.app.search3.dto;

/**
*  The class Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/


import com.cloudframe.app.search3.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class Table extends TableSerialized { 
   
			private List<TableEntry> tableEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for Table
	**/
    public Table() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Table. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Table(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of tableEntry
	 *  Corresponding COBOL Variable is WS-TABLE-ENTRY
	 *	@return tableEntry
	 */
   public List<TableEntry> getTableEntry() {
       return tableEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tableEntry
	 */
	public TableEntry getTableEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTableEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= TABLE_ENTRY_SIZE) {
             	index = TABLE_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("tableEntry - Array index exceeded max Size {}, resetting it to max allowed",TABLE_ENTRY_SIZE); 
	    }
		if (index >= tableEntry.size()) {
       		for (int fillIndex =  tableEntry.size() -1; fillIndex < index;fillIndex++) {
		       tableEntry.add(null);
		    }
			tableEntry.set(index,
			   	   	new TableEntry(this,beginTableEntry + index * TableEntry.getTableEntryFieldLength()) 
				                        ); 	
		} 
   	   TableEntry value = tableEntry.get(index);
   	   if (value == null) {
   	      tableEntry.set(index,
			   	   	new TableEntry(this,beginTableEntry + index * TableEntry.getTableEntryFieldLength()) 
				                        ); 
		  value = tableEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TableEntry at index with the passed value
	 *  Corresponding COBOL Variable is WS-TABLE-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setTableEntry(int index,char[] value) {
   	getTableEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getTableFieldLength() {
			return TABLE_LENGTH;
		}

}
  
