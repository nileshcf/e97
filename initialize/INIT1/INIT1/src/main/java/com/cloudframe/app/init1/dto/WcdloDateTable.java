package com.cloudframe.app.init1.dto;

/**
*  The class WcdloDateTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;
import java.util.List;
import java.util.ArrayList;


public class WcdloDateTable extends WcdloDateTableSerialized { 
   
			private List<WcdloDateTbl> wcdloDateTbl = new ArrayList<>();
    	
	
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
	 *	Returns the  value of wcdloDateTbl
	 *  Corresponding COBOL Variable is WCDLO-DATE-TBL
	 *	@return wcdloDateTbl
	 */
   public List<WcdloDateTbl> getWcdloDateTbl() {
       return wcdloDateTbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return wcdloDateTbl
	 */
	public WcdloDateTbl getWcdloDateTbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getWcdloDateTbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= WCDLO_DATE_TBL_SIZE) {
             	index = WCDLO_DATE_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("wcdloDateTbl - Array index exceeded max Size {}, resetting it to max allowed",WCDLO_DATE_TBL_SIZE); 
	    }
		if (index >= wcdloDateTbl.size()) {
       		for (int fillIndex =  wcdloDateTbl.size() -1; fillIndex < index;fillIndex++) {
		       wcdloDateTbl.add(null);
		    }
			wcdloDateTbl.set(index,
			   	   	new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength()) 
				                        ); 	
		} 
   	   WcdloDateTbl value = wcdloDateTbl.get(index);
   	   if (value == null) {
   	      wcdloDateTbl.set(index,
			   	   	new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength()) 
				                        ); 
		  value = wcdloDateTbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update WcdloDateTbl at index with the passed value
	 *  Corresponding COBOL Variable is WCDLO-DATE-TBL
	 *  @param index
	 *	@param value
	 */
  public void setWcdloDateTbl(int index,char[] value) {
   	getWcdloDateTbl(index).setString(value);
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
               wcdloDateTbl.add(newElement);
          }
     } else {
        if (wcdloDateTbl.size() < WCDLO_DATE_TBL_SIZE) {
          // prefill it first
          for (int index = wcdloDateTbl.size();index <  WCDLO_DATE_TBL_SIZE;index++) {
              WcdloDateTbl  newElement = new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength());
               wcdloDateTbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  WCDLO_DATE_TBL_SIZE;index++) {
     		WcdloDateTbl wcdloDateTblVar = wcdloDateTbl.get(index);
 			if (wcdloDateTblVar == null) {
                wcdloDateTblVar = new WcdloDateTbl(this,beginWcdloDateTbl + index * WcdloDateTbl.getWcdloDateTblFieldLength());
                  wcdloDateTbl.set(index, wcdloDateTblVar);
			} 
			wcdloDateTblVar.initialize();
		}
     }
   }

		public static int getWcdloDateTableFieldLength() {
			return WCDLO_DATE_TABLE_LENGTH;
		}

}
  
