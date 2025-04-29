package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlRsrchData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class S0v3DtlRsrchData extends S0v3DtlRsrchDataSerialized {
   
			@Getter @Setter private List<RsrchData> rsrchData = new ArrayList<>();
    	
	
	/**
	* Constructor for S0v3DtlRsrchData
	**/
    public S0v3DtlRsrchData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < RSRCH_DATA_SIZE;arrayIndex++) {
						getRsrchData().add(new RsrchData(this, beginRsrchData + 
						arrayIndex * RsrchData.getRsrchDataFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < RSRCH_DATA_SIZE;arrayIndex++) {
					getRsrchData().add(new RsrchData(this, beginRsrchData + 
						arrayIndex * RsrchData.getRsrchDataFieldLength()));
			}
    }





}
  
