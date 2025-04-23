package com.cloudframe.app.mcissues.dto;

/**
*  The class TableArray is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.mcissues.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.List;
import java.util.ArrayList;


public class TableArray extends TableArraySerialized {
   
      private List<char[]> tableItem; 

	
	/**
	* Constructor for TableArray
	**/
    public TableArray() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

    /**
	 *	Returns the value of tableItem
	 *  Corresponding COBOL Variable is TABLE-ITEM
	 *	@return tableItem
	 */
	public List<char[]> getTableItem() throws CFException {
        List<char[]>	list = new ArrayList<>();  
        for (int index =0;index < TABLE_ITEM_SIZE;index++) {
        	list.add( getTableItem( index) );
        }   
   		return list;
	}
	/**
	 *	Returns the element at the specified position form the list.
	 *  @param index
	 *	@return tableItem
	 */
	public char[] getTableItem(int index) {
		if (index < 0) {
		    logger.trace("Array index was {} for getTableItem(), resetting it to 0",index);
		    index = 0;
        } else if (index >= TABLE_ITEM_SIZE) {
             	index = TABLE_ITEM_SIZE -1; // can't exceed max array size
             	logger.trace("tableItem - Array index exceeded max Size {}, resetting it to max allowed",TABLE_ITEM_SIZE); 
	    }
   	      return getCharArray( (beginTableItem + index*TABLE_ITEM_LEN) , TABLE_ITEM_LEN );
    }
    
    
   public int  tableItemFieldLength() {
   	return TABLE_ITEM_LEN;
   }
   
	

  
  	/**
	 *	Update TableItem with the passed value at a given index
	 *  Corresponding COBOL Variable is TABLE-ITEM
	 *  @param index
	 *	@param value
	 */
  public void setTableItem(int index,char[] value) {
   	setTableItem(index,value,true);
   }
   
   
   /**
	 *	Update TableItem with the passed value at a given index and serializes if setModified is true
	 *  @param index
	 *	@param value
	 *	@param setModified - used for serializing as String
	 */
   private void setTableItem(int index,char[] value,boolean setModified) {
		if (index < 0) {
		    logger.trace("Array index was {} for setTableItem(int,String,boolean), reset it to 0",index);
		    index = 0;
	    }
       	
        if (value != null) {
           if (value.length > 8)  {     
		       value = substring(value,0,8);
           }  else if (value.length < 8) {
		       value = pad(8, value, SPACE_CHAR, RIGHT_PAD);
		   }   
        } else { // if value is null, fill it with spaces
      		   value = fillSpaces(8).toCharArray();
        }
	// String array will always read from stringValue so no need to explicitly set the array item
  	if (setModified) {
		serializeTableItem(index,value);		
       }
   }
   

	
	
	

		public static int getTableArrayFieldLength() {
			return TABLE_ARRAY_LENGTH;
		}

}
  
