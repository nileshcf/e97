package com.cloudframe.app.ms00d363.dto;

/**
*  The class FillerTblWs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class FillerTblWs extends FillerTblWsSerialized {
   
			@Getter @Setter private List<TransTable1> transTable1 = new ArrayList<>();
    	
	
	/**
	* Constructor for FillerTblWs
	**/
    public FillerTblWs() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TRANS_TABLE_1_SIZE;arrayIndex++) {
						getTransTable1().add(new TransTable1(this, beginTransTable1 + 
						arrayIndex * TransTable1.getTransTable1FieldLength()));
				}
	   	/*  end of offset */
    }





}
  
