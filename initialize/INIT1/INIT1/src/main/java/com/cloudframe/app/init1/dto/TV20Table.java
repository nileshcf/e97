package com.cloudframe.app.init1.dto;

/**
*  The class TV20Table is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import java.util.List;
import java.util.ArrayList;


public class TV20Table extends TV20TableSerialized {
   
			private List<TV20Tbl> tV20Tbl = new ArrayList<>();
    	
	
	/**
	* Constructor for TV20Table
	**/
    public TV20Table() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < T_V_20_TBL_SIZE;arrayIndex++) {
						tV20Tbl.add(new TV20Tbl(this, beginTV20Tbl + 
						arrayIndex * TV20Tbl.getTV20TblFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the  value of tV20Tbl
	 *  Corresponding COBOL Variable is T-V20-TBL
	 *	@return tV20Tbl
	 */
   public List<TV20Tbl> getTV20Tbl() {
       return tV20Tbl;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return tV20Tbl
	 */
	public TV20Tbl getTV20Tbl(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getTV20Tbl(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= T_V_20_TBL_SIZE) {
             	index = T_V_20_TBL_SIZE -1; // can't exceed max array size
             	logger.trace("tV20Tbl - Array index exceeded max Size {}, resetting it to max allowed",T_V_20_TBL_SIZE); 
	    }
		if (index >= tV20Tbl.size()) {
       		for (int fillIndex =  tV20Tbl.size() -1; fillIndex < index;fillIndex++) {
		       tV20Tbl.add(null);
		    }
			tV20Tbl.set(index,
			   	   	new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength()) 
				                        ); 	
		} 
   	   TV20Tbl value = tV20Tbl.get(index);
   	   if (value == null) {
   	      tV20Tbl.set(index,
			   	   	new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength()) 
				                        ); 
		  value = tV20Tbl.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update TV20Tbl at index with the passed value
	 *  Corresponding COBOL Variable is T-V20-TBL
	 *  @param index
	 *	@param value
	 */
  public void setTV20Tbl(int index,char[] value) {
   	getTV20Tbl(index).setString(value);
   }
   
	

	
	
	
	/**
	 * 	initializes TV20Table
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
     if (tV20Tbl.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  T_V_20_TBL_SIZE;index++) {
              TV20Tbl  newElement = new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength());
              newElement.initialize();
               tV20Tbl.add(newElement);
          }
     } else {
        if (tV20Tbl.size() < T_V_20_TBL_SIZE) {
          // prefill it first
          for (int index = tV20Tbl.size();index <  T_V_20_TBL_SIZE;index++) {
              TV20Tbl  newElement = new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength());
               tV20Tbl.add(newElement);
          }
        }
        
     	for (int index = 0;index <  T_V_20_TBL_SIZE;index++) {
     		TV20Tbl tV20TblVar = tV20Tbl.get(index);
 			if (tV20TblVar == null) {
                tV20TblVar = new TV20Tbl(this,beginTV20Tbl + index * TV20Tbl.getTV20TblFieldLength());
                  tV20Tbl.set(index, tV20TblVar);
			} 
			tV20TblVar.initialize();
		}
     }
   }

		public static int getTV20TableFieldLength() {
			return T_V_20_TABLE_LENGTH;
		}

}
  
