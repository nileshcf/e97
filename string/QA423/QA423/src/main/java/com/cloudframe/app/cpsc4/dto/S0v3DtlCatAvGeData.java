package com.cloudframe.app.cpsc4.dto;

/**
*  The class S0v3DtlCatAvGeData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class S0v3DtlCatAvGeData extends S0v3DtlCatAvGeDataSerialized {
   
			@Getter @Setter private List<CatAvGeData> catAvGeData = new ArrayList<>();
    	
	
	/**
	* Constructor for S0v3DtlCatAvGeData
	**/
    public S0v3DtlCatAvGeData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < CAT_AV_GE_DATA_SIZE;arrayIndex++) {
						getCatAvGeData().add(new CatAvGeData(this, beginCatAvGeData + 
						arrayIndex * CatAvGeData.getCatAvGeDataFieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < CAT_AV_GE_DATA_SIZE;arrayIndex++) {
					getCatAvGeData().add(new CatAvGeData(this, beginCatAvGeData + 
						arrayIndex * CatAvGeData.getCatAvGeDataFieldLength()));
			}
    }





}
  
