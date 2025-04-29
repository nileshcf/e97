package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlDriftData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class S0v3DtlDriftData extends S0v3DtlDriftDataSerialized {
   
			@Getter @Setter private List<DriftData> driftData = new ArrayList<>();
    	
	
	/**
	* Constructor for S0v3DtlDriftData
	**/
    public S0v3DtlDriftData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < DRIFT_DATA_SIZE;arrayIndex++) {
						getDriftData().add(new DriftData(this, beginDriftData + 
						arrayIndex * DriftData.getDriftDataFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < DRIFT_DATA_SIZE;arrayIndex++) {
					getDriftData().add(new DriftData(this, beginDriftData + 
						arrayIndex * DriftData.getDriftDataFieldLength()));
			}
    }





}
  
