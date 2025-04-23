package com.cloudframe.app.ms00d363.dto;

/**
*  The class CurrcyTbl is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class CurrcyTbl extends CurrcyTblSerialized {
   
			private List<CurcyTable2> curcyTable2 = new ArrayList<>();
    	
	
	/**
	* Constructor for CurrcyTbl
	**/
    public CurrcyTbl() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CURCY_TABLE_2_SIZE;arrayIndex++) {
						curcyTable2.add(new CurcyTable2(this, beginCurcyTable2 + 
						arrayIndex * CurcyTable2.getCurcyTable2FieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of curcyTable2
	 *  Corresponding COBOL Variable is WS-CURCY-TABLE2
	 *	@return curcyTable2
	 */
   public List<CurcyTable2> getCurcyTable2() {
       return curcyTable2;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return curcyTable2
	 */
	public CurcyTable2 getCurcyTable2(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getCurcyTable2(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= CURCY_TABLE_2_SIZE) {
             	index = CURCY_TABLE_2_SIZE -1; // can't exceed max array size
             	logger.trace("curcyTable2 - Array index exceeded max Size {}, resetting it to max allowed",CURCY_TABLE_2_SIZE); 
	    }
		if (index >= curcyTable2.size()) {
       		for (int fillIndex =  curcyTable2.size() -1; fillIndex < index;fillIndex++) {
		       curcyTable2.add(null);
		    }
			curcyTable2.set(index,
			   	   	new CurcyTable2(this,beginCurcyTable2 + index * CurcyTable2.getCurcyTable2FieldLength()) 
				                        ); 	
		} 
   	   CurcyTable2 value = curcyTable2.get(index);
   	   if (value == null) {
   	      curcyTable2.set(index,
			   	   	new CurcyTable2(this,beginCurcyTable2 + index * CurcyTable2.getCurcyTable2FieldLength()) 
				                        ); 
		  value = curcyTable2.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update CurcyTable2 at index with the passed value
	 *  Corresponding COBOL Variable is WS-CURCY-TABLE2
	 *  @param index
	 *	@param value
	 */
  public void setCurcyTable2(int index,char[] value) {
   	getCurcyTable2(index).setString(value);
   }
   
	

	
	
	

		public static int getCurrcyTblFieldLength() {
			return CURRCY_TBL_LENGTH;
		}

}
  
