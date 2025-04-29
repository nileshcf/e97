package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlDriftData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:30. using version 5.0.0.257
**/


import com.cloudframe.app.cpsc4.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;


public class S0v3DtlDriftData extends S0v3DtlDriftDataSerialized {
   
			private List<DriftData> driftData = new ArrayList<>();
    	
	
	/**
	* Constructor for S0v3DtlDriftData
	**/
    public S0v3DtlDriftData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DRIFT_DATA_SIZE;arrayIndex++) {
						driftData.add(new DriftData(this, beginDriftData + 
						arrayIndex * DriftData.getDriftDataFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < DRIFT_DATA_SIZE;arrayIndex++) {
					driftData.add(new DriftData(this, beginDriftData + 
						arrayIndex * DriftData.getDriftDataFieldLength()));
			}
    }


 

	/**
	 *	Returns the  value of driftData
	 *  Corresponding COBOL Variable is WS-DRIFT-DATA
	 *	@return driftData
	 */
   public List<DriftData> getDriftData() {
       return driftData;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return driftData
	 */
	public DriftData getDriftData(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getDriftData(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= DRIFT_DATA_SIZE) {
             	index = DRIFT_DATA_SIZE -1; // can't exceed max array size
             	logger.trace("driftData - Array index exceeded max Size {}, resetting it to max allowed",DRIFT_DATA_SIZE); 
	    }
		if (index >= driftData.size()) {
       		for (int fillIndex =  driftData.size() -1; fillIndex < index;fillIndex++) {
		       driftData.add(null);
		    }
			driftData.set(index,
			   	   	new DriftData(this,beginDriftData + index * DriftData.getDriftDataFieldLength()) 
				                        ); 	
		} 
   	   DriftData value = driftData.get(index);
   	   if (value == null) {
   	      driftData.set(index,
			   	   	new DriftData(this,beginDriftData + index * DriftData.getDriftDataFieldLength()) 
				                        ); 
		  value = driftData.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update DriftData at index with the passed value
	 *  Corresponding COBOL Variable is WS-DRIFT-DATA
	 *  @param index
	 *	@param value
	 */
  public void setDriftData(int index,char[] value) {
   	getDriftData(index).setString(value);
   }
   
	

	
	
	

		public static int getS0v3DtlDriftDataFieldLength() {
			return S_0V_3_DTL_DRIFT_DATA_LENGTH;
		}

}
  
