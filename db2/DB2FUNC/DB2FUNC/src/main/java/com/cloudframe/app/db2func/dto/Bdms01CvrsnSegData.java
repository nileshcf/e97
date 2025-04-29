package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CvrsnSegData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:22. using version 5.0.0.257
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class Bdms01CvrsnSegData extends Bdms01CvrsnSegDataSerialized { 
   

								private int bdms01CvrsnSegSqlcd;
			private List<Bdms01CvrsnTable> bdms01CvrsnTable = new ArrayList<>();
    	
	
	/**
	* Constructor for Bdms01CvrsnSegData
	**/
    public Bdms01CvrsnSegData() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Bdms01CvrsnSegData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CvrsnSegData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of bdms01CvrsnSegSqlcd
	 *	@return bdms01CvrsnSegSqlcd
	 */
	public int getBdms01CvrsnSegSqlcd() throws CFException {
       if (isBdms01CvrsnSegSqlcdModified()) { 
           bdms01CvrsnSegSqlcd = refreshBdms01CvrsnSegSqlcd();
        }
   		return bdms01CvrsnSegSqlcd;
	}
	

	
	   
	/**
	 * 	Update Bdms01CvrsnSegSqlcd with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-SEG-SQLCD
	 *	@param number
	 */
	public void setBdms01CvrsnSegSqlcd(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    bdms01CvrsnSegSqlcd = checkBdms01CvrsnSegSqlcdMaxLimit(number); 
		serializeBdms01CvrsnSegSqlcd(bdms01CvrsnSegSqlcd);
	}
	

	public void setBdms01CvrsnSegSqlcd(long number) {
	    number = checkBdms01CvrsnSegSqlcdMaxLimit(number); // Truncate if value is beyond +/- Max range
		setBdms01CvrsnSegSqlcd((int)number);
	}
	
	/**
	 * 	Update Bdms01CvrsnSegSqlcd with the passed value
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnSegSqlcd(char[] value) throws CFException {
		 bdms01CvrsnSegSqlcd = serializeBdms01CvrsnSegSqlcd(value);
	}
	/**
	 * 	Update Bdms01CvrsnSegSqlcd with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setBdms01CvrsnSegSqlcdString(char[] value) throws CFException {
		 setBdms01CvrsnSegSqlcd(value);
	}
	/**
	 *	Returns the  value of bdms01CvrsnTable
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-TABLE
	 *	@return bdms01CvrsnTable
	 */
   public List<Bdms01CvrsnTable> getBdms01CvrsnTable() {
       return bdms01CvrsnTable;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return bdms01CvrsnTable
	 */
	public Bdms01CvrsnTable getBdms01CvrsnTable(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getBdms01CvrsnTable(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= BDMS_01_CVRSN_TABLE_SIZE) {
             	index = BDMS_01_CVRSN_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("bdms01CvrsnTable - Array index exceeded max Size {}, resetting it to max allowed",BDMS_01_CVRSN_TABLE_SIZE); 
	    }
		if (index >= bdms01CvrsnTable.size()) {
       		for (int fillIndex =  bdms01CvrsnTable.size() -1; fillIndex < index;fillIndex++) {
		       bdms01CvrsnTable.add(null);
		    }
			bdms01CvrsnTable.set(index,
			   	   	new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength()) 
				                        ); 	
		} 
   	   Bdms01CvrsnTable value = bdms01CvrsnTable.get(index);
   	   if (value == null) {
   	      bdms01CvrsnTable.set(index,
			   	   	new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength()) 
				                        ); 
		  value = bdms01CvrsnTable.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Bdms01CvrsnTable at index with the passed value
	 *  Corresponding COBOL Variable is BDMS01-CVRSN-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setBdms01CvrsnTable(int index,char[] value) {
   	getBdms01CvrsnTable(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Bdms01CvrsnSegData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setBdms01CvrsnSegSqlcd(0);
     if (bdms01CvrsnTable.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  BDMS_01_CVRSN_TABLE_SIZE;index++) {
              Bdms01CvrsnTable  newElement = new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength());
              newElement.initialize();
               bdms01CvrsnTable.add(newElement);
          }
     } else {
        if (bdms01CvrsnTable.size() < BDMS_01_CVRSN_TABLE_SIZE) {
          // prefill it first
          for (int index = bdms01CvrsnTable.size();index <  BDMS_01_CVRSN_TABLE_SIZE;index++) {
              Bdms01CvrsnTable  newElement = new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength());
               bdms01CvrsnTable.add(newElement);
          }
        }
        
     	for (int index = 0;index <  BDMS_01_CVRSN_TABLE_SIZE;index++) {
     		Bdms01CvrsnTable bdms01CvrsnTableVar = bdms01CvrsnTable.get(index);
 			if (bdms01CvrsnTableVar == null) {
                bdms01CvrsnTableVar = new Bdms01CvrsnTable(this,beginBdms01CvrsnTable + index * Bdms01CvrsnTable.getBdms01CvrsnTableFieldLength());
                  bdms01CvrsnTable.set(index, bdms01CvrsnTableVar);
			} 
			bdms01CvrsnTableVar.initialize();
		}
     }
   }

		public static int getBdms01CvrsnSegDataFieldLength() {
			return BDMS_01_CVRSN_SEG_DATA_LENGTH;
		}

}
  
