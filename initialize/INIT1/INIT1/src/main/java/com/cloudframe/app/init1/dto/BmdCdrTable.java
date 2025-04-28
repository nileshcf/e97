package com.cloudframe.app.init1.dto;

/**
*  The class BmdCdrTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class BmdCdrTable extends BmdCdrTableSerialized { 
   

								private short tableCtr;

								private short tableNo;
	
	/**
	* Constructor for BmdCdrTable
	**/
    public BmdCdrTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for BmdCdrTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BmdCdrTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
								setTableCtr((short)0);
								setTableNo((short)0);
    } 

	/**
	 *	Returns the value of tableCtr
	 *	@return tableCtr
	 */
	public short getTableCtr() throws CFException {
        if (isTableCtrModified()) { 
           tableCtr = refreshTableCtr();
        }
   		return tableCtr;
	}
	
	/**
	 * 	Update TableCtr with the passed value
	 *  Corresponding COBOL Variable is WS-TABLE-CTR
	 *	@param number
	 */
	public void setTableCtr(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tableCtr = checkTableCtrMaxLimit(number); 
		serializeTableCtr(tableCtr);
	}

	public void setTableCtr(int number) {
	    number = checkTableCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTableCtr((short)number);
	}
	public void setTableCtr(long number) {
	    number = checkTableCtrMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTableCtr((short)number);
	}
	

	/**
	 *	Returns the value of tableNo
	 *	@return tableNo
	 */
	public short getTableNo() throws CFException {
        if (isTableNoModified()) { 
           tableNo = refreshTableNo();
        }
   		return tableNo;
	}
	
	/**
	 * 	Update TableNo with the passed value
	 *  Corresponding COBOL Variable is WS-TABLE-NO
	 *	@param number
	 */
	public void setTableNo(short number) {
	     // Truncate if the number is beyond +/- Max range
	    tableNo = checkTableNoMaxLimit(number); 
		serializeTableNo(tableNo);
	}

	public void setTableNo(int number) {
	    number = checkTableNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTableNo((short)number);
	}
	public void setTableNo(long number) {
	    number = checkTableNoMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setTableNo((short)number);
	}
	


	
	
	

		public static int getBmdCdrTableFieldLength() {
			return BMD_CDR_TABLE_LENGTH;
		}

}
  
