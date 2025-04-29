package com.cloudframe.app.ip798030.dto;

/**
*  The class LrmStat630 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.*;


@Data
public class LrmStat630 extends LrmStat630Serialized {
   

						@Getter @Setter private char[] lrmStatValues630 = new char[330];
			@Getter @Setter private List<LrmStatTable630> lrmStatTable630 = new ArrayList<>();
    	
	
	/**
	* Constructor for LrmStat630
	**/
    public LrmStat630() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < LRM_STAT_TABLE_630_SIZE;arrayIndex++) {
						getLrmStatTable630().add(new LrmStatTable630(this, beginLrmStatTable630 + 
						arrayIndex * LrmStatTable630.getLrmStatTable630FieldLength()));
				}
	   	/*  end of offset */
								setLrmStatValues630("LRM REQUEST CODE BAD                                              LRM JOB GROUP BAD                                                 LRM JOB NUMBER BAD                                                LRM SQL COUNT BAD                                                 LRM SQL NUMBER BAD                                                ".toCharArray());
    }





}
  
