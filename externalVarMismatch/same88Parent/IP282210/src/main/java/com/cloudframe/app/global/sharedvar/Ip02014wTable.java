package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip02014wTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:34. using version 5.0.0.256
**/


import com.cloudframe.app.global.sharedvar.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.dto.GlobalDto;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


@GlobalDto
public class Ip02014wTable extends Ip02014wTableSerialized { 
   
			private List<Ip02014wPrcsAgrmtTable> ip02014wPrcsAgrmtTable = new ArrayList<>();
    	
	
	/**
	* Constructor for Ip02014wTable
	**/
    public Ip02014wTable() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_02014W_PRCS_AGRMT_TABLE_SIZE;arrayIndex++) {
						ip02014wPrcsAgrmtTable.add(new Ip02014wPrcsAgrmtTable(this, beginIp02014wPrcsAgrmtTable + 
						arrayIndex * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of ip02014wPrcsAgrmtTable
	 *  Corresponding COBOL Variable is IP02014W-PRCS-AGRMT-TABLE
	 *	@return ip02014wPrcsAgrmtTable
	 */
   public List<Ip02014wPrcsAgrmtTable> getIp02014wPrcsAgrmtTable() {
       return ip02014wPrcsAgrmtTable;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip02014wPrcsAgrmtTable
	 */
	public Ip02014wPrcsAgrmtTable getIp02014wPrcsAgrmtTable(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp02014wPrcsAgrmtTable(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_02014W_PRCS_AGRMT_TABLE_SIZE) {
             	index = IP_02014W_PRCS_AGRMT_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("ip02014wPrcsAgrmtTable - Array index exceeded max Size {}, resetting it to max allowed",IP_02014W_PRCS_AGRMT_TABLE_SIZE); 
	    }
		if (index >= ip02014wPrcsAgrmtTable.size()) {
       		for (int fillIndex =  ip02014wPrcsAgrmtTable.size() -1; fillIndex < index;fillIndex++) {
		       ip02014wPrcsAgrmtTable.add(null);
		    }
			ip02014wPrcsAgrmtTable.set(index,
			   	   	new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength()) 
				                        ); 	
		} 
   	   Ip02014wPrcsAgrmtTable value = ip02014wPrcsAgrmtTable.get(index);
   	   if (value == null) {
   	      ip02014wPrcsAgrmtTable.set(index,
			   	   	new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength()) 
				                        ); 
		  value = ip02014wPrcsAgrmtTable.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip02014wPrcsAgrmtTable at index with the passed value
	 *  Corresponding COBOL Variable is IP02014W-PRCS-AGRMT-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setIp02014wPrcsAgrmtTable(int index,char[] value) {
   	getIp02014wPrcsAgrmtTable(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes Ip02014wTable
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (ip02014wPrcsAgrmtTable.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_02014W_PRCS_AGRMT_TABLE_SIZE;index++) {
              Ip02014wPrcsAgrmtTable  newElement = new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength());
              newElement.initialize();
               ip02014wPrcsAgrmtTable.add(newElement);
          }
     } else {
        if (ip02014wPrcsAgrmtTable.size() < IP_02014W_PRCS_AGRMT_TABLE_SIZE) {
          // prefill it first
          for (int index = ip02014wPrcsAgrmtTable.size();index <  IP_02014W_PRCS_AGRMT_TABLE_SIZE;index++) {
              Ip02014wPrcsAgrmtTable  newElement = new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength());
               ip02014wPrcsAgrmtTable.add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_02014W_PRCS_AGRMT_TABLE_SIZE;index++) {
     		Ip02014wPrcsAgrmtTable ip02014wPrcsAgrmtTableVar = ip02014wPrcsAgrmtTable.get(index);
 			if (ip02014wPrcsAgrmtTableVar == null) {
                ip02014wPrcsAgrmtTableVar = new Ip02014wPrcsAgrmtTable(this,beginIp02014wPrcsAgrmtTable + index * Ip02014wPrcsAgrmtTable.getIp02014wPrcsAgrmtTableFieldLength());
                  ip02014wPrcsAgrmtTable.set(index, ip02014wPrcsAgrmtTableVar);
			} 
			ip02014wPrcsAgrmtTableVar.initialize();
		}
     }
   }

		public static int getIp02014wTableFieldLength() {
			return IP_02014W_TABLE_LENGTH;
		}

}
  
