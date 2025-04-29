package com.cloudframe.app.ip224620.dto;

/**
*  The class Pds501S1s2s3Entries500 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:26. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class Pds501S1s2s3Entries500 extends Pds501S1s2s3Entries500Serialized {
   

								@Getter @Setter private short pds501S1s2s3Tcnt500;
			@Getter @Setter private List<Pds501S1s2s3Table500> pds501S1s2s3Table500 = new ArrayList<>();
    	
	
	/**
	* Constructor for Pds501S1s2s3Entries500
	**/
    public Pds501S1s2s3Entries500() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < PDS_501_S_1S_2S_3_TABLE_500_SIZE;arrayIndex++) {
						getPds501S1s2s3Table500().add(new Pds501S1s2s3Table500(this, beginPds501S1s2s3Table500 + 
						arrayIndex * Pds501S1s2s3Table500.getPds501S1s2s3Table500FieldLength()));
				}
	   	/*  end of offset */
			for (int arrayIndex = 0; arrayIndex < PDS_501_S_1S_2S_3_TABLE_500_SIZE;arrayIndex++) {
					getPds501S1s2s3Table500().add(new Pds501S1s2s3Table500(this, beginPds501S1s2s3Table500 + 
						arrayIndex * Pds501S1s2s3Table500.getPds501S1s2s3Table500FieldLength()));
			}
    }





}
  
