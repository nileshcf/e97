package com.cloudframe.app.ms00d363.dto;

/**
*  The class SamapcTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class SamapcTbl extends SamapcTblSerialized { 
   
			private List<SamapcTable> samapcTable = new ArrayList<>();
    	
	
	/**
	* Constructor for SamapcTbl
	**/
    public SamapcTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < SAMAPC_TABLE_SIZE;arrayIndex++) {
						samapcTable.add(new SamapcTable(this, beginSamapcTable + 
						arrayIndex * SamapcTable.getSamapcTableFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of samapcTable
	 *  Corresponding COBOL Variable is WS-SAMAPC-TABLE
	 *	@return samapcTable
	 */
   public List<SamapcTable> getSamapcTable() {
       return samapcTable;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return samapcTable
	 */
	public SamapcTable getSamapcTable(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getSamapcTable(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= SAMAPC_TABLE_SIZE) {
             	index = SAMAPC_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("samapcTable - Array index exceeded max Size {}, resetting it to max allowed",SAMAPC_TABLE_SIZE); 
	    }
		if (index >= samapcTable.size()) {
       		for (int fillIndex =  samapcTable.size() -1; fillIndex < index;fillIndex++) {
		       samapcTable.add(null);
		    }
			samapcTable.set(index,
			   	   	new SamapcTable(this,beginSamapcTable + index * SamapcTable.getSamapcTableFieldLength()) 
				                        ); 	
		} 
   	   SamapcTable value = samapcTable.get(index);
   	   if (value == null) {
   	      samapcTable.set(index,
			   	   	new SamapcTable(this,beginSamapcTable + index * SamapcTable.getSamapcTableFieldLength()) 
				                        ); 
		  value = samapcTable.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update SamapcTable at index with the passed value
	 *  Corresponding COBOL Variable is WS-SAMAPC-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setSamapcTable(int index,char[] value) {
   	getSamapcTable(index).setString(value);
   }
   
	

	
	
	

		public static int getSamapcTblFieldLength() {
			return SAMAPC_TBL_LENGTH;
		}

}
  
